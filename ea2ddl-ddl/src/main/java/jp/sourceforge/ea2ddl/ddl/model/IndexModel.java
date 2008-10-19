/**
 * 
 */
package jp.sourceforge.ea2ddl.ddl.model;

import java.io.Serializable;
import java.util.List;

/**
 * @author taktos
 * 
 */
public class IndexModel implements Serializable {
	private static final long serialVersionUID = 1L;
	private String _name;
	private List<String> _columnList;

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public List<String> getColumnList() {
		return _columnList;
	}

	public void setColumnList(List<String> columnList) {
		_columnList = columnList;
	}
}
