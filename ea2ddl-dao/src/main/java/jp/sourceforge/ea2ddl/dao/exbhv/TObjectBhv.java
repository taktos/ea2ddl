package jp.sourceforge.ea2ddl.dao.exbhv;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import jp.sourceforge.ea2ddl.dao.exentity.TObject;

/**
 * The behavior of t_object.
 * <p>
 * You can implement your original methods here.
 * This class is NOT overrided when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TObjectBhv extends jp.sourceforge.ea2ddl.dao.bsbhv.BsTObjectBhv {
	public TObject selectEntity(Integer id) {
		final List<TObject> list = outsideSql().selectList(PATH_selectTableById, id, TObject.class);
		if (list.size() == 0) {
			throw new EntityNotFoundException();
		}
		return list.get(0);
	}
}
