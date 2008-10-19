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
 * The base condition-bean of t_operationparams.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTOperationparamsCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TOperationparamsCQ _conditionQuery;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_operationparams";
    }

    public String getTableSqlName() {
        return "t_operationparams";
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
    public TOperationparamsCQ query() {
        return getConditionQuery();
    }

    public TOperationparamsCQ getConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = new TOperationparamsCQ(null, getSqlClause(), getSqlClause().getLocalTableAliasName(), 0);
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
     * cb.query().union(new UnionQuery&lt;TOperationparamsCB&gt;() {
     *     public void query(TOperationparamsCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<TOperationparamsCB> unionQuery) {
        final TOperationparamsCB cb = new TOperationparamsCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TOperationparamsCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all'.
     * <pre>
     * cb.query().unionAll(new UnionQuery&lt;TOperationparamsCB&gt;() {
     *     public void query(TOperationparamsCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void unionAll(UnionQuery<TOperationparamsCB> unionQuery) {
        final TOperationparamsCB cb = new TOperationparamsCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TOperationparamsCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }
    
    /**
     * @param unionQuery The query of 'union'. (NotNull)
     * @deprecated Sorry! Please use union(UnionQuery<TOperationparamsCB> unionQuery).
     */
    public void union(TOperationparamsCQ unionQuery) {
        query().xsetUnionQuery(unionQuery);
    }

    /**
     * @param unionQuery The query of 'union'. (NotNull)
     * @deprecated Sorry! Please use unionAll(UnionQuery<TOperationparamsCB> unionQuery).
     */
    public void unionAll(TOperationparamsCQ unionQuery) {
        query().xsetUnionAllQuery(unionQuery);
    }

    public boolean hasUnionQueryOrUnionAllQuery() {
        return query().hasUnionQueryOrUnionAllQuery();
    }

    // ===================================================================================
    //                                                                        Setup Select
    //                                                                        ============

    protected TOperationNss _nssTOperation;
    public TOperationNss getNssTOperation() {
        if (_nssTOperation == null) { _nssTOperation = new TOperationNss(null); }
        return _nssTOperation;
    }
    public TOperationNss setupSelect_TOperation() {
        doSetupSelect(new SsCall() { public ConditionQuery qf() { return query().queryTOperation(); } });
        if (_nssTOperation == null || !_nssTOperation.hasConditionQuery()) { _nssTOperation = new TOperationNss(query().queryTOperation()); }
        return _nssTOperation;
    }

    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected Specification _specification;
    public Specification specify() {
        if (_specification == null) { _specification = new Specification(this, new SpQyCall<TOperationparamsCQ>() {
            public boolean has() { return true; } public TOperationparamsCQ qy() { return query(); } }, _forDeriveReferrer); } return _specification;
    }
    public static class Specification extends AbstractSpecification<TOperationparamsCQ> {
        protected SpQyCall<TOperationparamsCQ> _myQyCall;
        protected TOperationCB.Specification _tOperation;
        public Specification(ConditionBean baseCB, SpQyCall<TOperationparamsCQ> qyCall, boolean forDeriveReferrer) { super(baseCB, qyCall, forDeriveReferrer); _myQyCall = qyCall; }
        public void columnOperationid() { doColumn("OperationID"); }
        public void columnName() { doColumn("Name"); }
        public void columnType() { doColumn("Type"); }
        public void columnNotes() { doColumn("Notes"); }
        public void columnPos() { doColumn("Pos"); }
        public void columnStyle() { doColumn("Style"); }
        public void columnKind() { doColumn("Kind"); }
        public void columnClassifier() { doColumn("Classifier"); }
        public void columnEaGuid() { doColumn("ea_guid"); }
        public void columnStyleex() { doColumn("StyleEx"); }
        protected void doSpecifyRequiredColumn() {
            if (_myQyCall.qy().hasConditionQueryTOperation()) {
                columnOperationid();// FK
            }
        }
        protected String getTableDbName() { return "t_operationparams"; }
        public TOperationCB.Specification specifyTOperation() {
            assertForeign("tOperation");
            if (_tOperation == null) {
                _tOperation = new TOperationCB.Specification(_baseCB, new SpQyCall<TOperationCQ>() {
                    public boolean has() { return _myQyCall.has() && _myQyCall.qy().hasConditionQueryTOperation(); }
                    public TOperationCQ qy() { return _myQyCall.qy().queryTOperation(); } }, _forDeriveReferrer);
            }
            return _tOperation;
        }
    }

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TOperationparamsCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TOperationparamsCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
}
