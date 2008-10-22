package jp.sourceforge.ea2ddl.dao.exbhv;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ListResultBean;
import jp.sourceforge.ea2ddl.dao.cbean.TObjectconstraintCB;
import jp.sourceforge.ea2ddl.dao.exentity.TObject;
import jp.sourceforge.ea2ddl.dao.exentity.TObjectconstraint;

/**
 * The behavior of t_objectconstraint.
 * <p>
 * You can implement your original methods here.
 * This class is NOT overrided when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TObjectconstraintBhv extends jp.sourceforge.ea2ddl.dao.bsbhv.BsTObjectconstraintBhv {
	public boolean hasConstraint(TObject object, String constraint) {
		final TObjectconstraintCB cb = new TObjectconstraintCB();
		cb.query().setObjectId_Equal(object.getObjectId());
		cb.query().setConstraint_Equal(constraint);
		final ListResultBean<TObjectconstraint> constraints = selectList(cb);
		return !constraints.isEmpty();
	}
}
