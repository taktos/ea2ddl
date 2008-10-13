package jp.sourceforge.ea2ddl.dao.allcommon.helper;

import java.util.List;
import java.util.Map;

/**
 * MapList-String.
 * <p>
 * <pre>
 * # Interface that offers generation of map and list from the following character strings (map list string). 
 * # 
 * #   ex) map:{key1=value1,key2=list:{value21,value22,value23},key3=map:{key31=value31}}
 * #   ex) list:{key1=value1,key2=list:{value21,value22,value23},key3=map:{key31=value31}}
 * # 
 * </pre>
 *
 * @author DBFlute(AutoGenerator)
 */
public interface MapListString {

    /** Default of map-mark. */
    public static final String DEFAULT_MAP_MARK = "map:";

    /** Default of list-mark. */
    public static final String DEFAULT_LIST_MARK = "list:";

    /** Default of start-brace. */
    public static final String DEFAULT_START_BRACE = "{";

    /** Default of end-brace. */
    public static final String DEFAULT_END_BRACE = "}";

    /** Default of delimter. */
    public static final String DEFAULT_DELIMITER = ";";

    /** Default of equal. */
    public static final String DEFAULT_EQUAL = "=";

    // ==========================================================================================
    //                                                                                     Setter
    //                                                                                     ======
    /**
     * Set map-mark.
     * 
     * @param mapMark Map-mark. (NotNull)
     */
    public void setMapMark(String mapMark);

    /**
     * Set list-mark.
     * 
     * @param listMark List-mark. (NotNull)
     */
    public void setListMark(String listMark);

    /**
     * Set start brace.
     * 
     * @param startBrace Start brace. (NotNull)
     */
    public void setStartBrace(String startBrace);

    /**
     * Set end brace.
     * 
     * @param endBrace End brace. (NotNull)
     */
    public void setEndBrace(String endBrace);

    /**
     * Set delimiter.
     * 
     * @param delimiter Delimiter. (NotNull)
     */
    public void setDelimiter(String delimiter);

    /**
     * Set equal.
     * 
     * @param equal Equal. (NotNull)
     */
    public void setEqual(String equal);
    
    // ==========================================================================================
    //                                                                                   Generate
    //                                                                                   ========
    /**
     * Generate map from map-string.
     * 
     * @param mapString Map-string (NotNull)
     * @return Generated map. (NotNull)
     */
    public Map<String, Object> generateMap(String mapString);

    /**
     * Generate map from list-string. {Implement}
     * 
     * @param listString List-string (NotNull)
     * @return Generated list. (NotNull)
     */
    public List<Object> generateList(String listString);
}