package jp.sourceforge.ea2ddl.dao.exbhv;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import jp.sourceforge.ea2ddl.dao.exdao.pmbean.SelectTablesInPackagePmb;
import jp.sourceforge.ea2ddl.dao.exentity.TObject;
import jp.sourceforge.ea2ddl.dao.exentity.TPackage;

/**
 * The behavior of t_object.
 * <p>
 * You can implement your original methods here. This class is NOT overrided
 * when re-generating.
 * </p>
 * 
 * @author DBFlute(AutoGenerator)
 */
public class TObjectBhv extends jp.sourceforge.ea2ddl.dao.bsbhv.BsTObjectBhv {
	private TPackageBhv _tPackageBhv;

	public void setTPackageBhv(TPackageBhv packageBhv) {
		_tPackageBhv = packageBhv;
	}

	public TObject selectEntity(Integer id) {
		final List<TObject> list = outsideSql().selectList(PATH_selectTableById, id, TObject.class);
		if (list.size() == 0) {
			throw new EntityNotFoundException();
		}
		return list.get(0);
	}

	public List<TObject> selectList(String packageTree, String stereotype, String objectType) {
		final TPackage pkg = _tPackageBhv.selectPackage(packageTree);
		final SelectTablesInPackagePmb pmb = new SelectTablesInPackagePmb();
		pmb.setPackageId(pkg.getPackageId());
		pmb.setStereotype(stereotype);
		pmb.setObjectType(objectType);
		return outsideSql().selectList(PATH_selectList, pmb, TObject.class);
	}

	public List<TObject> selectListByStereotype(String packageTree, String stereotype) {
		final TPackage pkg = _tPackageBhv.selectPackage(packageTree);
		return selectListByStereotype(pkg, stereotype);
	}

	public List<TObject> selectListByStereotype(TPackage pkg, String stereotype) {
		final SelectTablesInPackagePmb pmb = new SelectTablesInPackagePmb();
		pmb.setPackageId(pkg.getPackageId());
		pmb.setStereotype(stereotype);
		return outsideSql().selectList(PATH_selectList, pmb, TObject.class);
	}

}
