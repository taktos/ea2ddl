package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of usysQueries.
 * @author DBFlute(AutoGenerator)
 */
public class BsUsysqueriesCQ extends AbstractBsUsysqueriesCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected UsysqueriesCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsUsysqueriesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from usysQueries) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public UsysqueriesCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new UsysqueriesCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join usysQueries on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public UsysqueriesCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        UsysqueriesCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _queryname;
    public ConditionValue getQueryname() {
        if (_queryname == null) { _queryname = new ConditionValue(); }
        return _queryname;
    }
    protected ConditionValue getCValueQueryname() { return getQueryname(); }

    public BsUsysqueriesCQ addOrderBy_Queryname_Asc() { regOBA("QueryName"); return this; }
    public BsUsysqueriesCQ addOrderBy_Queryname_Desc() { regOBD("QueryName"); return this; }

    protected ConditionValue _newname;
    public ConditionValue getNewname() {
        if (_newname == null) { _newname = new ConditionValue(); }
        return _newname;
    }
    protected ConditionValue getCValueNewname() { return getNewname(); }

    public BsUsysqueriesCQ addOrderBy_Newname_Asc() { regOBA("NewName"); return this; }
    public BsUsysqueriesCQ addOrderBy_Newname_Desc() { regOBD("NewName"); return this; }

    protected ConditionValue _fixcode;
    public ConditionValue getFixcode() {
        if (_fixcode == null) { _fixcode = new ConditionValue(); }
        return _fixcode;
    }
    protected ConditionValue getCValueFixcode() { return getFixcode(); }

    public BsUsysqueriesCQ addOrderBy_Fixcode_Asc() { regOBA("FixCode"); return this; }
    public BsUsysqueriesCQ addOrderBy_Fixcode_Desc() { regOBD("FixCode"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsUsysqueriesCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsUsysqueriesCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    String xCB() { return UsysqueriesCB.class.getName(); }
    String xCQ() { return UsysqueriesCQ.class.getName(); }
    String xMap() { return Map.class.getName(); }
}
