package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_template.
 * @author DBFlute(AutoGenerator)
 */
public class BsTTemplateCQ extends AbstractBsTTemplateCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TTemplateCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTTemplateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_template) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TTemplateCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TTemplateCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_template on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TTemplateCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        TTemplateCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _templateid;
    public ConditionValue getTemplateid() {
        if (_templateid == null) { _templateid = new ConditionValue(); }
        return _templateid;
    }
    protected ConditionValue getCValueTemplateid() { return getTemplateid(); }

    public BsTTemplateCQ addOrderBy_Templateid_Asc() { regOBA("TemplateID"); return this; }
    public BsTTemplateCQ addOrderBy_Templateid_Desc() { regOBD("TemplateID"); return this; }

    protected ConditionValue _templatetype;
    public ConditionValue getTemplatetype() {
        if (_templatetype == null) { _templatetype = new ConditionValue(); }
        return _templatetype;
    }
    protected ConditionValue getCValueTemplatetype() { return getTemplatetype(); }

    public BsTTemplateCQ addOrderBy_Templatetype_Asc() { regOBA("TemplateType"); return this; }
    public BsTTemplateCQ addOrderBy_Templatetype_Desc() { regOBD("TemplateType"); return this; }

    protected ConditionValue _templatename;
    public ConditionValue getTemplatename() {
        if (_templatename == null) { _templatename = new ConditionValue(); }
        return _templatename;
    }
    protected ConditionValue getCValueTemplatename() { return getTemplatename(); }

    public BsTTemplateCQ addOrderBy_Templatename_Asc() { regOBA("TemplateName"); return this; }
    public BsTTemplateCQ addOrderBy_Templatename_Desc() { regOBD("TemplateName"); return this; }

    protected ConditionValue _notes;
    public ConditionValue getNotes() {
        if (_notes == null) { _notes = new ConditionValue(); }
        return _notes;
    }
    protected ConditionValue getCValueNotes() { return getNotes(); }

    public BsTTemplateCQ addOrderBy_Notes_Asc() { regOBA("Notes"); return this; }
    public BsTTemplateCQ addOrderBy_Notes_Desc() { regOBD("Notes"); return this; }

    protected ConditionValue _style;
    public ConditionValue getStyle() {
        if (_style == null) { _style = new ConditionValue(); }
        return _style;
    }
    protected ConditionValue getCValueStyle() { return getStyle(); }

    public BsTTemplateCQ addOrderBy_Style_Asc() { regOBA("Style"); return this; }
    public BsTTemplateCQ addOrderBy_Style_Desc() { regOBD("Style"); return this; }

    protected ConditionValue _template;
    public ConditionValue getTemplate() {
        if (_template == null) { _template = new ConditionValue(); }
        return _template;
    }
    protected ConditionValue getCValueTemplate() { return getTemplate(); }

    public BsTTemplateCQ addOrderBy_Template_Asc() { regOBA("Template"); return this; }
    public BsTTemplateCQ addOrderBy_Template_Desc() { regOBD("Template"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTTemplateCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTTemplateCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    String xCB() { return TTemplateCB.class.getName(); }
    String xCQ() { return TTemplateCQ.class.getName(); }
    String xMap() { return Map.class.getName(); }
}
