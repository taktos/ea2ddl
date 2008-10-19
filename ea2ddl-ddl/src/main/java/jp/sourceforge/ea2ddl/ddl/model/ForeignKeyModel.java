/**
 * 
 */
package jp.sourceforge.ea2ddl.ddl.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author taktos
 * 
 */
public class ForeignKeyModel implements Serializable {
	private static final long serialVersionUID = 1L;

	private String _name;
	private List<String> _columnNameList = new ArrayList<String>();
	private String _targetTable;
	private List<String> _targetColumnNameList = new ArrayList<String>();

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public List<String> getColumnNameList() {
		return _columnNameList;
	}

	public void setColumnNameList(List<String> columnNameList) {
		_columnNameList = columnNameList;
	}

	public void addColumnName(String columnName) {
		getColumnNameList().add(columnName);
	}

	public String getTargetTable() {
		return _targetTable;
	}

	public void setTargetTable(String targetTable) {
		_targetTable = targetTable;
	}

	public List<String> getTargetColumnNameList() {
		return _targetColumnNameList;
	}

	public void setTargetColumnNameList(List<String> targetColumnNameList) {
		_targetColumnNameList = targetColumnNameList;
	}

	public void addTargetColumnName(String targetColumnName) {
		getTargetColumnNameList().add(targetColumnName);
	}

}
