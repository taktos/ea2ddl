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
 * The abstract condition-query of t_datatypes.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTDatatypesCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTDatatypesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_datatypes";
    }
    
    public String getTableSqlName() {
        return "t_datatypes";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
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
     * @param productname The value of productname as equal.
     */
    public void setProductname_Equal(String productname) {
        regProductname(CK_EQ, fRES(productname));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param productname The value of productname as notEqual.
     */
    public void setProductname_NotEqual(String productname) {
        regProductname(CK_NE, fRES(productname));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param productname The value of productname as greaterThan.
     */
    public void setProductname_GreaterThan(String productname) {
        regProductname(CK_GT, fRES(productname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param productname The value of productname as lessThan.
     */
    public void setProductname_LessThan(String productname) {
        regProductname(CK_LT, fRES(productname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param productname The value of productname as greaterEqual.
     */
    public void setProductname_GreaterEqual(String productname) {
        regProductname(CK_GE, fRES(productname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param productname The value of productname as lessEqual.
     */
    public void setProductname_LessEqual(String productname) {
        regProductname(CK_LE, fRES(productname));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param productname The value of productname as prefixSearch.
     */
    public void setProductname_PrefixSearch(String productname) {
        regProductname(CK_PS, fRES(productname));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param productnameList The collection of productname as inScope.
     */
    public void setProductname_InScope(Collection<String> productnameList) {
        regProductname(CK_INS, cTL(productnameList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param productname The value of productname as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductname_LikeSearch(String productname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productname), getCValueProductname(), "ProductName", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param productname The value of productname as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductname_NotLikeSearch(String productname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productname), getCValueProductname(), "ProductName", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setProductname_IsNull() { regProductname(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setProductname_IsNotNull() { regProductname(CK_ISNN, DOBJ); }

    protected void regProductname(ConditionKey k, Object v) { regQ(k, v, getCValueProductname(), "ProductName"); }
    abstract protected ConditionValue getCValueProductname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
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
        regLSQ(CK_LS, fRES(datatype), getCValueDatatype(), "DataType", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param datatype The value of datatype as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDatatype_NotLikeSearch(String datatype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(datatype), getCValueDatatype(), "DataType", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setDatatype_IsNull() { regDatatype(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setDatatype_IsNotNull() { regDatatype(CK_ISNN, DOBJ); }

    protected void regDatatype(ConditionKey k, Object v) { regQ(k, v, getCValueDatatype(), "DataType"); }
    abstract protected ConditionValue getCValueDatatype();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param size The value of size as equal.
     */
    public void setSize_Equal(java.lang.Integer size) {
        regSize(CK_EQ, size);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param size The value of size as notEqual.
     */
    public void setSize_NotEqual(java.lang.Integer size) {
        regSize(CK_NE, size);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param size The value of size as greaterThan.
     */
    public void setSize_GreaterThan(java.lang.Integer size) {
        regSize(CK_GT, size);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param size The value of size as lessThan.
     */
    public void setSize_LessThan(java.lang.Integer size) {
        regSize(CK_LT, size);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param size The value of size as greaterEqual.
     */
    public void setSize_GreaterEqual(java.lang.Integer size) {
        regSize(CK_GE, size);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param size The value of size as lessEqual.
     */
    public void setSize_LessEqual(java.lang.Integer size) {
        regSize(CK_LE, size);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param sizeList The collection of size as inScope.
     */
    public void setSize_InScope(Collection<java.lang.Integer> sizeList) {
        regSize(CK_INS, cTL(sizeList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setSize_IsNull() { regSize(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setSize_IsNotNull() { regSize(CK_ISNN, DOBJ); }

    protected void regSize(ConditionKey k, Object v) { regQ(k, v, getCValueSize(), "Size"); }
    abstract protected ConditionValue getCValueSize();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param maxlen The value of maxlen as equal.
     */
    public void setMaxlen_Equal(java.lang.Integer maxlen) {
        regMaxlen(CK_EQ, maxlen);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param maxlen The value of maxlen as notEqual.
     */
    public void setMaxlen_NotEqual(java.lang.Integer maxlen) {
        regMaxlen(CK_NE, maxlen);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param maxlen The value of maxlen as greaterThan.
     */
    public void setMaxlen_GreaterThan(java.lang.Integer maxlen) {
        regMaxlen(CK_GT, maxlen);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param maxlen The value of maxlen as lessThan.
     */
    public void setMaxlen_LessThan(java.lang.Integer maxlen) {
        regMaxlen(CK_LT, maxlen);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param maxlen The value of maxlen as greaterEqual.
     */
    public void setMaxlen_GreaterEqual(java.lang.Integer maxlen) {
        regMaxlen(CK_GE, maxlen);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param maxlen The value of maxlen as lessEqual.
     */
    public void setMaxlen_LessEqual(java.lang.Integer maxlen) {
        regMaxlen(CK_LE, maxlen);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param maxlenList The collection of maxlen as inScope.
     */
    public void setMaxlen_InScope(Collection<java.lang.Integer> maxlenList) {
        regMaxlen(CK_INS, cTL(maxlenList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setMaxlen_IsNull() { regMaxlen(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setMaxlen_IsNotNull() { regMaxlen(CK_ISNN, DOBJ); }

    protected void regMaxlen(ConditionKey k, Object v) { regQ(k, v, getCValueMaxlen(), "MaxLen"); }
    abstract protected ConditionValue getCValueMaxlen();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param maxprec The value of maxprec as equal.
     */
    public void setMaxprec_Equal(java.lang.Integer maxprec) {
        regMaxprec(CK_EQ, maxprec);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param maxprec The value of maxprec as notEqual.
     */
    public void setMaxprec_NotEqual(java.lang.Integer maxprec) {
        regMaxprec(CK_NE, maxprec);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param maxprec The value of maxprec as greaterThan.
     */
    public void setMaxprec_GreaterThan(java.lang.Integer maxprec) {
        regMaxprec(CK_GT, maxprec);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param maxprec The value of maxprec as lessThan.
     */
    public void setMaxprec_LessThan(java.lang.Integer maxprec) {
        regMaxprec(CK_LT, maxprec);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param maxprec The value of maxprec as greaterEqual.
     */
    public void setMaxprec_GreaterEqual(java.lang.Integer maxprec) {
        regMaxprec(CK_GE, maxprec);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param maxprec The value of maxprec as lessEqual.
     */
    public void setMaxprec_LessEqual(java.lang.Integer maxprec) {
        regMaxprec(CK_LE, maxprec);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param maxprecList The collection of maxprec as inScope.
     */
    public void setMaxprec_InScope(Collection<java.lang.Integer> maxprecList) {
        regMaxprec(CK_INS, cTL(maxprecList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setMaxprec_IsNull() { regMaxprec(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setMaxprec_IsNotNull() { regMaxprec(CK_ISNN, DOBJ); }

    protected void regMaxprec(ConditionKey k, Object v) { regQ(k, v, getCValueMaxprec(), "MaxPrec"); }
    abstract protected ConditionValue getCValueMaxprec();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param maxscale The value of maxscale as equal.
     */
    public void setMaxscale_Equal(java.lang.Integer maxscale) {
        regMaxscale(CK_EQ, maxscale);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param maxscale The value of maxscale as notEqual.
     */
    public void setMaxscale_NotEqual(java.lang.Integer maxscale) {
        regMaxscale(CK_NE, maxscale);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param maxscale The value of maxscale as greaterThan.
     */
    public void setMaxscale_GreaterThan(java.lang.Integer maxscale) {
        regMaxscale(CK_GT, maxscale);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param maxscale The value of maxscale as lessThan.
     */
    public void setMaxscale_LessThan(java.lang.Integer maxscale) {
        regMaxscale(CK_LT, maxscale);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param maxscale The value of maxscale as greaterEqual.
     */
    public void setMaxscale_GreaterEqual(java.lang.Integer maxscale) {
        regMaxscale(CK_GE, maxscale);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param maxscale The value of maxscale as lessEqual.
     */
    public void setMaxscale_LessEqual(java.lang.Integer maxscale) {
        regMaxscale(CK_LE, maxscale);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param maxscaleList The collection of maxscale as inScope.
     */
    public void setMaxscale_InScope(Collection<java.lang.Integer> maxscaleList) {
        regMaxscale(CK_INS, cTL(maxscaleList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setMaxscale_IsNull() { regMaxscale(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setMaxscale_IsNotNull() { regMaxscale(CK_ISNN, DOBJ); }

    protected void regMaxscale(ConditionKey k, Object v) { regQ(k, v, getCValueMaxscale(), "MaxScale"); }
    abstract protected ConditionValue getCValueMaxscale();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param defaultlen The value of defaultlen as equal.
     */
    public void setDefaultlen_Equal(java.lang.Integer defaultlen) {
        regDefaultlen(CK_EQ, defaultlen);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param defaultlen The value of defaultlen as notEqual.
     */
    public void setDefaultlen_NotEqual(java.lang.Integer defaultlen) {
        regDefaultlen(CK_NE, defaultlen);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param defaultlen The value of defaultlen as greaterThan.
     */
    public void setDefaultlen_GreaterThan(java.lang.Integer defaultlen) {
        regDefaultlen(CK_GT, defaultlen);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param defaultlen The value of defaultlen as lessThan.
     */
    public void setDefaultlen_LessThan(java.lang.Integer defaultlen) {
        regDefaultlen(CK_LT, defaultlen);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param defaultlen The value of defaultlen as greaterEqual.
     */
    public void setDefaultlen_GreaterEqual(java.lang.Integer defaultlen) {
        regDefaultlen(CK_GE, defaultlen);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param defaultlen The value of defaultlen as lessEqual.
     */
    public void setDefaultlen_LessEqual(java.lang.Integer defaultlen) {
        regDefaultlen(CK_LE, defaultlen);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param defaultlenList The collection of defaultlen as inScope.
     */
    public void setDefaultlen_InScope(Collection<java.lang.Integer> defaultlenList) {
        regDefaultlen(CK_INS, cTL(defaultlenList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setDefaultlen_IsNull() { regDefaultlen(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setDefaultlen_IsNotNull() { regDefaultlen(CK_ISNN, DOBJ); }

    protected void regDefaultlen(ConditionKey k, Object v) { regQ(k, v, getCValueDefaultlen(), "DefaultLen"); }
    abstract protected ConditionValue getCValueDefaultlen();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param defaultprec The value of defaultprec as equal.
     */
    public void setDefaultprec_Equal(java.lang.Integer defaultprec) {
        regDefaultprec(CK_EQ, defaultprec);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param defaultprec The value of defaultprec as notEqual.
     */
    public void setDefaultprec_NotEqual(java.lang.Integer defaultprec) {
        regDefaultprec(CK_NE, defaultprec);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param defaultprec The value of defaultprec as greaterThan.
     */
    public void setDefaultprec_GreaterThan(java.lang.Integer defaultprec) {
        regDefaultprec(CK_GT, defaultprec);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param defaultprec The value of defaultprec as lessThan.
     */
    public void setDefaultprec_LessThan(java.lang.Integer defaultprec) {
        regDefaultprec(CK_LT, defaultprec);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param defaultprec The value of defaultprec as greaterEqual.
     */
    public void setDefaultprec_GreaterEqual(java.lang.Integer defaultprec) {
        regDefaultprec(CK_GE, defaultprec);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param defaultprec The value of defaultprec as lessEqual.
     */
    public void setDefaultprec_LessEqual(java.lang.Integer defaultprec) {
        regDefaultprec(CK_LE, defaultprec);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param defaultprecList The collection of defaultprec as inScope.
     */
    public void setDefaultprec_InScope(Collection<java.lang.Integer> defaultprecList) {
        regDefaultprec(CK_INS, cTL(defaultprecList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setDefaultprec_IsNull() { regDefaultprec(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setDefaultprec_IsNotNull() { regDefaultprec(CK_ISNN, DOBJ); }

    protected void regDefaultprec(ConditionKey k, Object v) { regQ(k, v, getCValueDefaultprec(), "DefaultPrec"); }
    abstract protected ConditionValue getCValueDefaultprec();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param defaultscale The value of defaultscale as equal.
     */
    public void setDefaultscale_Equal(java.lang.Integer defaultscale) {
        regDefaultscale(CK_EQ, defaultscale);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param defaultscale The value of defaultscale as notEqual.
     */
    public void setDefaultscale_NotEqual(java.lang.Integer defaultscale) {
        regDefaultscale(CK_NE, defaultscale);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param defaultscale The value of defaultscale as greaterThan.
     */
    public void setDefaultscale_GreaterThan(java.lang.Integer defaultscale) {
        regDefaultscale(CK_GT, defaultscale);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param defaultscale The value of defaultscale as lessThan.
     */
    public void setDefaultscale_LessThan(java.lang.Integer defaultscale) {
        regDefaultscale(CK_LT, defaultscale);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param defaultscale The value of defaultscale as greaterEqual.
     */
    public void setDefaultscale_GreaterEqual(java.lang.Integer defaultscale) {
        regDefaultscale(CK_GE, defaultscale);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param defaultscale The value of defaultscale as lessEqual.
     */
    public void setDefaultscale_LessEqual(java.lang.Integer defaultscale) {
        regDefaultscale(CK_LE, defaultscale);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param defaultscaleList The collection of defaultscale as inScope.
     */
    public void setDefaultscale_InScope(Collection<java.lang.Integer> defaultscaleList) {
        regDefaultscale(CK_INS, cTL(defaultscaleList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setDefaultscale_IsNull() { regDefaultscale(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setDefaultscale_IsNotNull() { regDefaultscale(CK_ISNN, DOBJ); }

    protected void regDefaultscale(ConditionKey k, Object v) { regQ(k, v, getCValueDefaultscale(), "DefaultScale"); }
    abstract protected ConditionValue getCValueDefaultscale();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param user The value of user as equal.
     */
    public void setUser_Equal(java.lang.Integer user) {
        regUser(CK_EQ, user);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param user The value of user as notEqual.
     */
    public void setUser_NotEqual(java.lang.Integer user) {
        regUser(CK_NE, user);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param user The value of user as greaterThan.
     */
    public void setUser_GreaterThan(java.lang.Integer user) {
        regUser(CK_GT, user);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param user The value of user as lessThan.
     */
    public void setUser_LessThan(java.lang.Integer user) {
        regUser(CK_LT, user);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param user The value of user as greaterEqual.
     */
    public void setUser_GreaterEqual(java.lang.Integer user) {
        regUser(CK_GE, user);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param user The value of user as lessEqual.
     */
    public void setUser_LessEqual(java.lang.Integer user) {
        regUser(CK_LE, user);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param userList The collection of user as inScope.
     */
    public void setUser_InScope(Collection<java.lang.Integer> userList) {
        regUser(CK_INS, cTL(userList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setUser_IsNull() { regUser(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setUser_IsNotNull() { regUser(CK_ISNN, DOBJ); }

    protected void regUser(ConditionKey k, Object v) { regQ(k, v, getCValueUser(), "User"); }
    abstract protected ConditionValue getCValueUser();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param pdata1 The value of pdata1 as equal.
     */
    public void setPdata1_Equal(String pdata1) {
        regPdata1(CK_EQ, fRES(pdata1));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata1 The value of pdata1 as notEqual.
     */
    public void setPdata1_NotEqual(String pdata1) {
        regPdata1(CK_NE, fRES(pdata1));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata1 The value of pdata1 as greaterThan.
     */
    public void setPdata1_GreaterThan(String pdata1) {
        regPdata1(CK_GT, fRES(pdata1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata1 The value of pdata1 as lessThan.
     */
    public void setPdata1_LessThan(String pdata1) {
        regPdata1(CK_LT, fRES(pdata1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata1 The value of pdata1 as greaterEqual.
     */
    public void setPdata1_GreaterEqual(String pdata1) {
        regPdata1(CK_GE, fRES(pdata1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata1 The value of pdata1 as lessEqual.
     */
    public void setPdata1_LessEqual(String pdata1) {
        regPdata1(CK_LE, fRES(pdata1));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata1 The value of pdata1 as prefixSearch.
     */
    public void setPdata1_PrefixSearch(String pdata1) {
        regPdata1(CK_PS, fRES(pdata1));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param pdata1List The collection of pdata1 as inScope.
     */
    public void setPdata1_InScope(Collection<String> pdata1List) {
        regPdata1(CK_INS, cTL(pdata1List));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param pdata1 The value of pdata1 as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPdata1_LikeSearch(String pdata1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pdata1), getCValuePdata1(), "PDATA1", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param pdata1 The value of pdata1 as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPdata1_NotLikeSearch(String pdata1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pdata1), getCValuePdata1(), "PDATA1", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setPdata1_IsNull() { regPdata1(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setPdata1_IsNotNull() { regPdata1(CK_ISNN, DOBJ); }

    protected void regPdata1(ConditionKey k, Object v) { regQ(k, v, getCValuePdata1(), "PDATA1"); }
    abstract protected ConditionValue getCValuePdata1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param pdata2 The value of pdata2 as equal.
     */
    public void setPdata2_Equal(String pdata2) {
        regPdata2(CK_EQ, fRES(pdata2));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata2 The value of pdata2 as notEqual.
     */
    public void setPdata2_NotEqual(String pdata2) {
        regPdata2(CK_NE, fRES(pdata2));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata2 The value of pdata2 as greaterThan.
     */
    public void setPdata2_GreaterThan(String pdata2) {
        regPdata2(CK_GT, fRES(pdata2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata2 The value of pdata2 as lessThan.
     */
    public void setPdata2_LessThan(String pdata2) {
        regPdata2(CK_LT, fRES(pdata2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata2 The value of pdata2 as greaterEqual.
     */
    public void setPdata2_GreaterEqual(String pdata2) {
        regPdata2(CK_GE, fRES(pdata2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata2 The value of pdata2 as lessEqual.
     */
    public void setPdata2_LessEqual(String pdata2) {
        regPdata2(CK_LE, fRES(pdata2));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata2 The value of pdata2 as prefixSearch.
     */
    public void setPdata2_PrefixSearch(String pdata2) {
        regPdata2(CK_PS, fRES(pdata2));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param pdata2List The collection of pdata2 as inScope.
     */
    public void setPdata2_InScope(Collection<String> pdata2List) {
        regPdata2(CK_INS, cTL(pdata2List));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param pdata2 The value of pdata2 as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPdata2_LikeSearch(String pdata2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pdata2), getCValuePdata2(), "PDATA2", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param pdata2 The value of pdata2 as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPdata2_NotLikeSearch(String pdata2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pdata2), getCValuePdata2(), "PDATA2", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setPdata2_IsNull() { regPdata2(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setPdata2_IsNotNull() { regPdata2(CK_ISNN, DOBJ); }

    protected void regPdata2(ConditionKey k, Object v) { regQ(k, v, getCValuePdata2(), "PDATA2"); }
    abstract protected ConditionValue getCValuePdata2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param pdata3 The value of pdata3 as equal.
     */
    public void setPdata3_Equal(String pdata3) {
        regPdata3(CK_EQ, fRES(pdata3));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata3 The value of pdata3 as notEqual.
     */
    public void setPdata3_NotEqual(String pdata3) {
        regPdata3(CK_NE, fRES(pdata3));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata3 The value of pdata3 as greaterThan.
     */
    public void setPdata3_GreaterThan(String pdata3) {
        regPdata3(CK_GT, fRES(pdata3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata3 The value of pdata3 as lessThan.
     */
    public void setPdata3_LessThan(String pdata3) {
        regPdata3(CK_LT, fRES(pdata3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata3 The value of pdata3 as greaterEqual.
     */
    public void setPdata3_GreaterEqual(String pdata3) {
        regPdata3(CK_GE, fRES(pdata3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata3 The value of pdata3 as lessEqual.
     */
    public void setPdata3_LessEqual(String pdata3) {
        regPdata3(CK_LE, fRES(pdata3));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata3 The value of pdata3 as prefixSearch.
     */
    public void setPdata3_PrefixSearch(String pdata3) {
        regPdata3(CK_PS, fRES(pdata3));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param pdata3List The collection of pdata3 as inScope.
     */
    public void setPdata3_InScope(Collection<String> pdata3List) {
        regPdata3(CK_INS, cTL(pdata3List));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param pdata3 The value of pdata3 as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPdata3_LikeSearch(String pdata3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pdata3), getCValuePdata3(), "PDATA3", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param pdata3 The value of pdata3 as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPdata3_NotLikeSearch(String pdata3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pdata3), getCValuePdata3(), "PDATA3", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setPdata3_IsNull() { regPdata3(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setPdata3_IsNotNull() { regPdata3(CK_ISNN, DOBJ); }

    protected void regPdata3(ConditionKey k, Object v) { regQ(k, v, getCValuePdata3(), "PDATA3"); }
    abstract protected ConditionValue getCValuePdata3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param pdata4 The value of pdata4 as equal.
     */
    public void setPdata4_Equal(String pdata4) {
        regPdata4(CK_EQ, fRES(pdata4));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata4 The value of pdata4 as notEqual.
     */
    public void setPdata4_NotEqual(String pdata4) {
        regPdata4(CK_NE, fRES(pdata4));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata4 The value of pdata4 as greaterThan.
     */
    public void setPdata4_GreaterThan(String pdata4) {
        regPdata4(CK_GT, fRES(pdata4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata4 The value of pdata4 as lessThan.
     */
    public void setPdata4_LessThan(String pdata4) {
        regPdata4(CK_LT, fRES(pdata4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata4 The value of pdata4 as greaterEqual.
     */
    public void setPdata4_GreaterEqual(String pdata4) {
        regPdata4(CK_GE, fRES(pdata4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata4 The value of pdata4 as lessEqual.
     */
    public void setPdata4_LessEqual(String pdata4) {
        regPdata4(CK_LE, fRES(pdata4));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param pdata4 The value of pdata4 as prefixSearch.
     */
    public void setPdata4_PrefixSearch(String pdata4) {
        regPdata4(CK_PS, fRES(pdata4));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param pdata4List The collection of pdata4 as inScope.
     */
    public void setPdata4_InScope(Collection<String> pdata4List) {
        regPdata4(CK_INS, cTL(pdata4List));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param pdata4 The value of pdata4 as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPdata4_LikeSearch(String pdata4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pdata4), getCValuePdata4(), "PDATA4", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param pdata4 The value of pdata4 as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPdata4_NotLikeSearch(String pdata4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pdata4), getCValuePdata4(), "PDATA4", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setPdata4_IsNull() { regPdata4(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setPdata4_IsNotNull() { regPdata4(CK_ISNN, DOBJ); }

    protected void regPdata4(ConditionKey k, Object v) { regQ(k, v, getCValuePdata4(), "PDATA4"); }
    abstract protected ConditionValue getCValuePdata4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(50)}
     * @param haslength The value of haslength as equal.
     */
    public void setHaslength_Equal(String haslength) {
        regHaslength(CK_EQ, fRES(haslength));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param haslength The value of haslength as notEqual.
     */
    public void setHaslength_NotEqual(String haslength) {
        regHaslength(CK_NE, fRES(haslength));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param haslength The value of haslength as greaterThan.
     */
    public void setHaslength_GreaterThan(String haslength) {
        regHaslength(CK_GT, fRES(haslength));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param haslength The value of haslength as lessThan.
     */
    public void setHaslength_LessThan(String haslength) {
        regHaslength(CK_LT, fRES(haslength));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param haslength The value of haslength as greaterEqual.
     */
    public void setHaslength_GreaterEqual(String haslength) {
        regHaslength(CK_GE, fRES(haslength));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param haslength The value of haslength as lessEqual.
     */
    public void setHaslength_LessEqual(String haslength) {
        regHaslength(CK_LE, fRES(haslength));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param haslength The value of haslength as prefixSearch.
     */
    public void setHaslength_PrefixSearch(String haslength) {
        regHaslength(CK_PS, fRES(haslength));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param haslengthList The collection of haslength as inScope.
     */
    public void setHaslength_InScope(Collection<String> haslengthList) {
        regHaslength(CK_INS, cTL(haslengthList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param haslength The value of haslength as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHaslength_LikeSearch(String haslength, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(haslength), getCValueHaslength(), "HasLength", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param haslength The value of haslength as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHaslength_NotLikeSearch(String haslength, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(haslength), getCValueHaslength(), "HasLength", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setHaslength_IsNull() { regHaslength(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setHaslength_IsNotNull() { regHaslength(CK_ISNN, DOBJ); }

    protected void regHaslength(ConditionKey k, Object v) { regQ(k, v, getCValueHaslength(), "HasLength"); }
    abstract protected ConditionValue getCValueHaslength();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param generictype The value of generictype as equal.
     */
    public void setGenerictype_Equal(String generictype) {
        regGenerictype(CK_EQ, fRES(generictype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param generictype The value of generictype as notEqual.
     */
    public void setGenerictype_NotEqual(String generictype) {
        regGenerictype(CK_NE, fRES(generictype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param generictype The value of generictype as greaterThan.
     */
    public void setGenerictype_GreaterThan(String generictype) {
        regGenerictype(CK_GT, fRES(generictype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param generictype The value of generictype as lessThan.
     */
    public void setGenerictype_LessThan(String generictype) {
        regGenerictype(CK_LT, fRES(generictype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param generictype The value of generictype as greaterEqual.
     */
    public void setGenerictype_GreaterEqual(String generictype) {
        regGenerictype(CK_GE, fRES(generictype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param generictype The value of generictype as lessEqual.
     */
    public void setGenerictype_LessEqual(String generictype) {
        regGenerictype(CK_LE, fRES(generictype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param generictype The value of generictype as prefixSearch.
     */
    public void setGenerictype_PrefixSearch(String generictype) {
        regGenerictype(CK_PS, fRES(generictype));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param generictypeList The collection of generictype as inScope.
     */
    public void setGenerictype_InScope(Collection<String> generictypeList) {
        regGenerictype(CK_INS, cTL(generictypeList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param generictype The value of generictype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGenerictype_LikeSearch(String generictype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(generictype), getCValueGenerictype(), "GenericType", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param generictype The value of generictype as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setGenerictype_NotLikeSearch(String generictype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(generictype), getCValueGenerictype(), "GenericType", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setGenerictype_IsNull() { regGenerictype(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setGenerictype_IsNotNull() { regGenerictype(CK_ISNN, DOBJ); }

    protected void regGenerictype(ConditionKey k, Object v) { regQ(k, v, getCValueGenerictype(), "GenericType"); }
    abstract protected ConditionValue getCValueGenerictype();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {UQ : NotNull : COUNTER}
     * @param datatypeid The value of datatypeid as equal.
     */
    public void setDatatypeid_Equal(java.lang.Integer datatypeid) {
        regDatatypeid(CK_EQ, datatypeid);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param datatypeid The value of datatypeid as notEqual.
     */
    public void setDatatypeid_NotEqual(java.lang.Integer datatypeid) {
        regDatatypeid(CK_NE, datatypeid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param datatypeid The value of datatypeid as greaterThan.
     */
    public void setDatatypeid_GreaterThan(java.lang.Integer datatypeid) {
        regDatatypeid(CK_GT, datatypeid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param datatypeid The value of datatypeid as lessThan.
     */
    public void setDatatypeid_LessThan(java.lang.Integer datatypeid) {
        regDatatypeid(CK_LT, datatypeid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param datatypeid The value of datatypeid as greaterEqual.
     */
    public void setDatatypeid_GreaterEqual(java.lang.Integer datatypeid) {
        regDatatypeid(CK_GE, datatypeid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param datatypeid The value of datatypeid as lessEqual.
     */
    public void setDatatypeid_LessEqual(java.lang.Integer datatypeid) {
        regDatatypeid(CK_LE, datatypeid);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param datatypeidList The collection of datatypeid as inScope.
     */
    public void setDatatypeid_InScope(Collection<java.lang.Integer> datatypeidList) {
        regDatatypeid(CK_INS, cTL(datatypeidList));
    }

    protected void regDatatypeid(ConditionKey k, Object v) { regQ(k, v, getCValueDatatypeid(), "DatatypeID"); }
    abstract protected ConditionValue getCValueDatatypeid();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TDatatypesCB.class.getName(); }
    String xCQ() { return TDatatypesCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
