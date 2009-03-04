package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of usysOldTables.
 * @author DBFlute(AutoGenerator)
 */
public class BsUsysoldtablesCQ extends AbstractBsUsysoldtablesCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected UsysoldtablesCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsUsysoldtablesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from usysOldTables) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public UsysoldtablesCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new UsysoldtablesCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join usysOldTables on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public UsysoldtablesCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        UsysoldtablesCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _tablename;
    public ConditionValue getTablename() {
        if (_tablename == null) { _tablename = new ConditionValue(); }
        return _tablename;
    }
    protected ConditionValue getCValueTablename() { return getTablename(); }

    public BsUsysoldtablesCQ addOrderBy_Tablename_Asc() { regOBA("TableName"); return this; }
    public BsUsysoldtablesCQ addOrderBy_Tablename_Desc() { regOBD("TableName"); return this; }

    protected ConditionValue _newname;
    public ConditionValue getNewname() {
        if (_newname == null) { _newname = new ConditionValue(); }
        return _newname;
    }
    protected ConditionValue getCValueNewname() { return getNewname(); }

    public BsUsysoldtablesCQ addOrderBy_Newname_Asc() { regOBA("NewName"); return this; }
    public BsUsysoldtablesCQ addOrderBy_Newname_Desc() { regOBD("NewName"); return this; }

    protected ConditionValue _relorder;
    public ConditionValue getRelorder() {
        if (_relorder == null) { _relorder = new ConditionValue(); }
        return _relorder;
    }
    protected ConditionValue getCValueRelorder() { return getRelorder(); }

    public BsUsysoldtablesCQ addOrderBy_Relorder_Asc() { regOBA("RelOrder"); return this; }
    public BsUsysoldtablesCQ addOrderBy_Relorder_Desc() { regOBD("RelOrder"); return this; }

    protected ConditionValue _fixcode;
    public ConditionValue getFixcode() {
        if (_fixcode == null) { _fixcode = new ConditionValue(); }
        return _fixcode;
    }
    protected ConditionValue getCValueFixcode() { return getFixcode(); }

    public BsUsysoldtablesCQ addOrderBy_Fixcode_Asc() { regOBA("FixCode"); return this; }
    public BsUsysoldtablesCQ addOrderBy_Fixcode_Desc() { regOBD("FixCode"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsUsysoldtablesCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsUsysoldtablesCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    String xCB() { return UsysoldtablesCB.class.getName(); }
    String xCQ() { return UsysoldtablesCQ.class.getName(); }
    String xMap() { return Map.class.getName(); }
}
