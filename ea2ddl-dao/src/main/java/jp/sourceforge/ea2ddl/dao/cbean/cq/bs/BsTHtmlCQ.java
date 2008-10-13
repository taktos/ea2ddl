package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_html.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTHtmlCQ extends AbstractBsTHtmlCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected THtmlCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTHtmlCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_html) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public THtmlCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new THtmlCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_html on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public THtmlCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported onClause of Base Table!"); }
        THtmlCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
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
    
    public BsTHtmlCQ addOrderBy_Type_Asc() { regOBA("Type"); return this; }
    public BsTHtmlCQ addOrderBy_Type_Desc() { regOBD("Type"); return this; }

    protected ConditionValue _template;
    public ConditionValue getTemplate() {
        if (_template == null) { _template = new ConditionValue(); }
        return _template;
    }
    protected ConditionValue getCValueTemplate() { return getTemplate(); }
    
    public BsTHtmlCQ addOrderBy_Template_Asc() { regOBA("Template"); return this; }
    public BsTHtmlCQ addOrderBy_Template_Desc() { regOBD("Template"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTHtmlCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTHtmlCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============


    protected String getConditionQueryClassNameInternally() { return THtmlCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}
