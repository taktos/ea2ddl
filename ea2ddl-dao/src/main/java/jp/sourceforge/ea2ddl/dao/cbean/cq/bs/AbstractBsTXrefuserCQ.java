package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_xrefuser.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsTXrefuserCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTXrefuserCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_xrefuser";
    }
    
    public String getTableSqlName() {
        return "t_xrefuser";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {UQ : VARCHAR(255)}
     * @param xrefid The value of xrefid as equal.
     */
    public void setXrefid_Equal(String xrefid) {
        regXrefid(CK_EQ, fRES(xrefid));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param xrefid The value of xrefid as notEqual.
     */
    public void setXrefid_NotEqual(String xrefid) {
        regXrefid(CK_NE, fRES(xrefid));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param xrefid The value of xrefid as greaterThan.
     */
    public void setXrefid_GreaterThan(String xrefid) {
        regXrefid(CK_GT, fRES(xrefid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param xrefid The value of xrefid as lessThan.
     */
    public void setXrefid_LessThan(String xrefid) {
        regXrefid(CK_LT, fRES(xrefid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param xrefid The value of xrefid as greaterEqual.
     */
    public void setXrefid_GreaterEqual(String xrefid) {
        regXrefid(CK_GE, fRES(xrefid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param xrefid The value of xrefid as lessEqual.
     */
    public void setXrefid_LessEqual(String xrefid) {
        regXrefid(CK_LE, fRES(xrefid));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param xrefid The value of xrefid as prefixSearch.
     */
    public void setXrefid_PrefixSearch(String xrefid) {
        regXrefid(CK_PS, fRES(xrefid));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param xrefid The value of xrefid as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setXrefid_LikeSearch(String xrefid, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(xrefid), getCValueXrefid(), "XrefID", "Xrefid", "xrefid", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param xrefidList The collection of xrefid as inScope.
     */
    public void setXrefid_InScope(Collection<String> xrefidList) {
        regXrefid(CK_INS, cTL(xrefidList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param xrefid The collection of xrefid as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setXrefid_InScope(String xrefid, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(xrefid), getCValueXrefid(), "XrefID", "Xrefid", "xrefid", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setXrefid_IsNull() { regXrefid(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setXrefid_IsNotNull() { regXrefid(CK_ISNN, DUMMY_OBJECT); }

    protected void regXrefid(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueXrefid(), "XrefID", "Xrefid", "xrefid");
    }
    protected void registerInlineXrefid(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueXrefid(), "XrefID", "Xrefid", "xrefid");
    }
    abstract protected ConditionValue getCValueXrefid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param toolid The value of toolid as equal.
     */
    public void setToolid_Equal(String toolid) {
        regToolid(CK_EQ, fRES(toolid));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param toolid The value of toolid as notEqual.
     */
    public void setToolid_NotEqual(String toolid) {
        regToolid(CK_NE, fRES(toolid));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param toolid The value of toolid as greaterThan.
     */
    public void setToolid_GreaterThan(String toolid) {
        regToolid(CK_GT, fRES(toolid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param toolid The value of toolid as lessThan.
     */
    public void setToolid_LessThan(String toolid) {
        regToolid(CK_LT, fRES(toolid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param toolid The value of toolid as greaterEqual.
     */
    public void setToolid_GreaterEqual(String toolid) {
        regToolid(CK_GE, fRES(toolid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param toolid The value of toolid as lessEqual.
     */
    public void setToolid_LessEqual(String toolid) {
        regToolid(CK_LE, fRES(toolid));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param toolid The value of toolid as prefixSearch.
     */
    public void setToolid_PrefixSearch(String toolid) {
        regToolid(CK_PS, fRES(toolid));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param toolid The value of toolid as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setToolid_LikeSearch(String toolid, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(toolid), getCValueToolid(), "ToolID", "Toolid", "toolid", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param toolidList The collection of toolid as inScope.
     */
    public void setToolid_InScope(Collection<String> toolidList) {
        regToolid(CK_INS, cTL(toolidList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param toolid The collection of toolid as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setToolid_InScope(String toolid, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(toolid), getCValueToolid(), "ToolID", "Toolid", "toolid", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setToolid_IsNull() { regToolid(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setToolid_IsNotNull() { regToolid(CK_ISNN, DUMMY_OBJECT); }

    protected void regToolid(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueToolid(), "ToolID", "Toolid", "toolid");
    }
    protected void registerInlineToolid(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueToolid(), "ToolID", "Toolid", "toolid");
    }
    abstract protected ConditionValue getCValueToolid();

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
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param visibility The value of visibility as equal.
     */
    public void setVisibility_Equal(String visibility) {
        regVisibility(CK_EQ, fRES(visibility));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param visibility The value of visibility as notEqual.
     */
    public void setVisibility_NotEqual(String visibility) {
        regVisibility(CK_NE, fRES(visibility));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param visibility The value of visibility as greaterThan.
     */
    public void setVisibility_GreaterThan(String visibility) {
        regVisibility(CK_GT, fRES(visibility));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param visibility The value of visibility as lessThan.
     */
    public void setVisibility_LessThan(String visibility) {
        regVisibility(CK_LT, fRES(visibility));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param visibility The value of visibility as greaterEqual.
     */
    public void setVisibility_GreaterEqual(String visibility) {
        regVisibility(CK_GE, fRES(visibility));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param visibility The value of visibility as lessEqual.
     */
    public void setVisibility_LessEqual(String visibility) {
        regVisibility(CK_LE, fRES(visibility));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param visibility The value of visibility as prefixSearch.
     */
    public void setVisibility_PrefixSearch(String visibility) {
        regVisibility(CK_PS, fRES(visibility));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param visibility The value of visibility as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setVisibility_LikeSearch(String visibility, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(visibility), getCValueVisibility(), "Visibility", "Visibility", "visibility", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param visibilityList The collection of visibility as inScope.
     */
    public void setVisibility_InScope(Collection<String> visibilityList) {
        regVisibility(CK_INS, cTL(visibilityList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param visibility The collection of visibility as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setVisibility_InScope(String visibility, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(visibility), getCValueVisibility(), "Visibility", "Visibility", "visibility", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setVisibility_IsNull() { regVisibility(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setVisibility_IsNotNull() { regVisibility(CK_ISNN, DUMMY_OBJECT); }

    protected void regVisibility(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueVisibility(), "Visibility", "Visibility", "visibility");
    }
    protected void registerInlineVisibility(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueVisibility(), "Visibility", "Visibility", "visibility");
    }
    abstract protected ConditionValue getCValueVisibility();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param namespace The value of namespace as equal.
     */
    public void setNamespace_Equal(String namespace) {
        regNamespace(CK_EQ, fRES(namespace));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param namespace The value of namespace as notEqual.
     */
    public void setNamespace_NotEqual(String namespace) {
        regNamespace(CK_NE, fRES(namespace));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param namespace The value of namespace as greaterThan.
     */
    public void setNamespace_GreaterThan(String namespace) {
        regNamespace(CK_GT, fRES(namespace));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param namespace The value of namespace as lessThan.
     */
    public void setNamespace_LessThan(String namespace) {
        regNamespace(CK_LT, fRES(namespace));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param namespace The value of namespace as greaterEqual.
     */
    public void setNamespace_GreaterEqual(String namespace) {
        regNamespace(CK_GE, fRES(namespace));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param namespace The value of namespace as lessEqual.
     */
    public void setNamespace_LessEqual(String namespace) {
        regNamespace(CK_LE, fRES(namespace));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param namespace The value of namespace as prefixSearch.
     */
    public void setNamespace_PrefixSearch(String namespace) {
        regNamespace(CK_PS, fRES(namespace));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param namespace The value of namespace as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNamespace_LikeSearch(String namespace, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(namespace), getCValueNamespace(), "Namespace", "Namespace", "namespace", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param namespaceList The collection of namespace as inScope.
     */
    public void setNamespace_InScope(Collection<String> namespaceList) {
        regNamespace(CK_INS, cTL(namespaceList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param namespace The collection of namespace as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setNamespace_InScope(String namespace, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(namespace), getCValueNamespace(), "Namespace", "Namespace", "namespace", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setNamespace_IsNull() { regNamespace(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setNamespace_IsNotNull() { regNamespace(CK_ISNN, DUMMY_OBJECT); }

    protected void regNamespace(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueNamespace(), "Namespace", "Namespace", "namespace");
    }
    protected void registerInlineNamespace(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueNamespace(), "Namespace", "Namespace", "namespace");
    }
    abstract protected ConditionValue getCValueNamespace();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param requirement The value of requirement as equal.
     */
    public void setRequirement_Equal(String requirement) {
        regRequirement(CK_EQ, fRES(requirement));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param requirement The value of requirement as notEqual.
     */
    public void setRequirement_NotEqual(String requirement) {
        regRequirement(CK_NE, fRES(requirement));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param requirement The value of requirement as greaterThan.
     */
    public void setRequirement_GreaterThan(String requirement) {
        regRequirement(CK_GT, fRES(requirement));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param requirement The value of requirement as lessThan.
     */
    public void setRequirement_LessThan(String requirement) {
        regRequirement(CK_LT, fRES(requirement));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param requirement The value of requirement as greaterEqual.
     */
    public void setRequirement_GreaterEqual(String requirement) {
        regRequirement(CK_GE, fRES(requirement));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param requirement The value of requirement as lessEqual.
     */
    public void setRequirement_LessEqual(String requirement) {
        regRequirement(CK_LE, fRES(requirement));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param requirement The value of requirement as prefixSearch.
     */
    public void setRequirement_PrefixSearch(String requirement) {
        regRequirement(CK_PS, fRES(requirement));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param requirement The value of requirement as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRequirement_LikeSearch(String requirement, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(requirement), getCValueRequirement(), "Requirement", "Requirement", "requirement", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param requirementList The collection of requirement as inScope.
     */
    public void setRequirement_InScope(Collection<String> requirementList) {
        regRequirement(CK_INS, cTL(requirementList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param requirement The collection of requirement as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setRequirement_InScope(String requirement, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(requirement), getCValueRequirement(), "Requirement", "Requirement", "requirement", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setRequirement_IsNull() { regRequirement(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setRequirement_IsNotNull() { regRequirement(CK_ISNN, DUMMY_OBJECT); }

    protected void regRequirement(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueRequirement(), "Requirement", "Requirement", "requirement");
    }
    protected void registerInlineRequirement(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueRequirement(), "Requirement", "Requirement", "requirement");
    }
    abstract protected ConditionValue getCValueRequirement();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param constraint The value of constraint as equal.
     */
    public void setConstraint_Equal(String constraint) {
        regConstraint(CK_EQ, fRES(constraint));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param constraint The value of constraint as notEqual.
     */
    public void setConstraint_NotEqual(String constraint) {
        regConstraint(CK_NE, fRES(constraint));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param constraint The value of constraint as greaterThan.
     */
    public void setConstraint_GreaterThan(String constraint) {
        regConstraint(CK_GT, fRES(constraint));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param constraint The value of constraint as lessThan.
     */
    public void setConstraint_LessThan(String constraint) {
        regConstraint(CK_LT, fRES(constraint));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param constraint The value of constraint as greaterEqual.
     */
    public void setConstraint_GreaterEqual(String constraint) {
        regConstraint(CK_GE, fRES(constraint));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param constraint The value of constraint as lessEqual.
     */
    public void setConstraint_LessEqual(String constraint) {
        regConstraint(CK_LE, fRES(constraint));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param constraint The value of constraint as prefixSearch.
     */
    public void setConstraint_PrefixSearch(String constraint) {
        regConstraint(CK_PS, fRES(constraint));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param constraint The value of constraint as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setConstraint_LikeSearch(String constraint, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(constraint), getCValueConstraint(), "Constraint", "Constraint", "constraint", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param constraintList The collection of constraint as inScope.
     */
    public void setConstraint_InScope(Collection<String> constraintList) {
        regConstraint(CK_INS, cTL(constraintList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param constraint The collection of constraint as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setConstraint_InScope(String constraint, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(constraint), getCValueConstraint(), "Constraint", "Constraint", "constraint", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setConstraint_IsNull() { regConstraint(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setConstraint_IsNotNull() { regConstraint(CK_ISNN, DUMMY_OBJECT); }

    protected void regConstraint(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueConstraint(), "Constraint", "Constraint", "constraint");
    }
    protected void registerInlineConstraint(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueConstraint(), "Constraint", "Constraint", "constraint");
    }
    abstract protected ConditionValue getCValueConstraint();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param behavior The value of behavior as equal.
     */
    public void setBehavior_Equal(String behavior) {
        regBehavior(CK_EQ, fRES(behavior));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param behavior The value of behavior as notEqual.
     */
    public void setBehavior_NotEqual(String behavior) {
        regBehavior(CK_NE, fRES(behavior));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param behavior The value of behavior as greaterThan.
     */
    public void setBehavior_GreaterThan(String behavior) {
        regBehavior(CK_GT, fRES(behavior));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param behavior The value of behavior as lessThan.
     */
    public void setBehavior_LessThan(String behavior) {
        regBehavior(CK_LT, fRES(behavior));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param behavior The value of behavior as greaterEqual.
     */
    public void setBehavior_GreaterEqual(String behavior) {
        regBehavior(CK_GE, fRES(behavior));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param behavior The value of behavior as lessEqual.
     */
    public void setBehavior_LessEqual(String behavior) {
        regBehavior(CK_LE, fRES(behavior));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param behavior The value of behavior as prefixSearch.
     */
    public void setBehavior_PrefixSearch(String behavior) {
        regBehavior(CK_PS, fRES(behavior));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param behavior The value of behavior as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBehavior_LikeSearch(String behavior, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(behavior), getCValueBehavior(), "Behavior", "Behavior", "behavior", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param behaviorList The collection of behavior as inScope.
     */
    public void setBehavior_InScope(Collection<String> behaviorList) {
        regBehavior(CK_INS, cTL(behaviorList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param behavior The collection of behavior as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setBehavior_InScope(String behavior, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(behavior), getCValueBehavior(), "Behavior", "Behavior", "behavior", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setBehavior_IsNull() { regBehavior(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setBehavior_IsNotNull() { regBehavior(CK_ISNN, DUMMY_OBJECT); }

    protected void regBehavior(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueBehavior(), "Behavior", "Behavior", "behavior");
    }
    protected void registerInlineBehavior(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueBehavior(), "Behavior", "Behavior", "behavior");
    }
    abstract protected ConditionValue getCValueBehavior();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param partition The value of partition as equal.
     */
    public void setPartition_Equal(String partition) {
        regPartition(CK_EQ, fRES(partition));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param partition The value of partition as notEqual.
     */
    public void setPartition_NotEqual(String partition) {
        regPartition(CK_NE, fRES(partition));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param partition The value of partition as greaterThan.
     */
    public void setPartition_GreaterThan(String partition) {
        regPartition(CK_GT, fRES(partition));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param partition The value of partition as lessThan.
     */
    public void setPartition_LessThan(String partition) {
        regPartition(CK_LT, fRES(partition));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param partition The value of partition as greaterEqual.
     */
    public void setPartition_GreaterEqual(String partition) {
        regPartition(CK_GE, fRES(partition));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param partition The value of partition as lessEqual.
     */
    public void setPartition_LessEqual(String partition) {
        regPartition(CK_LE, fRES(partition));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param partition The value of partition as prefixSearch.
     */
    public void setPartition_PrefixSearch(String partition) {
        regPartition(CK_PS, fRES(partition));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param partition The value of partition as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPartition_LikeSearch(String partition, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(partition), getCValuePartition(), "Partition", "Partition", "partition", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param partitionList The collection of partition as inScope.
     */
    public void setPartition_InScope(Collection<String> partitionList) {
        regPartition(CK_INS, cTL(partitionList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param partition The collection of partition as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setPartition_InScope(String partition, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(partition), getCValuePartition(), "Partition", "Partition", "partition", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setPartition_IsNull() { regPartition(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setPartition_IsNotNull() { regPartition(CK_ISNN, DUMMY_OBJECT); }

    protected void regPartition(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePartition(), "Partition", "Partition", "partition");
    }
    protected void registerInlinePartition(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePartition(), "Partition", "Partition", "partition");
    }
    abstract protected ConditionValue getCValuePartition();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {LONGCHAR(2147483647)}
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
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param client The value of client as equal.
     */
    public void setClient_Equal(String client) {
        regClient(CK_EQ, fRES(client));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param client The value of client as notEqual.
     */
    public void setClient_NotEqual(String client) {
        regClient(CK_NE, fRES(client));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param client The value of client as greaterThan.
     */
    public void setClient_GreaterThan(String client) {
        regClient(CK_GT, fRES(client));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param client The value of client as lessThan.
     */
    public void setClient_LessThan(String client) {
        regClient(CK_LT, fRES(client));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param client The value of client as greaterEqual.
     */
    public void setClient_GreaterEqual(String client) {
        regClient(CK_GE, fRES(client));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param client The value of client as lessEqual.
     */
    public void setClient_LessEqual(String client) {
        regClient(CK_LE, fRES(client));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param client The value of client as prefixSearch.
     */
    public void setClient_PrefixSearch(String client) {
        regClient(CK_PS, fRES(client));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param client The value of client as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setClient_LikeSearch(String client, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(client), getCValueClient(), "Client", "Client", "client", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param clientList The collection of client as inScope.
     */
    public void setClient_InScope(Collection<String> clientList) {
        regClient(CK_INS, cTL(clientList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param client The collection of client as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setClient_InScope(String client, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(client), getCValueClient(), "Client", "Client", "client", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setClient_IsNull() { regClient(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setClient_IsNotNull() { regClient(CK_ISNN, DUMMY_OBJECT); }

    protected void regClient(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueClient(), "Client", "Client", "client");
    }
    protected void registerInlineClient(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueClient(), "Client", "Client", "client");
    }
    abstract protected ConditionValue getCValueClient();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param supplier The value of supplier as equal.
     */
    public void setSupplier_Equal(String supplier) {
        regSupplier(CK_EQ, fRES(supplier));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param supplier The value of supplier as notEqual.
     */
    public void setSupplier_NotEqual(String supplier) {
        regSupplier(CK_NE, fRES(supplier));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param supplier The value of supplier as greaterThan.
     */
    public void setSupplier_GreaterThan(String supplier) {
        regSupplier(CK_GT, fRES(supplier));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param supplier The value of supplier as lessThan.
     */
    public void setSupplier_LessThan(String supplier) {
        regSupplier(CK_LT, fRES(supplier));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param supplier The value of supplier as greaterEqual.
     */
    public void setSupplier_GreaterEqual(String supplier) {
        regSupplier(CK_GE, fRES(supplier));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param supplier The value of supplier as lessEqual.
     */
    public void setSupplier_LessEqual(String supplier) {
        regSupplier(CK_LE, fRES(supplier));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param supplier The value of supplier as prefixSearch.
     */
    public void setSupplier_PrefixSearch(String supplier) {
        regSupplier(CK_PS, fRES(supplier));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param supplier The value of supplier as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSupplier_LikeSearch(String supplier, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(supplier), getCValueSupplier(), "Supplier", "Supplier", "supplier", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param supplierList The collection of supplier as inScope.
     */
    public void setSupplier_InScope(Collection<String> supplierList) {
        regSupplier(CK_INS, cTL(supplierList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param supplier The collection of supplier as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setSupplier_InScope(String supplier, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(supplier), getCValueSupplier(), "Supplier", "Supplier", "supplier", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setSupplier_IsNull() { regSupplier(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setSupplier_IsNotNull() { regSupplier(CK_ISNN, DUMMY_OBJECT); }

    protected void regSupplier(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueSupplier(), "Supplier", "Supplier", "supplier");
    }
    protected void registerInlineSupplier(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueSupplier(), "Supplier", "Supplier", "supplier");
    }
    abstract protected ConditionValue getCValueSupplier();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param link The value of link as equal.
     */
    public void setLink_Equal(String link) {
        regLink(CK_EQ, fRES(link));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param link The value of link as notEqual.
     */
    public void setLink_NotEqual(String link) {
        regLink(CK_NE, fRES(link));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param link The value of link as greaterThan.
     */
    public void setLink_GreaterThan(String link) {
        regLink(CK_GT, fRES(link));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param link The value of link as lessThan.
     */
    public void setLink_LessThan(String link) {
        regLink(CK_LT, fRES(link));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param link The value of link as greaterEqual.
     */
    public void setLink_GreaterEqual(String link) {
        regLink(CK_GE, fRES(link));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param link The value of link as lessEqual.
     */
    public void setLink_LessEqual(String link) {
        regLink(CK_LE, fRES(link));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param link The value of link as prefixSearch.
     */
    public void setLink_PrefixSearch(String link) {
        regLink(CK_PS, fRES(link));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param link The value of link as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLink_LikeSearch(String link, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(link), getCValueLink(), "Link", "Link", "link", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param linkList The collection of link as inScope.
     */
    public void setLink_InScope(Collection<String> linkList) {
        regLink(CK_INS, cTL(linkList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param link The collection of link as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setLink_InScope(String link, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(link), getCValueLink(), "Link", "Link", "link", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setLink_IsNull() { regLink(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setLink_IsNotNull() { regLink(CK_ISNN, DUMMY_OBJECT); }

    protected void regLink(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueLink(), "Link", "Link", "link");
    }
    protected void registerInlineLink(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueLink(), "Link", "Link", "link");
    }
    abstract protected ConditionValue getCValueLink();

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TXrefuserCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TXrefuserCQ.class.getName(); }
}
