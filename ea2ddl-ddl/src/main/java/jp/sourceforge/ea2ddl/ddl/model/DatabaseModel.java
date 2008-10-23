/**
 * 
 */
package jp.sourceforge.ea2ddl.ddl.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author taktos
 * 
 */
public class DatabaseModel extends Model {
	private static final long serialVersionUID = 1L;

	private List<TableModel> _tableList;

	public List<TableModel> getTableList() {
		if (_tableList == null) {
			synchronized (this) {
				if (_tableList == null) {
					_tableList = new ArrayList<TableModel>();
				}
			}
		}
		return _tableList;
	}

	public void setTableList(List<TableModel> tableList) {
		_tableList = tableList;
	}

	public void addTable(TableModel table) {
		getTableList().add(table);
	}
}
