/**
 * 
 */
package jp.sourceforge.ea2ddl.ddl.model;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import jp.sourceforge.ea2ddl.common.config.Config;
import jp.sourceforge.ea2ddl.dao.exentity.TAttribute;

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
	private boolean ordered;

	public static ColumnModel create(TAttribute columnDef, Config dictionary) {
		ColumnModel column = new ColumnModel();
		column.setName(columnDef.getName());
		column.setAlias(columnDef.getStyle());
		column.setType(columnDef, dictionary);
		column.setNullable(Integer.valueOf(0).equals(
				columnDef.getAllowduplicates()));
		column.setOrdered(Integer.valueOf(1).equals(columnDef.getIsordered()));
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
					setScale(len);
				}
				if (m.group(5) != null) {
					setPrecision(Integer.valueOf(m.group(5)));
				}
			}
			return;
		}
		setType(columnDef.getType());
		if (columnDef.getLength() != null) {
			setScale(columnDef.getLength());
		} else if (columnDef.getScale() != null) {
			setScale(columnDef.getScale());
		}
		setPrecision(columnDef.getPrecision());
	}

	public boolean isNullable() {
		return nullable;
	}

	public void setNullable(boolean nullable) {
		this.nullable = nullable;
	}

	public boolean isOrdered() {
		return ordered;
	}

	public void setOrdered(boolean ordered) {
		this.ordered = ordered;
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
		if (_scale != null) {
			b.append("(").append(_scale);
			if (_precision != null) {
				b.append(",").append(_precision);
			}
			b.append(")");
		}
		if (!isNullable()) {
			b.append(" NOT NULL");
		}
		if (isOrdered()) {
			b.append(" AUTO_INCREMENT");
		}
		return b.toString();
	}

}
