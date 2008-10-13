package jp.sourceforge.ea2ddl.dao.cbean.bs;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.AbstractConditionBean;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ConditionBean;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ConditionQuery;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.SubQuery;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.UnionQuery;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-bean of t_datatypes.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTDatatypesCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TDatatypesCQ _conditionQuery;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_datatypes";
    }

    public String getTableSqlName() {
        return "t_datatypes";
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
    public TDatatypesCQ query() {
        return getConditionQuery();
    }

    public TDatatypesCQ getConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = new TDatatypesCQ(null, getSqlClause(), getSqlClause().getLocalTableAliasName(), 0);
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
     * cb.query().union(new UnionQuery&lt;TDatatypesCB&gt;() {
     *     public void query(TDatatypesCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<TDatatypesCB> unionQuery) {
        final TDatatypesCB cb = new TDatatypesCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TDatatypesCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all'.
     * <pre>
     * cb.query().unionAll(new UnionQuery&lt;TDatatypesCB&gt;() {
     *     public void query(TDatatypesCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void unionAll(UnionQuery<TDatatypesCB> unionQuery) {
        final TDatatypesCB cb = new TDatatypesCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TDatatypesCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }
    
    /**
     * @param unionQuery The query of 'union'. (NotNull)
     * @deprecated Sorry! Please use union(UnionQuery<TDatatypesCB> unionQuery).
     */
    public void union(TDatatypesCQ unionQuery) {
        query().xsetUnionQuery(unionQuery);
    }

    /**
     * @param unionQuery The query of 'union'. (NotNull)
     * @deprecated Sorry! Please use unionAll(UnionQuery<TDatatypesCB> unionQuery).
     */
    public void unionAll(TDatatypesCQ unionQuery) {
        query().xsetUnionAllQuery(unionQuery);
    }

    public boolean hasUnionQueryOrUnionAllQuery() {
        return query().hasUnionQueryOrUnionAllQuery();
    }

    // ===================================================================================
    //                                                                        Setup Select
    //                                                                        ============

    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected Specification _specification;
    public Specification specify() {
        if (_specification == null) { _specification = new Specification(this, new SpQyCall<TDatatypesCQ>() {
            public boolean has() { return true; } public TDatatypesCQ qy() { return query(); } }, _forDeriveReferrer); } return _specification;
    }
    public static class Specification extends AbstractSpecification<TDatatypesCQ> {
        protected SpQyCall<TDatatypesCQ> _myQyCall;
        public Specification(ConditionBean baseCB, SpQyCall<TDatatypesCQ> qyCall, boolean forDeriveReferrer) { super(baseCB, qyCall, forDeriveReferrer); _myQyCall = qyCall; }
        public void columnType() { doColumn("Type"); }
        public void columnProductname() { doColumn("ProductName"); }
        public void columnDatatype() { doColumn("DataType"); }
        public void columnSize() { doColumn("Size"); }
        public void columnMaxlen() { doColumn("MaxLen"); }
        public void columnMaxprec() { doColumn("MaxPrec"); }
        public void columnMaxscale() { doColumn("MaxScale"); }
        public void columnDefaultlen() { doColumn("DefaultLen"); }
        public void columnDefaultprec() { doColumn("DefaultPrec"); }
        public void columnDefaultscale() { doColumn("DefaultScale"); }
        public void columnUser() { doColumn("User"); }
        public void columnPdata1() { doColumn("PDATA1"); }
        public void columnPdata2() { doColumn("PDATA2"); }
        public void columnPdata3() { doColumn("PDATA3"); }
        public void columnPdata4() { doColumn("PDATA4"); }
        public void columnHaslength() { doColumn("HasLength"); }
        public void columnGenerictype() { doColumn("GenericType"); }
        public void columnDatatypeid() { doColumn("DatatypeID"); }
        protected void doSpecifyRequiredColumn() {
        }
        protected String getTableDbName() { return "t_datatypes"; }
    }

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TDatatypesCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TDatatypesCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
}
