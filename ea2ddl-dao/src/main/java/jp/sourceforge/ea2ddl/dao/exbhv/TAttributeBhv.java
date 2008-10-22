package jp.sourceforge.ea2ddl.dao.exbhv;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ListResultBean;
import jp.sourceforge.ea2ddl.dao.cbean.TAttributeCB;
import jp.sourceforge.ea2ddl.dao.exentity.TAttribute;
import jp.sourceforge.ea2ddl.dao.exentity.TObject;

/**
 * The behavior of t_attribute.
 * <p>
 * You can implement your original methods here. This class is NOT overrided
 * when re-generating.
 * </p>
 * 
 * @author DBFlute(AutoGenerator)
 */
public class TAttributeBhv extends jp.sourceforge.ea2ddl.dao.bsbhv.BsTAttributeBhv {
	public ListResultBean<TAttribute> selectColumns(TObject table) {
		final TAttributeCB cb = new TAttributeCB();
		cb.query().setObjectId_Equal(table.getObjectId());
		cb.query().addOrderBy_Pos_Asc();
		return selectList(cb);
	}
}
