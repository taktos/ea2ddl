package jp.sourceforge.ea2ddl.dao.cbean.bs;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.AbstractConditionBean;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ConditionBean;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ConditionQuery;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.SubQuery;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.UnionQuery;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;
import jp.sourceforge.ea2ddl.dao.cbean.nss.*;

/**
 * The base condition-bean of t_objectproperties.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTObjectpropertiesCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TObjectpropertiesCQ _conditionQuery;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_objectproperties";
    }

    public String getTableSqlName() {
        return "t_objectproperties";
    }

    // ===================================================================================
    //                                                                      PrimaryKey Map
    //                                                                      ==============
    public void acceptPrimaryKeyMap(Map<String, ? extends Object> primaryKeyMap) {

        String msg = "This table has no primary-keys: " + getTableDbName();
        throw new IllegalStateException(msg);

    }

    // ===================================================================================
    //                                                                     OrderBy Setting
    //                                                                     ===============
    public ConditionBean addOrderBy_PK_Asc() {
        String msg = "This table has no primary-keys: " + getTableDbName();
        throw new IllegalStateException(msg);
    }

    public ConditionBean addOrderBy_PK_Desc() {
        String msg = "This table has no primary-keys: " + getTableDbName();
        throw new IllegalStateException(msg);
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    public TObjectpropertiesCQ query() {
        return getConditionQuery();
    }

    public TObjectpropertiesCQ getConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = new TObjectpropertiesCQ(null, getSqlClause(), getSqlClause().getLocalTableAliasName(), 0);
        }
        return _conditionQuery;
    }

    public ConditionQuery getConditionQueryAsInterface() {
        return getConditionQuery();
    }

    // ===================================================================================
    //                                                                               Union
    //                                                                               =====
    /**
     * Set up 'union'.
     * <pre>
     * cb.query().union(new UnionQuery&lt;TObjectpropertiesCB&gt;() {
     *     public void query(TObjectpropertiesCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<TObjectpropertiesCB> unionQuery) {
        final TObjectpropertiesCB cb = new TObjectpropertiesCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TObjectpropertiesCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all'.
     * <pre>
     * cb.query().unionAll(new UnionQuery&lt;TObjectpropertiesCB&gt;() {
     *     public void query(TObjectpropertiesCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void unionAll(UnionQuery<TObjectpropertiesCB> unionQuery) {
        final TObjectpropertiesCB cb = new TObjectpropertiesCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TObjectpropertiesCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }
    
    /**
     * @param unionQuery The query of 'union'. (NotNull)
     * @deprecated Sorry! Please use union(UnionQuery<TObjectpropertiesCB> unionQuery).
     */
    public void union(TObjectpropertiesCQ unionQuery) {
        query().xsetUnionQuery(unionQuery);
    }

    /**
     * @param unionQuery The query of 'union'. (NotNull)
     * @deprecated Sorry! Please use unionAll(UnionQuery<TObjectpropertiesCB> unionQuery).
     */
    public void unionAll(TObjectpropertiesCQ unionQuery) {
        query().xsetUnionAllQuery(unionQuery);
    }

    public boolean hasUnionQueryOrUnionAllQuery() {
        return query().hasUnionQueryOrUnionAllQuery();
    }

    // ===================================================================================
    //                                                                        Setup Select
    //                                                                        ============

    protected TObjectNss _nssTObject;
    public TObjectNss getNssTObject() {
        if (_nssTObject == null) { _nssTObject = new TObjectNss(null); }
        return _nssTObject;
    }
    public TObjectNss setupSelect_TObject() {
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryTObject(); } });
        if (_nssTObject == null || !_nssTObject.hasConditionQuery()) { _nssTObject = new TObjectNss(query().queryTObject()); }
        return _nssTObject;
    }

    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected Specification _specification;
    public Specification specify() {
        if (_specification == null) { _specification = new Specification(this, new SpQyCall<TObjectpropertiesCQ>() {
            public boolean has() { return true; } public TObjectpropertiesCQ qy() { return query(); } }, _forDeriveReferrer); } return _specification;
    }
    public static class Specification extends AbstractSpecification<TObjectpropertiesCQ> {
        protected SpQyCall<TObjectpropertiesCQ> _myQyCall;
        protected TObjectCB.Specification _tObject;
        public Specification(ConditionBean baseCB, SpQyCall<TObjectpropertiesCQ> qyCall, boolean forDeriveReferrer) { super(baseCB, qyCall, forDeriveReferrer); _myQyCall = qyCall; }
        public void columnPropertyid() { doColumn("PropertyID"); }
        public void columnObjectId() { doColumn("Object_ID"); }
        public void columnProperty() { doColumn("Property"); }
        public void columnValue() { doColumn("Value"); }
        public void columnNotes() { doColumn("Notes"); }
        public void columnEaGuid() { doColumn("ea_guid"); }
        protected void doSpecifyRequiredColumn() {
            if (_myQyCall.qy().hasConditionQueryTObject()) {
                columnObjectId();// FK
            }
        }
        protected String getTableDbName() { return "t_objectproperties"; }
        public TObjectCB.Specification specifyTObject() {
            assertForeign("tObject");
            if (_tObject == null) {
                _tObject = new TObjectCB.Specification(_baseCB, new SpQyCall<TObjectCQ>() {
                    public boolean has() { return _myQyCall.has() && _myQyCall.qy().hasConditionQueryTObject(); }
                    public TObjectCQ qy() { return _myQyCall.qy().queryTObject(); } }, _forDeriveReferrer);
            }
            return _tObject;
        }
    }

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TObjectpropertiesCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TObjectpropertiesCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
}
