/**
 * 
 */
package jp.sourceforge.ea2ddl.ddl.factory.impl;

import java.util.List;

import jp.sourceforge.ea2ddl.common.config.Config;
import jp.sourceforge.ea2ddl.dao.cbean.TConnectorCB;
import jp.sourceforge.ea2ddl.dao.cbean.TOperationCB;
import jp.sourceforge.ea2ddl.dao.cbean.TOperationparamsCB;
import jp.sourceforge.ea2ddl.dao.exbhv.TAttributeBhv;
import jp.sourceforge.ea2ddl.dao.exbhv.TConnectorBhv;
import jp.sourceforge.ea2ddl.dao.exbhv.TObjectBhv;
import jp.sourceforge.ea2ddl.dao.exbhv.TObjectconstraintBhv;
import jp.sourceforge.ea2ddl.dao.exbhv.TObjectpropertiesBhv;
import jp.sourceforge.ea2ddl.dao.exbhv.TOperationBhv;
import jp.sourceforge.ea2ddl.dao.exbhv.TOperationparamsBhv;
import jp.sourceforge.ea2ddl.dao.exbhv.TPackageBhv;
import jp.sourceforge.ea2ddl.dao.exentity.TAttribute;
import jp.sourceforge.ea2ddl.dao.exentity.TConnector;
import jp.sourceforge.ea2ddl.dao.exentity.TObject;
import jp.sourceforge.ea2ddl.dao.exentity.TOperation;
import jp.sourceforge.ea2ddl.dao.exentity.TOperationparams;
import jp.sourceforge.ea2ddl.dao.exentity.TPackage;
import jp.sourceforge.ea2ddl.ddl.ConfigKey;
import jp.sourceforge.ea2ddl.ddl.Constants;
import jp.sourceforge.ea2ddl.ddl.factory.ModelFactory;
import jp.sourceforge.ea2ddl.ddl.model.ColumnModel;
import jp.sourceforge.ea2ddl.ddl.model.DatabaseModel;
import jp.sourceforge.ea2ddl.ddl.model.ForeignKeyModel;
import jp.sourceforge.ea2ddl.ddl.model.IndexModel;
import jp.sourceforge.ea2ddl.ddl.model.PrimaryKeyModel;
import jp.sourceforge.ea2ddl.ddl.model.TableModel;
import jp.sourceforge.ea2ddl.ddl.model.UniqueModel;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.dbflute.cbean.coption.LikeSearchOption;
import org.seasar.framework.container.annotation.tiger.Binding;

/**
 * @author taktos
 * 
 */
public class DatabaseModelFactoryImpl implements ModelFactory {
	private Log _log = LogFactory.getLog(DatabaseModelFactoryImpl.class);

	private Config _config;
	private TPackageBhv _tPackageBhv;
	private TObjectBhv _tObjectBhv;
	private TObjectpropertiesBhv _tObjectpropertiesBhv;
	private TObjectconstraintBhv _tObjectconstraintBhv;
	private TAttributeBhv _tAttributeBhv;
	private TConnectorBhv _tConnectorBhv;
	private TOperationBhv _tOperationBhv;
	private TOperationparamsBhv _tOperationparamsBhv;

	@Binding
	public void setConfig(Config config) {
		_config = config;
	}

	@Binding
	public void setTPackageBhv(TPackageBhv packageBhv) {
		_tPackageBhv = packageBhv;
	}

	@Binding
	public void setTObjectBhv(TObjectBhv objectBhv) {
		_tObjectBhv = objectBhv;
	}

	@Binding
	public void setTObjectpropertiesBhv(TObjectpropertiesBhv objectpropertiesBhv) {
		_tObjectpropertiesBhv = objectpropertiesBhv;
	}

	@Binding
	public void setTObjectconstraintBhv(TObjectconstraintBhv objectconstraintBhv) {
		_tObjectconstraintBhv = objectconstraintBhv;
	}

	@Binding
	public void setTAttributeBhv(TAttributeBhv attributeBhv) {
		_tAttributeBhv = attributeBhv;
	}

	@Binding
	public void setTConnectorBhv(TConnectorBhv connectorBhv) {
		_tConnectorBhv = connectorBhv;
	}

	@Binding
	public void setTOperationBhv(TOperationBhv operationBhv) {
		_tOperationBhv = operationBhv;
	}

	@Binding
	public void setTOperationparamsBhv(TOperationparamsBhv operationparamsBhv) {
		_tOperationparamsBhv = operationparamsBhv;
	}

	/*
	 * (�� Javadoc)
	 * 
	 * @see jp.sourceforge.ea2ddl.ddl.factory.Generator#execute()
	 */
	public DatabaseModel create() {
		final DatabaseModel dbModel = new DatabaseModel();
		final TPackage pkg = getPackage();
		final List<TObject> objectList = _tObjectBhv.selectListByStereotype(
				pkg, Constants.STEREOTYPE_TABLE);
		_log.debug(objectList.size());

		for (TObject object : objectList) {
			final TableModel table = generateTableModel(object);
			dbModel.addTable(table);
		}
		return dbModel;
	}

	protected TPackage getPackage() {
		return _tPackageBhv.selectPackage(_config
				.getProperty(ConfigKey.ER_PACKAGE_TREE));
	}

	protected TableModel generateTableModel(TObject tobject) {
		final TableModel table = new TableModel();
		table.setName(tobject.getName());
		table.setAlias(tobject.getAlias());
		table.setNote(tobject.getNote());
		if (_config.getBoolean(_config.getProperty(ConfigKey.USE_SCHEMA))) {
			table.setSchema(_tObjectpropertiesBhv.getValue(tobject,
					Constants.OBJECT_PROPERTIES_OWNER));
		}
		table.setSuppressCommonColumn(_tObjectconstraintBhv.hasConstraint(
				tobject, Constants.SUPPRESS_COMMON_COLUMN));
		generateColumnModel(table, tobject);
		generatePKModel(table, tobject);
		generateFKModel(table, tobject);
		generateUniqueModel(table, tobject);
		generateIndexModel(table, tobject);
		return table;
	}

	protected void generateColumnModel(TableModel table, TObject tobject) {
		final List<TAttribute> attributes = _tAttributeBhv
				.selectColumns(tobject);
		for (TAttribute attribute : attributes) {
			table.addColumn(ColumnModel.create(attribute, _config));
		}
	}

	protected String getColumnType(TAttribute attribute) {
		final String dictionary = _config.getProperty(attribute.getType());
		if (dictionary != null) {
			return dictionary;
		}
		return attribute.getType();
	}

	protected void generatePKModel(TableModel table, TObject tobject) {
		final ListResultBean<TOperation> pkList = _tOperationBhv
				.selectOperation(tobject, Constants.STEREOTYPE_PRIMARY_KEY);
		if (pkList.isEmpty()) {
			return;
		}
		final TOperation opePK = pkList.get(0);
		final ListResultBean<TOperationparams> params = _tOperationparamsBhv
				.selectOperationParams(opePK);
		if (!params.isEmpty()) {
			final PrimaryKeyModel pk = new PrimaryKeyModel();
			pk.setName(opePK.getName());
			for (TOperationparams param : params) {
				pk.addColumnName(param.getName());
			}
			table.setPrimaryKey(pk);
		}
	}

	protected void generateFKModel(TableModel table, TObject tobject) {
		final ListResultBean<TOperation> fkList = _tOperationBhv
				.selectOperation(tobject, Constants.STEREOTYPE_FOREIGN_KEY);
		for (TOperation opeFK : fkList) {
			final ForeignKeyModel fkModel = new ForeignKeyModel();
			fkModel.setName(opeFK.getName());

			{
				final ListResultBean<TOperationparams> params = _tOperationparamsBhv
						.selectOperationParams(opeFK);
				for (TOperationparams param : params) {
					fkModel.addColumnName(param.getName());
				}
			}
			{
				final TConnectorCB conCB = new TConnectorCB();
				conCB.query().setStartObjectId_Equal(tobject.getObjectId());
				// FK名が長すぎるとEAが勝手に縮めてしまうので、StyleExカラムでLike検索する
				// String fkName = opeFK.getName();
				// if (50 < fkName.length()) {
				// fkName = fkName.substring(0, 47) + "...";
				// }
				// conCB.query().setSourcerole_Equal(fkName);
				conCB.query().setStyleex_LikeSearch(
						"SRC=" + opeFK.getName() + ":",
						new LikeSearchOption().likeContain());
				final TConnector con = _tConnectorBhv.selectEntity(conCB);

				final TObject targetTable = _tObjectBhv.selectEntity(con
						.getEndObjectId());
				fkModel.setTargetTable(targetTable.getName());

				final TOperationCB targetOpeCB = new TOperationCB();
				targetOpeCB.query().setObjectId_Equal(con.getEndObjectId());
				targetOpeCB.query().setName_Equal(con.getDestrole());
				final TOperation targetOpe = _tOperationBhv
						.selectEntity(targetOpeCB);

				final ListResultBean<TOperationparams> targetParams = _tOperationparamsBhv
						.selectOperationParams(targetOpe);
				for (TOperationparams targetParam : targetParams) {
					fkModel.addTargetColumnName(targetParam.getName());
				}
			}
			table.addForeignKey(fkModel);
		}
	}

	protected void generateUniqueModel(TableModel table, TObject tobject) {
		final TOperationCB cb = new TOperationCB();
		cb.query().setObjectId_Equal(tobject.getObjectId());
		cb.query().setStereotype_Equal(Constants.STEREOTYPE_UNIQUE);
		final ListResultBean<TOperation> uniqueList = _tOperationBhv
				.selectList(cb);
		for (TOperation unique : uniqueList) {
			final UniqueModel uniqueModel = new UniqueModel();
			uniqueModel.setName(unique.getName());
			final TOperationparamsCB opeCB = new TOperationparamsCB();
			opeCB.query().setOperationid_Equal(unique.getOperationid());
			opeCB.query().addOrderBy_Pos_Asc();
			final ListResultBean<TOperationparams> cols = _tOperationparamsBhv
					.selectList(opeCB);
			for (TOperationparams param : cols) {
				uniqueModel.addColumnName(param.getName());
			}
			table.addUnique(uniqueModel);
		}
	}

	protected void generateIndexModel(TableModel table, TObject tobject) {
		final ListResultBean<TOperation> indexList = _tOperationBhv
				.selectOperation(tobject, "index");
		for (TOperation index : indexList) {
			final IndexModel indexModel = new IndexModel();
			indexModel.setName(index.getName());
			final ListResultBean<TOperationparams> params = _tOperationparamsBhv
					.selectOperationParams(index);
			for (TOperationparams param : params) {
				indexModel.addColumn(param.getName());
			}
			table.addIndex(indexModel);
		}
	}

}
