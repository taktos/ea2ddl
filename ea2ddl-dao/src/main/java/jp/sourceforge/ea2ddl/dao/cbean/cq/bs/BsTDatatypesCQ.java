package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_datatypes.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTDatatypesCQ extends AbstractBsTDatatypesCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TDatatypesCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTDatatypesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_datatypes) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TDatatypesCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TDatatypesCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_datatypes on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TDatatypesCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported onClause of Base Table!"); }
        TDatatypesCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _type;
    public ConditionValue getType() {
        if (_type == null) { _type = new ConditionValue(); }
        return _type;
    }
    protected ConditionValue getCValueType() { return getType(); }
    
    public BsTDatatypesCQ addOrderBy_Type_Asc() { regOBA("Type"); return this; }
    public BsTDatatypesCQ addOrderBy_Type_Desc() { regOBD("Type"); return this; }

    protected ConditionValue _productname;
    public ConditionValue getProductname() {
        if (_productname == null) { _productname = new ConditionValue(); }
        return _productname;
    }
    protected ConditionValue getCValueProductname() { return getProductname(); }
    
    public BsTDatatypesCQ addOrderBy_Productname_Asc() { regOBA("ProductName"); return this; }
    public BsTDatatypesCQ addOrderBy_Productname_Desc() { regOBD("ProductName"); return this; }

    protected ConditionValue _datatype;
    public ConditionValue getDatatype() {
        if (_datatype == null) { _datatype = new ConditionValue(); }
        return _datatype;
    }
    protected ConditionValue getCValueDatatype() { return getDatatype(); }
    
    public BsTDatatypesCQ addOrderBy_Datatype_Asc() { regOBA("DataType"); return this; }
    public BsTDatatypesCQ addOrderBy_Datatype_Desc() { regOBD("DataType"); return this; }

    protected ConditionValue _size;
    public ConditionValue getSize() {
        if (_size == null) { _size = new ConditionValue(); }
        return _size;
    }
    protected ConditionValue getCValueSize() { return getSize(); }
          
    public BsTDatatypesCQ addOrderBy_Size_Asc() { regOBA("Size"); return this; }
    public BsTDatatypesCQ addOrderBy_Size_Desc() { regOBD("Size"); return this; }

    protected ConditionValue _maxlen;
    public ConditionValue getMaxlen() {
        if (_maxlen == null) { _maxlen = new ConditionValue(); }
        return _maxlen;
    }
    protected ConditionValue getCValueMaxlen() { return getMaxlen(); }
          
    public BsTDatatypesCQ addOrderBy_Maxlen_Asc() { regOBA("MaxLen"); return this; }
    public BsTDatatypesCQ addOrderBy_Maxlen_Desc() { regOBD("MaxLen"); return this; }

    protected ConditionValue _maxprec;
    public ConditionValue getMaxprec() {
        if (_maxprec == null) { _maxprec = new ConditionValue(); }
        return _maxprec;
    }
    protected ConditionValue getCValueMaxprec() { return getMaxprec(); }
          
    public BsTDatatypesCQ addOrderBy_Maxprec_Asc() { regOBA("MaxPrec"); return this; }
    public BsTDatatypesCQ addOrderBy_Maxprec_Desc() { regOBD("MaxPrec"); return this; }

    protected ConditionValue _maxscale;
    public ConditionValue getMaxscale() {
        if (_maxscale == null) { _maxscale = new ConditionValue(); }
        return _maxscale;
    }
    protected ConditionValue getCValueMaxscale() { return getMaxscale(); }
          
    public BsTDatatypesCQ addOrderBy_Maxscale_Asc() { regOBA("MaxScale"); return this; }
    public BsTDatatypesCQ addOrderBy_Maxscale_Desc() { regOBD("MaxScale"); return this; }

    protected ConditionValue _defaultlen;
    public ConditionValue getDefaultlen() {
        if (_defaultlen == null) { _defaultlen = new ConditionValue(); }
        return _defaultlen;
    }
    protected ConditionValue getCValueDefaultlen() { return getDefaultlen(); }
          
    public BsTDatatypesCQ addOrderBy_Defaultlen_Asc() { regOBA("DefaultLen"); return this; }
    public BsTDatatypesCQ addOrderBy_Defaultlen_Desc() { regOBD("DefaultLen"); return this; }

    protected ConditionValue _defaultprec;
    public ConditionValue getDefaultprec() {
        if (_defaultprec == null) { _defaultprec = new ConditionValue(); }
        return _defaultprec;
    }
    protected ConditionValue getCValueDefaultprec() { return getDefaultprec(); }
          
    public BsTDatatypesCQ addOrderBy_Defaultprec_Asc() { regOBA("DefaultPrec"); return this; }
    public BsTDatatypesCQ addOrderBy_Defaultprec_Desc() { regOBD("DefaultPrec"); return this; }

    protected ConditionValue _defaultscale;
    public ConditionValue getDefaultscale() {
        if (_defaultscale == null) { _defaultscale = new ConditionValue(); }
        return _defaultscale;
    }
    protected ConditionValue getCValueDefaultscale() { return getDefaultscale(); }
          
    public BsTDatatypesCQ addOrderBy_Defaultscale_Asc() { regOBA("DefaultScale"); return this; }
    public BsTDatatypesCQ addOrderBy_Defaultscale_Desc() { regOBD("DefaultScale"); return this; }

    protected ConditionValue _user;
    public ConditionValue getUser() {
        if (_user == null) { _user = new ConditionValue(); }
        return _user;
    }
    protected ConditionValue getCValueUser() { return getUser(); }
          
    public BsTDatatypesCQ addOrderBy_User_Asc() { regOBA("User"); return this; }
    public BsTDatatypesCQ addOrderBy_User_Desc() { regOBD("User"); return this; }

    protected ConditionValue _pdata1;
    public ConditionValue getPdata1() {
        if (_pdata1 == null) { _pdata1 = new ConditionValue(); }
        return _pdata1;
    }
    protected ConditionValue getCValuePdata1() { return getPdata1(); }
    
    public BsTDatatypesCQ addOrderBy_Pdata1_Asc() { regOBA("PDATA1"); return this; }
    public BsTDatatypesCQ addOrderBy_Pdata1_Desc() { regOBD("PDATA1"); return this; }

    protected ConditionValue _pdata2;
    public ConditionValue getPdata2() {
        if (_pdata2 == null) { _pdata2 = new ConditionValue(); }
        return _pdata2;
    }
    protected ConditionValue getCValuePdata2() { return getPdata2(); }
    
    public BsTDatatypesCQ addOrderBy_Pdata2_Asc() { regOBA("PDATA2"); return this; }
    public BsTDatatypesCQ addOrderBy_Pdata2_Desc() { regOBD("PDATA2"); return this; }

    protected ConditionValue _pdata3;
    public ConditionValue getPdata3() {
        if (_pdata3 == null) { _pdata3 = new ConditionValue(); }
        return _pdata3;
    }
    protected ConditionValue getCValuePdata3() { return getPdata3(); }
    
    public BsTDatatypesCQ addOrderBy_Pdata3_Asc() { regOBA("PDATA3"); return this; }
    public BsTDatatypesCQ addOrderBy_Pdata3_Desc() { regOBD("PDATA3"); return this; }

    protected ConditionValue _pdata4;
    public ConditionValue getPdata4() {
        if (_pdata4 == null) { _pdata4 = new ConditionValue(); }
        return _pdata4;
    }
    protected ConditionValue getCValuePdata4() { return getPdata4(); }
    
    public BsTDatatypesCQ addOrderBy_Pdata4_Asc() { regOBA("PDATA4"); return this; }
    public BsTDatatypesCQ addOrderBy_Pdata4_Desc() { regOBD("PDATA4"); return this; }

    protected ConditionValue _haslength;
    public ConditionValue getHaslength() {
        if (_haslength == null) { _haslength = new ConditionValue(); }
        return _haslength;
    }
    protected ConditionValue getCValueHaslength() { return getHaslength(); }
    
    public BsTDatatypesCQ addOrderBy_Haslength_Asc() { regOBA("HasLength"); return this; }
    public BsTDatatypesCQ addOrderBy_Haslength_Desc() { regOBD("HasLength"); return this; }

    protected ConditionValue _generictype;
    public ConditionValue getGenerictype() {
        if (_generictype == null) { _generictype = new ConditionValue(); }
        return _generictype;
    }
    protected ConditionValue getCValueGenerictype() { return getGenerictype(); }
    
    public BsTDatatypesCQ addOrderBy_Generictype_Asc() { regOBA("GenericType"); return this; }
    public BsTDatatypesCQ addOrderBy_Generictype_Desc() { regOBD("GenericType"); return this; }

    protected ConditionValue _datatypeid;
    public ConditionValue getDatatypeid() {
        if (_datatypeid == null) { _datatypeid = new ConditionValue(); }
        return _datatypeid;
    }
    protected ConditionValue getCValueDatatypeid() { return getDatatypeid(); }
          
    public BsTDatatypesCQ addOrderBy_Datatypeid_Asc() { regOBA("DatatypeID"); return this; }
    public BsTDatatypesCQ addOrderBy_Datatypeid_Desc() { regOBD("DatatypeID"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTDatatypesCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTDatatypesCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============


    protected String getConditionQueryClassNameInternally() { return TDatatypesCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}
