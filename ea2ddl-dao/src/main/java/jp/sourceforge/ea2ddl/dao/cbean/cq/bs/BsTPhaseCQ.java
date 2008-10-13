package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_phase.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTPhaseCQ extends AbstractBsTPhaseCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TPhaseCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTPhaseCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_phase) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TPhaseCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TPhaseCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_phase on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TPhaseCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported onClause of Base Table!"); }
        TPhaseCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _phaseid;
    public ConditionValue getPhaseid() {
        if (_phaseid == null) { _phaseid = new ConditionValue(); }
        return _phaseid;
    }
    protected ConditionValue getCValuePhaseid() { return getPhaseid(); }
    
    public BsTPhaseCQ addOrderBy_Phaseid_Asc() { regOBA("PhaseID"); return this; }
    public BsTPhaseCQ addOrderBy_Phaseid_Desc() { regOBD("PhaseID"); return this; }

    protected ConditionValue _phasename;
    public ConditionValue getPhasename() {
        if (_phasename == null) { _phasename = new ConditionValue(); }
        return _phasename;
    }
    protected ConditionValue getCValuePhasename() { return getPhasename(); }
    
    public BsTPhaseCQ addOrderBy_Phasename_Asc() { regOBA("PhaseName"); return this; }
    public BsTPhaseCQ addOrderBy_Phasename_Desc() { regOBD("PhaseName"); return this; }

    protected ConditionValue _phasenotes;
    public ConditionValue getPhasenotes() {
        if (_phasenotes == null) { _phasenotes = new ConditionValue(); }
        return _phasenotes;
    }
    protected ConditionValue getCValuePhasenotes() { return getPhasenotes(); }
    
    public BsTPhaseCQ addOrderBy_Phasenotes_Asc() { regOBA("PhaseNotes"); return this; }
    public BsTPhaseCQ addOrderBy_Phasenotes_Desc() { regOBD("PhaseNotes"); return this; }

    protected ConditionValue _phasestyle;
    public ConditionValue getPhasestyle() {
        if (_phasestyle == null) { _phasestyle = new ConditionValue(); }
        return _phasestyle;
    }
    protected ConditionValue getCValuePhasestyle() { return getPhasestyle(); }
    
    public BsTPhaseCQ addOrderBy_Phasestyle_Asc() { regOBA("PhaseStyle"); return this; }
    public BsTPhaseCQ addOrderBy_Phasestyle_Desc() { regOBD("PhaseStyle"); return this; }

    protected ConditionValue _startdate;
    public ConditionValue getStartdate() {
        if (_startdate == null) { _startdate = new ConditionValue(); }
        return _startdate;
    }
    protected ConditionValue getCValueStartdate() { return getStartdate(); }
    
    public BsTPhaseCQ addOrderBy_Startdate_Asc() { regOBA("StartDate"); return this; }
    public BsTPhaseCQ addOrderBy_Startdate_Desc() { regOBD("StartDate"); return this; }

    protected ConditionValue _enddate;
    public ConditionValue getEnddate() {
        if (_enddate == null) { _enddate = new ConditionValue(); }
        return _enddate;
    }
    protected ConditionValue getCValueEnddate() { return getEnddate(); }
    
    public BsTPhaseCQ addOrderBy_Enddate_Asc() { regOBA("EndDate"); return this; }
    public BsTPhaseCQ addOrderBy_Enddate_Desc() { regOBD("EndDate"); return this; }

    protected ConditionValue _phasecontent;
    public ConditionValue getPhasecontent() {
        if (_phasecontent == null) { _phasecontent = new ConditionValue(); }
        return _phasecontent;
    }
    protected ConditionValue getCValuePhasecontent() { return getPhasecontent(); }
    
    public BsTPhaseCQ addOrderBy_Phasecontent_Asc() { regOBA("PhaseContent"); return this; }
    public BsTPhaseCQ addOrderBy_Phasecontent_Desc() { regOBD("PhaseContent"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTPhaseCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTPhaseCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============


    protected String getConditionQueryClassNameInternally() { return TPhaseCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}
