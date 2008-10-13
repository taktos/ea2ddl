package jp.sourceforge.ea2ddl.dao.allcommon.bhv;

import jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable;
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ConditionBean;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ListResultBean;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.PagingResultBean;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;

/**
 * The interface of behavior-readable.
 * 
 * @author DBFlute(AutoGenerator)
 */
public interface BehaviorReadable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Map-string map-mark. */
    public static final String MAP_STRING_MAP_MARK = "map:";

    /** Map-string list-mark. */
    public static final String MAP_STRING_LIST_MARK = "list:";

    /** Map-string start-brace. */
    public static final String MAP_STRING_START_BRACE = "@{";

    /** Map-string end-brace. */
    public static final String MAP_STRING_END_BRACE = "@}";

    /** Map-string delimiter. */
    public static final String MAP_STRING_DELIMITER = "@;";

    /** Map-string equal. */
    public static final String MAP_STRING_EQUAL = "@=";

    // ===================================================================================
    //                                                                          Table name
    //                                                                          ==========
    /**
     * Get table db-name.
     * @return Table db-name. (NotNull)
     */
    public String getTableDbName();

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /**
     * Get dbmeta.
     * @return DBMeta. (NotNull)
     */
    public DBMeta getDBMeta();

    // ===================================================================================
    //                                                                        Dao Accessor
    //                                                                        ============
    /**
     * Get dao-readable.
     * @return Dao-readable. (NotNull)
     */
    public DaoReadable getDaoReadable();

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /**
     * New entity.
     * @return Entity. (NotNull)
     */
    public Entity newEntity();

    /**
     * New condition-bean.
     * @return Condition-bean. (NotNull)
     */
    public ConditionBean newConditionBean();

    // ===================================================================================
    //                                                                       Basic Get All
    //                                                                       =============
    /**
     * Get count all.
     * @return Count all.
     */
    public int getCountAll();

    // ===================================================================================
    //                                                                    Basic Read Count
    //                                                                    ================
    /**
     * Read count by condition-bean.
     * <pre>
     * If the argument 'condition-bean' is effective about fetch-scope,
     * this method invoke select count ignoring the fetch-scope.
     * </pre>
     * @param cb Condition-bean. This condition-bean should not be set up about fetch-scope. (NotNull)
     * @return Read count. (NotNull)
     */
    public int readCount(ConditionBean cb);

    // ===================================================================================
    //                                                                   Basic Read Entity
    //                                                                   =================
    /**
     * Read entity by condition-bean.
     * @param cb Condition-bean. (NotNull)
     * @return Read entity. (Nullalble)
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public Entity readEntity(ConditionBean cb);

    /**
     * Read simple entity by condition-bean with deleted check.
     * @param cb Condition-bean. (NotNull)
     * @return Read entity. (NotNull)
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public Entity readEntityWithDeletedCheck(ConditionBean cb);

    // ===================================================================================
    //                                                                     Basic Read List
    //                                                                     ===============
    /**
     * Read list as result-bean.
     * @param cb Condition-bean. (NotNull)
     * @return List-result-bean. If the select result is zero, it returns empty list. (NotNull)
     */
    public ListResultBean<Entity> readList(ConditionBean cb);

    /**
     * Read page as result-bean.
     * @param cb Condition-bean. (NotNull)
     * @return Read page. (NotNull)
     */
    public PagingResultBean<Entity> readPage(final ConditionBean cb);

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    /**
     * The implementation.
     * @return The value of sequence. (NotNull)
     */
    public java.math.BigDecimal readNextVal();
}
