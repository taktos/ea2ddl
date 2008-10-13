package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_diagramlinks.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTDiagramlinksCQ extends AbstractBsTDiagramlinksCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TDiagramlinksCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTDiagramlinksCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_diagramlinks) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TDiagramlinksCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TDiagramlinksCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_diagramlinks on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TDiagramlinksCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported onClause of Base Table!"); }
        TDiagramlinksCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _diagramid;
    public ConditionValue getDiagramid() {
        if (_diagramid == null) { _diagramid = new ConditionValue(); }
        return _diagramid;
    }
    protected ConditionValue getCValueDiagramid() { return getDiagramid(); }
          
    public BsTDiagramlinksCQ addOrderBy_Diagramid_Asc() { regOBA("DiagramID"); return this; }
    public BsTDiagramlinksCQ addOrderBy_Diagramid_Desc() { regOBD("DiagramID"); return this; }

    protected ConditionValue _connectorid;
    public ConditionValue getConnectorid() {
        if (_connectorid == null) { _connectorid = new ConditionValue(); }
        return _connectorid;
    }
    protected ConditionValue getCValueConnectorid() { return getConnectorid(); }
          
    public BsTDiagramlinksCQ addOrderBy_Connectorid_Asc() { regOBA("ConnectorID"); return this; }
    public BsTDiagramlinksCQ addOrderBy_Connectorid_Desc() { regOBD("ConnectorID"); return this; }

    protected ConditionValue _geometry;
    public ConditionValue getGeometry() {
        if (_geometry == null) { _geometry = new ConditionValue(); }
        return _geometry;
    }
    protected ConditionValue getCValueGeometry() { return getGeometry(); }
    
    public BsTDiagramlinksCQ addOrderBy_Geometry_Asc() { regOBA("Geometry"); return this; }
    public BsTDiagramlinksCQ addOrderBy_Geometry_Desc() { regOBD("Geometry"); return this; }

    protected ConditionValue _style;
    public ConditionValue getStyle() {
        if (_style == null) { _style = new ConditionValue(); }
        return _style;
    }
    protected ConditionValue getCValueStyle() { return getStyle(); }
    
    public BsTDiagramlinksCQ addOrderBy_Style_Asc() { regOBA("Style"); return this; }
    public BsTDiagramlinksCQ addOrderBy_Style_Desc() { regOBD("Style"); return this; }

    protected ConditionValue _hidden;
    public ConditionValue getHidden() {
        if (_hidden == null) { _hidden = new ConditionValue(); }
        return _hidden;
    }
    protected ConditionValue getCValueHidden() { return getHidden(); }
    
    public BsTDiagramlinksCQ addOrderBy_Hidden_Asc() { regOBA("Hidden"); return this; }
    public BsTDiagramlinksCQ addOrderBy_Hidden_Desc() { regOBD("Hidden"); return this; }

    protected ConditionValue _path;
    public ConditionValue getPath() {
        if (_path == null) { _path = new ConditionValue(); }
        return _path;
    }
    protected ConditionValue getCValuePath() { return getPath(); }
    
    public BsTDiagramlinksCQ addOrderBy_Path_Asc() { regOBA("Path"); return this; }
    public BsTDiagramlinksCQ addOrderBy_Path_Desc() { regOBD("Path"); return this; }

    protected ConditionValue _instanceId;
    public ConditionValue getInstanceId() {
        if (_instanceId == null) { _instanceId = new ConditionValue(); }
        return _instanceId;
    }
    protected ConditionValue getCValueInstanceId() { return getInstanceId(); }
          
    public BsTDiagramlinksCQ addOrderBy_InstanceId_Asc() { regOBA("Instance_ID"); return this; }
    public BsTDiagramlinksCQ addOrderBy_InstanceId_Desc() { regOBD("Instance_ID"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTDiagramlinksCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTDiagramlinksCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============


    protected String getConditionQueryClassNameInternally() { return TDiagramlinksCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}
