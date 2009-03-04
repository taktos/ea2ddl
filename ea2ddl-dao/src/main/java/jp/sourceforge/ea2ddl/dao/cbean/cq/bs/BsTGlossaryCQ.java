package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_glossary.
 * @author DBFlute(AutoGenerator)
 */
public class BsTGlossaryCQ extends AbstractBsTGlossaryCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TGlossaryCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTGlossaryCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_glossary) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TGlossaryCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TGlossaryCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_glossary on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TGlossaryCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        TGlossaryCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _term;
    public ConditionValue getTerm() {
        if (_term == null) { _term = new ConditionValue(); }
        return _term;
    }
    protected ConditionValue getCValueTerm() { return getTerm(); }

    public BsTGlossaryCQ addOrderBy_Term_Asc() { regOBA("Term"); return this; }
    public BsTGlossaryCQ addOrderBy_Term_Desc() { regOBD("Term"); return this; }

    protected ConditionValue _type;
    public ConditionValue getType() {
        if (_type == null) { _type = new ConditionValue(); }
        return _type;
    }
    protected ConditionValue getCValueType() { return getType(); }

    public BsTGlossaryCQ addOrderBy_Type_Asc() { regOBA("Type"); return this; }
    public BsTGlossaryCQ addOrderBy_Type_Desc() { regOBD("Type"); return this; }

    protected ConditionValue _meaning;
    public ConditionValue getMeaning() {
        if (_meaning == null) { _meaning = new ConditionValue(); }
        return _meaning;
    }
    protected ConditionValue getCValueMeaning() { return getMeaning(); }

    public BsTGlossaryCQ addOrderBy_Meaning_Asc() { regOBA("Meaning"); return this; }
    public BsTGlossaryCQ addOrderBy_Meaning_Desc() { regOBD("Meaning"); return this; }

    protected ConditionValue _glossaryid;
    public ConditionValue getGlossaryid() {
        if (_glossaryid == null) { _glossaryid = new ConditionValue(); }
        return _glossaryid;
    }
    protected ConditionValue getCValueGlossaryid() { return getGlossaryid(); }

    public BsTGlossaryCQ addOrderBy_Glossaryid_Asc() { regOBA("GlossaryID"); return this; }
    public BsTGlossaryCQ addOrderBy_Glossaryid_Desc() { regOBD("GlossaryID"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTGlossaryCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTGlossaryCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    String xCB() { return TGlossaryCB.class.getName(); }
    String xCQ() { return TGlossaryCQ.class.getName(); }
    String xMap() { return Map.class.getName(); }
}
