package jp.sourceforge.ea2ddl.dao.exentity;

import java.util.Map;

/**
 * The entity of t_attribute.
 * <p>
 * You can implement your original methods here. This class remains when
 * re-generating.
 * </p>
 * 
 * @author DBFlute(AutoGenerator)
 */
public class TAttribute extends jp.sourceforge.ea2ddl.dao.bsentity.BsTAttribute {

	/** Serial version UID. (Default) */
	private static final long serialVersionUID = 1L;

	private Map<String, TAttributetag> _tags;

	public Map<String, TAttributetag> getTags() {
		return _tags;
	}

	public void setTags(Map<String, TAttributetag> tags) {
		_tags = tags;
	}

	private String _default;

	public String getDefault() {
		return _default;
	}

	public void setDefault(final String _default) {
		this._default = _default;
	}
}
