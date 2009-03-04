package jp.sourceforge.ea2ddl.dao.exbhv;

import jp.sourceforge.ea2ddl.dao.cbean.TObjectpropertiesCB;
import jp.sourceforge.ea2ddl.dao.exentity.TObject;
import jp.sourceforge.ea2ddl.dao.exentity.TObjectproperties;

import org.seasar.dbflute.cbean.ListResultBean;

/**
 * The behavior of t_objectproperties.
 * <p>
 * You can implement your original methods here.
 * This class is NOT overrided when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TObjectpropertiesBhv extends jp.sourceforge.ea2ddl.dao.bsbhv.BsTObjectpropertiesBhv {
	public ListResultBean<TObjectproperties> selectProperties(TObject object, String property) {
		final TObjectpropertiesCB cb = new TObjectpropertiesCB();
		if (object != null) {
			cb.query().setObjectId_Equal(object.getObjectId());
		}
		if (property != null) {
			cb.query().setProperty_Equal(property);
		}
		return selectList(cb);
	}

	public String getValue(TObject object, String key) {
		final ListResultBean<TObjectproperties> properties = selectProperties(object, key);
		if (properties.isEmpty()) {
			return null;
		}
		final StringBuffer b = new StringBuffer();
		for (TObjectproperties prop : properties) {
			if (b.length() != 0) {
				b.append(" ");
			}
			b.append(prop.getValue());
		}
		return b.toString();
	}

	public String getNotes(TObject object, String key) {
		final ListResultBean<TObjectproperties> properties = selectProperties(object, key);
		if (properties.isEmpty()) {
			return null;
		}
		final StringBuffer b = new StringBuffer();
		for (TObjectproperties prop : properties) {
			if (b.length() != 0) {
				b.append(" ");
			}
			b.append(prop.getNotes());
		}
		return b.toString();
	}
}
