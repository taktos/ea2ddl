package jp.sourceforge.ea2ddl.dao.exbhv;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ListResultBean;
import jp.sourceforge.ea2ddl.dao.cbean.TOperationCB;
import jp.sourceforge.ea2ddl.dao.exentity.TObject;
import jp.sourceforge.ea2ddl.dao.exentity.TOperation;

/**
 * The behavior of t_operation.
 * <p>
 * You can implement your original methods here. This class is NOT overrided
 * when re-generating.
 * </p>
 * 
 * @author DBFlute(AutoGenerator)
 */
public class TOperationBhv extends jp.sourceforge.ea2ddl.dao.bsbhv.BsTOperationBhv {

	private TOperationparamsBhv _tOperationparamsBhv;

	public void setTOperationparamsBhv(TOperationparamsBhv operationparamsBhv) {
		_tOperationparamsBhv = operationparamsBhv;
	}

	public ListResultBean<TOperation> selectOperation(TObject object, String stereotype) {
		final TOperationCB cb = new TOperationCB();
		cb.query().setObjectId_Equal(object.getObjectId());
		cb.query().setStereotype_Equal(stereotype);
		final ListResultBean<TOperation> opeList = selectList(cb);
		for (TOperation ope : opeList) {
			ope.setTOperationparamsList(_tOperationparamsBhv.selectOperationParams(ope));
		}
		return opeList;
	}
}
