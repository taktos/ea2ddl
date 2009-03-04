package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_objecttypes.
 * @author DBFlute(AutoGenerator)
 */
public class BsTObjecttypesCQ extends AbstractBsTObjecttypesCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TObjecttypesCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTObjecttypesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_objecttypes) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TObjecttypesCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TObjecttypesCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_objecttypes on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TObjecttypesCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        TObjecttypesCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _objectType;
    public ConditionValue getObjectType() {
        if (_objectType == null) { _objectType = new ConditionValue(); }
        return _objectType;
    }
    protected ConditionValue getCValueObjectType() { return getObjectType(); }

    public BsTObjecttypesCQ addOrderBy_ObjectType_Asc() { regOBA("Object_Type"); return this; }
    public BsTObjecttypesCQ addOrderBy_ObjectType_Desc() { regOBD("Object_Type"); return this; }

    protected ConditionValue _description;
    public ConditionValue getDescription() {
        if (_description == null) { _description = new ConditionValue(); }
        return _description;
    }
    protected ConditionValue getCValueDescription() { return getDescription(); }

    public BsTObjecttypesCQ addOrderBy_Description_Asc() { regOBA("Description"); return this; }
    public BsTObjecttypesCQ addOrderBy_Description_Desc() { regOBD("Description"); return this; }

    protected ConditionValue _designobject;
    public ConditionValue getDesignobject() {
        if (_designobject == null) { _designobject = new ConditionValue(); }
        return _designobject;
    }
    protected ConditionValue getCValueDesignobject() { return getDesignobject(); }

    public BsTObjecttypesCQ addOrderBy_Designobject_Asc() { regOBA("DesignObject"); return this; }
    public BsTObjecttypesCQ addOrderBy_Designobject_Desc() { regOBD("DesignObject"); return this; }

    protected ConditionValue _imageid;
    public ConditionValue getImageid() {
        if (_imageid == null) { _imageid = new ConditionValue(); }
        return _imageid;
    }
    protected ConditionValue getCValueImageid() { return getImageid(); }

    public BsTObjecttypesCQ addOrderBy_Imageid_Asc() { regOBA("ImageID"); return this; }
    public BsTObjecttypesCQ addOrderBy_Imageid_Desc() { regOBD("ImageID"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTObjecttypesCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTObjecttypesCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

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
    String xCB() { return TObjecttypesCB.class.getName(); }
    String xCQ() { return TObjecttypesCQ.class.getName(); }
    String xMap() { return Map.class.getName(); }
}
