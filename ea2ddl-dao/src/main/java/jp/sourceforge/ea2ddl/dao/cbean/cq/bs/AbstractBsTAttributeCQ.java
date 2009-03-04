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
 * The abstract condition-query of t_attribute.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTAttributeCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTAttributeCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_attribute";
    }
    
    public String getTableSqlName() {
        return "t_attribute";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER : FK to t_object}
     * @param objectId The value of objectId as equal.
     */
    public void setObjectId_Equal(java.lang.Integer objectId) {
        regObjectId(CK_EQ, objectId);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param objectId The value of objectId as notEqual.
     */
    public void setObjectId_NotEqual(java.lang.Integer objectId) {
        regObjectId(CK_NE, objectId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param objectId The value of objectId as greaterThan.
     */
    public void setObjectId_GreaterThan(java.lang.Integer objectId) {
        regObjectId(CK_GT, objectId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param objectId The value of objectId as lessThan.
     */
    public void setObjectId_LessThan(java.lang.Integer objectId) {
        regObjectId(CK_LT, objectId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param objectId The value of objectId as greaterEqual.
     */
    public void setObjectId_GreaterEqual(java.lang.Integer objectId) {
        regObjectId(CK_GE, objectId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
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

    public void inScopeTObject(SubQuery<TObjectCB> subQuery) {
        assertObjectNotNull("subQuery<TObjectCB>", subQuery);
        TObjectCB cb = new TObjectCB(); cb.xsetupForInScopeSubQuery(); subQuery.query(cb);
        String subQueryPropertyName = keepObjectId_InScopeSubQuery_TObject(cb.query()); // for saving query-value.
        registerInScopeSubQuery(cb.query(), "Object_ID", "Object_ID", subQueryPropertyName);
    }
    public abstract String keepObjectId_InScopeSubQuery_TObject(TObjectCQ subQuery);

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setObjectId_IsNull() { regObjectId(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setObjectId_IsNotNull() { regObjectId(CK_ISNN, DOBJ); }

    protected void regObjectId(ConditionKey k, Object v) { regQ(k, v, getCValueObjectId(), "Object_ID"); }
    abstract protected ConditionValue getCValueObjectId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param name The value of name as equal.
     */
    public void setName_Equal(String name) {
        regName(CK_EQ, fRES(name));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param name The value of name as notEqual.
     */
    public void setName_NotEqual(String name) {
        regName(CK_NE, fRES(name));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param name The value of name as greaterThan.
     */
    public void setName_GreaterThan(String name) {
        regName(CK_GT, fRES(name));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param name The value of name as lessThan.
     */
    public void setName_LessThan(String name) {
        regName(CK_LT, fRES(name));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param name The value of name as greaterEqual.
     */
    public void setName_GreaterEqual(String name) {
        regName(CK_GE, fRES(name));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param name The value of name as lessEqual.
     */
    public void setName_LessEqual(String name) {
        regName(CK_LE, fRES(name));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param name The value of name as prefixSearch.
     */
    public void setName_PrefixSearch(String name) {
        regName(CK_PS, fRES(name));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param nameList The collection of name as inScope.
     */
    public void setName_InScope(Collection<String> nameList) {
        regName(CK_INS, cTL(nameList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param name The value of name as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setName_LikeSearch(String name, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(name), getCValueName(), "Name", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param name The value of name as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setName_NotLikeSearch(String name, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(name), getCValueName(), "Name", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setName_IsNull() { regName(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setName_IsNotNull() { regName(CK_ISNN, DOBJ); }

    protected void regName(ConditionKey k, Object v) { regQ(k, v, getCValueName(), "Name"); }
    abstract protected ConditionValue getCValueName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param scope The value of scope as equal.
     */
    public void setScope_Equal(String scope) {
        regScope(CK_EQ, fRES(scope));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param scope The value of scope as notEqual.
     */
    public void setScope_NotEqual(String scope) {
        regScope(CK_NE, fRES(scope));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param scope The value of scope as greaterThan.
     */
    public void setScope_GreaterThan(String scope) {
        regScope(CK_GT, fRES(scope));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param scope The value of scope as lessThan.
     */
    public void setScope_LessThan(String scope) {
        regScope(CK_LT, fRES(scope));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param scope The value of scope as greaterEqual.
     */
    public void setScope_GreaterEqual(String scope) {
        regScope(CK_GE, fRES(scope));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param scope The value of scope as lessEqual.
     */
    public void setScope_LessEqual(String scope) {
        regScope(CK_LE, fRES(scope));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param scope The value of scope as prefixSearch.
     */
    public void setScope_PrefixSearch(String scope) {
        regScope(CK_PS, fRES(scope));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param scopeList The collection of scope as inScope.
     */
    public void setScope_InScope(Collection<String> scopeList) {
        regScope(CK_INS, cTL(scopeList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param scope The value of scope as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setScope_LikeSearch(String scope, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(scope), getCValueScope(), "Scope", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param scope The value of scope as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setScope_NotLikeSearch(String scope, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(scope), getCValueScope(), "Scope", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setScope_IsNull() { regScope(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setScope_IsNotNull() { regScope(CK_ISNN, DOBJ); }

    protected void regScope(ConditionKey k, Object v) { regQ(k, v, getCValueScope(), "Scope"); }
    abstract protected ConditionValue getCValueScope();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param stereotype The value of stereotype as equal.
     */
    public void setStereotype_Equal(String stereotype) {
        regStereotype(CK_EQ, fRES(stereotype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param stereotype The value of stereotype as notEqual.
     */
    public void setStereotype_NotEqual(String stereotype) {
        regStereotype(CK_NE, fRES(stereotype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param stereotype The value of stereotype as greaterThan.
     */
    public void setStereotype_GreaterThan(String stereotype) {
        regStereotype(CK_GT, fRES(stereotype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param stereotype The value of stereotype as lessThan.
     */
    public void setStereotype_LessThan(String stereotype) {
        regStereotype(CK_LT, fRES(stereotype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param stereotype The value of stereotype as greaterEqual.
     */
    public void setStereotype_GreaterEqual(String stereotype) {
        regStereotype(CK_GE, fRES(stereotype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param stereotype The value of stereotype as lessEqual.
     */
    public void setStereotype_LessEqual(String stereotype) {
        regStereotype(CK_LE, fRES(stereotype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param stereotype The value of stereotype as prefixSearch.
     */
    public void setStereotype_PrefixSearch(String stereotype) {
        regStereotype(CK_PS, fRES(stereotype));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param stereotypeList The collection of stereotype as inScope.
     */
    public void setStereotype_InScope(Collection<String> stereotypeList) {
        regStereotype(CK_INS, cTL(stereotypeList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param stereotype The value of stereotype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStereotype_LikeSearch(String stereotype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stereotype), getCValueStereotype(), "Stereotype", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param stereotype The value of stereotype as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStereotype_NotLikeSearch(String stereotype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stereotype), getCValueStereotype(), "Stereotype", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setStereotype_IsNull() { regStereotype(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setStereotype_IsNotNull() { regStereotype(CK_ISNN, DOBJ); }

    protected void regStereotype(ConditionKey k, Object v) { regQ(k, v, getCValueStereotype(), "Stereotype"); }
    abstract protected ConditionValue getCValueStereotype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param containment The value of containment as equal.
     */
    public void setContainment_Equal(String containment) {
        regContainment(CK_EQ, fRES(containment));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param containment The value of containment as notEqual.
     */
    public void setContainment_NotEqual(String containment) {
        regContainment(CK_NE, fRES(containment));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param containment The value of containment as greaterThan.
     */
    public void setContainment_GreaterThan(String containment) {
        regContainment(CK_GT, fRES(containment));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param containment The value of containment as lessThan.
     */
    public void setContainment_LessThan(String containment) {
        regContainment(CK_LT, fRES(containment));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param containment The value of containment as greaterEqual.
     */
    public void setContainment_GreaterEqual(String containment) {
        regContainment(CK_GE, fRES(containment));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param containment The value of containment as lessEqual.
     */
    public void setContainment_LessEqual(String containment) {
        regContainment(CK_LE, fRES(containment));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param containment The value of containment as prefixSearch.
     */
    public void setContainment_PrefixSearch(String containment) {
        regContainment(CK_PS, fRES(containment));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param containmentList The collection of containment as inScope.
     */
    public void setContainment_InScope(Collection<String> containmentList) {
        regContainment(CK_INS, cTL(containmentList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param containment The value of containment as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setContainment_LikeSearch(String containment, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(containment), getCValueContainment(), "Containment", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param containment The value of containment as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setContainment_NotLikeSearch(String containment, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(containment), getCValueContainment(), "Containment", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setContainment_IsNull() { regContainment(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setContainment_IsNotNull() { regContainment(CK_ISNN, DOBJ); }

    protected void regContainment(ConditionKey k, Object v) { regQ(k, v, getCValueContainment(), "Containment"); }
    abstract protected ConditionValue getCValueContainment();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param isstatic The value of isstatic as equal.
     */
    public void setIsstatic_Equal(java.lang.Integer isstatic) {
        regIsstatic(CK_EQ, isstatic);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param isstatic The value of isstatic as notEqual.
     */
    public void setIsstatic_NotEqual(java.lang.Integer isstatic) {
        regIsstatic(CK_NE, isstatic);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param isstatic The value of isstatic as greaterThan.
     */
    public void setIsstatic_GreaterThan(java.lang.Integer isstatic) {
        regIsstatic(CK_GT, isstatic);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param isstatic The value of isstatic as lessThan.
     */
    public void setIsstatic_LessThan(java.lang.Integer isstatic) {
        regIsstatic(CK_LT, isstatic);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param isstatic The value of isstatic as greaterEqual.
     */
    public void setIsstatic_GreaterEqual(java.lang.Integer isstatic) {
        regIsstatic(CK_GE, isstatic);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
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
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setIsstatic_IsNull() { regIsstatic(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setIsstatic_IsNotNull() { regIsstatic(CK_ISNN, DOBJ); }

    protected void regIsstatic(ConditionKey k, Object v) { regQ(k, v, getCValueIsstatic(), "IsStatic"); }
    abstract protected ConditionValue getCValueIsstatic();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param iscollection The value of iscollection as equal.
     */
    public void setIscollection_Equal(java.lang.Integer iscollection) {
        regIscollection(CK_EQ, iscollection);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param iscollection The value of iscollection as notEqual.
     */
    public void setIscollection_NotEqual(java.lang.Integer iscollection) {
        regIscollection(CK_NE, iscollection);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param iscollection The value of iscollection as greaterThan.
     */
    public void setIscollection_GreaterThan(java.lang.Integer iscollection) {
        regIscollection(CK_GT, iscollection);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param iscollection The value of iscollection as lessThan.
     */
    public void setIscollection_LessThan(java.lang.Integer iscollection) {
        regIscollection(CK_LT, iscollection);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param iscollection The value of iscollection as greaterEqual.
     */
    public void setIscollection_GreaterEqual(java.lang.Integer iscollection) {
        regIscollection(CK_GE, iscollection);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
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
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setIscollection_IsNull() { regIscollection(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setIscollection_IsNotNull() { regIscollection(CK_ISNN, DOBJ); }

    protected void regIscollection(ConditionKey k, Object v) { regQ(k, v, getCValueIscollection(), "IsCollection"); }
    abstract protected ConditionValue getCValueIscollection();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param isordered The value of isordered as equal.
     */
    public void setIsordered_Equal(java.lang.Integer isordered) {
        regIsordered(CK_EQ, isordered);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param isordered The value of isordered as notEqual.
     */
    public void setIsordered_NotEqual(java.lang.Integer isordered) {
        regIsordered(CK_NE, isordered);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param isordered The value of isordered as greaterThan.
     */
    public void setIsordered_GreaterThan(java.lang.Integer isordered) {
        regIsordered(CK_GT, isordered);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param isordered The value of isordered as lessThan.
     */
    public void setIsordered_LessThan(java.lang.Integer isordered) {
        regIsordered(CK_LT, isordered);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param isordered The value of isordered as greaterEqual.
     */
    public void setIsordered_GreaterEqual(java.lang.Integer isordered) {
        regIsordered(CK_GE, isordered);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
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
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setIsordered_IsNull() { regIsordered(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setIsordered_IsNotNull() { regIsordered(CK_ISNN, DOBJ); }

    protected void regIsordered(ConditionKey k, Object v) { regQ(k, v, getCValueIsordered(), "IsOrdered"); }
    abstract protected ConditionValue getCValueIsordered();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param allowduplicates The value of allowduplicates as equal.
     */
    public void setAllowduplicates_Equal(java.lang.Integer allowduplicates) {
        regAllowduplicates(CK_EQ, allowduplicates);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param allowduplicates The value of allowduplicates as notEqual.
     */
    public void setAllowduplicates_NotEqual(java.lang.Integer allowduplicates) {
        regAllowduplicates(CK_NE, allowduplicates);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param allowduplicates The value of allowduplicates as greaterThan.
     */
    public void setAllowduplicates_GreaterThan(java.lang.Integer allowduplicates) {
        regAllowduplicates(CK_GT, allowduplicates);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param allowduplicates The value of allowduplicates as lessThan.
     */
    public void setAllowduplicates_LessThan(java.lang.Integer allowduplicates) {
        regAllowduplicates(CK_LT, allowduplicates);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param allowduplicates The value of allowduplicates as greaterEqual.
     */
    public void setAllowduplicates_GreaterEqual(java.lang.Integer allowduplicates) {
        regAllowduplicates(CK_GE, allowduplicates);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
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
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setAllowduplicates_IsNull() { regAllowduplicates(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setAllowduplicates_IsNotNull() { regAllowduplicates(CK_ISNN, DOBJ); }

    protected void regAllowduplicates(ConditionKey k, Object v) { regQ(k, v, getCValueAllowduplicates(), "AllowDuplicates"); }
    abstract protected ConditionValue getCValueAllowduplicates();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param lowerbound The value of lowerbound as equal.
     */
    public void setLowerbound_Equal(String lowerbound) {
        regLowerbound(CK_EQ, fRES(lowerbound));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param lowerbound The value of lowerbound as notEqual.
     */
    public void setLowerbound_NotEqual(String lowerbound) {
        regLowerbound(CK_NE, fRES(lowerbound));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param lowerbound The value of lowerbound as greaterThan.
     */
    public void setLowerbound_GreaterThan(String lowerbound) {
        regLowerbound(CK_GT, fRES(lowerbound));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param lowerbound The value of lowerbound as lessThan.
     */
    public void setLowerbound_LessThan(String lowerbound) {
        regLowerbound(CK_LT, fRES(lowerbound));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param lowerbound The value of lowerbound as greaterEqual.
     */
    public void setLowerbound_GreaterEqual(String lowerbound) {
        regLowerbound(CK_GE, fRES(lowerbound));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param lowerbound The value of lowerbound as lessEqual.
     */
    public void setLowerbound_LessEqual(String lowerbound) {
        regLowerbound(CK_LE, fRES(lowerbound));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param lowerbound The value of lowerbound as prefixSearch.
     */
    public void setLowerbound_PrefixSearch(String lowerbound) {
        regLowerbound(CK_PS, fRES(lowerbound));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param lowerboundList The collection of lowerbound as inScope.
     */
    public void setLowerbound_InScope(Collection<String> lowerboundList) {
        regLowerbound(CK_INS, cTL(lowerboundList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param lowerbound The value of lowerbound as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLowerbound_LikeSearch(String lowerbound, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lowerbound), getCValueLowerbound(), "LowerBound", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param lowerbound The value of lowerbound as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLowerbound_NotLikeSearch(String lowerbound, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lowerbound), getCValueLowerbound(), "LowerBound", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setLowerbound_IsNull() { regLowerbound(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setLowerbound_IsNotNull() { regLowerbound(CK_ISNN, DOBJ); }

    protected void regLowerbound(ConditionKey k, Object v) { regQ(k, v, getCValueLowerbound(), "LowerBound"); }
    abstract protected ConditionValue getCValueLowerbound();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param upperbound The value of upperbound as equal.
     */
    public void setUpperbound_Equal(String upperbound) {
        regUpperbound(CK_EQ, fRES(upperbound));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param upperbound The value of upperbound as notEqual.
     */
    public void setUpperbound_NotEqual(String upperbound) {
        regUpperbound(CK_NE, fRES(upperbound));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param upperbound The value of upperbound as greaterThan.
     */
    public void setUpperbound_GreaterThan(String upperbound) {
        regUpperbound(CK_GT, fRES(upperbound));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param upperbound The value of upperbound as lessThan.
     */
    public void setUpperbound_LessThan(String upperbound) {
        regUpperbound(CK_LT, fRES(upperbound));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param upperbound The value of upperbound as greaterEqual.
     */
    public void setUpperbound_GreaterEqual(String upperbound) {
        regUpperbound(CK_GE, fRES(upperbound));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param upperbound The value of upperbound as lessEqual.
     */
    public void setUpperbound_LessEqual(String upperbound) {
        regUpperbound(CK_LE, fRES(upperbound));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param upperbound The value of upperbound as prefixSearch.
     */
    public void setUpperbound_PrefixSearch(String upperbound) {
        regUpperbound(CK_PS, fRES(upperbound));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param upperboundList The collection of upperbound as inScope.
     */
    public void setUpperbound_InScope(Collection<String> upperboundList) {
        regUpperbound(CK_INS, cTL(upperboundList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param upperbound The value of upperbound as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUpperbound_LikeSearch(String upperbound, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(upperbound), getCValueUpperbound(), "UpperBound", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param upperbound The value of upperbound as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUpperbound_NotLikeSearch(String upperbound, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(upperbound), getCValueUpperbound(), "UpperBound", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setUpperbound_IsNull() { regUpperbound(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setUpperbound_IsNotNull() { regUpperbound(CK_ISNN, DOBJ); }

    protected void regUpperbound(ConditionKey k, Object v) { regQ(k, v, getCValueUpperbound(), "UpperBound"); }
    abstract protected ConditionValue getCValueUpperbound();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param container The value of container as equal.
     */
    public void setContainer_Equal(String container) {
        regContainer(CK_EQ, fRES(container));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param container The value of container as notEqual.
     */
    public void setContainer_NotEqual(String container) {
        regContainer(CK_NE, fRES(container));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param container The value of container as greaterThan.
     */
    public void setContainer_GreaterThan(String container) {
        regContainer(CK_GT, fRES(container));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param container The value of container as lessThan.
     */
    public void setContainer_LessThan(String container) {
        regContainer(CK_LT, fRES(container));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param container The value of container as greaterEqual.
     */
    public void setContainer_GreaterEqual(String container) {
        regContainer(CK_GE, fRES(container));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param container The value of container as lessEqual.
     */
    public void setContainer_LessEqual(String container) {
        regContainer(CK_LE, fRES(container));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param container The value of container as prefixSearch.
     */
    public void setContainer_PrefixSearch(String container) {
        regContainer(CK_PS, fRES(container));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param containerList The collection of container as inScope.
     */
    public void setContainer_InScope(Collection<String> containerList) {
        regContainer(CK_INS, cTL(containerList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param container The value of container as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setContainer_LikeSearch(String container, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(container), getCValueContainer(), "Container", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param container The value of container as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setContainer_NotLikeSearch(String container, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(container), getCValueContainer(), "Container", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setContainer_IsNull() { regContainer(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setContainer_IsNotNull() { regContainer(CK_ISNN, DOBJ); }

    protected void regContainer(ConditionKey k, Object v) { regQ(k, v, getCValueContainer(), "Container"); }
    abstract protected ConditionValue getCValueContainer();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {LONGCHAR(2147483647)}
     * @param notes The value of notes as equal.
     */
    public void setNotes_Equal(String notes) {
        regNotes(CK_EQ, fRES(notes));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param notes The value of notes as notEqual.
     */
    public void setNotes_NotEqual(String notes) {
        regNotes(CK_NE, fRES(notes));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param notes The value of notes as greaterThan.
     */
    public void setNotes_GreaterThan(String notes) {
        regNotes(CK_GT, fRES(notes));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param notes The value of notes as lessThan.
     */
    public void setNotes_LessThan(String notes) {
        regNotes(CK_LT, fRES(notes));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param notes The value of notes as greaterEqual.
     */
    public void setNotes_GreaterEqual(String notes) {
        regNotes(CK_GE, fRES(notes));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param notes The value of notes as lessEqual.
     */
    public void setNotes_LessEqual(String notes) {
        regNotes(CK_LE, fRES(notes));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param notes The value of notes as prefixSearch.
     */
    public void setNotes_PrefixSearch(String notes) {
        regNotes(CK_PS, fRES(notes));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param notesList The collection of notes as inScope.
     */
    public void setNotes_InScope(Collection<String> notesList) {
        regNotes(CK_INS, cTL(notesList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param notes The value of notes as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNotes_LikeSearch(String notes, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(notes), getCValueNotes(), "Notes", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param notes The value of notes as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNotes_NotLikeSearch(String notes, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(notes), getCValueNotes(), "Notes", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setNotes_IsNull() { regNotes(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setNotes_IsNotNull() { regNotes(CK_ISNN, DOBJ); }

    protected void regNotes(ConditionKey k, Object v) { regQ(k, v, getCValueNotes(), "Notes"); }
    abstract protected ConditionValue getCValueNotes();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(1)}
     * @param derived The value of derived as equal.
     */
    public void setDerived_Equal(String derived) {
        regDerived(CK_EQ, fRES(derived));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param derived The value of derived as notEqual.
     */
    public void setDerived_NotEqual(String derived) {
        regDerived(CK_NE, fRES(derived));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param derived The value of derived as greaterThan.
     */
    public void setDerived_GreaterThan(String derived) {
        regDerived(CK_GT, fRES(derived));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param derived The value of derived as lessThan.
     */
    public void setDerived_LessThan(String derived) {
        regDerived(CK_LT, fRES(derived));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param derived The value of derived as greaterEqual.
     */
    public void setDerived_GreaterEqual(String derived) {
        regDerived(CK_GE, fRES(derived));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param derived The value of derived as lessEqual.
     */
    public void setDerived_LessEqual(String derived) {
        regDerived(CK_LE, fRES(derived));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param derived The value of derived as prefixSearch.
     */
    public void setDerived_PrefixSearch(String derived) {
        regDerived(CK_PS, fRES(derived));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param derivedList The collection of derived as inScope.
     */
    public void setDerived_InScope(Collection<String> derivedList) {
        regDerived(CK_INS, cTL(derivedList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param derived The value of derived as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDerived_LikeSearch(String derived, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(derived), getCValueDerived(), "Derived", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param derived The value of derived as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDerived_NotLikeSearch(String derived, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(derived), getCValueDerived(), "Derived", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setDerived_IsNull() { regDerived(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setDerived_IsNotNull() { regDerived(CK_ISNN, DOBJ); }

    protected void regDerived(ConditionKey k, Object v) { regQ(k, v, getCValueDerived(), "Derived"); }
    abstract protected ConditionValue getCValueDerived();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {UQ : NotNull : COUNTER}
     * @param id The value of id as equal.
     */
    public void setId_Equal(java.lang.Integer id) {
        regId(CK_EQ, id);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param id The value of id as notEqual.
     */
    public void setId_NotEqual(java.lang.Integer id) {
        regId(CK_NE, id);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param id The value of id as greaterThan.
     */
    public void setId_GreaterThan(java.lang.Integer id) {
        regId(CK_GT, id);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param id The value of id as lessThan.
     */
    public void setId_LessThan(java.lang.Integer id) {
        regId(CK_LT, id);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param id The value of id as greaterEqual.
     */
    public void setId_GreaterEqual(java.lang.Integer id) {
        regId(CK_GE, id);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
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

    protected void regId(ConditionKey k, Object v) { regQ(k, v, getCValueId(), "ID"); }
    abstract protected ConditionValue getCValueId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param pos The value of pos as equal.
     */
    public void setPos_Equal(java.lang.Integer pos) {
        regPos(CK_EQ, pos);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param pos The value of pos as notEqual.
     */
    public void setPos_NotEqual(java.lang.Integer pos) {
        regPos(CK_NE, pos);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param pos The value of pos as greaterThan.
     */
    public void setPos_GreaterThan(java.lang.Integer pos) {
        regPos(CK_GT, pos);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param pos The value of pos as lessThan.
     */
    public void setPos_LessThan(java.lang.Integer pos) {
        regPos(CK_LT, pos);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param pos The value of pos as greaterEqual.
     */
    public void setPos_GreaterEqual(java.lang.Integer pos) {
        regPos(CK_GE, pos);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
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
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setPos_IsNull() { regPos(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setPos_IsNotNull() { regPos(CK_ISNN, DOBJ); }

    protected void regPos(ConditionKey k, Object v) { regQ(k, v, getCValuePos(), "Pos"); }
    abstract protected ConditionValue getCValuePos();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {LONGCHAR(2147483647)}
     * @param genoption The value of genoption as equal.
     */
    public void setGenoption_Equal(String genoption) {
        regGenoption(CK_EQ, fRES(genoption));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param genoption The value of genoption as notEqual.
     */
    public void setGenoption_NotEqual(String genoption) {
        regGenoption(CK_NE, fRES(genoption));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param genoption The value of genoption as greaterThan.
     */
    public void setGenoption_GreaterThan(String genoption) {
        regGenoption(CK_GT, fRES(genoption));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param genoption The value of genoption as lessThan.
     */
    public void setGenoption_LessThan(String genoption) {
        regGenoption(CK_LT, fRES(genoption));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param genoption The value of genoption as greaterEqual.
     */
    public void setGenoption_GreaterEqual(String genoption) {
        regGenoption(CK_GE, fRES(genoption));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param genoption The value of genoption as lessEqual.
     */
    public void setGenoption_LessEqual(String genoption) {
        regGenoption(CK_LE, fRES(genoption));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param genoption The value of genoption as prefixSearch.
     */
    public void setGenoption_PrefixSearch(String genoption) {
        regGenoption(CK_PS, fRES(genoption));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param genoptionList The collection of genoption as inScope.
     */
    public void setGenoption_InScope(Collection<String> genoptionList) {
        regGenoption(CK_INS, cTL(genoptionList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param genoption The value of genoption as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGenoption_LikeSearch(String genoption, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(genoption), getCValueGenoption(), "GenOption", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param genoption The value of genoption as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setGenoption_NotLikeSearch(String genoption, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(genoption), getCValueGenoption(), "GenOption", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setGenoption_IsNull() { regGenoption(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setGenoption_IsNotNull() { regGenoption(CK_ISNN, DOBJ); }

    protected void regGenoption(ConditionKey k, Object v) { regQ(k, v, getCValueGenoption(), "GenOption"); }
    abstract protected ConditionValue getCValueGenoption();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param length The value of length as equal.
     */
    public void setLength_Equal(java.lang.Integer length) {
        regLength(CK_EQ, length);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param length The value of length as notEqual.
     */
    public void setLength_NotEqual(java.lang.Integer length) {
        regLength(CK_NE, length);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param length The value of length as greaterThan.
     */
    public void setLength_GreaterThan(java.lang.Integer length) {
        regLength(CK_GT, length);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param length The value of length as lessThan.
     */
    public void setLength_LessThan(java.lang.Integer length) {
        regLength(CK_LT, length);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param length The value of length as greaterEqual.
     */
    public void setLength_GreaterEqual(java.lang.Integer length) {
        regLength(CK_GE, length);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
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
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setLength_IsNull() { regLength(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setLength_IsNotNull() { regLength(CK_ISNN, DOBJ); }

    protected void regLength(ConditionKey k, Object v) { regQ(k, v, getCValueLength(), "Length"); }
    abstract protected ConditionValue getCValueLength();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param precision The value of precision as equal.
     */
    public void setPrecision_Equal(java.lang.Integer precision) {
        regPrecision(CK_EQ, precision);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param precision The value of precision as notEqual.
     */
    public void setPrecision_NotEqual(java.lang.Integer precision) {
        regPrecision(CK_NE, precision);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param precision The value of precision as greaterThan.
     */
    public void setPrecision_GreaterThan(java.lang.Integer precision) {
        regPrecision(CK_GT, precision);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param precision The value of precision as lessThan.
     */
    public void setPrecision_LessThan(java.lang.Integer precision) {
        regPrecision(CK_LT, precision);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param precision The value of precision as greaterEqual.
     */
    public void setPrecision_GreaterEqual(java.lang.Integer precision) {
        regPrecision(CK_GE, precision);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
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
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setPrecision_IsNull() { regPrecision(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setPrecision_IsNotNull() { regPrecision(CK_ISNN, DOBJ); }

    protected void regPrecision(ConditionKey k, Object v) { regQ(k, v, getCValuePrecision(), "Precision"); }
    abstract protected ConditionValue getCValuePrecision();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param scale The value of scale as equal.
     */
    public void setScale_Equal(java.lang.Integer scale) {
        regScale(CK_EQ, scale);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param scale The value of scale as notEqual.
     */
    public void setScale_NotEqual(java.lang.Integer scale) {
        regScale(CK_NE, scale);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param scale The value of scale as greaterThan.
     */
    public void setScale_GreaterThan(java.lang.Integer scale) {
        regScale(CK_GT, scale);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param scale The value of scale as lessThan.
     */
    public void setScale_LessThan(java.lang.Integer scale) {
        regScale(CK_LT, scale);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param scale The value of scale as greaterEqual.
     */
    public void setScale_GreaterEqual(java.lang.Integer scale) {
        regScale(CK_GE, scale);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
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
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setScale_IsNull() { regScale(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setScale_IsNotNull() { regScale(CK_ISNN, DOBJ); }

    protected void regScale(ConditionKey k, Object v) { regQ(k, v, getCValueScale(), "Scale"); }
    abstract protected ConditionValue getCValueScale();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param style The value of style as equal.
     */
    public void setStyle_Equal(String style) {
        regStyle(CK_EQ, fRES(style));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param style The value of style as notEqual.
     */
    public void setStyle_NotEqual(String style) {
        regStyle(CK_NE, fRES(style));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param style The value of style as greaterThan.
     */
    public void setStyle_GreaterThan(String style) {
        regStyle(CK_GT, fRES(style));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param style The value of style as lessThan.
     */
    public void setStyle_LessThan(String style) {
        regStyle(CK_LT, fRES(style));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param style The value of style as greaterEqual.
     */
    public void setStyle_GreaterEqual(String style) {
        regStyle(CK_GE, fRES(style));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param style The value of style as lessEqual.
     */
    public void setStyle_LessEqual(String style) {
        regStyle(CK_LE, fRES(style));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param style The value of style as prefixSearch.
     */
    public void setStyle_PrefixSearch(String style) {
        regStyle(CK_PS, fRES(style));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param styleList The collection of style as inScope.
     */
    public void setStyle_InScope(Collection<String> styleList) {
        regStyle(CK_INS, cTL(styleList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param style The value of style as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStyle_LikeSearch(String style, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(style), getCValueStyle(), "Style", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param style The value of style as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStyle_NotLikeSearch(String style, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(style), getCValueStyle(), "Style", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setStyle_IsNull() { regStyle(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setStyle_IsNotNull() { regStyle(CK_ISNN, DOBJ); }

    protected void regStyle(ConditionKey k, Object v) { regQ(k, v, getCValueStyle(), "Style"); }
    abstract protected ConditionValue getCValueStyle();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param classifier The value of classifier as equal.
     */
    public void setClassifier_Equal(String classifier) {
        regClassifier(CK_EQ, fRES(classifier));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param classifier The value of classifier as notEqual.
     */
    public void setClassifier_NotEqual(String classifier) {
        regClassifier(CK_NE, fRES(classifier));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param classifier The value of classifier as greaterThan.
     */
    public void setClassifier_GreaterThan(String classifier) {
        regClassifier(CK_GT, fRES(classifier));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param classifier The value of classifier as lessThan.
     */
    public void setClassifier_LessThan(String classifier) {
        regClassifier(CK_LT, fRES(classifier));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param classifier The value of classifier as greaterEqual.
     */
    public void setClassifier_GreaterEqual(String classifier) {
        regClassifier(CK_GE, fRES(classifier));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param classifier The value of classifier as lessEqual.
     */
    public void setClassifier_LessEqual(String classifier) {
        regClassifier(CK_LE, fRES(classifier));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param classifier The value of classifier as prefixSearch.
     */
    public void setClassifier_PrefixSearch(String classifier) {
        regClassifier(CK_PS, fRES(classifier));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param classifierList The collection of classifier as inScope.
     */
    public void setClassifier_InScope(Collection<String> classifierList) {
        regClassifier(CK_INS, cTL(classifierList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param classifier The value of classifier as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setClassifier_LikeSearch(String classifier, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(classifier), getCValueClassifier(), "Classifier", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param classifier The value of classifier as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setClassifier_NotLikeSearch(String classifier, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(classifier), getCValueClassifier(), "Classifier", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setClassifier_IsNull() { regClassifier(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setClassifier_IsNotNull() { regClassifier(CK_ISNN, DOBJ); }

    protected void regClassifier(ConditionKey k, Object v) { regQ(k, v, getCValueClassifier(), "Classifier"); }
    abstract protected ConditionValue getCValueClassifier();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param eaGuid The value of eaGuid as equal.
     */
    public void setEaGuid_Equal(String eaGuid) {
        regEaGuid(CK_EQ, fRES(eaGuid));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param eaGuid The value of eaGuid as notEqual.
     */
    public void setEaGuid_NotEqual(String eaGuid) {
        regEaGuid(CK_NE, fRES(eaGuid));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param eaGuid The value of eaGuid as greaterThan.
     */
    public void setEaGuid_GreaterThan(String eaGuid) {
        regEaGuid(CK_GT, fRES(eaGuid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param eaGuid The value of eaGuid as lessThan.
     */
    public void setEaGuid_LessThan(String eaGuid) {
        regEaGuid(CK_LT, fRES(eaGuid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param eaGuid The value of eaGuid as greaterEqual.
     */
    public void setEaGuid_GreaterEqual(String eaGuid) {
        regEaGuid(CK_GE, fRES(eaGuid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param eaGuid The value of eaGuid as lessEqual.
     */
    public void setEaGuid_LessEqual(String eaGuid) {
        regEaGuid(CK_LE, fRES(eaGuid));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param eaGuid The value of eaGuid as prefixSearch.
     */
    public void setEaGuid_PrefixSearch(String eaGuid) {
        regEaGuid(CK_PS, fRES(eaGuid));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param eaGuidList The collection of eaGuid as inScope.
     */
    public void setEaGuid_InScope(Collection<String> eaGuidList) {
        regEaGuid(CK_INS, cTL(eaGuidList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param eaGuid The value of eaGuid as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEaGuid_LikeSearch(String eaGuid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(eaGuid), getCValueEaGuid(), "ea_guid", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param eaGuid The value of eaGuid as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEaGuid_NotLikeSearch(String eaGuid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(eaGuid), getCValueEaGuid(), "ea_guid", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setEaGuid_IsNull() { regEaGuid(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setEaGuid_IsNotNull() { regEaGuid(CK_ISNN, DOBJ); }

    protected void regEaGuid(ConditionKey k, Object v) { regQ(k, v, getCValueEaGuid(), "ea_guid"); }
    abstract protected ConditionValue getCValueEaGuid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {LONGCHAR(2147483647)}
     * @param styleex The value of styleex as equal.
     */
    public void setStyleex_Equal(String styleex) {
        regStyleex(CK_EQ, fRES(styleex));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param styleex The value of styleex as notEqual.
     */
    public void setStyleex_NotEqual(String styleex) {
        regStyleex(CK_NE, fRES(styleex));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param styleex The value of styleex as greaterThan.
     */
    public void setStyleex_GreaterThan(String styleex) {
        regStyleex(CK_GT, fRES(styleex));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param styleex The value of styleex as lessThan.
     */
    public void setStyleex_LessThan(String styleex) {
        regStyleex(CK_LT, fRES(styleex));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param styleex The value of styleex as greaterEqual.
     */
    public void setStyleex_GreaterEqual(String styleex) {
        regStyleex(CK_GE, fRES(styleex));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param styleex The value of styleex as lessEqual.
     */
    public void setStyleex_LessEqual(String styleex) {
        regStyleex(CK_LE, fRES(styleex));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param styleex The value of styleex as prefixSearch.
     */
    public void setStyleex_PrefixSearch(String styleex) {
        regStyleex(CK_PS, fRES(styleex));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param styleexList The collection of styleex as inScope.
     */
    public void setStyleex_InScope(Collection<String> styleexList) {
        regStyleex(CK_INS, cTL(styleexList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param styleex The value of styleex as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStyleex_LikeSearch(String styleex, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(styleex), getCValueStyleex(), "StyleEx", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param styleex The value of styleex as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStyleex_NotLikeSearch(String styleex, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(styleex), getCValueStyleex(), "StyleEx", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setStyleex_IsNull() { regStyleex(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setStyleex_IsNotNull() { regStyleex(CK_ISNN, DOBJ); }

    protected void regStyleex(ConditionKey k, Object v) { regQ(k, v, getCValueStyleex(), "StyleEx"); }
    abstract protected ConditionValue getCValueStyleex();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TAttributeCB.class.getName(); }
    String xCQ() { return TAttributeCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
