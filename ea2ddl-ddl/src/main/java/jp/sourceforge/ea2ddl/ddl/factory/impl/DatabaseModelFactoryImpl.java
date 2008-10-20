/**
 * 
 */
package jp.sourceforge.ea2ddl.ddl.factory.impl;

import java.util.List;

import jp.sourceforge.ea2ddl.common.config.Config;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ListResultBean;
import jp.sourceforge.ea2ddl.dao.cbean.TAttributeCB;
import jp.sourceforge.ea2ddl.dao.cbean.TConnectorCB;
import jp.sourceforge.ea2ddl.dao.cbean.TObjectpropertiesCB;
import jp.sourceforge.ea2ddl.dao.cbean.TOperationCB;
import jp.sourceforge.ea2ddl.dao.cbean.TOperationparamsCB;
import jp.sourceforge.ea2ddl.dao.exbhv.TAttributeBhv;
import jp.sourceforge.ea2ddl.dao.exbhv.TConnectorBhv;
import jp.sourceforge.ea2ddl.dao.exbhv.TObjectBhv;
import jp.sourceforge.ea2ddl.dao.exbhv.TObjectpropertiesBhv;
import jp.sourceforge.ea2ddl.dao.exbhv.TOperationBhv;
import jp.sourceforge.ea2ddl.dao.exbhv.TOperationparamsBhv;
import jp.sourceforge.ea2ddl.dao.exbhv.TPackageBhv;
import jp.sourceforge.ea2ddl.dao.exentity.TAttribute;
import jp.sourceforge.ea2ddl.dao.exentity.TConnector;
import jp.sourceforge.ea2ddl.dao.exentity.TObject;
import jp.sourceforge.ea2ddl.dao.exentity.TObjectproperties;
import jp.sourceforge.ea2ddl.dao.exentity.TOperation;
import jp.sourceforge.ea2ddl.dao.exentity.TOperationparams;
import jp.sourceforge.ea2ddl.dao.exentity.TPackage;
import jp.sourceforge.ea2ddl.ddl.factory.DatabaseModelFactory;
import jp.sourceforge.ea2ddl.ddl.model.ColumnModel;
import jp.sourceforge.ea2ddl.ddl.model.DatabaseModel;
import jp.sourceforge.ea2ddl.ddl.model.ForeignKeyModel;
import jp.sourceforge.ea2ddl.ddl.model.PrimaryKeyModel;
import jp.sourceforge.ea2ddl.ddl.model.TableModel;
import jp.sourceforge.ea2ddl.ddl.model.UniqueModel;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.seasar.framework.container.annotation.tiger.Binding;

/**
 * @author taktos
 * 
 */
public class DatabaseModelFactoryImpl implements DatabaseModelFactory {
	private Log _log = LogFactory.getLog(DatabaseModelFactoryImpl.class);

	private Config _config;
	private TPackageBhv _tPackageBhv;
	private TObjectBhv _tObjectBhv;
	private TObjectpropertiesBhv _tObjectpropertiesBhv;
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
		final TPackage pkg = getPackage(_config.getProperty("er.package.tree"));
		final List<TObject> objectList = _tObjectBhv.selectListByStereotype(
				pkg, "table");
		_log.debug(objectList.size());

		for (TObject object : objectList) {
			final TableModel table = generateTableModel(object);
			dbModel.addTable(table);
		}
		return dbModel;
	}

	protected TPackage getPackage(String packageTree) {
		return _tPackageBhv.selectPackage(packageTree);
	}

	protected TableModel generateTableModel(TObject tobject) {
		final TableModel table = new TableModel();
		table.setName(tobject.getName());
		table.setAlias(tobject.getAlias());
		table.setNote(tobject.getNote());
		if (_config.getBoolean("use.schema")) {
			final TObjectpropertiesCB cb = new TObjectpropertiesCB();
			cb.query().setObjectId_Equal(tobject.getObjectId());
			cb.query().setProperty_Equal("OWNER");
			final TObjectproperties owner = _tObjectpropertiesBhv
					.selectEntity(cb);
			if (owner != null) {
				table.setSchema(owner.getValue());
			}
		}
		generateColumnModel(table, tobject);
		generatePKModel(table, tobject);
		generateFKModel(table, tobject);
		generateUniqueModel(table, tobject);

		return table;
	}

	protected void generateColumnModel(TableModel table, TObject tobject) {
		final TAttributeCB cb = new TAttributeCB();
		cb.query().setObjectId_Equal(tobject.getObjectId());
		cb.query().addOrderBy_Pos_Asc();
		final ListResultBean<TAttribute> attributes = _tAttributeBhv
				.selectList(cb);
		for (TAttribute attribute : attributes) {
			final ColumnModel column = new ColumnModel();
			column.setName(attribute.getName());
			column.setAlias(attribute.getStyle());
			column.setType(attribute.getType());
			column.setLength(attribute.getLength());
			column.setPrecision(attribute.getPrecision());
			column.setScale(attribute.getScale());
			column.setNullable(Integer.valueOf(0).equals(
					attribute.getAllowduplicates()));
			column.setNote(attribute.getNotes());
			table.addColumn(column);
		}
	}

	protected void generatePKModel(TableModel table, TObject tobject) {
		final TOperationCB opeCB = new TOperationCB();
		opeCB.query().setObjectId_Equal(tobject.getObjectId());
		opeCB.query().setStereotype_Equal("PK");
		final TOperation opePK = _tOperationBhv.selectEntity(opeCB);
		if (opePK == null) {
			return;
		}
		final TOperationparamsCB cb = new TOperationparamsCB();
		cb.query().setOperationid_Equal(opePK.getOperationid());
		cb.query().addOrderBy_Pos_Asc();
		final ListResultBean<TOperationparams> params = _tOperationparamsBhv
				.selectList(cb);
		if (0 < params.size()) {
			final PrimaryKeyModel pk = new PrimaryKeyModel();
			pk.setName(opePK.getName());
			for (TOperationparams param : params) {
				pk.addColumnName(param.getName());
			}
			table.setPrimaryKey(pk);
		}
	}

	protected void generateFKModel(TableModel table, TObject tobject) {
		final TOperationCB opeCB = new TOperationCB();
		opeCB.query().setObjectId_Equal(tobject.getObjectId());
		opeCB.query().setStereotype_Equal("FK");
		final ListResultBean<TOperation> opeFKList = _tOperationBhv
				.selectList(opeCB);
		for (TOperation opeFK : opeFKList) {
			final ForeignKeyModel fk = new ForeignKeyModel();
			fk.setName(opeFK.getName());
			{
				final TOperationparamsCB paraCB = new TOperationparamsCB();
				paraCB.query().setOperationid_Equal(opeFK.getOperationid());
				paraCB.query().addOrderBy_Pos_Asc();
				final ListResultBean<TOperationparams> params = _tOperationparamsBhv
						.selectList(paraCB);
				for (TOperationparams param : params) {
					fk.addColumnName(param.getName());
				}
			}
			{
				final TConnectorCB conCB = new TConnectorCB();
				conCB.query().setStartObjectId_Equal(tobject.getObjectId());
				conCB.query().setSourcerole_Equal(opeFK.getName());
				final TConnector con = _tConnectorBhv.selectEntity(conCB);

				final TObject targetTable = _tObjectBhv.selectEntity(con
						.getEndObjectId());
				fk.setTargetTable(targetTable.getName());

				final TOperationCB targetOpeCB = new TOperationCB();
				targetOpeCB.query().setObjectId_Equal(con.getEndObjectId());
				targetOpeCB.query().setName_Equal(con.getDestrole());
				final TOperation targetOpe = _tOperationBhv
						.selectEntity(targetOpeCB);

				final TOperationparamsCB targetParaCB = new TOperationparamsCB();
				targetParaCB.query().setOperationid_Equal(
						targetOpe.getOperationid());
				targetParaCB.query().addOrderBy_Pos_Asc();
				final ListResultBean<TOperationparams> targetParams = _tOperationparamsBhv
						.selectList(targetParaCB);
				for (TOperationparams targetParam : targetParams) {
					fk.addTargetColumnName(targetParam.getName());
				}
			}
			table.addForeignKey(fk);
		}
	}

	protected void generateUniqueModel(TableModel table, TObject tobject) {
		final TOperationCB cb = new TOperationCB();
		cb.query().setObjectId_Equal(tobject.getObjectId());
		cb.query().setStereotype_Equal("unique");
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
}
