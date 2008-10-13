package jp.sourceforge.ea2ddl.dao.allcommon.cbean;

import java.util.List;

/**
 * The list-result-bean for ${myClassName}.
 * 
 * @param <ENTITY> The type of entity.
 * @author DBFlute(AutoGenerator)
 */
public class ResultBeanBuilder<ENTITY> {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected String _tableDbName;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public ResultBeanBuilder(String tableDbName) {
        _tableDbName = tableDbName;
    }

    // ===================================================================================
    //                                                                             Builder
    //                                                                             =======
    /**
     * Build the result bean of list.
     * 
     * @param ob The bean of orderBy. (NotNull)
     * @param selectedList Selected list. (NotNull)
     * @return The result bean of list. (NotNull)
     */
    public ListResultBean<ENTITY> buildListResultBean(ConditionBean ob, List<ENTITY> selectedList) {
        ListResultBean<ENTITY> rb = new ListResultBean<ENTITY>();
        rb.setTableDbName(_tableDbName);
        rb.setAllRecordCount(selectedList.size());
        rb.setSelectedList(selectedList);
        rb.setOrderByClause(ob.getSqlComponentOfOrderByClause());
        return rb;
    }

    /**
     * Build the result bean of paging.
     * 
     * @param pb The bean of paging. (NotNull)
     * @param allRecordCount All record count.
     * @param selectedList The list of selected entity. (NotNull)
     * @return The result bean of paging. (NotNull)
     */
    public PagingResultBean<ENTITY> buildPagingResultBean(PagingBean pb, int allRecordCount, List<ENTITY> selectedList) {
        PagingResultBean<ENTITY> rb = new PagingResultBean<ENTITY>();
        rb.setTableDbName(_tableDbName);
        rb.setAllRecordCount(allRecordCount);
        rb.setSelectedList(selectedList);
        rb.setOrderByClause(pb.getSqlComponentOfOrderByClause());
        rb.setPageSize(pb.getFetchSize());
        rb.setCurrentPageNumber(pb.getFetchPageNumber());
        return rb;
    }
}
