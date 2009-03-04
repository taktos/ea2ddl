package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_rtf.
 * @author DBFlute(AutoGenerator)
 */
public class BsTRtfCQ extends AbstractBsTRtfCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TRtfCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTRtfCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_rtf) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TRtfCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TRtfCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_rtf on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TRtfCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        TRtfCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
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

    public BsTRtfCQ addOrderBy_Type_Asc() { regOBA("Type"); return this; }
    public BsTRtfCQ addOrderBy_Type_Desc() { regOBD("Type"); return this; }

    protected ConditionValue _template;
    public ConditionValue getTemplate() {
        if (_template == null) { _template = new ConditionValue(); }
        return _template;
    }
    protected ConditionValue getCValueTemplate() { return getTemplate(); }

    public BsTRtfCQ addOrderBy_Template_Asc() { regOBA("Template"); return this; }
    public BsTRtfCQ addOrderBy_Template_Desc() { regOBD("Template"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTRtfCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTRtfCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    String xCB() { return TRtfCB.class.getName(); }
    String xCQ() { return TRtfCQ.class.getName(); }
    String xMap() { return Map.class.getName(); }
}
