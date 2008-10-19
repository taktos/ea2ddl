package jp.sourceforge.ea2ddl.dao.cbean.nss;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ConditionQuery;
import jp.sourceforge.ea2ddl.dao.cbean.cq.TConnectorCQ;

/**
 * The nest-select-setupper of t_connector.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class TConnectorNss {

    protected TConnectorCQ _query;
    public TConnectorNss(TConnectorCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                           With Nested Foreign Table
    //                                                           =========================
    public TOperationNss withTOperationBySourcerole() {
        _query.doNss(new TConnectorCQ.NssCall() { public ConditionQuery qf() { return _query.queryTOperationBySourcerole(); }});
		return new TOperationNss(_query.queryTOperationBySourcerole());
    }
    public TOperationNss withTOperationByDestrole() {
        _query.doNss(new TConnectorCQ.NssCall() { public ConditionQuery qf() { return _query.queryTOperationByDestrole(); }});
		return new TOperationNss(_query.queryTOperationByDestrole());
    }
    public TObjectNss withTObjectByStartObjectId() {
        _query.doNss(new TConnectorCQ.NssCall() { public ConditionQuery qf() { return _query.queryTObjectByStartObjectId(); }});
		return new TObjectNss(_query.queryTObjectByStartObjectId());
    }
    public TObjectNss withTObjectByEndObjectId() {
        _query.doNss(new TConnectorCQ.NssCall() { public ConditionQuery qf() { return _query.queryTObjectByEndObjectId(); }});
		return new TObjectNss(_query.queryTObjectByEndObjectId());
    }

    // ===================================================================================
    //                                                          With Nested Referrer Table
    //                                                          ==========================
}
