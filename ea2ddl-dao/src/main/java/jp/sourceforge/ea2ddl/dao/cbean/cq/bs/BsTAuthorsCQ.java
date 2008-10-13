package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_authors.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTAuthorsCQ extends AbstractBsTAuthorsCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TAuthorsCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTAuthorsCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_authors) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TAuthorsCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TAuthorsCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_authors on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TAuthorsCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported onClause of Base Table!"); }
        TAuthorsCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _authorname;
    public ConditionValue getAuthorname() {
        if (_authorname == null) { _authorname = new ConditionValue(); }
        return _authorname;
    }
    protected ConditionValue getCValueAuthorname() { return getAuthorname(); }
    
    public BsTAuthorsCQ addOrderBy_Authorname_Asc() { regOBA("AuthorName"); return this; }
    public BsTAuthorsCQ addOrderBy_Authorname_Desc() { regOBD("AuthorName"); return this; }

    protected ConditionValue _roles;
    public ConditionValue getRoles() {
        if (_roles == null) { _roles = new ConditionValue(); }
        return _roles;
    }
    protected ConditionValue getCValueRoles() { return getRoles(); }
    
    public BsTAuthorsCQ addOrderBy_Roles_Asc() { regOBA("Roles"); return this; }
    public BsTAuthorsCQ addOrderBy_Roles_Desc() { regOBD("Roles"); return this; }

    protected ConditionValue _notes;
    public ConditionValue getNotes() {
        if (_notes == null) { _notes = new ConditionValue(); }
        return _notes;
    }
    protected ConditionValue getCValueNotes() { return getNotes(); }
    
    public BsTAuthorsCQ addOrderBy_Notes_Asc() { regOBA("Notes"); return this; }
    public BsTAuthorsCQ addOrderBy_Notes_Desc() { regOBD("Notes"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTAuthorsCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTAuthorsCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============


    protected String getConditionQueryClassNameInternally() { return TAuthorsCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}
