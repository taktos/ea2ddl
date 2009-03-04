package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_connectortypes.
 * @author DBFlute(AutoGenerator)
 */
public class BsTConnectortypesCQ extends AbstractBsTConnectortypesCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TConnectortypesCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTConnectortypesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_connectortypes) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TConnectortypesCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TConnectortypesCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_connectortypes on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TConnectortypesCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        TConnectortypesCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _connectorType;
    public ConditionValue getConnectorType() {
        if (_connectorType == null) { _connectorType = new ConditionValue(); }
        return _connectorType;
    }
    protected ConditionValue getCValueConnectorType() { return getConnectorType(); }

    public BsTConnectortypesCQ addOrderBy_ConnectorType_Asc() { regOBA("Connector_Type"); return this; }
    public BsTConnectortypesCQ addOrderBy_ConnectorType_Desc() { regOBD("Connector_Type"); return this; }

    protected ConditionValue _description;
    public ConditionValue getDescription() {
        if (_description == null) { _description = new ConditionValue(); }
        return _description;
    }
    protected ConditionValue getCValueDescription() { return getDescription(); }

    public BsTConnectortypesCQ addOrderBy_Description_Asc() { regOBA("Description"); return this; }
    public BsTConnectortypesCQ addOrderBy_Description_Desc() { regOBD("Description"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTConnectortypesCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTConnectortypesCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    String xCB() { return TConnectortypesCB.class.getName(); }
    String xCQ() { return TConnectortypesCQ.class.getName(); }
    String xMap() { return Map.class.getName(); }
}
