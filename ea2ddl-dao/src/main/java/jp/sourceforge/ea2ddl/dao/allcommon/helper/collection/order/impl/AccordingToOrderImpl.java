package jp.sourceforge.ea2ddl.dao.allcommon.helper.collection.order.impl;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.helper.collection.order.AccordingToOrder;
import jp.sourceforge.ea2ddl.dao.allcommon.helper.collection.order.AccordingToOrderIdExtractor;
import jp.sourceforge.ea2ddl.dao.allcommon.helper.collection.order.AccordingToOrderOption;

/**
 * @author DBFlute(AutoGenerator)
 */
public class AccordingToOrderImpl implements AccordingToOrder {

    // ===================================================================================
    //                                                                                Main
    //                                                                                ====
    /**
     * The implementation.
     * 
     * @param unorderedList The unordered list. (NotNull)
     * @param option The option of according-to-order. (NotNull)
     * @param <ELEMENT_TYPE> The type of element.
     * @param <ID_TYPE> The type of ID.
     */
    public <ELEMENT_TYPE, ID_TYPE> void order(final List<ELEMENT_TYPE> unorderedList, final AccordingToOrderOption<ELEMENT_TYPE, ID_TYPE> option) {
        assertObjectNotNull("unorderedList", unorderedList);
        if (unorderedList.isEmpty()) {
            return;
        }
        assertObjectNotNull("option", option);
        final List<ID_TYPE> orderedUniqueIdList = option.getOrderedUniqueIdList();
        assertObjectNotNull("option.getOrderedUniqueIdList()", orderedUniqueIdList);
        if (orderedUniqueIdList.isEmpty()) {
            return;
        }
        final AccordingToOrderIdExtractor<ELEMENT_TYPE, ID_TYPE> idExtractor = option.getIdExtractor();
        assertObjectNotNull("option.getIdExtractor()", idExtractor);

        final Map<ID_TYPE, Integer> idIndexMap = new LinkedHashMap<ID_TYPE, Integer>();
        int index = 0;
        for (ID_TYPE id : orderedUniqueIdList) {
            if (idIndexMap.containsKey(id)) {
                String msg = "The id was duplicated: id=" + id + " orderedUniqueIdList=" + orderedUniqueIdList;
                throw new IllegalStateException(msg);
            }
            idIndexMap.put(id, index);
            ++index;
        }
        final Comparator<ELEMENT_TYPE> comp = new Comparator<ELEMENT_TYPE>() {
            public int compare(ELEMENT_TYPE o1, ELEMENT_TYPE o2) {
                final ID_TYPE id1 = idExtractor.extractId(o1);
                final ID_TYPE id2 = idExtractor.extractId(o2);
                assertObjectNotNull("id1 of " + o1, id1);
                assertObjectNotNull("id2 of " + o2, id2);
                final Integer index1 = idIndexMap.get(id1);
                final Integer index2 = idIndexMap.get(id2);
                if (index1 != null && index2 != null) {
                    return index1.compareTo(index2);
                }
                if (index1 == null && index2 == null) {
                    return 0;
                }
                return index1 == null ? 1 : -1;
            }
        };
        Collections.sort(unorderedList, comp);
    }

    // ===================================================================================
    //                                                                       Assert Helper
    //                                                                       =============
    /**
     * Assert that the object is not null.
     * 
     * @param variableName Variable name. (NotNull)
     * @param value Value. (NotNull)
     * @exception IllegalArgumentException
     */
    protected void assertObjectNotNull(String variableName, Object value) {
        if (variableName == null) {
            String msg = "The value should not be null: variableName=" + variableName + " value=" + value;
            throw new IllegalArgumentException(msg);
        }
        if (value == null) {
            String msg = "The value should not be null: variableName=" + variableName;
            throw new IllegalArgumentException(msg);
        }
    }
}
