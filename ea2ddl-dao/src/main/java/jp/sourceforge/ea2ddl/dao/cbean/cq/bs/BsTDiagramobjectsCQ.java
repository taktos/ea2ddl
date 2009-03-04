package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_diagramobjects.
 * @author DBFlute(AutoGenerator)
 */
public class BsTDiagramobjectsCQ extends AbstractBsTDiagramobjectsCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TDiagramobjectsCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTDiagramobjectsCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_diagramobjects) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TDiagramobjectsCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TDiagramobjectsCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_diagramobjects on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TDiagramobjectsCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        TDiagramobjectsCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _diagramId;
    public ConditionValue getDiagramId() {
        if (_diagramId == null) { _diagramId = new ConditionValue(); }
        return _diagramId;
    }
    protected ConditionValue getCValueDiagramId() { return getDiagramId(); }

    public BsTDiagramobjectsCQ addOrderBy_DiagramId_Asc() { regOBA("Diagram_ID"); return this; }
    public BsTDiagramobjectsCQ addOrderBy_DiagramId_Desc() { regOBD("Diagram_ID"); return this; }

    protected ConditionValue _objectId;
    public ConditionValue getObjectId() {
        if (_objectId == null) { _objectId = new ConditionValue(); }
        return _objectId;
    }
    protected ConditionValue getCValueObjectId() { return getObjectId(); }

    public BsTDiagramobjectsCQ addOrderBy_ObjectId_Asc() { regOBA("Object_ID"); return this; }
    public BsTDiagramobjectsCQ addOrderBy_ObjectId_Desc() { regOBD("Object_ID"); return this; }

    protected ConditionValue _recttop;
    public ConditionValue getRecttop() {
        if (_recttop == null) { _recttop = new ConditionValue(); }
        return _recttop;
    }
    protected ConditionValue getCValueRecttop() { return getRecttop(); }

    public BsTDiagramobjectsCQ addOrderBy_Recttop_Asc() { regOBA("RectTop"); return this; }
    public BsTDiagramobjectsCQ addOrderBy_Recttop_Desc() { regOBD("RectTop"); return this; }

    protected ConditionValue _rectleft;
    public ConditionValue getRectleft() {
        if (_rectleft == null) { _rectleft = new ConditionValue(); }
        return _rectleft;
    }
    protected ConditionValue getCValueRectleft() { return getRectleft(); }

    public BsTDiagramobjectsCQ addOrderBy_Rectleft_Asc() { regOBA("RectLeft"); return this; }
    public BsTDiagramobjectsCQ addOrderBy_Rectleft_Desc() { regOBD("RectLeft"); return this; }

    protected ConditionValue _rectright;
    public ConditionValue getRectright() {
        if (_rectright == null) { _rectright = new ConditionValue(); }
        return _rectright;
    }
    protected ConditionValue getCValueRectright() { return getRectright(); }

    public BsTDiagramobjectsCQ addOrderBy_Rectright_Asc() { regOBA("RectRight"); return this; }
    public BsTDiagramobjectsCQ addOrderBy_Rectright_Desc() { regOBD("RectRight"); return this; }

    protected ConditionValue _rectbottom;
    public ConditionValue getRectbottom() {
        if (_rectbottom == null) { _rectbottom = new ConditionValue(); }
        return _rectbottom;
    }
    protected ConditionValue getCValueRectbottom() { return getRectbottom(); }

    public BsTDiagramobjectsCQ addOrderBy_Rectbottom_Asc() { regOBA("RectBottom"); return this; }
    public BsTDiagramobjectsCQ addOrderBy_Rectbottom_Desc() { regOBD("RectBottom"); return this; }

    protected ConditionValue _sequence;
    public ConditionValue getSequence() {
        if (_sequence == null) { _sequence = new ConditionValue(); }
        return _sequence;
    }
    protected ConditionValue getCValueSequence() { return getSequence(); }

    public BsTDiagramobjectsCQ addOrderBy_Sequence_Asc() { regOBA("Sequence"); return this; }
    public BsTDiagramobjectsCQ addOrderBy_Sequence_Desc() { regOBD("Sequence"); return this; }

    protected ConditionValue _objectstyle;
    public ConditionValue getObjectstyle() {
        if (_objectstyle == null) { _objectstyle = new ConditionValue(); }
        return _objectstyle;
    }
    protected ConditionValue getCValueObjectstyle() { return getObjectstyle(); }

    public BsTDiagramobjectsCQ addOrderBy_Objectstyle_Asc() { regOBA("ObjectStyle"); return this; }
    public BsTDiagramobjectsCQ addOrderBy_Objectstyle_Desc() { regOBD("ObjectStyle"); return this; }

    protected ConditionValue _instanceId;
    public ConditionValue getInstanceId() {
        if (_instanceId == null) { _instanceId = new ConditionValue(); }
        return _instanceId;
    }
    protected ConditionValue getCValueInstanceId() { return getInstanceId(); }

    public BsTDiagramobjectsCQ addOrderBy_InstanceId_Asc() { regOBA("Instance_ID"); return this; }
    public BsTDiagramobjectsCQ addOrderBy_InstanceId_Desc() { regOBD("Instance_ID"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTDiagramobjectsCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTDiagramobjectsCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    String xCB() { return TDiagramobjectsCB.class.getName(); }
    String xCQ() { return TDiagramobjectsCQ.class.getName(); }
    String xMap() { return Map.class.getName(); }
}
