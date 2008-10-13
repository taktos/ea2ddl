package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_diagram.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsTDiagramCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTDiagramCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_diagram";
    }
    
    public String getTableSqlName() {
        return "t_diagram";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {UQ : COUNTER : NotNull}
     * @param diagramId The value of diagramId as equal.
     */
    public void setDiagramId_Equal(java.lang.Integer diagramId) {
        regDiagramId(CK_EQ, diagramId);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param diagramId The value of diagramId as notEqual.
     */
    public void setDiagramId_NotEqual(java.lang.Integer diagramId) {
        regDiagramId(CK_NE, diagramId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param diagramId The value of diagramId as greaterThan.
     */
    public void setDiagramId_GreaterThan(java.lang.Integer diagramId) {
        regDiagramId(CK_GT, diagramId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param diagramId The value of diagramId as lessThan.
     */
    public void setDiagramId_LessThan(java.lang.Integer diagramId) {
        regDiagramId(CK_LT, diagramId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param diagramId The value of diagramId as greaterEqual.
     */
    public void setDiagramId_GreaterEqual(java.lang.Integer diagramId) {
        regDiagramId(CK_GE, diagramId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param diagramId The value of diagramId as lessEqual.
     */
    public void setDiagramId_LessEqual(java.lang.Integer diagramId) {
        regDiagramId(CK_LE, diagramId);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param diagramIdList The collection of diagramId as inScope.
     */
    public void setDiagramId_InScope(Collection<java.lang.Integer> diagramIdList) {
        regDiagramId(CK_INS, cTL(diagramIdList));
    }

    protected void regDiagramId(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueDiagramId(), "Diagram_ID", "DiagramId", "diagramId");
    }
    protected void registerInlineDiagramId(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueDiagramId(), "Diagram_ID", "DiagramId", "diagramId");
    }
    abstract protected ConditionValue getCValueDiagramId();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param packageId The value of packageId as equal.
     */
    public void setPackageId_Equal(java.lang.Integer packageId) {
        regPackageId(CK_EQ, packageId);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param packageId The value of packageId as notEqual.
     */
    public void setPackageId_NotEqual(java.lang.Integer packageId) {
        regPackageId(CK_NE, packageId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param packageId The value of packageId as greaterThan.
     */
    public void setPackageId_GreaterThan(java.lang.Integer packageId) {
        regPackageId(CK_GT, packageId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param packageId The value of packageId as lessThan.
     */
    public void setPackageId_LessThan(java.lang.Integer packageId) {
        regPackageId(CK_LT, packageId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param packageId The value of packageId as greaterEqual.
     */
    public void setPackageId_GreaterEqual(java.lang.Integer packageId) {
        regPackageId(CK_GE, packageId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param packageId The value of packageId as lessEqual.
     */
    public void setPackageId_LessEqual(java.lang.Integer packageId) {
        regPackageId(CK_LE, packageId);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param packageIdList The collection of packageId as inScope.
     */
    public void setPackageId_InScope(Collection<java.lang.Integer> packageIdList) {
        regPackageId(CK_INS, cTL(packageIdList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setPackageId_IsNull() { regPackageId(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setPackageId_IsNotNull() { regPackageId(CK_ISNN, DUMMY_OBJECT); }

    protected void regPackageId(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePackageId(), "Package_ID", "PackageId", "packageId");
    }
    protected void registerInlinePackageId(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePackageId(), "Package_ID", "PackageId", "packageId");
    }
    abstract protected ConditionValue getCValuePackageId();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param parentid The value of parentid as equal.
     */
    public void setParentid_Equal(java.lang.Integer parentid) {
        regParentid(CK_EQ, parentid);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param parentid The value of parentid as notEqual.
     */
    public void setParentid_NotEqual(java.lang.Integer parentid) {
        regParentid(CK_NE, parentid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param parentid The value of parentid as greaterThan.
     */
    public void setParentid_GreaterThan(java.lang.Integer parentid) {
        regParentid(CK_GT, parentid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param parentid The value of parentid as lessThan.
     */
    public void setParentid_LessThan(java.lang.Integer parentid) {
        regParentid(CK_LT, parentid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param parentid The value of parentid as greaterEqual.
     */
    public void setParentid_GreaterEqual(java.lang.Integer parentid) {
        regParentid(CK_GE, parentid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param parentid The value of parentid as lessEqual.
     */
    public void setParentid_LessEqual(java.lang.Integer parentid) {
        regParentid(CK_LE, parentid);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param parentidList The collection of parentid as inScope.
     */
    public void setParentid_InScope(Collection<java.lang.Integer> parentidList) {
        regParentid(CK_INS, cTL(parentidList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setParentid_IsNull() { regParentid(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setParentid_IsNotNull() { regParentid(CK_ISNN, DUMMY_OBJECT); }

    protected void regParentid(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueParentid(), "ParentID", "Parentid", "parentid");
    }
    protected void registerInlineParentid(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueParentid(), "ParentID", "Parentid", "parentid");
    }
    abstract protected ConditionValue getCValueParentid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param diagramType The value of diagramType as equal.
     */
    public void setDiagramType_Equal(String diagramType) {
        regDiagramType(CK_EQ, fRES(diagramType));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param diagramType The value of diagramType as notEqual.
     */
    public void setDiagramType_NotEqual(String diagramType) {
        regDiagramType(CK_NE, fRES(diagramType));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param diagramType The value of diagramType as greaterThan.
     */
    public void setDiagramType_GreaterThan(String diagramType) {
        regDiagramType(CK_GT, fRES(diagramType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param diagramType The value of diagramType as lessThan.
     */
    public void setDiagramType_LessThan(String diagramType) {
        regDiagramType(CK_LT, fRES(diagramType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param diagramType The value of diagramType as greaterEqual.
     */
    public void setDiagramType_GreaterEqual(String diagramType) {
        regDiagramType(CK_GE, fRES(diagramType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param diagramType The value of diagramType as lessEqual.
     */
    public void setDiagramType_LessEqual(String diagramType) {
        regDiagramType(CK_LE, fRES(diagramType));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param diagramType The value of diagramType as prefixSearch.
     */
    public void setDiagramType_PrefixSearch(String diagramType) {
        regDiagramType(CK_PS, fRES(diagramType));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param diagramType The value of diagramType as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDiagramType_LikeSearch(String diagramType, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(diagramType), getCValueDiagramType(), "Diagram_Type", "DiagramType", "diagramType", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param diagramTypeList The collection of diagramType as inScope.
     */
    public void setDiagramType_InScope(Collection<String> diagramTypeList) {
        regDiagramType(CK_INS, cTL(diagramTypeList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param diagramType The collection of diagramType as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setDiagramType_InScope(String diagramType, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(diagramType), getCValueDiagramType(), "Diagram_Type", "DiagramType", "diagramType", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setDiagramType_IsNull() { regDiagramType(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setDiagramType_IsNotNull() { regDiagramType(CK_ISNN, DUMMY_OBJECT); }

    protected void regDiagramType(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueDiagramType(), "Diagram_Type", "DiagramType", "diagramType");
    }
    protected void registerInlineDiagramType(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueDiagramType(), "Diagram_Type", "DiagramType", "diagramType");
    }
    abstract protected ConditionValue getCValueDiagramType();

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
     * @param version The value of version as equal.
     */
    public void setVersion_Equal(String version) {
        regVersion(CK_EQ, fRES(version));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param version The value of version as notEqual.
     */
    public void setVersion_NotEqual(String version) {
        regVersion(CK_NE, fRES(version));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param version The value of version as greaterThan.
     */
    public void setVersion_GreaterThan(String version) {
        regVersion(CK_GT, fRES(version));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param version The value of version as lessThan.
     */
    public void setVersion_LessThan(String version) {
        regVersion(CK_LT, fRES(version));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param version The value of version as greaterEqual.
     */
    public void setVersion_GreaterEqual(String version) {
        regVersion(CK_GE, fRES(version));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param version The value of version as lessEqual.
     */
    public void setVersion_LessEqual(String version) {
        regVersion(CK_LE, fRES(version));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param version The value of version as prefixSearch.
     */
    public void setVersion_PrefixSearch(String version) {
        regVersion(CK_PS, fRES(version));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param version The value of version as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setVersion_LikeSearch(String version, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(version), getCValueVersion(), "Version", "Version", "version", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param versionList The collection of version as inScope.
     */
    public void setVersion_InScope(Collection<String> versionList) {
        regVersion(CK_INS, cTL(versionList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param version The collection of version as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setVersion_InScope(String version, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(version), getCValueVersion(), "Version", "Version", "version", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setVersion_IsNull() { regVersion(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setVersion_IsNotNull() { regVersion(CK_ISNN, DUMMY_OBJECT); }

    protected void regVersion(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueVersion(), "Version", "Version", "version");
    }
    protected void registerInlineVersion(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueVersion(), "Version", "Version", "version");
    }
    abstract protected ConditionValue getCValueVersion();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param author The value of author as equal.
     */
    public void setAuthor_Equal(String author) {
        regAuthor(CK_EQ, fRES(author));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param author The value of author as notEqual.
     */
    public void setAuthor_NotEqual(String author) {
        regAuthor(CK_NE, fRES(author));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param author The value of author as greaterThan.
     */
    public void setAuthor_GreaterThan(String author) {
        regAuthor(CK_GT, fRES(author));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param author The value of author as lessThan.
     */
    public void setAuthor_LessThan(String author) {
        regAuthor(CK_LT, fRES(author));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param author The value of author as greaterEqual.
     */
    public void setAuthor_GreaterEqual(String author) {
        regAuthor(CK_GE, fRES(author));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param author The value of author as lessEqual.
     */
    public void setAuthor_LessEqual(String author) {
        regAuthor(CK_LE, fRES(author));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param author The value of author as prefixSearch.
     */
    public void setAuthor_PrefixSearch(String author) {
        regAuthor(CK_PS, fRES(author));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param author The value of author as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAuthor_LikeSearch(String author, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(author), getCValueAuthor(), "Author", "Author", "author", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param authorList The collection of author as inScope.
     */
    public void setAuthor_InScope(Collection<String> authorList) {
        regAuthor(CK_INS, cTL(authorList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param author The collection of author as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setAuthor_InScope(String author, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(author), getCValueAuthor(), "Author", "Author", "author", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setAuthor_IsNull() { regAuthor(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setAuthor_IsNotNull() { regAuthor(CK_ISNN, DUMMY_OBJECT); }

    protected void regAuthor(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueAuthor(), "Author", "Author", "author");
    }
    protected void registerInlineAuthor(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueAuthor(), "Author", "Author", "author");
    }
    abstract protected ConditionValue getCValueAuthor();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param showdetails The value of showdetails as equal.
     */
    public void setShowdetails_Equal(java.lang.Integer showdetails) {
        regShowdetails(CK_EQ, showdetails);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param showdetails The value of showdetails as notEqual.
     */
    public void setShowdetails_NotEqual(java.lang.Integer showdetails) {
        regShowdetails(CK_NE, showdetails);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param showdetails The value of showdetails as greaterThan.
     */
    public void setShowdetails_GreaterThan(java.lang.Integer showdetails) {
        regShowdetails(CK_GT, showdetails);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param showdetails The value of showdetails as lessThan.
     */
    public void setShowdetails_LessThan(java.lang.Integer showdetails) {
        regShowdetails(CK_LT, showdetails);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param showdetails The value of showdetails as greaterEqual.
     */
    public void setShowdetails_GreaterEqual(java.lang.Integer showdetails) {
        regShowdetails(CK_GE, showdetails);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param showdetails The value of showdetails as lessEqual.
     */
    public void setShowdetails_LessEqual(java.lang.Integer showdetails) {
        regShowdetails(CK_LE, showdetails);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param showdetailsList The collection of showdetails as inScope.
     */
    public void setShowdetails_InScope(Collection<java.lang.Integer> showdetailsList) {
        regShowdetails(CK_INS, cTL(showdetailsList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setShowdetails_IsNull() { regShowdetails(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setShowdetails_IsNotNull() { regShowdetails(CK_ISNN, DUMMY_OBJECT); }

    protected void regShowdetails(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueShowdetails(), "ShowDetails", "Showdetails", "showdetails");
    }
    protected void registerInlineShowdetails(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueShowdetails(), "ShowDetails", "Showdetails", "showdetails");
    }
    abstract protected ConditionValue getCValueShowdetails();

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
     * Equal(=). And NullIgnored, OnceRegistered. {BIT : NotNull}
     * @param attpub The value of attpub as equal.
     */
    public void setAttpub_Equal(Boolean attpub) {
        regAttpub(CK_EQ, attpub);
    }

    protected void regAttpub(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueAttpub(), "AttPub", "Attpub", "attpub");
    }
    protected void registerInlineAttpub(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueAttpub(), "AttPub", "Attpub", "attpub");
    }
    abstract protected ConditionValue getCValueAttpub();

    /**
     * Equal(=). And NullIgnored, OnceRegistered. {BIT : NotNull}
     * @param attpri The value of attpri as equal.
     */
    public void setAttpri_Equal(Boolean attpri) {
        regAttpri(CK_EQ, attpri);
    }

    protected void regAttpri(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueAttpri(), "AttPri", "Attpri", "attpri");
    }
    protected void registerInlineAttpri(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueAttpri(), "AttPri", "Attpri", "attpri");
    }
    abstract protected ConditionValue getCValueAttpri();

    /**
     * Equal(=). And NullIgnored, OnceRegistered. {BIT : NotNull}
     * @param attpro The value of attpro as equal.
     */
    public void setAttpro_Equal(Boolean attpro) {
        regAttpro(CK_EQ, attpro);
    }

    protected void regAttpro(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueAttpro(), "AttPro", "Attpro", "attpro");
    }
    protected void registerInlineAttpro(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueAttpro(), "AttPro", "Attpro", "attpro");
    }
    abstract protected ConditionValue getCValueAttpro();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(1)}
     * @param orientation The value of orientation as equal.
     */
    public void setOrientation_Equal(String orientation) {
        regOrientation(CK_EQ, fRES(orientation));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param orientation The value of orientation as notEqual.
     */
    public void setOrientation_NotEqual(String orientation) {
        regOrientation(CK_NE, fRES(orientation));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param orientation The value of orientation as greaterThan.
     */
    public void setOrientation_GreaterThan(String orientation) {
        regOrientation(CK_GT, fRES(orientation));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param orientation The value of orientation as lessThan.
     */
    public void setOrientation_LessThan(String orientation) {
        regOrientation(CK_LT, fRES(orientation));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param orientation The value of orientation as greaterEqual.
     */
    public void setOrientation_GreaterEqual(String orientation) {
        regOrientation(CK_GE, fRES(orientation));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param orientation The value of orientation as lessEqual.
     */
    public void setOrientation_LessEqual(String orientation) {
        regOrientation(CK_LE, fRES(orientation));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param orientation The value of orientation as prefixSearch.
     */
    public void setOrientation_PrefixSearch(String orientation) {
        regOrientation(CK_PS, fRES(orientation));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param orientation The value of orientation as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrientation_LikeSearch(String orientation, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(orientation), getCValueOrientation(), "Orientation", "Orientation", "orientation", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param orientationList The collection of orientation as inScope.
     */
    public void setOrientation_InScope(Collection<String> orientationList) {
        regOrientation(CK_INS, cTL(orientationList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param orientation The collection of orientation as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setOrientation_InScope(String orientation, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(orientation), getCValueOrientation(), "Orientation", "Orientation", "orientation", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setOrientation_IsNull() { regOrientation(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setOrientation_IsNotNull() { regOrientation(CK_ISNN, DUMMY_OBJECT); }

    protected void regOrientation(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueOrientation(), "Orientation", "Orientation", "orientation");
    }
    protected void registerInlineOrientation(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueOrientation(), "Orientation", "Orientation", "orientation");
    }
    abstract protected ConditionValue getCValueOrientation();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param cx The value of cx as equal.
     */
    public void setCx_Equal(java.lang.Integer cx) {
        regCx(CK_EQ, cx);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param cx The value of cx as notEqual.
     */
    public void setCx_NotEqual(java.lang.Integer cx) {
        regCx(CK_NE, cx);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param cx The value of cx as greaterThan.
     */
    public void setCx_GreaterThan(java.lang.Integer cx) {
        regCx(CK_GT, cx);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param cx The value of cx as lessThan.
     */
    public void setCx_LessThan(java.lang.Integer cx) {
        regCx(CK_LT, cx);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param cx The value of cx as greaterEqual.
     */
    public void setCx_GreaterEqual(java.lang.Integer cx) {
        regCx(CK_GE, cx);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param cx The value of cx as lessEqual.
     */
    public void setCx_LessEqual(java.lang.Integer cx) {
        regCx(CK_LE, cx);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param cxList The collection of cx as inScope.
     */
    public void setCx_InScope(Collection<java.lang.Integer> cxList) {
        regCx(CK_INS, cTL(cxList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setCx_IsNull() { regCx(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setCx_IsNotNull() { regCx(CK_ISNN, DUMMY_OBJECT); }

    protected void regCx(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueCx(), "cx", "Cx", "cx");
    }
    protected void registerInlineCx(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueCx(), "cx", "Cx", "cx");
    }
    abstract protected ConditionValue getCValueCx();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param cy The value of cy as equal.
     */
    public void setCy_Equal(java.lang.Integer cy) {
        regCy(CK_EQ, cy);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param cy The value of cy as notEqual.
     */
    public void setCy_NotEqual(java.lang.Integer cy) {
        regCy(CK_NE, cy);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param cy The value of cy as greaterThan.
     */
    public void setCy_GreaterThan(java.lang.Integer cy) {
        regCy(CK_GT, cy);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param cy The value of cy as lessThan.
     */
    public void setCy_LessThan(java.lang.Integer cy) {
        regCy(CK_LT, cy);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param cy The value of cy as greaterEqual.
     */
    public void setCy_GreaterEqual(java.lang.Integer cy) {
        regCy(CK_GE, cy);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param cy The value of cy as lessEqual.
     */
    public void setCy_LessEqual(java.lang.Integer cy) {
        regCy(CK_LE, cy);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param cyList The collection of cy as inScope.
     */
    public void setCy_InScope(Collection<java.lang.Integer> cyList) {
        regCy(CK_INS, cTL(cyList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setCy_IsNull() { regCy(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setCy_IsNotNull() { regCy(CK_ISNN, DUMMY_OBJECT); }

    protected void regCy(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueCy(), "cy", "Cy", "cy");
    }
    protected void registerInlineCy(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueCy(), "cy", "Cy", "cy");
    }
    abstract protected ConditionValue getCValueCy();
    
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
     * Equal(=). And NullIgnored, OnceRegistered. {DATETIME}
     * @param createddate The value of createddate as equal.
     */
    public void setCreateddate_Equal(java.sql.Timestamp createddate) {
        regCreateddate(CK_EQ, createddate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param createddate The value of createddate as greaterThan.
     */
    public void setCreateddate_GreaterThan(java.sql.Timestamp createddate) {
        regCreateddate(CK_GT, createddate);
    }

    /**
     * LessThan(&gt;). And NullIgnored, OnceRegistered.
     * @param createddate The value of createddate as lessThan.
     */
    public void setCreateddate_LessThan(java.sql.Timestamp createddate) {
        regCreateddate(CK_LT, createddate);
    }

    /**
     * GreaterEqual(&gt;). And NullIgnored, OnceRegistered.
     * @param createddate The value of createddate as greaterEqual.
     */
    public void setCreateddate_GreaterEqual(java.sql.Timestamp createddate) {
        regCreateddate(CK_GE, createddate);
    }

    /**
     * LessEqual(&gt;). And NullIgnored, OnceRegistered.
     * @param createddate The value of createddate as lessEqual.
     */
    public void setCreateddate_LessEqual(java.sql.Timestamp createddate) {
        regCreateddate(CK_LE, createddate);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt;= $toDate). And NullIgnored, OnceRegistered. {DATETIME}
     * @param fromDate The from-date of createddate. (Nullable)
     * @param toDate The to-date of createddate. (Nullable)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setCreateddate_FromTo(java.util.Date fromDate, java.util.Date toDate, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.FromToOption fromToOption) {
        registerFromToQuery((fromDate != null ? new java.sql.Timestamp(fromDate.getTime()) : null), (toDate != null ? new java.sql.Timestamp(toDate.getTime()) : null), getCValueCreateddate(), "CreatedDate", "Createddate", "createddate", fromToOption);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt; $toDate + 1). And NullIgnored, OnceRegistered. {DATETIME}
     * @param fromDate The from-date of createddate. (Nullable)
     * @param toDate The to-date of createddate. (Nullable)
     */
    public void setCreateddate_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setCreateddate_FromTo(fromDate, toDate, new jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.DateFromToOption());
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setCreateddate_IsNull() { regCreateddate(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setCreateddate_IsNotNull() { regCreateddate(CK_ISNN, DUMMY_OBJECT); }

    protected void regCreateddate(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueCreateddate(), "CreatedDate", "Createddate", "createddate");
    }
    protected void registerInlineCreateddate(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueCreateddate(), "CreatedDate", "Createddate", "createddate");
    }
    abstract protected ConditionValue getCValueCreateddate();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {DATETIME}
     * @param modifieddate The value of modifieddate as equal.
     */
    public void setModifieddate_Equal(java.sql.Timestamp modifieddate) {
        regModifieddate(CK_EQ, modifieddate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param modifieddate The value of modifieddate as greaterThan.
     */
    public void setModifieddate_GreaterThan(java.sql.Timestamp modifieddate) {
        regModifieddate(CK_GT, modifieddate);
    }

    /**
     * LessThan(&gt;). And NullIgnored, OnceRegistered.
     * @param modifieddate The value of modifieddate as lessThan.
     */
    public void setModifieddate_LessThan(java.sql.Timestamp modifieddate) {
        regModifieddate(CK_LT, modifieddate);
    }

    /**
     * GreaterEqual(&gt;). And NullIgnored, OnceRegistered.
     * @param modifieddate The value of modifieddate as greaterEqual.
     */
    public void setModifieddate_GreaterEqual(java.sql.Timestamp modifieddate) {
        regModifieddate(CK_GE, modifieddate);
    }

    /**
     * LessEqual(&gt;). And NullIgnored, OnceRegistered.
     * @param modifieddate The value of modifieddate as lessEqual.
     */
    public void setModifieddate_LessEqual(java.sql.Timestamp modifieddate) {
        regModifieddate(CK_LE, modifieddate);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt;= $toDate). And NullIgnored, OnceRegistered. {DATETIME}
     * @param fromDate The from-date of modifieddate. (Nullable)
     * @param toDate The to-date of modifieddate. (Nullable)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setModifieddate_FromTo(java.util.Date fromDate, java.util.Date toDate, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.FromToOption fromToOption) {
        registerFromToQuery((fromDate != null ? new java.sql.Timestamp(fromDate.getTime()) : null), (toDate != null ? new java.sql.Timestamp(toDate.getTime()) : null), getCValueModifieddate(), "ModifiedDate", "Modifieddate", "modifieddate", fromToOption);
    }

    /**
     * FromTo($fromDate &lt;= COLUMN_NAME &lt; $toDate + 1). And NullIgnored, OnceRegistered. {DATETIME}
     * @param fromDate The from-date of modifieddate. (Nullable)
     * @param toDate The to-date of modifieddate. (Nullable)
     */
    public void setModifieddate_DateFromTo(java.util.Date fromDate, java.util.Date toDate) {
        setModifieddate_FromTo(fromDate, toDate, new jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.DateFromToOption());
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setModifieddate_IsNull() { regModifieddate(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setModifieddate_IsNotNull() { regModifieddate(CK_ISNN, DUMMY_OBJECT); }

    protected void regModifieddate(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueModifieddate(), "ModifiedDate", "Modifieddate", "modifieddate");
    }
    protected void registerInlineModifieddate(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueModifieddate(), "ModifiedDate", "Modifieddate", "modifieddate");
    }
    abstract protected ConditionValue getCValueModifieddate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param htmlpath The value of htmlpath as equal.
     */
    public void setHtmlpath_Equal(String htmlpath) {
        regHtmlpath(CK_EQ, fRES(htmlpath));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param htmlpath The value of htmlpath as notEqual.
     */
    public void setHtmlpath_NotEqual(String htmlpath) {
        regHtmlpath(CK_NE, fRES(htmlpath));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param htmlpath The value of htmlpath as greaterThan.
     */
    public void setHtmlpath_GreaterThan(String htmlpath) {
        regHtmlpath(CK_GT, fRES(htmlpath));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param htmlpath The value of htmlpath as lessThan.
     */
    public void setHtmlpath_LessThan(String htmlpath) {
        regHtmlpath(CK_LT, fRES(htmlpath));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param htmlpath The value of htmlpath as greaterEqual.
     */
    public void setHtmlpath_GreaterEqual(String htmlpath) {
        regHtmlpath(CK_GE, fRES(htmlpath));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param htmlpath The value of htmlpath as lessEqual.
     */
    public void setHtmlpath_LessEqual(String htmlpath) {
        regHtmlpath(CK_LE, fRES(htmlpath));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param htmlpath The value of htmlpath as prefixSearch.
     */
    public void setHtmlpath_PrefixSearch(String htmlpath) {
        regHtmlpath(CK_PS, fRES(htmlpath));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param htmlpath The value of htmlpath as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHtmlpath_LikeSearch(String htmlpath, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(htmlpath), getCValueHtmlpath(), "HTMLPath", "Htmlpath", "htmlpath", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param htmlpathList The collection of htmlpath as inScope.
     */
    public void setHtmlpath_InScope(Collection<String> htmlpathList) {
        regHtmlpath(CK_INS, cTL(htmlpathList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param htmlpath The collection of htmlpath as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setHtmlpath_InScope(String htmlpath, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(htmlpath), getCValueHtmlpath(), "HTMLPath", "Htmlpath", "htmlpath", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setHtmlpath_IsNull() { regHtmlpath(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setHtmlpath_IsNotNull() { regHtmlpath(CK_ISNN, DUMMY_OBJECT); }

    protected void regHtmlpath(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueHtmlpath(), "HTMLPath", "Htmlpath", "htmlpath");
    }
    protected void registerInlineHtmlpath(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueHtmlpath(), "HTMLPath", "Htmlpath", "htmlpath");
    }
    abstract protected ConditionValue getCValueHtmlpath();

    /**
     * Equal(=). And NullIgnored, OnceRegistered. {BIT : NotNull}
     * @param showforeign The value of showforeign as equal.
     */
    public void setShowforeign_Equal(Boolean showforeign) {
        regShowforeign(CK_EQ, showforeign);
    }

    protected void regShowforeign(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueShowforeign(), "ShowForeign", "Showforeign", "showforeign");
    }
    protected void registerInlineShowforeign(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueShowforeign(), "ShowForeign", "Showforeign", "showforeign");
    }
    abstract protected ConditionValue getCValueShowforeign();

    /**
     * Equal(=). And NullIgnored, OnceRegistered. {BIT : NotNull}
     * @param showborder The value of showborder as equal.
     */
    public void setShowborder_Equal(Boolean showborder) {
        regShowborder(CK_EQ, showborder);
    }

    protected void regShowborder(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueShowborder(), "ShowBorder", "Showborder", "showborder");
    }
    protected void registerInlineShowborder(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueShowborder(), "ShowBorder", "Showborder", "showborder");
    }
    abstract protected ConditionValue getCValueShowborder();

    /**
     * Equal(=). And NullIgnored, OnceRegistered. {BIT : NotNull}
     * @param showpackagecontents The value of showpackagecontents as equal.
     */
    public void setShowpackagecontents_Equal(Boolean showpackagecontents) {
        regShowpackagecontents(CK_EQ, showpackagecontents);
    }

    protected void regShowpackagecontents(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueShowpackagecontents(), "ShowPackageContents", "Showpackagecontents", "showpackagecontents");
    }
    protected void registerInlineShowpackagecontents(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueShowpackagecontents(), "ShowPackageContents", "Showpackagecontents", "showpackagecontents");
    }
    abstract protected ConditionValue getCValueShowpackagecontents();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param pdata The value of pdata as equal.
     */
    public void setPdata_Equal(String pdata) {
        regPdata(CK_EQ, fRES(pdata));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata The value of pdata as notEqual.
     */
    public void setPdata_NotEqual(String pdata) {
        regPdata(CK_NE, fRES(pdata));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata The value of pdata as greaterThan.
     */
    public void setPdata_GreaterThan(String pdata) {
        regPdata(CK_GT, fRES(pdata));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata The value of pdata as lessThan.
     */
    public void setPdata_LessThan(String pdata) {
        regPdata(CK_LT, fRES(pdata));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata The value of pdata as greaterEqual.
     */
    public void setPdata_GreaterEqual(String pdata) {
        regPdata(CK_GE, fRES(pdata));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata The value of pdata as lessEqual.
     */
    public void setPdata_LessEqual(String pdata) {
        regPdata(CK_LE, fRES(pdata));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata The value of pdata as prefixSearch.
     */
    public void setPdata_PrefixSearch(String pdata) {
        regPdata(CK_PS, fRES(pdata));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param pdata The value of pdata as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPdata_LikeSearch(String pdata, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(pdata), getCValuePdata(), "PDATA", "Pdata", "pdata", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param pdataList The collection of pdata as inScope.
     */
    public void setPdata_InScope(Collection<String> pdataList) {
        regPdata(CK_INS, cTL(pdataList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param pdata The collection of pdata as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setPdata_InScope(String pdata, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(pdata), getCValuePdata(), "PDATA", "Pdata", "pdata", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setPdata_IsNull() { regPdata(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setPdata_IsNotNull() { regPdata(CK_ISNN, DUMMY_OBJECT); }

    protected void regPdata(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePdata(), "PDATA", "Pdata", "pdata");
    }
    protected void registerInlinePdata(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePdata(), "PDATA", "Pdata", "pdata");
    }
    abstract protected ConditionValue getCValuePdata();

    /**
     * Equal(=). And NullIgnored, OnceRegistered. {BIT : NotNull}
     * @param locked The value of locked as equal.
     */
    public void setLocked_Equal(Boolean locked) {
        regLocked(CK_EQ, locked);
    }

    protected void regLocked(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueLocked(), "Locked", "Locked", "locked");
    }
    protected void registerInlineLocked(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueLocked(), "Locked", "Locked", "locked");
    }
    abstract protected ConditionValue getCValueLocked();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {UQ : VARCHAR(40)}
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
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param tpos The value of tpos as equal.
     */
    public void setTpos_Equal(java.lang.Integer tpos) {
        regTpos(CK_EQ, tpos);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param tpos The value of tpos as notEqual.
     */
    public void setTpos_NotEqual(java.lang.Integer tpos) {
        regTpos(CK_NE, tpos);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param tpos The value of tpos as greaterThan.
     */
    public void setTpos_GreaterThan(java.lang.Integer tpos) {
        regTpos(CK_GT, tpos);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param tpos The value of tpos as lessThan.
     */
    public void setTpos_LessThan(java.lang.Integer tpos) {
        regTpos(CK_LT, tpos);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param tpos The value of tpos as greaterEqual.
     */
    public void setTpos_GreaterEqual(java.lang.Integer tpos) {
        regTpos(CK_GE, tpos);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
     * @param tpos The value of tpos as lessEqual.
     */
    public void setTpos_LessEqual(java.lang.Integer tpos) {
        regTpos(CK_LE, tpos);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param tposList The collection of tpos as inScope.
     */
    public void setTpos_InScope(Collection<java.lang.Integer> tposList) {
        regTpos(CK_INS, cTL(tposList));
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setTpos_IsNull() { regTpos(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setTpos_IsNotNull() { regTpos(CK_ISNN, DUMMY_OBJECT); }

    protected void regTpos(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueTpos(), "TPos", "Tpos", "tpos");
    }
    protected void registerInlineTpos(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueTpos(), "TPos", "Tpos", "tpos");
    }
    abstract protected ConditionValue getCValueTpos();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param swimlanes The value of swimlanes as equal.
     */
    public void setSwimlanes_Equal(String swimlanes) {
        regSwimlanes(CK_EQ, fRES(swimlanes));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param swimlanes The value of swimlanes as notEqual.
     */
    public void setSwimlanes_NotEqual(String swimlanes) {
        regSwimlanes(CK_NE, fRES(swimlanes));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param swimlanes The value of swimlanes as greaterThan.
     */
    public void setSwimlanes_GreaterThan(String swimlanes) {
        regSwimlanes(CK_GT, fRES(swimlanes));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param swimlanes The value of swimlanes as lessThan.
     */
    public void setSwimlanes_LessThan(String swimlanes) {
        regSwimlanes(CK_LT, fRES(swimlanes));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param swimlanes The value of swimlanes as greaterEqual.
     */
    public void setSwimlanes_GreaterEqual(String swimlanes) {
        regSwimlanes(CK_GE, fRES(swimlanes));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param swimlanes The value of swimlanes as lessEqual.
     */
    public void setSwimlanes_LessEqual(String swimlanes) {
        regSwimlanes(CK_LE, fRES(swimlanes));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param swimlanes The value of swimlanes as prefixSearch.
     */
    public void setSwimlanes_PrefixSearch(String swimlanes) {
        regSwimlanes(CK_PS, fRES(swimlanes));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param swimlanes The value of swimlanes as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSwimlanes_LikeSearch(String swimlanes, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(swimlanes), getCValueSwimlanes(), "Swimlanes", "Swimlanes", "swimlanes", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param swimlanesList The collection of swimlanes as inScope.
     */
    public void setSwimlanes_InScope(Collection<String> swimlanesList) {
        regSwimlanes(CK_INS, cTL(swimlanesList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param swimlanes The collection of swimlanes as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setSwimlanes_InScope(String swimlanes, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(swimlanes), getCValueSwimlanes(), "Swimlanes", "Swimlanes", "swimlanes", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setSwimlanes_IsNull() { regSwimlanes(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setSwimlanes_IsNotNull() { regSwimlanes(CK_ISNN, DUMMY_OBJECT); }

    protected void regSwimlanes(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueSwimlanes(), "Swimlanes", "Swimlanes", "swimlanes");
    }
    protected void registerInlineSwimlanes(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueSwimlanes(), "Swimlanes", "Swimlanes", "swimlanes");
    }
    abstract protected ConditionValue getCValueSwimlanes();

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
    protected String getConditionBeanClassNameInternally() { return TDiagramCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TDiagramCQ.class.getName(); }
}
