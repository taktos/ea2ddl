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
public class TableModel implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private String alias;
	private String note;
	private String schema;

	private List<ColumnModel> _columnList;
	private PrimaryKeyModel _primaryKey;
	private List<UniqueModel> _uniqueList;
	private List<ForeignKeyModel> _foreignKeyList;
	private List<IndexModel> _indexList;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getSchema() {
		return schema;
	}

	public void setSchema(String schema) {
		this.schema = schema;
	}

	public List<ColumnModel> getColumnList() {
		if (_columnList == null) {
			synchronized (this) {
				if (_columnList == null) {
					_columnList = new ArrayList<ColumnModel>();
				}
			}
		}
		return _columnList;
	}

	public void setColumnList(List<ColumnModel> columnList) {
		_columnList = columnList;
	}

	public void addColumn(ColumnModel column) {
		getColumnList().add(column);
	}

	public PrimaryKeyModel getPrimaryKey() {
		return _primaryKey;
	}

	public void setPrimaryKey(PrimaryKeyModel primaryKey) {
		_primaryKey = primaryKey;
	}

	public List<UniqueModel> getUniqueList() {
		if (_uniqueList == null) {
			synchronized (this) {
				if (_uniqueList == null) {
					_uniqueList = new ArrayList<UniqueModel>();
				}
			}
		}
		return _uniqueList;
	}

	public void setUniqueList(List<UniqueModel> uniqueList) {
		_uniqueList = uniqueList;
	}

	public void addUnique(UniqueModel unique) {
		getUniqueList().add(unique);
	}

	public List<ForeignKeyModel> getForeignKeyList() {
		if (_foreignKeyList == null) {
			synchronized (this) {
				if (_foreignKeyList == null) {
					_foreignKeyList = new ArrayList<ForeignKeyModel>();
				}
			}
		}
		return _foreignKeyList;
	}

	public void setForeignKeyList(List<ForeignKeyModel> foreignKeyList) {
		_foreignKeyList = foreignKeyList;
	}

	public void addForeignKey(ForeignKeyModel foreignKey) {
		getForeignKeyList().add(foreignKey);
	}

	public List<IndexModel> getIndexList() {
		return _indexList;
	}

	public void setIndexList(List<IndexModel> indexList) {
		_indexList = indexList;
	}

	public String getComment() {
		StringBuffer b = new StringBuffer();
		if (getAlias() != null) {
			b.append(getAlias()).append(".").append("\r\n");
		}
		if (getNote() != null) {
			b.append(getNote());
		}
		if (b.length() == 0) {
			return null;
		}
		return b.toString();
	}
}
