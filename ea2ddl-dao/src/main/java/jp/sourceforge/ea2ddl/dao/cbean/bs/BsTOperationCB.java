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
 * The base condition-bean of t_operation.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTOperationCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TOperationCQ _conditionQuery;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_operation";
    }

    public String getTableSqlName() {
        return "t_operation";
    }

    // ===================================================================================
    //                                                                      PrimaryKey Map
    //                                                                      ==============
    public void acceptPrimaryKeyMap(Map<String, ? extends Object> primaryKeyMap) {
        assertPrimaryKeyMap(primaryKeyMap);
        {
            Object obj = primaryKeyMap.get("OperationID");
            if (obj instanceof java.lang.Integer) {
                query().setOperationid_Equal((java.lang.Integer)obj);
            } else {
                query().setOperationid_Equal(new java.lang.Integer((String)obj));
            }
        }

    }

    // ===================================================================================
    //                                                                     OrderBy Setting
    //                                                                     ===============
    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_Operationid_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_Operationid_Desc();
        return this;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    public TOperationCQ query() {
        return getConditionQuery();
    }

    public TOperationCQ getConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = new TOperationCQ(null, getSqlClause(), getSqlClause().getLocalTableAliasName(), 0);
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
     * cb.query().union(new UnionQuery&lt;TOperationCB&gt;() {
     *     public void query(TOperationCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<TOperationCB> unionQuery) {
        final TOperationCB cb = new TOperationCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TOperationCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all'.
     * <pre>
     * cb.query().unionAll(new UnionQuery&lt;TOperationCB&gt;() {
     *     public void query(TOperationCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void unionAll(UnionQuery<TOperationCB> unionQuery) {
        final TOperationCB cb = new TOperationCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TOperationCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }
    
    /**
     * @param unionQuery The query of 'union'. (NotNull)
     * @deprecated Sorry! Please use union(UnionQuery<TOperationCB> unionQuery).
     */
    public void union(TOperationCQ unionQuery) {
        query().xsetUnionQuery(unionQuery);
    }

    /**
     * @param unionQuery The query of 'union'. (NotNull)
     * @deprecated Sorry! Please use unionAll(UnionQuery<TOperationCB> unionQuery).
     */
    public void unionAll(TOperationCQ unionQuery) {
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
        if (_specification == null) { _specification = new Specification(this, new SpQyCall<TOperationCQ>() {
            public boolean has() { return true; } public TOperationCQ qy() { return query(); } }, _forDeriveReferrer); } return _specification;
    }
    public static class Specification extends AbstractSpecification<TOperationCQ> {
        protected SpQyCall<TOperationCQ> _myQyCall;
        protected TObjectCB.Specification _tObject;
        public Specification(ConditionBean baseCB, SpQyCall<TOperationCQ> qyCall, boolean forDeriveReferrer) { super(baseCB, qyCall, forDeriveReferrer); _myQyCall = qyCall; }
        public void columnOperationid() { doColumn("OperationID"); }
        public void columnObjectId() { doColumn("Object_ID"); }
        public void columnName() { doColumn("Name"); }
        public void columnScope() { doColumn("Scope"); }
        public void columnType() { doColumn("Type"); }
        public void columnReturnarray() { doColumn("ReturnArray"); }
        public void columnStereotype() { doColumn("Stereotype"); }
        public void columnIsstatic() { doColumn("IsStatic"); }
        public void columnConcurrency() { doColumn("Concurrency"); }
        public void columnNotes() { doColumn("Notes"); }
        public void columnBehaviour() { doColumn("Behaviour"); }
        public void columnGenoption() { doColumn("GenOption"); }
        public void columnPos() { doColumn("Pos"); }
        public void columnStyle() { doColumn("Style"); }
        public void columnPure() { doColumn("Pure"); }
        public void columnClassifier() { doColumn("Classifier"); }
        public void columnCode() { doColumn("Code"); }
        public void columnIsroot() { doColumn("IsRoot"); }
        public void columnIsleaf() { doColumn("IsLeaf"); }
        public void columnIsquery() { doColumn("IsQuery"); }
        public void columnStateflags() { doColumn("StateFlags"); }
        public void columnEaGuid() { doColumn("ea_guid"); }
        public void columnStyleex() { doColumn("StyleEx"); }
        protected void doSpecifyRequiredColumn() {
            columnOperationid();// PK
            if (_myQyCall.qy().hasConditionQueryTObject()) {
                columnObjectId();// FK
            }
        }
        protected String getTableDbName() { return "t_operation"; }
        public TObjectCB.Specification specifyTObject() {
            assertForeign("tObject");
            if (_tObject == null) {
                _tObject = new TObjectCB.Specification(_baseCB, new SpQyCall<TObjectCQ>() {
                    public boolean has() { return _myQyCall.has() && _myQyCall.qy().hasConditionQueryTObject(); }
                    public TObjectCQ qy() { return _myQyCall.qy().queryTObject(); } }, _forDeriveReferrer);
            }
            return _tObject;
        }
        public RAFunction<TOperationparamsCB, TOperationCQ> derivedTOperationparamsList() {
            return new RAFunction<TOperationparamsCB, TOperationCQ>(_baseCB, _myQyCall.qy(), new RAQSetupper<TOperationparamsCB, TOperationCQ>() {
                public void setup(String function, SubQuery<TOperationparamsCB> subQuery, TOperationCQ cq, String aliasName) {
                    cq.xderiveTOperationparamsList(function, subQuery, aliasName); } });
        }
    }

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TOperationCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TOperationCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
}
