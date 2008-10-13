package jp.sourceforge.ea2ddl.dao.exbhv;

import javax.persistence.EntityNotFoundException;

import jp.sourceforge.ea2ddl.common.config.Config;
import jp.sourceforge.ea2ddl.dao.cbean.TPackageCB;
import jp.sourceforge.ea2ddl.dao.exentity.TPackage;

/**
 * The behavior of t_package.
 * <p>
 * You can implement your original methods here.
 * This class is NOT overrided when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class TPackageBhv extends jp.sourceforge.ea2ddl.dao.bsbhv.BsTPackageBhv {
	private Config _config;
	
	public void setConfig(Config config) {
		_config = config;
	}

	/**
	 * パッケージツリーから対象のパッケージオブジェクトを検索する。
	 * @param packageTree 対象パッケージのルートからのパス
	 * @return パッケージ
	 */
	public TPackage selectPackage(String packageTree) {
		final String[] packageNames = packageTree.split("[/.]");

		TPackage pkg = selectRoot();
		for (int i = 0; i < packageNames.length; i++) {
			final TPackageCB cb = new TPackageCB();
			cb.query().setParentId_Equal(pkg.getPackageId());
			cb.query().setName_Equal(packageNames[i]);
			pkg = selectEntity(cb);
			if (pkg == null) {
				throw new EntityNotFoundException("Package " + packageNames[i] + " in " + packageTree + " is not found.");
			}
		}
		return pkg;
	}
	
	public TPackage selectRoot() {
		final TPackageCB cb = new TPackageCB();
		cb.query().setName_Equal(_config.getProperty("root.package.name"));
		return selectEntity(cb);
	}
}
