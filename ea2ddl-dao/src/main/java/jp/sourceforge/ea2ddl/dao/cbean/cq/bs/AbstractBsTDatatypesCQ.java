package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_datatypes.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsTDatatypesCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTDatatypesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
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
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
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
     * @param productname The value of productname as equal.
     */
    public void setProductname_Equal(String productname) {
        regProductname(CK_EQ, fRES(productname));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param productname The value of productname as notEqual.
     */
    public void setProductname_NotEqual(String productname) {
        regProductname(CK_NE, fRES(productname));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param productname The value of productname as greaterThan.
     */
    public void setProductname_GreaterThan(String productname) {
        regProductname(CK_GT, fRES(productname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param productname The value of productname as lessThan.
     */
    public void setProductname_LessThan(String productname) {
        regProductname(CK_LT, fRES(productname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param productname The value of productname as greaterEqual.
     */
    public void setProductname_GreaterEqual(String productname) {
        regProductname(CK_GE, fRES(productname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param productname The value of productname as lessEqual.
     */
    public void setProductname_LessEqual(String productname) {
        regProductname(CK_LE, fRES(productname));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param productname The value of productname as prefixSearch.
     */
    public void setProductname_PrefixSearch(String productname) {
        regProductname(CK_PS, fRES(productname));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param productname The value of productname as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductname_LikeSearch(String productname, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(productname), getCValueProductname(), "ProductName", "Productname", "productname", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param productnameList The collection of productname as inScope.
     */
    public void setProductname_InScope(Collection<String> productnameList) {
        regProductname(CK_INS, cTL(productnameList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param productname The collection of productname as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setProductname_InScope(String productname, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(productname), getCValueProductname(), "ProductName", "Productname", "productname", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setProductname_IsNull() { regProductname(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setProductname_IsNotNull() { regProductname(CK_ISNN, DUMMY_OBJECT); }

    protected void regProductname(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueProductname(), "ProductName", "Productname", "productname");
    }
    protected void registerInlineProductname(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueProductname(), "ProductName", "Productname", "productname");
    }
    abstract protected ConditionValue getCValueProductname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param datatype The value of datatype as equal.
     */
    public void setDatatype_Equal(String datatype) {
        regDatatype(CK_EQ, fRES(datatype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param datatype The value of datatype as notEqual.
     */
    public void setDatatype_NotEqual(String datatype) {
        regDatatype(CK_NE, fRES(datatype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param datatype The value of datatype as greaterThan.
     */
    public void setDatatype_GreaterThan(String datatype) {
        regDatatype(CK_GT, fRES(datatype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param datatype The value of datatype as lessThan.
     */
    public void setDatatype_LessThan(String datatype) {
        regDatatype(CK_LT, fRES(datatype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param datatype The value of datatype as greaterEqual.
     */
    public void setDatatype_GreaterEqual(String datatype) {
        regDatatype(CK_GE, fRES(datatype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param datatype The value of datatype as lessEqual.
     */
    public void setDatatype_LessEqual(String datatype) {
        regDatatype(CK_LE, fRES(datatype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param datatype The value of datatype as prefixSearch.
     */
    public void setDatatype_PrefixSearch(String datatype) {
        regDatatype(CK_PS, fRES(datatype));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param datatype The value of datatype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDatatype_LikeSearch(String datatype, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(datatype), getCValueDatatype(), "DataType", "Datatype", "datatype", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param datatypeList The collection of datatype as inScope.
     */
    public void setDatatype_InScope(Collection<String> datatypeList) {
        regDatatype(CK_INS, cTL(datatypeList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param datatype The collection of datatype as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setDatatype_InScope(String datatype, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(datatype), getCValueDatatype(), "DataType", "Datatype", "datatype", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setDatatype_IsNull() { regDatatype(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setDatatype_IsNotNull() { regDatatype(CK_ISNN, DUMMY_OBJECT); }

    protected void regDatatype(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueDatatype(), "DataType", "Datatype", "datatype");
    }
    protected void registerInlineDatatype(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueDatatype(), "DataType", "Datatype", "datatype");
    }
    abstract protected ConditionValue getCValueDatatype();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param size The value of size as equal.
     */
    public void setSize_Equal(java.lang.Integer size) {
        regSize(CK_EQ, size);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param size The value of size as notEqual.
     */
    public void setSize_NotEqual(java.lang.Integer size) {
        regSize(CK_NE, size);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param size The value of size as greaterThan.
     */
    public void setSize_GreaterThan(java.lang.Integer size) {
        regSize(CK_GT, size);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param size The value of size as lessThan.
     */
    public void setSize_LessThan(java.lang.Integer size) {
        regSize(CK_LT, size);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param size The value of size as greaterEqual.
     */
    public void setSize_GreaterEqual(java.lang.Integer size) {
        regSize(CK_GE, size);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
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
     * IsNull(is null). And OnceRegistered.
     */
    public void setSize_IsNull() { regSize(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setSize_IsNotNull() { regSize(CK_ISNN, DUMMY_OBJECT); }

    protected void regSize(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueSize(), "Size", "Size", "size");
    }
    protected void registerInlineSize(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueSize(), "Size", "Size", "size");
    }
    abstract protected ConditionValue getCValueSize();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param maxlen The value of maxlen as equal.
     */
    public void setMaxlen_Equal(java.lang.Integer maxlen) {
        regMaxlen(CK_EQ, maxlen);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param maxlen The value of maxlen as notEqual.
     */
    public void setMaxlen_NotEqual(java.lang.Integer maxlen) {
        regMaxlen(CK_NE, maxlen);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param maxlen The value of maxlen as greaterThan.
     */
    public void setMaxlen_GreaterThan(java.lang.Integer maxlen) {
        regMaxlen(CK_GT, maxlen);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param maxlen The value of maxlen as lessThan.
     */
    public void setMaxlen_LessThan(java.lang.Integer maxlen) {
        regMaxlen(CK_LT, maxlen);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param maxlen The value of maxlen as greaterEqual.
     */
    public void setMaxlen_GreaterEqual(java.lang.Integer maxlen) {
        regMaxlen(CK_GE, maxlen);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
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
     * IsNull(is null). And OnceRegistered.
     */
    public void setMaxlen_IsNull() { regMaxlen(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setMaxlen_IsNotNull() { regMaxlen(CK_ISNN, DUMMY_OBJECT); }

    protected void regMaxlen(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueMaxlen(), "MaxLen", "Maxlen", "maxlen");
    }
    protected void registerInlineMaxlen(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueMaxlen(), "MaxLen", "Maxlen", "maxlen");
    }
    abstract protected ConditionValue getCValueMaxlen();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param maxprec The value of maxprec as equal.
     */
    public void setMaxprec_Equal(java.lang.Integer maxprec) {
        regMaxprec(CK_EQ, maxprec);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param maxprec The value of maxprec as notEqual.
     */
    public void setMaxprec_NotEqual(java.lang.Integer maxprec) {
        regMaxprec(CK_NE, maxprec);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param maxprec The value of maxprec as greaterThan.
     */
    public void setMaxprec_GreaterThan(java.lang.Integer maxprec) {
        regMaxprec(CK_GT, maxprec);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param maxprec The value of maxprec as lessThan.
     */
    public void setMaxprec_LessThan(java.lang.Integer maxprec) {
        regMaxprec(CK_LT, maxprec);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param maxprec The value of maxprec as greaterEqual.
     */
    public void setMaxprec_GreaterEqual(java.lang.Integer maxprec) {
        regMaxprec(CK_GE, maxprec);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
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
     * IsNull(is null). And OnceRegistered.
     */
    public void setMaxprec_IsNull() { regMaxprec(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setMaxprec_IsNotNull() { regMaxprec(CK_ISNN, DUMMY_OBJECT); }

    protected void regMaxprec(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueMaxprec(), "MaxPrec", "Maxprec", "maxprec");
    }
    protected void registerInlineMaxprec(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueMaxprec(), "MaxPrec", "Maxprec", "maxprec");
    }
    abstract protected ConditionValue getCValueMaxprec();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param maxscale The value of maxscale as equal.
     */
    public void setMaxscale_Equal(java.lang.Integer maxscale) {
        regMaxscale(CK_EQ, maxscale);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param maxscale The value of maxscale as notEqual.
     */
    public void setMaxscale_NotEqual(java.lang.Integer maxscale) {
        regMaxscale(CK_NE, maxscale);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param maxscale The value of maxscale as greaterThan.
     */
    public void setMaxscale_GreaterThan(java.lang.Integer maxscale) {
        regMaxscale(CK_GT, maxscale);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param maxscale The value of maxscale as lessThan.
     */
    public void setMaxscale_LessThan(java.lang.Integer maxscale) {
        regMaxscale(CK_LT, maxscale);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param maxscale The value of maxscale as greaterEqual.
     */
    public void setMaxscale_GreaterEqual(java.lang.Integer maxscale) {
        regMaxscale(CK_GE, maxscale);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
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
     * IsNull(is null). And OnceRegistered.
     */
    public void setMaxscale_IsNull() { regMaxscale(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setMaxscale_IsNotNull() { regMaxscale(CK_ISNN, DUMMY_OBJECT); }

    protected void regMaxscale(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueMaxscale(), "MaxScale", "Maxscale", "maxscale");
    }
    protected void registerInlineMaxscale(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueMaxscale(), "MaxScale", "Maxscale", "maxscale");
    }
    abstract protected ConditionValue getCValueMaxscale();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param defaultlen The value of defaultlen as equal.
     */
    public void setDefaultlen_Equal(java.lang.Integer defaultlen) {
        regDefaultlen(CK_EQ, defaultlen);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param defaultlen The value of defaultlen as notEqual.
     */
    public void setDefaultlen_NotEqual(java.lang.Integer defaultlen) {
        regDefaultlen(CK_NE, defaultlen);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param defaultlen The value of defaultlen as greaterThan.
     */
    public void setDefaultlen_GreaterThan(java.lang.Integer defaultlen) {
        regDefaultlen(CK_GT, defaultlen);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param defaultlen The value of defaultlen as lessThan.
     */
    public void setDefaultlen_LessThan(java.lang.Integer defaultlen) {
        regDefaultlen(CK_LT, defaultlen);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param defaultlen The value of defaultlen as greaterEqual.
     */
    public void setDefaultlen_GreaterEqual(java.lang.Integer defaultlen) {
        regDefaultlen(CK_GE, defaultlen);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
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
     * IsNull(is null). And OnceRegistered.
     */
    public void setDefaultlen_IsNull() { regDefaultlen(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setDefaultlen_IsNotNull() { regDefaultlen(CK_ISNN, DUMMY_OBJECT); }

    protected void regDefaultlen(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueDefaultlen(), "DefaultLen", "Defaultlen", "defaultlen");
    }
    protected void registerInlineDefaultlen(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueDefaultlen(), "DefaultLen", "Defaultlen", "defaultlen");
    }
    abstract protected ConditionValue getCValueDefaultlen();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param defaultprec The value of defaultprec as equal.
     */
    public void setDefaultprec_Equal(java.lang.Integer defaultprec) {
        regDefaultprec(CK_EQ, defaultprec);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param defaultprec The value of defaultprec as notEqual.
     */
    public void setDefaultprec_NotEqual(java.lang.Integer defaultprec) {
        regDefaultprec(CK_NE, defaultprec);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param defaultprec The value of defaultprec as greaterThan.
     */
    public void setDefaultprec_GreaterThan(java.lang.Integer defaultprec) {
        regDefaultprec(CK_GT, defaultprec);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param defaultprec The value of defaultprec as lessThan.
     */
    public void setDefaultprec_LessThan(java.lang.Integer defaultprec) {
        regDefaultprec(CK_LT, defaultprec);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param defaultprec The value of defaultprec as greaterEqual.
     */
    public void setDefaultprec_GreaterEqual(java.lang.Integer defaultprec) {
        regDefaultprec(CK_GE, defaultprec);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
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
     * IsNull(is null). And OnceRegistered.
     */
    public void setDefaultprec_IsNull() { regDefaultprec(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setDefaultprec_IsNotNull() { regDefaultprec(CK_ISNN, DUMMY_OBJECT); }

    protected void regDefaultprec(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueDefaultprec(), "DefaultPrec", "Defaultprec", "defaultprec");
    }
    protected void registerInlineDefaultprec(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueDefaultprec(), "DefaultPrec", "Defaultprec", "defaultprec");
    }
    abstract protected ConditionValue getCValueDefaultprec();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param defaultscale The value of defaultscale as equal.
     */
    public void setDefaultscale_Equal(java.lang.Integer defaultscale) {
        regDefaultscale(CK_EQ, defaultscale);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param defaultscale The value of defaultscale as notEqual.
     */
    public void setDefaultscale_NotEqual(java.lang.Integer defaultscale) {
        regDefaultscale(CK_NE, defaultscale);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param defaultscale The value of defaultscale as greaterThan.
     */
    public void setDefaultscale_GreaterThan(java.lang.Integer defaultscale) {
        regDefaultscale(CK_GT, defaultscale);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param defaultscale The value of defaultscale as lessThan.
     */
    public void setDefaultscale_LessThan(java.lang.Integer defaultscale) {
        regDefaultscale(CK_LT, defaultscale);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param defaultscale The value of defaultscale as greaterEqual.
     */
    public void setDefaultscale_GreaterEqual(java.lang.Integer defaultscale) {
        regDefaultscale(CK_GE, defaultscale);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
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
     * IsNull(is null). And OnceRegistered.
     */
    public void setDefaultscale_IsNull() { regDefaultscale(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setDefaultscale_IsNotNull() { regDefaultscale(CK_ISNN, DUMMY_OBJECT); }

    protected void regDefaultscale(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueDefaultscale(), "DefaultScale", "Defaultscale", "defaultscale");
    }
    protected void registerInlineDefaultscale(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueDefaultscale(), "DefaultScale", "Defaultscale", "defaultscale");
    }
    abstract protected ConditionValue getCValueDefaultscale();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param user The value of user as equal.
     */
    public void setUser_Equal(java.lang.Integer user) {
        regUser(CK_EQ, user);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param user The value of user as notEqual.
     */
    public void setUser_NotEqual(java.lang.Integer user) {
        regUser(CK_NE, user);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param user The value of user as greaterThan.
     */
    public void setUser_GreaterThan(java.lang.Integer user) {
        regUser(CK_GT, user);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param user The value of user as lessThan.
     */
    public void setUser_LessThan(java.lang.Integer user) {
        regUser(CK_LT, user);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param user The value of user as greaterEqual.
     */
    public void setUser_GreaterEqual(java.lang.Integer user) {
        regUser(CK_GE, user);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
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
     * IsNull(is null). And OnceRegistered.
     */
    public void setUser_IsNull() { regUser(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setUser_IsNotNull() { regUser(CK_ISNN, DUMMY_OBJECT); }

    protected void regUser(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueUser(), "User", "User", "user");
    }
    protected void registerInlineUser(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueUser(), "User", "User", "user");
    }
    abstract protected ConditionValue getCValueUser();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param pdata1 The value of pdata1 as equal.
     */
    public void setPdata1_Equal(String pdata1) {
        regPdata1(CK_EQ, fRES(pdata1));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata1 The value of pdata1 as notEqual.
     */
    public void setPdata1_NotEqual(String pdata1) {
        regPdata1(CK_NE, fRES(pdata1));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata1 The value of pdata1 as greaterThan.
     */
    public void setPdata1_GreaterThan(String pdata1) {
        regPdata1(CK_GT, fRES(pdata1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata1 The value of pdata1 as lessThan.
     */
    public void setPdata1_LessThan(String pdata1) {
        regPdata1(CK_LT, fRES(pdata1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata1 The value of pdata1 as greaterEqual.
     */
    public void setPdata1_GreaterEqual(String pdata1) {
        regPdata1(CK_GE, fRES(pdata1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata1 The value of pdata1 as lessEqual.
     */
    public void setPdata1_LessEqual(String pdata1) {
        regPdata1(CK_LE, fRES(pdata1));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata1 The value of pdata1 as prefixSearch.
     */
    public void setPdata1_PrefixSearch(String pdata1) {
        regPdata1(CK_PS, fRES(pdata1));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param pdata1 The value of pdata1 as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPdata1_LikeSearch(String pdata1, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(pdata1), getCValuePdata1(), "PDATA1", "Pdata1", "pdata1", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param pdata1List The collection of pdata1 as inScope.
     */
    public void setPdata1_InScope(Collection<String> pdata1List) {
        regPdata1(CK_INS, cTL(pdata1List));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param pdata1 The collection of pdata1 as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setPdata1_InScope(String pdata1, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(pdata1), getCValuePdata1(), "PDATA1", "Pdata1", "pdata1", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setPdata1_IsNull() { regPdata1(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setPdata1_IsNotNull() { regPdata1(CK_ISNN, DUMMY_OBJECT); }

    protected void regPdata1(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePdata1(), "PDATA1", "Pdata1", "pdata1");
    }
    protected void registerInlinePdata1(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePdata1(), "PDATA1", "Pdata1", "pdata1");
    }
    abstract protected ConditionValue getCValuePdata1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param pdata2 The value of pdata2 as equal.
     */
    public void setPdata2_Equal(String pdata2) {
        regPdata2(CK_EQ, fRES(pdata2));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata2 The value of pdata2 as notEqual.
     */
    public void setPdata2_NotEqual(String pdata2) {
        regPdata2(CK_NE, fRES(pdata2));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata2 The value of pdata2 as greaterThan.
     */
    public void setPdata2_GreaterThan(String pdata2) {
        regPdata2(CK_GT, fRES(pdata2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata2 The value of pdata2 as lessThan.
     */
    public void setPdata2_LessThan(String pdata2) {
        regPdata2(CK_LT, fRES(pdata2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata2 The value of pdata2 as greaterEqual.
     */
    public void setPdata2_GreaterEqual(String pdata2) {
        regPdata2(CK_GE, fRES(pdata2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata2 The value of pdata2 as lessEqual.
     */
    public void setPdata2_LessEqual(String pdata2) {
        regPdata2(CK_LE, fRES(pdata2));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata2 The value of pdata2 as prefixSearch.
     */
    public void setPdata2_PrefixSearch(String pdata2) {
        regPdata2(CK_PS, fRES(pdata2));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param pdata2 The value of pdata2 as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPdata2_LikeSearch(String pdata2, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(pdata2), getCValuePdata2(), "PDATA2", "Pdata2", "pdata2", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param pdata2List The collection of pdata2 as inScope.
     */
    public void setPdata2_InScope(Collection<String> pdata2List) {
        regPdata2(CK_INS, cTL(pdata2List));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param pdata2 The collection of pdata2 as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setPdata2_InScope(String pdata2, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(pdata2), getCValuePdata2(), "PDATA2", "Pdata2", "pdata2", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setPdata2_IsNull() { regPdata2(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setPdata2_IsNotNull() { regPdata2(CK_ISNN, DUMMY_OBJECT); }

    protected void regPdata2(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePdata2(), "PDATA2", "Pdata2", "pdata2");
    }
    protected void registerInlinePdata2(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePdata2(), "PDATA2", "Pdata2", "pdata2");
    }
    abstract protected ConditionValue getCValuePdata2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param pdata3 The value of pdata3 as equal.
     */
    public void setPdata3_Equal(String pdata3) {
        regPdata3(CK_EQ, fRES(pdata3));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata3 The value of pdata3 as notEqual.
     */
    public void setPdata3_NotEqual(String pdata3) {
        regPdata3(CK_NE, fRES(pdata3));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata3 The value of pdata3 as greaterThan.
     */
    public void setPdata3_GreaterThan(String pdata3) {
        regPdata3(CK_GT, fRES(pdata3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata3 The value of pdata3 as lessThan.
     */
    public void setPdata3_LessThan(String pdata3) {
        regPdata3(CK_LT, fRES(pdata3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata3 The value of pdata3 as greaterEqual.
     */
    public void setPdata3_GreaterEqual(String pdata3) {
        regPdata3(CK_GE, fRES(pdata3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata3 The value of pdata3 as lessEqual.
     */
    public void setPdata3_LessEqual(String pdata3) {
        regPdata3(CK_LE, fRES(pdata3));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata3 The value of pdata3 as prefixSearch.
     */
    public void setPdata3_PrefixSearch(String pdata3) {
        regPdata3(CK_PS, fRES(pdata3));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param pdata3 The value of pdata3 as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPdata3_LikeSearch(String pdata3, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(pdata3), getCValuePdata3(), "PDATA3", "Pdata3", "pdata3", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param pdata3List The collection of pdata3 as inScope.
     */
    public void setPdata3_InScope(Collection<String> pdata3List) {
        regPdata3(CK_INS, cTL(pdata3List));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param pdata3 The collection of pdata3 as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setPdata3_InScope(String pdata3, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(pdata3), getCValuePdata3(), "PDATA3", "Pdata3", "pdata3", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setPdata3_IsNull() { regPdata3(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setPdata3_IsNotNull() { regPdata3(CK_ISNN, DUMMY_OBJECT); }

    protected void regPdata3(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePdata3(), "PDATA3", "Pdata3", "pdata3");
    }
    protected void registerInlinePdata3(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePdata3(), "PDATA3", "Pdata3", "pdata3");
    }
    abstract protected ConditionValue getCValuePdata3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param pdata4 The value of pdata4 as equal.
     */
    public void setPdata4_Equal(String pdata4) {
        regPdata4(CK_EQ, fRES(pdata4));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata4 The value of pdata4 as notEqual.
     */
    public void setPdata4_NotEqual(String pdata4) {
        regPdata4(CK_NE, fRES(pdata4));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata4 The value of pdata4 as greaterThan.
     */
    public void setPdata4_GreaterThan(String pdata4) {
        regPdata4(CK_GT, fRES(pdata4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata4 The value of pdata4 as lessThan.
     */
    public void setPdata4_LessThan(String pdata4) {
        regPdata4(CK_LT, fRES(pdata4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata4 The value of pdata4 as greaterEqual.
     */
    public void setPdata4_GreaterEqual(String pdata4) {
        regPdata4(CK_GE, fRES(pdata4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata4 The value of pdata4 as lessEqual.
     */
    public void setPdata4_LessEqual(String pdata4) {
        regPdata4(CK_LE, fRES(pdata4));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param pdata4 The value of pdata4 as prefixSearch.
     */
    public void setPdata4_PrefixSearch(String pdata4) {
        regPdata4(CK_PS, fRES(pdata4));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param pdata4 The value of pdata4 as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPdata4_LikeSearch(String pdata4, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(pdata4), getCValuePdata4(), "PDATA4", "Pdata4", "pdata4", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param pdata4List The collection of pdata4 as inScope.
     */
    public void setPdata4_InScope(Collection<String> pdata4List) {
        regPdata4(CK_INS, cTL(pdata4List));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param pdata4 The collection of pdata4 as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setPdata4_InScope(String pdata4, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(pdata4), getCValuePdata4(), "PDATA4", "Pdata4", "pdata4", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setPdata4_IsNull() { regPdata4(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setPdata4_IsNotNull() { regPdata4(CK_ISNN, DUMMY_OBJECT); }

    protected void regPdata4(ConditionKey key, Object value) {
        registerQuery(key, value, getCValuePdata4(), "PDATA4", "Pdata4", "pdata4");
    }
    protected void registerInlinePdata4(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValuePdata4(), "PDATA4", "Pdata4", "pdata4");
    }
    abstract protected ConditionValue getCValuePdata4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(50)}
     * @param haslength The value of haslength as equal.
     */
    public void setHaslength_Equal(String haslength) {
        regHaslength(CK_EQ, fRES(haslength));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param haslength The value of haslength as notEqual.
     */
    public void setHaslength_NotEqual(String haslength) {
        regHaslength(CK_NE, fRES(haslength));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param haslength The value of haslength as greaterThan.
     */
    public void setHaslength_GreaterThan(String haslength) {
        regHaslength(CK_GT, fRES(haslength));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param haslength The value of haslength as lessThan.
     */
    public void setHaslength_LessThan(String haslength) {
        regHaslength(CK_LT, fRES(haslength));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param haslength The value of haslength as greaterEqual.
     */
    public void setHaslength_GreaterEqual(String haslength) {
        regHaslength(CK_GE, fRES(haslength));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param haslength The value of haslength as lessEqual.
     */
    public void setHaslength_LessEqual(String haslength) {
        regHaslength(CK_LE, fRES(haslength));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param haslength The value of haslength as prefixSearch.
     */
    public void setHaslength_PrefixSearch(String haslength) {
        regHaslength(CK_PS, fRES(haslength));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param haslength The value of haslength as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHaslength_LikeSearch(String haslength, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(haslength), getCValueHaslength(), "HasLength", "Haslength", "haslength", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param haslengthList The collection of haslength as inScope.
     */
    public void setHaslength_InScope(Collection<String> haslengthList) {
        regHaslength(CK_INS, cTL(haslengthList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param haslength The collection of haslength as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setHaslength_InScope(String haslength, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(haslength), getCValueHaslength(), "HasLength", "Haslength", "haslength", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setHaslength_IsNull() { regHaslength(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setHaslength_IsNotNull() { regHaslength(CK_ISNN, DUMMY_OBJECT); }

    protected void regHaslength(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueHaslength(), "HasLength", "Haslength", "haslength");
    }
    protected void registerInlineHaslength(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueHaslength(), "HasLength", "Haslength", "haslength");
    }
    abstract protected ConditionValue getCValueHaslength();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param generictype The value of generictype as equal.
     */
    public void setGenerictype_Equal(String generictype) {
        regGenerictype(CK_EQ, fRES(generictype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param generictype The value of generictype as notEqual.
     */
    public void setGenerictype_NotEqual(String generictype) {
        regGenerictype(CK_NE, fRES(generictype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param generictype The value of generictype as greaterThan.
     */
    public void setGenerictype_GreaterThan(String generictype) {
        regGenerictype(CK_GT, fRES(generictype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param generictype The value of generictype as lessThan.
     */
    public void setGenerictype_LessThan(String generictype) {
        regGenerictype(CK_LT, fRES(generictype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param generictype The value of generictype as greaterEqual.
     */
    public void setGenerictype_GreaterEqual(String generictype) {
        regGenerictype(CK_GE, fRES(generictype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param generictype The value of generictype as lessEqual.
     */
    public void setGenerictype_LessEqual(String generictype) {
        regGenerictype(CK_LE, fRES(generictype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param generictype The value of generictype as prefixSearch.
     */
    public void setGenerictype_PrefixSearch(String generictype) {
        regGenerictype(CK_PS, fRES(generictype));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param generictype The value of generictype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGenerictype_LikeSearch(String generictype, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(generictype), getCValueGenerictype(), "GenericType", "Generictype", "generictype", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param generictypeList The collection of generictype as inScope.
     */
    public void setGenerictype_InScope(Collection<String> generictypeList) {
        regGenerictype(CK_INS, cTL(generictypeList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param generictype The collection of generictype as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setGenerictype_InScope(String generictype, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(generictype), getCValueGenerictype(), "GenericType", "Generictype", "generictype", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setGenerictype_IsNull() { regGenerictype(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setGenerictype_IsNotNull() { regGenerictype(CK_ISNN, DUMMY_OBJECT); }

    protected void regGenerictype(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueGenerictype(), "GenericType", "Generictype", "generictype");
    }
    protected void registerInlineGenerictype(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueGenerictype(), "GenericType", "Generictype", "generictype");
    }
    abstract protected ConditionValue getCValueGenerictype();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {UQ : COUNTER : NotNull}
     * @param datatypeid The value of datatypeid as equal.
     */
    public void setDatatypeid_Equal(java.lang.Integer datatypeid) {
        regDatatypeid(CK_EQ, datatypeid);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param datatypeid The value of datatypeid as notEqual.
     */
    public void setDatatypeid_NotEqual(java.lang.Integer datatypeid) {
        regDatatypeid(CK_NE, datatypeid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param datatypeid The value of datatypeid as greaterThan.
     */
    public void setDatatypeid_GreaterThan(java.lang.Integer datatypeid) {
        regDatatypeid(CK_GT, datatypeid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param datatypeid The value of datatypeid as lessThan.
     */
    public void setDatatypeid_LessThan(java.lang.Integer datatypeid) {
        regDatatypeid(CK_LT, datatypeid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param datatypeid The value of datatypeid as greaterEqual.
     */
    public void setDatatypeid_GreaterEqual(java.lang.Integer datatypeid) {
        regDatatypeid(CK_GE, datatypeid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
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

    protected void regDatatypeid(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueDatatypeid(), "DatatypeID", "Datatypeid", "datatypeid");
    }
    protected void registerInlineDatatypeid(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueDatatypeid(), "DatatypeID", "Datatypeid", "datatypeid");
    }
    abstract protected ConditionValue getCValueDatatypeid();

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TDatatypesCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TDatatypesCQ.class.getName(); }
}
