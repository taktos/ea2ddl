/**
 * 
 */
package jp.sourceforge.ea2ddl.ddl.model;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import jp.sourceforge.ea2ddl.common.config.Config;
import jp.sourceforge.ea2ddl.dao.exentity.TAttribute;
import jp.sourceforge.ea2ddl.dao.exentity.TAttributetag;

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
	private Integer _precision;
	private Integer _scale;
	private boolean nullable;
	private boolean autoIncrement;

	public static ColumnModel create(TAttribute columnDef, Config dictionary) {
		ColumnModel column = new ColumnModel();
		column.setName(columnDef.getName());
		column.setAlias(columnDef.getStyle());
		column.setType(columnDef, dictionary);
		column.setNullable(Integer.valueOf(0).equals(
				columnDef.getAllowduplicates()));
		column.setAutoIncrement(columnDef);
		column.setNote(columnDef.getNotes());
		return column;
	}

	private void setType(TAttribute columnDef, Config dictionary) {
		String domain = dictionary.getProperty(columnDef.getType());
		if (domain != null) {
			Pattern p = Pattern.compile(
					"^(\\w+)\\s*(\\((\\d+)(,\\s*(\\d+))?\\))?.*",
					Pattern.CASE_INSENSITIVE);
			Matcher m = p.matcher(domain);
			if (m.matches()) {
				setType(m.group(1));
				if (m.group(3) != null) {
					Integer len = Integer.valueOf(m.group(3));
					setPrecision(len);
				}
				if (m.group(5) != null) {
					setScale(Integer.valueOf(m.group(5)));
				}
			}
			return;
		}
		setType(columnDef.getType());
		if (columnDef.getLength() != null) {
			setPrecision(columnDef.getLength());
		} else if (columnDef.getPrecision() != null) {
			setPrecision(columnDef.getPrecision());
			setScale(columnDef.getScale());
		}
	}

	public boolean isNullable() {
		return nullable;
	}

	public void setNullable(boolean nullable) {
		this.nullable = nullable;
	}

	public boolean isAutoIncrement() {
		return autoIncrement;
	}

	public void setAutoIncrement(boolean autoIncrement) {
		this.autoIncrement = autoIncrement;
	}

	public void setAutoIncrement(TAttribute columnDef) {
		TAttributetag tag = columnDef.getTags().get("AutoNum");
		if (tag != null && "True".equals(tag.getValue())) {
			this.autoIncrement = true;
		} else {
			this.autoIncrement = false;
		}
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
		StringBuilder b = new StringBuilder();
		b.append(_type);
		if (_precision != null) {
			b.append("(").append(_precision);
			if (_scale != null) {
				b.append(",").append(_scale);
			}
			b.append(")");
		}
		if (!isNullable()) {
			b.append(" NOT NULL");
		}
		if (isAutoIncrement()) {
			b.append(" AUTO_INCREMENT");
		}
		return b.toString();
	}

}
