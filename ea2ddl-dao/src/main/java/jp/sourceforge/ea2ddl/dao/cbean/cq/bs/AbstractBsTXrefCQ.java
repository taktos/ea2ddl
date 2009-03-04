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
 * The abstract condition-query of t_xref.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTXrefCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTXrefCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_xref";
    }
    
    public String getTableSqlName() {
        return "t_xref";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {UQ : VARCHAR(255)}
     * @param xrefid The value of xrefid as equal.
     */
    public void setXrefid_Equal(String xrefid) {
        regXrefid(CK_EQ, fRES(xrefid));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param xrefid The value of xrefid as notEqual.
     */
    public void setXrefid_NotEqual(String xrefid) {
        regXrefid(CK_NE, fRES(xrefid));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param xrefid The value of xrefid as greaterThan.
     */
    public void setXrefid_GreaterThan(String xrefid) {
        regXrefid(CK_GT, fRES(xrefid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param xrefid The value of xrefid as lessThan.
     */
    public void setXrefid_LessThan(String xrefid) {
        regXrefid(CK_LT, fRES(xrefid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param xrefid The value of xrefid as greaterEqual.
     */
    public void setXrefid_GreaterEqual(String xrefid) {
        regXrefid(CK_GE, fRES(xrefid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param xrefid The value of xrefid as lessEqual.
     */
    public void setXrefid_LessEqual(String xrefid) {
        regXrefid(CK_LE, fRES(xrefid));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param xrefid The value of xrefid as prefixSearch.
     */
    public void setXrefid_PrefixSearch(String xrefid) {
        regXrefid(CK_PS, fRES(xrefid));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param xrefidList The collection of xrefid as inScope.
     */
    public void setXrefid_InScope(Collection<String> xrefidList) {
        regXrefid(CK_INS, cTL(xrefidList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param xrefid The value of xrefid as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setXrefid_LikeSearch(String xrefid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(xrefid), getCValueXrefid(), "XrefID", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param xrefid The value of xrefid as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setXrefid_NotLikeSearch(String xrefid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(xrefid), getCValueXrefid(), "XrefID", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setXrefid_IsNull() { regXrefid(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setXrefid_IsNotNull() { regXrefid(CK_ISNN, DOBJ); }

    protected void regXrefid(ConditionKey k, Object v) { regQ(k, v, getCValueXrefid(), "XrefID"); }
    abstract protected ConditionValue getCValueXrefid();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param visibility The value of visibility as equal.
     */
    public void setVisibility_Equal(String visibility) {
        regVisibility(CK_EQ, fRES(visibility));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param visibility The value of visibility as notEqual.
     */
    public void setVisibility_NotEqual(String visibility) {
        regVisibility(CK_NE, fRES(visibility));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param visibility The value of visibility as greaterThan.
     */
    public void setVisibility_GreaterThan(String visibility) {
        regVisibility(CK_GT, fRES(visibility));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param visibility The value of visibility as lessThan.
     */
    public void setVisibility_LessThan(String visibility) {
        regVisibility(CK_LT, fRES(visibility));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param visibility The value of visibility as greaterEqual.
     */
    public void setVisibility_GreaterEqual(String visibility) {
        regVisibility(CK_GE, fRES(visibility));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param visibility The value of visibility as lessEqual.
     */
    public void setVisibility_LessEqual(String visibility) {
        regVisibility(CK_LE, fRES(visibility));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param visibility The value of visibility as prefixSearch.
     */
    public void setVisibility_PrefixSearch(String visibility) {
        regVisibility(CK_PS, fRES(visibility));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param visibilityList The collection of visibility as inScope.
     */
    public void setVisibility_InScope(Collection<String> visibilityList) {
        regVisibility(CK_INS, cTL(visibilityList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param visibility The value of visibility as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setVisibility_LikeSearch(String visibility, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(visibility), getCValueVisibility(), "Visibility", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param visibility The value of visibility as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setVisibility_NotLikeSearch(String visibility, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(visibility), getCValueVisibility(), "Visibility", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setVisibility_IsNull() { regVisibility(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setVisibility_IsNotNull() { regVisibility(CK_ISNN, DOBJ); }

    protected void regVisibility(ConditionKey k, Object v) { regQ(k, v, getCValueVisibility(), "Visibility"); }
    abstract protected ConditionValue getCValueVisibility();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param namespace The value of namespace as equal.
     */
    public void setNamespace_Equal(String namespace) {
        regNamespace(CK_EQ, fRES(namespace));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param namespace The value of namespace as notEqual.
     */
    public void setNamespace_NotEqual(String namespace) {
        regNamespace(CK_NE, fRES(namespace));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param namespace The value of namespace as greaterThan.
     */
    public void setNamespace_GreaterThan(String namespace) {
        regNamespace(CK_GT, fRES(namespace));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param namespace The value of namespace as lessThan.
     */
    public void setNamespace_LessThan(String namespace) {
        regNamespace(CK_LT, fRES(namespace));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param namespace The value of namespace as greaterEqual.
     */
    public void setNamespace_GreaterEqual(String namespace) {
        regNamespace(CK_GE, fRES(namespace));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param namespace The value of namespace as lessEqual.
     */
    public void setNamespace_LessEqual(String namespace) {
        regNamespace(CK_LE, fRES(namespace));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param namespace The value of namespace as prefixSearch.
     */
    public void setNamespace_PrefixSearch(String namespace) {
        regNamespace(CK_PS, fRES(namespace));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param namespaceList The collection of namespace as inScope.
     */
    public void setNamespace_InScope(Collection<String> namespaceList) {
        regNamespace(CK_INS, cTL(namespaceList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param namespace The value of namespace as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNamespace_LikeSearch(String namespace, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(namespace), getCValueNamespace(), "Namespace", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param namespace The value of namespace as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNamespace_NotLikeSearch(String namespace, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(namespace), getCValueNamespace(), "Namespace", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setNamespace_IsNull() { regNamespace(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setNamespace_IsNotNull() { regNamespace(CK_ISNN, DOBJ); }

    protected void regNamespace(ConditionKey k, Object v) { regQ(k, v, getCValueNamespace(), "Namespace"); }
    abstract protected ConditionValue getCValueNamespace();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param requirement The value of requirement as equal.
     */
    public void setRequirement_Equal(String requirement) {
        regRequirement(CK_EQ, fRES(requirement));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param requirement The value of requirement as notEqual.
     */
    public void setRequirement_NotEqual(String requirement) {
        regRequirement(CK_NE, fRES(requirement));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param requirement The value of requirement as greaterThan.
     */
    public void setRequirement_GreaterThan(String requirement) {
        regRequirement(CK_GT, fRES(requirement));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param requirement The value of requirement as lessThan.
     */
    public void setRequirement_LessThan(String requirement) {
        regRequirement(CK_LT, fRES(requirement));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param requirement The value of requirement as greaterEqual.
     */
    public void setRequirement_GreaterEqual(String requirement) {
        regRequirement(CK_GE, fRES(requirement));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param requirement The value of requirement as lessEqual.
     */
    public void setRequirement_LessEqual(String requirement) {
        regRequirement(CK_LE, fRES(requirement));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param requirement The value of requirement as prefixSearch.
     */
    public void setRequirement_PrefixSearch(String requirement) {
        regRequirement(CK_PS, fRES(requirement));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param requirementList The collection of requirement as inScope.
     */
    public void setRequirement_InScope(Collection<String> requirementList) {
        regRequirement(CK_INS, cTL(requirementList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param requirement The value of requirement as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRequirement_LikeSearch(String requirement, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(requirement), getCValueRequirement(), "Requirement", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param requirement The value of requirement as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRequirement_NotLikeSearch(String requirement, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(requirement), getCValueRequirement(), "Requirement", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setRequirement_IsNull() { regRequirement(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setRequirement_IsNotNull() { regRequirement(CK_ISNN, DOBJ); }

    protected void regRequirement(ConditionKey k, Object v) { regQ(k, v, getCValueRequirement(), "Requirement"); }
    abstract protected ConditionValue getCValueRequirement();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param constraint The value of constraint as equal.
     */
    public void setConstraint_Equal(String constraint) {
        regConstraint(CK_EQ, fRES(constraint));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param constraint The value of constraint as notEqual.
     */
    public void setConstraint_NotEqual(String constraint) {
        regConstraint(CK_NE, fRES(constraint));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param constraint The value of constraint as greaterThan.
     */
    public void setConstraint_GreaterThan(String constraint) {
        regConstraint(CK_GT, fRES(constraint));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param constraint The value of constraint as lessThan.
     */
    public void setConstraint_LessThan(String constraint) {
        regConstraint(CK_LT, fRES(constraint));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param constraint The value of constraint as greaterEqual.
     */
    public void setConstraint_GreaterEqual(String constraint) {
        regConstraint(CK_GE, fRES(constraint));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param constraint The value of constraint as lessEqual.
     */
    public void setConstraint_LessEqual(String constraint) {
        regConstraint(CK_LE, fRES(constraint));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param constraint The value of constraint as prefixSearch.
     */
    public void setConstraint_PrefixSearch(String constraint) {
        regConstraint(CK_PS, fRES(constraint));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param constraintList The collection of constraint as inScope.
     */
    public void setConstraint_InScope(Collection<String> constraintList) {
        regConstraint(CK_INS, cTL(constraintList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param constraint The value of constraint as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setConstraint_LikeSearch(String constraint, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(constraint), getCValueConstraint(), "Constraint", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param constraint The value of constraint as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setConstraint_NotLikeSearch(String constraint, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(constraint), getCValueConstraint(), "Constraint", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setConstraint_IsNull() { regConstraint(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setConstraint_IsNotNull() { regConstraint(CK_ISNN, DOBJ); }

    protected void regConstraint(ConditionKey k, Object v) { regQ(k, v, getCValueConstraint(), "Constraint"); }
    abstract protected ConditionValue getCValueConstraint();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param behavior The value of behavior as equal.
     */
    public void setBehavior_Equal(String behavior) {
        regBehavior(CK_EQ, fRES(behavior));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param behavior The value of behavior as notEqual.
     */
    public void setBehavior_NotEqual(String behavior) {
        regBehavior(CK_NE, fRES(behavior));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param behavior The value of behavior as greaterThan.
     */
    public void setBehavior_GreaterThan(String behavior) {
        regBehavior(CK_GT, fRES(behavior));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param behavior The value of behavior as lessThan.
     */
    public void setBehavior_LessThan(String behavior) {
        regBehavior(CK_LT, fRES(behavior));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param behavior The value of behavior as greaterEqual.
     */
    public void setBehavior_GreaterEqual(String behavior) {
        regBehavior(CK_GE, fRES(behavior));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param behavior The value of behavior as lessEqual.
     */
    public void setBehavior_LessEqual(String behavior) {
        regBehavior(CK_LE, fRES(behavior));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param behavior The value of behavior as prefixSearch.
     */
    public void setBehavior_PrefixSearch(String behavior) {
        regBehavior(CK_PS, fRES(behavior));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param behaviorList The collection of behavior as inScope.
     */
    public void setBehavior_InScope(Collection<String> behaviorList) {
        regBehavior(CK_INS, cTL(behaviorList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param behavior The value of behavior as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBehavior_LikeSearch(String behavior, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(behavior), getCValueBehavior(), "Behavior", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param behavior The value of behavior as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBehavior_NotLikeSearch(String behavior, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(behavior), getCValueBehavior(), "Behavior", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setBehavior_IsNull() { regBehavior(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setBehavior_IsNotNull() { regBehavior(CK_ISNN, DOBJ); }

    protected void regBehavior(ConditionKey k, Object v) { regQ(k, v, getCValueBehavior(), "Behavior"); }
    abstract protected ConditionValue getCValueBehavior();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param partition The value of partition as equal.
     */
    public void setPartition_Equal(String partition) {
        regPartition(CK_EQ, fRES(partition));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param partition The value of partition as notEqual.
     */
    public void setPartition_NotEqual(String partition) {
        regPartition(CK_NE, fRES(partition));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param partition The value of partition as greaterThan.
     */
    public void setPartition_GreaterThan(String partition) {
        regPartition(CK_GT, fRES(partition));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param partition The value of partition as lessThan.
     */
    public void setPartition_LessThan(String partition) {
        regPartition(CK_LT, fRES(partition));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param partition The value of partition as greaterEqual.
     */
    public void setPartition_GreaterEqual(String partition) {
        regPartition(CK_GE, fRES(partition));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param partition The value of partition as lessEqual.
     */
    public void setPartition_LessEqual(String partition) {
        regPartition(CK_LE, fRES(partition));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param partition The value of partition as prefixSearch.
     */
    public void setPartition_PrefixSearch(String partition) {
        regPartition(CK_PS, fRES(partition));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param partitionList The collection of partition as inScope.
     */
    public void setPartition_InScope(Collection<String> partitionList) {
        regPartition(CK_INS, cTL(partitionList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param partition The value of partition as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPartition_LikeSearch(String partition, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(partition), getCValuePartition(), "Partition", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param partition The value of partition as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPartition_NotLikeSearch(String partition, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(partition), getCValuePartition(), "Partition", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setPartition_IsNull() { regPartition(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setPartition_IsNotNull() { regPartition(CK_ISNN, DOBJ); }

    protected void regPartition(ConditionKey k, Object v) { regQ(k, v, getCValuePartition(), "Partition"); }
    abstract protected ConditionValue getCValuePartition();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {LONGCHAR(2147483647)}
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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param client The value of client as equal.
     */
    public void setClient_Equal(String client) {
        regClient(CK_EQ, fRES(client));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param client The value of client as notEqual.
     */
    public void setClient_NotEqual(String client) {
        regClient(CK_NE, fRES(client));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param client The value of client as greaterThan.
     */
    public void setClient_GreaterThan(String client) {
        regClient(CK_GT, fRES(client));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param client The value of client as lessThan.
     */
    public void setClient_LessThan(String client) {
        regClient(CK_LT, fRES(client));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param client The value of client as greaterEqual.
     */
    public void setClient_GreaterEqual(String client) {
        regClient(CK_GE, fRES(client));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param client The value of client as lessEqual.
     */
    public void setClient_LessEqual(String client) {
        regClient(CK_LE, fRES(client));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param client The value of client as prefixSearch.
     */
    public void setClient_PrefixSearch(String client) {
        regClient(CK_PS, fRES(client));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param clientList The collection of client as inScope.
     */
    public void setClient_InScope(Collection<String> clientList) {
        regClient(CK_INS, cTL(clientList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param client The value of client as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setClient_LikeSearch(String client, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(client), getCValueClient(), "Client", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param client The value of client as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setClient_NotLikeSearch(String client, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(client), getCValueClient(), "Client", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setClient_IsNull() { regClient(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setClient_IsNotNull() { regClient(CK_ISNN, DOBJ); }

    protected void regClient(ConditionKey k, Object v) { regQ(k, v, getCValueClient(), "Client"); }
    abstract protected ConditionValue getCValueClient();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param supplier The value of supplier as equal.
     */
    public void setSupplier_Equal(String supplier) {
        regSupplier(CK_EQ, fRES(supplier));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param supplier The value of supplier as notEqual.
     */
    public void setSupplier_NotEqual(String supplier) {
        regSupplier(CK_NE, fRES(supplier));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param supplier The value of supplier as greaterThan.
     */
    public void setSupplier_GreaterThan(String supplier) {
        regSupplier(CK_GT, fRES(supplier));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param supplier The value of supplier as lessThan.
     */
    public void setSupplier_LessThan(String supplier) {
        regSupplier(CK_LT, fRES(supplier));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param supplier The value of supplier as greaterEqual.
     */
    public void setSupplier_GreaterEqual(String supplier) {
        regSupplier(CK_GE, fRES(supplier));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param supplier The value of supplier as lessEqual.
     */
    public void setSupplier_LessEqual(String supplier) {
        regSupplier(CK_LE, fRES(supplier));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param supplier The value of supplier as prefixSearch.
     */
    public void setSupplier_PrefixSearch(String supplier) {
        regSupplier(CK_PS, fRES(supplier));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param supplierList The collection of supplier as inScope.
     */
    public void setSupplier_InScope(Collection<String> supplierList) {
        regSupplier(CK_INS, cTL(supplierList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param supplier The value of supplier as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSupplier_LikeSearch(String supplier, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(supplier), getCValueSupplier(), "Supplier", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param supplier The value of supplier as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSupplier_NotLikeSearch(String supplier, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(supplier), getCValueSupplier(), "Supplier", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setSupplier_IsNull() { regSupplier(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setSupplier_IsNotNull() { regSupplier(CK_ISNN, DOBJ); }

    protected void regSupplier(ConditionKey k, Object v) { regQ(k, v, getCValueSupplier(), "Supplier"); }
    abstract protected ConditionValue getCValueSupplier();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param link The value of link as equal.
     */
    public void setLink_Equal(String link) {
        regLink(CK_EQ, fRES(link));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param link The value of link as notEqual.
     */
    public void setLink_NotEqual(String link) {
        regLink(CK_NE, fRES(link));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param link The value of link as greaterThan.
     */
    public void setLink_GreaterThan(String link) {
        regLink(CK_GT, fRES(link));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param link The value of link as lessThan.
     */
    public void setLink_LessThan(String link) {
        regLink(CK_LT, fRES(link));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param link The value of link as greaterEqual.
     */
    public void setLink_GreaterEqual(String link) {
        regLink(CK_GE, fRES(link));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param link The value of link as lessEqual.
     */
    public void setLink_LessEqual(String link) {
        regLink(CK_LE, fRES(link));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param link The value of link as prefixSearch.
     */
    public void setLink_PrefixSearch(String link) {
        regLink(CK_PS, fRES(link));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param linkList The collection of link as inScope.
     */
    public void setLink_InScope(Collection<String> linkList) {
        regLink(CK_INS, cTL(linkList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param link The value of link as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLink_LikeSearch(String link, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(link), getCValueLink(), "Link", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param link The value of link as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLink_NotLikeSearch(String link, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(link), getCValueLink(), "Link", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setLink_IsNull() { regLink(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setLink_IsNotNull() { regLink(CK_ISNN, DOBJ); }

    protected void regLink(ConditionKey k, Object v) { regQ(k, v, getCValueLink(), "Link"); }
    abstract protected ConditionValue getCValueLink();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TXrefCB.class.getName(); }
    String xCQ() { return TXrefCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
