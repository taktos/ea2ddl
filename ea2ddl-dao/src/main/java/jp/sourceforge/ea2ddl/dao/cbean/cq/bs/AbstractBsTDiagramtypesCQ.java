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
 * The abstract condition-query of t_diagramtypes.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTDiagramtypesCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTDiagramtypesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_diagramtypes";
    }
    
    public String getTableSqlName() {
        return "t_diagramtypes";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {UQ : VARCHAR(50)}
     * @param diagramType The value of diagramType as equal.
     */
    public void setDiagramType_Equal(String diagramType) {
        regDiagramType(CK_EQ, fRES(diagramType));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param diagramType The value of diagramType as notEqual.
     */
    public void setDiagramType_NotEqual(String diagramType) {
        regDiagramType(CK_NE, fRES(diagramType));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param diagramType The value of diagramType as greaterThan.
     */
    public void setDiagramType_GreaterThan(String diagramType) {
        regDiagramType(CK_GT, fRES(diagramType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param diagramType The value of diagramType as lessThan.
     */
    public void setDiagramType_LessThan(String diagramType) {
        regDiagramType(CK_LT, fRES(diagramType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param diagramType The value of diagramType as greaterEqual.
     */
    public void setDiagramType_GreaterEqual(String diagramType) {
        regDiagramType(CK_GE, fRES(diagramType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param diagramType The value of diagramType as lessEqual.
     */
    public void setDiagramType_LessEqual(String diagramType) {
        regDiagramType(CK_LE, fRES(diagramType));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param diagramType The value of diagramType as prefixSearch.
     */
    public void setDiagramType_PrefixSearch(String diagramType) {
        regDiagramType(CK_PS, fRES(diagramType));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param diagramTypeList The collection of diagramType as inScope.
     */
    public void setDiagramType_InScope(Collection<String> diagramTypeList) {
        regDiagramType(CK_INS, cTL(diagramTypeList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param diagramType The value of diagramType as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDiagramType_LikeSearch(String diagramType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(diagramType), getCValueDiagramType(), "Diagram_Type", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param diagramType The value of diagramType as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDiagramType_NotLikeSearch(String diagramType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(diagramType), getCValueDiagramType(), "Diagram_Type", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setDiagramType_IsNull() { regDiagramType(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setDiagramType_IsNotNull() { regDiagramType(CK_ISNN, DOBJ); }

    protected void regDiagramType(ConditionKey k, Object v) { regQ(k, v, getCValueDiagramType(), "Diagram_Type"); }
    abstract protected ConditionValue getCValueDiagramType();

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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param packageId The value of packageId as equal.
     */
    public void setPackageId_Equal(java.lang.Integer packageId) {
        regPackageId(CK_EQ, packageId);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param packageId The value of packageId as notEqual.
     */
    public void setPackageId_NotEqual(java.lang.Integer packageId) {
        regPackageId(CK_NE, packageId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param packageId The value of packageId as greaterThan.
     */
    public void setPackageId_GreaterThan(java.lang.Integer packageId) {
        regPackageId(CK_GT, packageId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param packageId The value of packageId as lessThan.
     */
    public void setPackageId_LessThan(java.lang.Integer packageId) {
        regPackageId(CK_LT, packageId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param packageId The value of packageId as greaterEqual.
     */
    public void setPackageId_GreaterEqual(java.lang.Integer packageId) {
        regPackageId(CK_GE, packageId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
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
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setPackageId_IsNull() { regPackageId(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setPackageId_IsNotNull() { regPackageId(CK_ISNN, DOBJ); }

    protected void regPackageId(ConditionKey k, Object v) { regQ(k, v, getCValuePackageId(), "Package_ID"); }
    abstract protected ConditionValue getCValuePackageId();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TDiagramtypesCB.class.getName(); }
    String xCQ() { return TDiagramtypesCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
