package jp.sourceforge.ea2ddl.dao.exbhv;

import jp.sourceforge.ea2ddl.dao.cbean.TAttributeCB;
import jp.sourceforge.ea2ddl.dao.exentity.TAttribute;
import jp.sourceforge.ea2ddl.dao.exentity.TObject;

import org.seasar.dbflute.cbean.ListResultBean;

/**
 * The behavior of t_attribute.
 * <p>
 * You can implement your original methods here. This class is NOT overrided
 * when re-generating.
 * </p>
 * 
 * @author DBFlute(AutoGenerator)
 */
public class TAttributeBhv extends
		jp.sourceforge.ea2ddl.dao.bsbhv.BsTAttributeBhv {
	private TAttributetagBhv _tAttributetagBhv;

	public void setTAttributetagBhv(TAttributetagBhv tAttributetagBhv) {
		_tAttributetagBhv = tAttributetagBhv;
	}

	public ListResultBean<TAttribute> selectColumns(TObject table) {
		final TAttributeCB cb = new TAttributeCB();
		cb.query().setObjectId_Equal(table.getObjectId());
		cb.query().addOrderBy_Pos_Asc();
		ListResultBean<TAttribute> list = selectList(cb);
		for (TAttribute tAttribute : list) {
			_tAttributetagBhv.loadTags(tAttribute);
		}
		return list;
	}
}
