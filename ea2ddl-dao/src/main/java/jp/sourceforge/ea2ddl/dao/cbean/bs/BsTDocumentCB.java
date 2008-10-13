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
 * The base condition-bean of t_document.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTDocumentCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TDocumentCQ _conditionQuery;

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_document";
    }

    public String getTableSqlName() {
        return "t_document";
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
    public TDocumentCQ query() {
        return getConditionQuery();
    }

    public TDocumentCQ getConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = new TDocumentCQ(null, getSqlClause(), getSqlClause().getLocalTableAliasName(), 0);
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
     * cb.query().union(new UnionQuery&lt;TDocumentCB&gt;() {
     *     public void query(TDocumentCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void union(UnionQuery<TDocumentCB> unionQuery) {
        final TDocumentCB cb = new TDocumentCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TDocumentCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all'.
     * <pre>
     * cb.query().unionAll(new UnionQuery&lt;TDocumentCB&gt;() {
     *     public void query(TDocumentCB unionCB) {
     *         unionCB.query().setXxx...
     *     }
     * });
     * </pre>
     * @param unionQuery The query of 'union'. (NotNull)
     */
    public void unionAll(UnionQuery<TDocumentCB> unionQuery) {
        final TDocumentCB cb = new TDocumentCB(); cb.xsetupForUnion(); unionQuery.query(cb);
        final TDocumentCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }
    
    /**
     * @param unionQuery The query of 'union'. (NotNull)
     * @deprecated Sorry! Please use union(UnionQuery<TDocumentCB> unionQuery).
     */
    public void union(TDocumentCQ unionQuery) {
        query().xsetUnionQuery(unionQuery);
    }

    /**
     * @param unionQuery The query of 'union'. (NotNull)
     * @deprecated Sorry! Please use unionAll(UnionQuery<TDocumentCB> unionQuery).
     */
    public void unionAll(TDocumentCQ unionQuery) {
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
        if (_specification == null) { _specification = new Specification(this, new SpQyCall<TDocumentCQ>() {
            public boolean has() { return true; } public TDocumentCQ qy() { return query(); } }, _forDeriveReferrer); } return _specification;
    }
    public static class Specification extends AbstractSpecification<TDocumentCQ> {
        protected SpQyCall<TDocumentCQ> _myQyCall;
        public Specification(ConditionBean baseCB, SpQyCall<TDocumentCQ> qyCall, boolean forDeriveReferrer) { super(baseCB, qyCall, forDeriveReferrer); _myQyCall = qyCall; }
        public void columnDocid() { doColumn("DocID"); }
        public void columnDocname() { doColumn("DocName"); }
        public void columnNotes() { doColumn("Notes"); }
        public void columnStyle() { doColumn("Style"); }
        public void columnElementid() { doColumn("ElementID"); }
        public void columnElementtype() { doColumn("ElementType"); }
        public void columnStrcontent() { doColumn("StrContent"); }
        public void columnBincontent() { doColumn("BinContent"); }
        public void columnDoctype() { doColumn("DocType"); }
        public void columnAuthor() { doColumn("Author"); }
        public void columnVersion() { doColumn("Version"); }
        public void columnIsactive() { doColumn("IsActive"); }
        public void columnSequence() { doColumn("Sequence"); }
        public void columnDocdate() { doColumn("DocDate"); }
        protected void doSpecifyRequiredColumn() {
        }
        protected String getTableDbName() { return "t_document"; }
    }

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TDocumentCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TDocumentCQ.class.getName(); }
    protected String getSubQueryClassNameInternally() { return SubQuery.class.getName(); }
}
