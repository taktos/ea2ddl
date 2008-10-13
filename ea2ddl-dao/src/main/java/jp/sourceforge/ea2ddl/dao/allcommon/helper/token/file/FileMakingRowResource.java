package jp.sourceforge.ea2ddl.dao.allcommon.helper.token.file;

/**
 * @author DBFlute(AutoGenerator)
 */
public class FileMakingRowResource {

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    protected java.util.List<String> _valueList;

    protected java.util.LinkedHashMap<String, String> _nameValueMap;

    // =====================================================================================
    //                                                                              Accessor
    //                                                                              ========
    public java.util.List<String> getValueList() {
        return _valueList;
    }

    /**
     * Set the list of value. {Priority One}
     * 
     * @param valueList The list of value. (NotNull and NotEmpty)
     */
    public void setValueList(java.util.List<String> valueList) {
        this._valueList = valueList;
    }

    public java.util.LinkedHashMap<String, String> getNameValueMap() {
        return _nameValueMap;
    }

    /**
     * Set the map of name and value. {Priority Two} <br />
     * If valueList is set, This nameValueMap is ignored.
     * 
     * @param nameValueMap The map of name and value. (NotNull and NotEmpty)
     */
    public void setNameValueMap(java.util.LinkedHashMap<String, String> nameValueMap) {
        this._nameValueMap = nameValueMap;
    }
}
