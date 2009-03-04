package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_objectresource.
 * @author DBFlute(AutoGenerator)
 */
public class BsTObjectresourceCQ extends AbstractBsTObjectresourceCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TObjectresourceCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTObjectresourceCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_objectresource) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TObjectresourceCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TObjectresourceCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_objectresource on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TObjectresourceCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        TObjectresourceCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _objectId;
    public ConditionValue getObjectId() {
        if (_objectId == null) { _objectId = new ConditionValue(); }
        return _objectId;
    }
    protected ConditionValue getCValueObjectId() { return getObjectId(); }

    public BsTObjectresourceCQ addOrderBy_ObjectId_Asc() { regOBA("Object_ID"); return this; }
    public BsTObjectresourceCQ addOrderBy_ObjectId_Desc() { regOBD("Object_ID"); return this; }

    protected ConditionValue _resource;
    public ConditionValue getResource() {
        if (_resource == null) { _resource = new ConditionValue(); }
        return _resource;
    }
    protected ConditionValue getCValueResource() { return getResource(); }

    public BsTObjectresourceCQ addOrderBy_Resource_Asc() { regOBA("Resource"); return this; }
    public BsTObjectresourceCQ addOrderBy_Resource_Desc() { regOBD("Resource"); return this; }

    protected ConditionValue _role;
    public ConditionValue getRole() {
        if (_role == null) { _role = new ConditionValue(); }
        return _role;
    }
    protected ConditionValue getCValueRole() { return getRole(); }

    public BsTObjectresourceCQ addOrderBy_Role_Asc() { regOBA("Role"); return this; }
    public BsTObjectresourceCQ addOrderBy_Role_Desc() { regOBD("Role"); return this; }

    protected ConditionValue _time;
    public ConditionValue getTime() {
        if (_time == null) { _time = new ConditionValue(); }
        return _time;
    }
    protected ConditionValue getCValueTime() { return getTime(); }

    public BsTObjectresourceCQ addOrderBy_Time_Asc() { regOBA("Time"); return this; }
    public BsTObjectresourceCQ addOrderBy_Time_Desc() { regOBD("Time"); return this; }

    protected ConditionValue _notes;
    public ConditionValue getNotes() {
        if (_notes == null) { _notes = new ConditionValue(); }
        return _notes;
    }
    protected ConditionValue getCValueNotes() { return getNotes(); }

    public BsTObjectresourceCQ addOrderBy_Notes_Asc() { regOBA("Notes"); return this; }
    public BsTObjectresourceCQ addOrderBy_Notes_Desc() { regOBD("Notes"); return this; }

    protected ConditionValue _percentcomplete;
    public ConditionValue getPercentcomplete() {
        if (_percentcomplete == null) { _percentcomplete = new ConditionValue(); }
        return _percentcomplete;
    }
    protected ConditionValue getCValuePercentcomplete() { return getPercentcomplete(); }

    public BsTObjectresourceCQ addOrderBy_Percentcomplete_Asc() { regOBA("PercentComplete"); return this; }
    public BsTObjectresourceCQ addOrderBy_Percentcomplete_Desc() { regOBD("PercentComplete"); return this; }

    protected ConditionValue _datestart;
    public ConditionValue getDatestart() {
        if (_datestart == null) { _datestart = new ConditionValue(); }
        return _datestart;
    }
    protected ConditionValue getCValueDatestart() { return getDatestart(); }

    public BsTObjectresourceCQ addOrderBy_Datestart_Asc() { regOBA("DateStart"); return this; }
    public BsTObjectresourceCQ addOrderBy_Datestart_Desc() { regOBD("DateStart"); return this; }

    protected ConditionValue _dateend;
    public ConditionValue getDateend() {
        if (_dateend == null) { _dateend = new ConditionValue(); }
        return _dateend;
    }
    protected ConditionValue getCValueDateend() { return getDateend(); }

    public BsTObjectresourceCQ addOrderBy_Dateend_Asc() { regOBA("DateEnd"); return this; }
    public BsTObjectresourceCQ addOrderBy_Dateend_Desc() { regOBD("DateEnd"); return this; }

    protected ConditionValue _history;
    public ConditionValue getHistory() {
        if (_history == null) { _history = new ConditionValue(); }
        return _history;
    }
    protected ConditionValue getCValueHistory() { return getHistory(); }

    public BsTObjectresourceCQ addOrderBy_History_Asc() { regOBA("History"); return this; }
    public BsTObjectresourceCQ addOrderBy_History_Desc() { regOBD("History"); return this; }

    protected ConditionValue _expectedhours;
    public ConditionValue getExpectedhours() {
        if (_expectedhours == null) { _expectedhours = new ConditionValue(); }
        return _expectedhours;
    }
    protected ConditionValue getCValueExpectedhours() { return getExpectedhours(); }

    public BsTObjectresourceCQ addOrderBy_Expectedhours_Asc() { regOBA("ExpectedHours"); return this; }
    public BsTObjectresourceCQ addOrderBy_Expectedhours_Desc() { regOBD("ExpectedHours"); return this; }

    protected ConditionValue _actualhours;
    public ConditionValue getActualhours() {
        if (_actualhours == null) { _actualhours = new ConditionValue(); }
        return _actualhours;
    }
    protected ConditionValue getCValueActualhours() { return getActualhours(); }

    public BsTObjectresourceCQ addOrderBy_Actualhours_Asc() { regOBA("ActualHours"); return this; }
    public BsTObjectresourceCQ addOrderBy_Actualhours_Desc() { regOBD("ActualHours"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTObjectresourceCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTObjectresourceCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    String xCB() { return TObjectresourceCB.class.getName(); }
    String xCQ() { return TObjectresourceCQ.class.getName(); }
    String xMap() { return Map.class.getName(); }
}
