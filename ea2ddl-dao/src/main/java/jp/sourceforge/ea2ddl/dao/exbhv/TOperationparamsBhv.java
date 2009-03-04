package jp.sourceforge.ea2ddl.dao.exbhv;

import jp.sourceforge.ea2ddl.dao.cbean.TOperationparamsCB;
import jp.sourceforge.ea2ddl.dao.exentity.TOperation;
import jp.sourceforge.ea2ddl.dao.exentity.TOperationparams;

import org.seasar.dbflute.cbean.ListResultBean;

/**
 * The behavior of t_operationparams.
 * <p>
 * You can implement your original methods here.
 * This class is NOT overrided when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TOperationparamsBhv extends jp.sourceforge.ea2ddl.dao.bsbhv.BsTOperationparamsBhv {
	public ListResultBean<TOperationparams> selectOperationParams(TOperation operation) {
		final TOperationparamsCB cb = new TOperationparamsCB();
		cb.query().setOperationid_Equal(operation.getOperationid());
		cb.query().addOrderBy_Pos_Asc();
		return selectList(cb);
	}
}
