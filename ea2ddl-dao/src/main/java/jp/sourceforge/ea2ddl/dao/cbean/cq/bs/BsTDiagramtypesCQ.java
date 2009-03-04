package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_diagramtypes.
 * @author DBFlute(AutoGenerator)
 */
public class BsTDiagramtypesCQ extends AbstractBsTDiagramtypesCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TDiagramtypesCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTDiagramtypesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_diagramtypes) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TDiagramtypesCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TDiagramtypesCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_diagramtypes on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TDiagramtypesCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        TDiagramtypesCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _diagramType;
    public ConditionValue getDiagramType() {
        if (_diagramType == null) { _diagramType = new ConditionValue(); }
        return _diagramType;
    }
    protected ConditionValue getCValueDiagramType() { return getDiagramType(); }

    public BsTDiagramtypesCQ addOrderBy_DiagramType_Asc() { regOBA("Diagram_Type"); return this; }
    public BsTDiagramtypesCQ addOrderBy_DiagramType_Desc() { regOBD("Diagram_Type"); return this; }

    protected ConditionValue _name;
    public ConditionValue getName() {
        if (_name == null) { _name = new ConditionValue(); }
        return _name;
    }
    protected ConditionValue getCValueName() { return getName(); }

    public BsTDiagramtypesCQ addOrderBy_Name_Asc() { regOBA("Name"); return this; }
    public BsTDiagramtypesCQ addOrderBy_Name_Desc() { regOBD("Name"); return this; }

    protected ConditionValue _packageId;
    public ConditionValue getPackageId() {
        if (_packageId == null) { _packageId = new ConditionValue(); }
        return _packageId;
    }
    protected ConditionValue getCValuePackageId() { return getPackageId(); }

    public BsTDiagramtypesCQ addOrderBy_PackageId_Asc() { regOBA("Package_ID"); return this; }
    public BsTDiagramtypesCQ addOrderBy_PackageId_Desc() { regOBD("Package_ID"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTDiagramtypesCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTDiagramtypesCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    String xCB() { return TDiagramtypesCB.class.getName(); }
    String xCQ() { return TDiagramtypesCQ.class.getName(); }
    String xMap() { return Map.class.getName(); }
}
