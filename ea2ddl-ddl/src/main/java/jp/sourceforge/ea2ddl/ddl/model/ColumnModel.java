/**
 * 
 */
package jp.sourceforge.ea2ddl.ddl.model;

import java.io.Serializable;

/**
 * @author taktos
 * 
 */
public class ColumnModel implements Serializable {
	private static final long serialVersionUID = 1L;

	private String _name;
	private String _alias;
	private String _note;
	private String _type;
	private Integer _length;
	private Integer _precision;
	private Integer _scale;
	private boolean nullable;

	public boolean isNullable() {
		return nullable;
	}

	public void setNullable(boolean nullable) {
		this.nullable = nullable;
	}

	private String defaultValue;

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getAlias() {
		return _alias;
	}

	public void setAlias(String alias) {
		_alias = alias;
	}

	public String getNote() {
		return _note;
	}

	public void setNote(String note) {
		_note = note;
	}

	public String getType() {
		return _type;
	}

	public void setType(String type) {
		_type = type;
	}

	public Integer getLength() {
		return _length;
	}

	public void setLength(Integer length) {
		_length = length;
	}

	public Integer getPrecision() {
		return _precision;
	}

	public void setPrecision(Integer precision) {
		_precision = precision;
	}

	public Integer getScale() {
		return _scale;
	}

	public void setScale(Integer scale) {
		_scale = scale;
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public String getDefinition() {
		StringBuffer b = new StringBuffer();
		b.append(getType());
		if ("CHAR".equals(getType()) || "VARCHAR".equals(getType())
				|| "VARCHAR2".equals(getType()) || "INTEGER".equals(getType())
				|| "LONG".equals(getType()) || "FLOAT".equals(getType())
				|| "NCHAR".equals(getType()) || "NVARCHAR".equals(getType())
				|| "NVARCHAR2".equals(getType()) || "RAW".equals(getType())) {
			b.append("(").append(getLength()).append(")");
		} else if ("NUMBER".equals(getType())) {
			b.append("(").append(getPrecision());
			if (getScale() != null && 0 != getScale()) {
				b.append(",").append(getScale());
			}
			b.append(")");
		}
		if (!isNullable()) {
			b.append(" NOT NULL");
		}
		return b.toString();
	}

}
