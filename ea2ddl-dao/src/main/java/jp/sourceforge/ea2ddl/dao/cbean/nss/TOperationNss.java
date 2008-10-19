package jp.sourceforge.ea2ddl.dao.cbean.nss;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ConditionQuery;
import jp.sourceforge.ea2ddl.dao.cbean.cq.TOperationCQ;

/**
 * The nest-select-setupper of t_operation.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class TOperationNss {

    protected TOperationCQ _query;
    public TOperationNss(TOperationCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                           With Nested Foreign Table
    //                                                           =========================
    public TObjectNss withTObject() {
        _query.doNss(new TOperationCQ.NssCall() { public ConditionQuery qf() { return _query.queryTObject(); }});
		return new TObjectNss(_query.queryTObject());
    }

    // ===================================================================================
    //                                                          With Nested Referrer Table
    //                                                          ==========================
}
