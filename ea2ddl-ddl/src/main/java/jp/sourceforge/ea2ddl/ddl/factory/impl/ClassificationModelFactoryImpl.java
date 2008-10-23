/**
 * 
 */
package jp.sourceforge.ea2ddl.ddl.factory.impl;

import java.util.List;

import jp.sourceforge.ea2ddl.common.config.Config;
import jp.sourceforge.ea2ddl.dao.exbhv.TObjectBhv;
import jp.sourceforge.ea2ddl.dao.exbhv.TPackageBhv;
import jp.sourceforge.ea2ddl.dao.exentity.TObject;
import jp.sourceforge.ea2ddl.dao.exentity.TPackage;
import jp.sourceforge.ea2ddl.ddl.factory.ModelFactory;
import jp.sourceforge.ea2ddl.ddl.model.ClassificationModel;
import jp.sourceforge.ea2ddl.ddl.model.Model;

/**
 * @author taktos
 * 
 */
public class ClassificationModelFactoryImpl implements ModelFactory {

	private Config _config;
	private TObjectBhv _tObjectBhv;
	private TPackageBhv _tPackageBhv;

	public void setConfig(Config config) {
		_config = config;
	}

	public void setTPackageBhv(TPackageBhv packageBhv) {
		_tPackageBhv = packageBhv;
	}

	public void setTObjectBhv(TObjectBhv objectBhv) {
		_tObjectBhv = objectBhv;
	}

	/*
	 * (非 Javadoc)
	 * 
	 * @see jp.sourceforge.ea2ddl.ddl.factory.ModelFactory#create()
	 */
	public Model create() {
		final ClassificationModel model = new ClassificationModel();
		final List<TObject> noteList = _tObjectBhv.selectList(_config.getProperty("er.package.tree"), null, "Note");
		for (TObject note : noteList) {
			model.addClassification(note.getNote());
		}
		return model;
	}

	protected TPackage getPackage(String packageTree) {
		return _tPackageBhv.selectPackage(packageTree);
	}

}
