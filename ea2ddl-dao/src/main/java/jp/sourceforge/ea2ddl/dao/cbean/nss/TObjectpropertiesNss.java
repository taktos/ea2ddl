package jp.sourceforge.ea2ddl.dao.cbean.nss;

import org.seasar.dbflute.cbean.ConditionQuery;
import jp.sourceforge.ea2ddl.dao.cbean.cq.TObjectpropertiesCQ;

/**
 * The nest select set-upper of t_objectproperties.
 * @author DBFlute(AutoGenerator)
 */
public class TObjectpropertiesNss {

    protected TObjectpropertiesCQ _query;
    public TObjectpropertiesNss(TObjectpropertiesCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                           With Nested Foreign Table
    //                                                           =========================
    public TObjectNss withTObject() {
        _query.doNss(new TObjectpropertiesCQ.NssCall() { public ConditionQuery qf() { return _query.queryTObject(); }});
		return new TObjectNss(_query.queryTObject());
    }

    // ===================================================================================
    //                                                          With Nested Referrer Table
    //                                                          ==========================
}
