package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_taggedvalue.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTTaggedvalueCQ extends AbstractBsTTaggedvalueCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTaggedvalueCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTaggedvalueCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_taggedvalue) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TTaggedvalueCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TTaggedvalueCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_taggedvalue on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TTaggedvalueCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported onClause of Base Table!"); }
        TTaggedvalueCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _propertyid;
    public ConditionValue getPropertyid() {
        if (_propertyid == null) { _propertyid = new ConditionValue(); }
        return _propertyid;
    }
    protected ConditionValue getCValuePropertyid() { return getPropertyid(); }
    
    public BsTTaggedvalueCQ addOrderBy_Propertyid_Asc() { regOBA("PropertyID"); return this; }
    public BsTTaggedvalueCQ addOrderBy_Propertyid_Desc() { regOBD("PropertyID"); return this; }

    protected ConditionValue _elementid;
    public ConditionValue getElementid() {
        if (_elementid == null) { _elementid = new ConditionValue(); }
        return _elementid;
    }
    protected ConditionValue getCValueElementid() { return getElementid(); }
    
    public BsTTaggedvalueCQ addOrderBy_Elementid_Asc() { regOBA("ElementID"); return this; }
    public BsTTaggedvalueCQ addOrderBy_Elementid_Desc() { regOBD("ElementID"); return this; }

    protected ConditionValue _baseclass;
    public ConditionValue getBaseclass() {
        if (_baseclass == null) { _baseclass = new ConditionValue(); }
        return _baseclass;
    }
    protected ConditionValue getCValueBaseclass() { return getBaseclass(); }
    
    public BsTTaggedvalueCQ addOrderBy_Baseclass_Asc() { regOBA("BaseClass"); return this; }
    public BsTTaggedvalueCQ addOrderBy_Baseclass_Desc() { regOBD("BaseClass"); return this; }

    protected ConditionValue _tagvalue;
    public ConditionValue getTagvalue() {
        if (_tagvalue == null) { _tagvalue = new ConditionValue(); }
        return _tagvalue;
    }
    protected ConditionValue getCValueTagvalue() { return getTagvalue(); }
    
    public BsTTaggedvalueCQ addOrderBy_Tagvalue_Asc() { regOBA("TagValue"); return this; }
    public BsTTaggedvalueCQ addOrderBy_Tagvalue_Desc() { regOBD("TagValue"); return this; }

    protected ConditionValue _notes;
    public ConditionValue getNotes() {
        if (_notes == null) { _notes = new ConditionValue(); }
        return _notes;
    }
    protected ConditionValue getCValueNotes() { return getNotes(); }
    
    public BsTTaggedvalueCQ addOrderBy_Notes_Asc() { regOBA("Notes"); return this; }
    public BsTTaggedvalueCQ addOrderBy_Notes_Desc() { regOBD("Notes"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTTaggedvalueCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTTaggedvalueCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============


    protected String getConditionQueryClassNameInternally() { return TTaggedvalueCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}
