package jp.sourceforge.ea2ddl.dao.allcommon.cbean;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.grouping.GroupingOption;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.grouping.GroupingRowEndDeterminer;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.grouping.GroupingRowResource;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.grouping.GroupingRowSetupper;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.mapping.EntityDtoMapper;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.OrderByClause;

/**
 * The result bean for list.
 * @param <ENTITY> The type of entity for the element of selected list.
 * @author DBFlute(AutoGenerator)
 */
public class ListResultBean<ENTITY> implements List<ENTITY>, Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The value of table db-name. (Nullable: If it's null, it means 'Not Selected Yet'.) */
    protected String _tableDbName;

    /** The value of all record count. */
    protected int _allRecordCount;

    /** The list of selected entity. (NotNull) */
    protected List<ENTITY> _selectedList = new ArrayList<ENTITY>();

    /** The clause of order-by. (NotNull) */
    protected OrderByClause _orderByClause = new OrderByClause();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor.
     */
    public ListResultBean() {
    }

    // ===================================================================================
    //                                                                            Grouping
    //                                                                            ========
    /**
     * Group the list. This method needs the property 'selectedList' only.
     * @param <ROW> The type of row.
     * @param groupingRowSetupper The setupper of grouping row. (NotNull)
     * @param groupingOption The option of grouping. (NotNull and it requires the breakCount or the determiner)
     * @return The grouped list. (NotNull)
     */
    public <ROW> List<ROW> groupingList(GroupingRowSetupper<ROW, ENTITY> groupingRowSetupper, GroupingOption<ENTITY> groupingOption) {
        final List<ROW> groupingList = new ArrayList<ROW>();
        GroupingRowEndDeterminer<ENTITY> rowEndDeterminer = groupingOption.getGroupingRowEndDeterminer();
        if (rowEndDeterminer == null) {
            rowEndDeterminer = new GroupingRowEndDeterminer<ENTITY>() {
                public boolean determine(GroupingRowResource<ENTITY> rowResource, ENTITY nextEntity) {
                    return rowResource.isSizeUpBreakCount();
                }
            }; // as Default
        }
        GroupingRowResource<ENTITY> rowResource = new GroupingRowResource<ENTITY>();
        int breakCount = groupingOption.getElementCount();
        int rowElementIndex = 0;
        int allElementIndex = 0;
        for (ENTITY entity : _selectedList) {
            // Set up row resource.
            rowResource.addGroupingRowList(entity);
            rowResource.setElementCurrentIndex(rowElementIndex);
            rowResource.setBreakCount(breakCount);

            if (_selectedList.size() == (allElementIndex + 1)) { // Last Loop!
                // Set up the object of grouping row!
                final ROW groupingRowObject = groupingRowSetupper.setup(rowResource);

                // Register!
                groupingList.add(groupingRowObject);
                break;
            }

            // Not last loop so the nextElement must exist.
            final ENTITY nextElement = _selectedList.get(allElementIndex + 1);

            // Do at row end.
            if (rowEndDeterminer.determine(rowResource, nextElement)) { // Determine the row end!
                // Set up the object of grouping row!
                final ROW groupingRowObject = groupingRowSetupper.setup(rowResource);

                // Register!
                groupingList.add(groupingRowObject);

                // Initialize!
                rowResource = new GroupingRowResource<ENTITY>();
                rowElementIndex = 0;
                ++allElementIndex;
                continue;
            }
            ++rowElementIndex;
            ++allElementIndex;
        }
        return groupingList;
    }

    // ===================================================================================
    //                                                                             Mapping
    //                                                                             =======
    public <DTO> ListResultBean<DTO> mappingList(EntityDtoMapper<ENTITY, DTO> entityDtoMapper) {
        final ListResultBean<DTO> mappingList = new ListResultBean<DTO>();
        for (ENTITY entity : _selectedList) {
            mappingList.add(entityDtoMapper.map(entity));
        }
        mappingList.setTableDbName(getTableDbName());
        mappingList.setAllRecordCount(getAllRecordCount());
        mappingList.setOrderByClause(getOrderByClause());
        return mappingList;
    }

    // ===================================================================================
    //                                                                       Determination
    //                                                                       =============
    /**
     * Has this result selected?
     * @return Determination. {Whether table DB name is not null}
     */
    public boolean isSelectedResult() {
        return _tableDbName != null;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * @return Hash-code from primary-keys.
     */
    public int hashCode() {
        if (_selectedList == null) {
            return super.hashCode();
        }
        return _selectedList.hashCode();
    }

    /**
     * @param other Other entity. (Nullable)
     * @return Comparing result. If other is null, returns false.
     */
    public boolean equals(Object other) {
        if (_selectedList == null) {
            return false;
        }
        if (other == null) {
            return false;
        }
        if (!(other instanceof List)) {
            return false;
        }
        return _selectedList.equals(other);
    }

    /**
     * @return The view string of all attribute values. (NotNull)
     */
	@Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("{").append(_tableDbName);
        sb.append(",").append(_allRecordCount);
        sb.append(",").append(_orderByClause != null ? _orderByClause.getOrderByClause() : null);
        sb.append(",").append(_selectedList);
        sb.append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                       List Elements
    //                                                                       =============
    public boolean add(ENTITY o) {
        return _selectedList.add(o);
    }

    public boolean addAll(Collection<? extends ENTITY> c) {
        return _selectedList.addAll(c);
    }

    public void clear() {
        _selectedList.clear();
    }

    public boolean contains(Object o) {
        return _selectedList.contains(o);
    }

    public boolean containsAll(Collection<?> c) {
        return _selectedList.containsAll(c);
    }

    public boolean isEmpty() {
        return _selectedList.isEmpty();
    }

    public Iterator<ENTITY> iterator() {
        return _selectedList.iterator();
    }

    public boolean remove(Object o) {
        return _selectedList.remove(o);
    }

    public boolean removeAll(Collection<?> c) {
        return _selectedList.removeAll(c);
    }

    public boolean retainAll(Collection<?> c) {
        return _selectedList.retainAll(c);
    }

    public int size() {
        return _selectedList.size();
    }

    public Object[] toArray() {
        return _selectedList.toArray();
    }

    public <TYPE> TYPE[] toArray(TYPE[] a) {
        return _selectedList.toArray(a);
    }

    public void add(int index, ENTITY element) {
        _selectedList.add(index, element);
    }

    public boolean addAll(int index, Collection<? extends ENTITY> c) {
        return _selectedList.addAll(index, c);
    }

    public ENTITY get(int index) {
        return _selectedList.get(index);
    }

    public int indexOf(Object o) {
        return _selectedList.indexOf(o);
    }

    public int lastIndexOf(Object o) {
        return _selectedList.lastIndexOf(o);
    }

    public ListIterator<ENTITY> listIterator() {
        return _selectedList.listIterator();
    }

    public ListIterator<ENTITY> listIterator(int index) {
        return _selectedList.listIterator(index);
    }

    public ENTITY remove(int index) {
        return _selectedList.remove(index);
    }

    public ENTITY set(int index, ENTITY element) {
        return _selectedList.set(index, element);
    }

    public List<ENTITY> subList(int fromIndex, int toIndex) {
        return _selectedList.subList(fromIndex, toIndex);
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * Get the value of tableDbName.
     * @return The value of tableDbName. (Nullable: If it's null, it means 'Not Selected Yet'.)
     */
    public String getTableDbName() {
        return _tableDbName;
    }

    /**
     * Set the value of tableDbName.
     * @param tableDbName The value of tableDbName. (NotNull)
     */
    public void setTableDbName(String tableDbName) {
        _tableDbName = tableDbName;
    }

    /**
     * Get the value of allRecordCount.
     * @return The value of allRecordCount.
     */
    public int getAllRecordCount() {
        return _allRecordCount;
    }

    /**
     * Set the value of allRecordCount.
     * @param allRecordCount The value of allRecordCount.
     */
    public void setAllRecordCount(int allRecordCount) {
        _allRecordCount = allRecordCount;
    }

    /**
     * Get the value of selectedList.
     * @return Selected list. (NotNull)
     */
    public List<ENTITY> getSelectedList() {
        return _selectedList;
    }

    /**
     * Set the value of selectedList.
     * @param selectedList Selected list. (NotNull: If you set null, it ignores it.)
     */
    public void setSelectedList(List<ENTITY> selectedList) {
        if (selectedList == null) { return; } // Not allowed to set null value to the selected list
        _selectedList = selectedList;
    }

    /**
     * Get the value of orderByClause.
     * @return The value of orderByClause. (NotNull)
     */
    public OrderByClause getOrderByClause() {
        return _orderByClause;
    }

    /**
     * Set the value of orderByClause.
     * @param orderByClause The value of orderByClause. (NotNull: If you set null, it ignores it.)
     */
    public void setOrderByClause(OrderByClause orderByClause) {
        if (orderByClause == null) { return; } // Not allowed to set null value to the selected list
        _orderByClause = orderByClause;
    }
}
