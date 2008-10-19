package jp.sourceforge.ea2ddl.dao.cbean.nss;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ConditionQuery;
import jp.sourceforge.ea2ddl.dao.cbean.cq.TOperationparamsCQ;

/**
 * The nest-select-setupper of t_operationparams.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class TOperationparamsNss {

    protected TOperationparamsCQ _query;
    public TOperationparamsNss(TOperationparamsCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                           With Nested Foreign Table
    //                                                           =========================
    public TOperationNss withTOperation() {
        _query.doNss(new TOperationparamsCQ.NssCall() { public ConditionQuery qf() { return _query.queryTOperation(); }});
		return new TOperationNss(_query.queryTOperation());
    }

    // ===================================================================================
    //                                                          With Nested Referrer Table
    //                                                          ==========================
}
