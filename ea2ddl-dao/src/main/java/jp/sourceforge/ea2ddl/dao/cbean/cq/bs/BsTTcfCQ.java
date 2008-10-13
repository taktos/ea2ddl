package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_tcf.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTTcfCQ extends AbstractBsTTcfCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTcfCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTcfCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_tcf) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TTcfCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TTcfCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_tcf on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TTcfCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported onClause of Base Table!"); }
        TTcfCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _tcfid;
    public ConditionValue getTcfid() {
        if (_tcfid == null) { _tcfid = new ConditionValue(); }
        return _tcfid;
    }
    protected ConditionValue getCValueTcfid() { return getTcfid(); }
    
    public BsTTcfCQ addOrderBy_Tcfid_Asc() { regOBA("TCFID"); return this; }
    public BsTTcfCQ addOrderBy_Tcfid_Desc() { regOBD("TCFID"); return this; }

    protected ConditionValue _description;
    public ConditionValue getDescription() {
        if (_description == null) { _description = new ConditionValue(); }
        return _description;
    }
    protected ConditionValue getCValueDescription() { return getDescription(); }
    
    public BsTTcfCQ addOrderBy_Description_Asc() { regOBA("Description"); return this; }
    public BsTTcfCQ addOrderBy_Description_Desc() { regOBD("Description"); return this; }

    protected ConditionValue _weight;
    public ConditionValue getWeight() {
        if (_weight == null) { _weight = new ConditionValue(); }
        return _weight;
    }
    protected ConditionValue getCValueWeight() { return getWeight(); }
          
    public BsTTcfCQ addOrderBy_Weight_Asc() { regOBA("Weight"); return this; }
    public BsTTcfCQ addOrderBy_Weight_Desc() { regOBD("Weight"); return this; }

    protected ConditionValue _value;
    public ConditionValue getValue() {
        if (_value == null) { _value = new ConditionValue(); }
        return _value;
    }
    protected ConditionValue getCValueValue() { return getValue(); }
          
    public BsTTcfCQ addOrderBy_Value_Asc() { regOBA("Value"); return this; }
    public BsTTcfCQ addOrderBy_Value_Desc() { regOBD("Value"); return this; }

    protected ConditionValue _notes;
    public ConditionValue getNotes() {
        if (_notes == null) { _notes = new ConditionValue(); }
        return _notes;
    }
    protected ConditionValue getCValueNotes() { return getNotes(); }
    
    public BsTTcfCQ addOrderBy_Notes_Asc() { regOBA("Notes"); return this; }
    public BsTTcfCQ addOrderBy_Notes_Desc() { regOBD("Notes"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTTcfCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTTcfCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============


    protected String getConditionQueryClassNameInternally() { return TTcfCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}
