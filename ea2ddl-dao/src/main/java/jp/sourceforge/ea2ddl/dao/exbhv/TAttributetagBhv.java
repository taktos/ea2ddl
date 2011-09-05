package jp.sourceforge.ea2ddl.dao.exbhv;

import java.util.HashMap;
import java.util.Map;

import jp.sourceforge.ea2ddl.dao.cbean.TAttributetagCB;
import jp.sourceforge.ea2ddl.dao.exentity.TAttribute;
import jp.sourceforge.ea2ddl.dao.exentity.TAttributetag;

import org.seasar.dbflute.cbean.ListResultBean;

/**
 * The behavior of t_attributetag.
 * <p>
 * You can implement your original methods here. This class is NOT overrided
 * when re-generating.
 * </p>
 * 
 * @author DBFlute(AutoGenerator)
 */
public class TAttributetagBhv extends
		jp.sourceforge.ea2ddl.dao.bsbhv.BsTAttributetagBhv {

	public void loadTags(TAttribute attribute) {
		TAttributetagCB cb = new TAttributetagCB();
		cb.query().setElementid_Equal(attribute.getId());
		ListResultBean<TAttributetag> list = selectList(cb);
		Map<String, TAttributetag> map = new HashMap<String, TAttributetag>();
		for (TAttributetag tAttributetag : list) {
			map.put(tAttributetag.getProperty(), tAttributetag);
		}
		attribute.setTags(map);
	}
}
