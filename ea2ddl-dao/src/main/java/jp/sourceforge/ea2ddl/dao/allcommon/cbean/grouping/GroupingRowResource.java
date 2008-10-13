package jp.sourceforge.ea2ddl.dao.allcommon.cbean.grouping;

import java.util.List;
import java.util.ArrayList;

/**
 * The class of row resource for grouping making.
 * @param <ENTITY> The type of entity.
 * @author DBFlute(AutoGenerator)
 */
public class GroupingRowResource<ENTITY> {

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    protected List<ENTITY> _groupingRowList = new ArrayList<ENTITY>();
    protected int _elementCurrentIndex;
    protected int _breakCount;

    // =====================================================================================
    //                                                                           Easy-to-Use
    //                                                                           ===========
    /**
     * @return Does the list of grouping row size up the break count?
     */
    public boolean isSizeUpBreakCount() {
        return _elementCurrentIndex == (_breakCount-1);
    }

    // =====================================================================================
    //                                                                              Accessor
    //                                                                              ========
    /**
     * @return The list of grouping row. (NotNull and NotEmpty)
     */
    public List<ENTITY> getGroupingRowList() {
        return this._groupingRowList;
    }

    /**
     * Add the element entity to the list of grouping row. {INTERNAL METHOD}
     * @param groupingRow The element entity to the list of grouping row.
     */
    public void addGroupingRowList(ENTITY groupingRow) {
        this._groupingRowList.add(groupingRow);
    }

    /**
     * @return The entity of element current index. (NotNull)
     */
    public ENTITY getCurrentEntity() {
        return _groupingRowList.get(_elementCurrentIndex);
    }

    /**
     * @return The index of current element.
     */
    public int getElementCurrentIndex() {
        return this._elementCurrentIndex;
    }

    /**
     * Set the index of current element. {INTERNAL METHOD}
     * @param elementCurrentIndex The index of current element.
     */
    public void setElementCurrentIndex(int elementCurrentIndex) {
        this._elementCurrentIndex = elementCurrentIndex;
    }

    /**
     * @return The count of break loop.
     */
    public int getBreakCount() {
        return this._breakCount;
    }

    /**
     * Set the count of break loop. {INTERNAL METHOD}
     * @param breakCount The count of break loop.
     */
    public void setBreakCount(int breakCount) {
        this._breakCount = breakCount;
    }
}
