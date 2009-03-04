package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_ecf.
 * @author DBFlute(AutoGenerator)
 */
public class BsTEcfCQ extends AbstractBsTEcfCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TEcfCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTEcfCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_ecf) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TEcfCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TEcfCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_ecf on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TEcfCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        TEcfCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _ecfid;
    public ConditionValue getEcfid() {
        if (_ecfid == null) { _ecfid = new ConditionValue(); }
        return _ecfid;
    }
    protected ConditionValue getCValueEcfid() { return getEcfid(); }

    public BsTEcfCQ addOrderBy_Ecfid_Asc() { regOBA("ECFID"); return this; }
    public BsTEcfCQ addOrderBy_Ecfid_Desc() { regOBD("ECFID"); return this; }

    protected ConditionValue _description;
    public ConditionValue getDescription() {
        if (_description == null) { _description = new ConditionValue(); }
        return _description;
    }
    protected ConditionValue getCValueDescription() { return getDescription(); }

    public BsTEcfCQ addOrderBy_Description_Asc() { regOBA("Description"); return this; }
    public BsTEcfCQ addOrderBy_Description_Desc() { regOBD("Description"); return this; }

    protected ConditionValue _weight;
    public ConditionValue getWeight() {
        if (_weight == null) { _weight = new ConditionValue(); }
        return _weight;
    }
    protected ConditionValue getCValueWeight() { return getWeight(); }

    public BsTEcfCQ addOrderBy_Weight_Asc() { regOBA("Weight"); return this; }
    public BsTEcfCQ addOrderBy_Weight_Desc() { regOBD("Weight"); return this; }

    protected ConditionValue _value;
    public ConditionValue getValue() {
        if (_value == null) { _value = new ConditionValue(); }
        return _value;
    }
    protected ConditionValue getCValueValue() { return getValue(); }

    public BsTEcfCQ addOrderBy_Value_Asc() { regOBA("Value"); return this; }
    public BsTEcfCQ addOrderBy_Value_Desc() { regOBD("Value"); return this; }

    protected ConditionValue _notes;
    public ConditionValue getNotes() {
        if (_notes == null) { _notes = new ConditionValue(); }
        return _notes;
    }
    protected ConditionValue getCValueNotes() { return getNotes(); }

    public BsTEcfCQ addOrderBy_Notes_Asc() { regOBA("Notes"); return this; }
    public BsTEcfCQ addOrderBy_Notes_Desc() { regOBD("Notes"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTEcfCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTEcfCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TEcfCB.class.getName(); }
    String xCQ() { return TEcfCQ.class.getName(); }
    String xMap() { return Map.class.getName(); }
}
