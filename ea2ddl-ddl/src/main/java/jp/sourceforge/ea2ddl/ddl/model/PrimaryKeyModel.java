package jp.sourceforge.ea2ddl.ddl.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PrimaryKeyModel implements Serializable {
	private static final long serialVersionUID = 1L;

	private String _name;
	private List<String> _columnNameList;

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public List<String> getColumnNameList() {
		if (_columnNameList == null) {
			synchronized (this) {
				_columnNameList = new ArrayList<String>();
			}
		}
		return _columnNameList;
	}

	public void setColumnNameList(List<String> columnNameList) {
		_columnNameList = columnNameList;
	}

	public void addColumnName(String columnName) {
		getColumnNameList().add(columnName);
	}
}
