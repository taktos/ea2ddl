package jp.sourceforge.ea2ddl.dao.allcommon.dbmeta;

import java.util.Map;
import java.util.List;

import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.helper.MapListString;
import jp.sourceforge.ea2ddl.dao.allcommon.helper.MapStringBuilder;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.info.ColumnInfo;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.info.ForeignInfo;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.info.ReferrerInfo;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.info.RelationInfo;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.info.UniqueInfo;

/**
 * The interface of DB meta.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public interface DBMeta {

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
    //                                                                          Table Info
    //                                                                          ==========
    /**
     * Get table db-name.
     * @return Table db-name. (NotNull)
     */
    public String getTableDbName();

    /**
     * Get table property-name(JavaBeansRule).
     * @return Table property-name(JavaBeansRule). (NotNull)
     */
    public String getTablePropertyName();

    /**
     * Get table SQL-name.
     * @return Table SQL-name. (NotNull)
     */
    public String getTableSqlName();

    // ===================================================================================
    //                                                                       Name Handling
    //                                                                       =============
    /**
     * Has object of flexible name? {Target objects are TABLE and COLUMN}
     * @param flexibleName The flexible name. (NotNull and NotEmpty)
     * @return Determination.
     */
    public boolean hasFlexibleName(String flexibleName);

    /**
     * Find db name by flexible name. {Target objects are TABLE and COLUMN}
     * @param flexibleName The flexible name. (NotNull and NotEmpty)
     * @return Db name. (NotNull and NotEmpty)
     */
    public String findDbName(String flexibleName);

    /**
     * Find property name(JavaBeansRule) by flexible name. {Target objects are TABLE and COLUMN}
     * @param flexibleName The flexible name. (NotNull and NotEmpty)
     * @return Db name. (NotNull and NotEmpty)
     */
    public String findPropertyName(String flexibleName);

    // ===================================================================================
    //                                                                            Name Map
    //                                                                            ========
    /**
     * Get the key-to-lower map of DB name(lower) and property name.
     * @return The key-to-lower map of DB name(lower) and property name. (NotNull)
     */
    public Map<String, String> getDbNamePropertyNameKeyToLowerMap();

    /**
     * Get the key-to-lower map of property name(lower) and db name.
     * @return The key-to-lower map of property name(lower) and db name. (NotNull)
     */
    public Map<String, String> getPropertyNameDbNameKeyToLowerMap();

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    /**
     * Get the type-name of entity.
     * @return The type-name of entity. (NotNull)
     */ 
    public String getEntityTypeName();

    /**
     * Get the type-name of condition-bean.
     * @return The type-name of condition-bean. (Nullable: If the condition-bean does not exist)
     */ 
    public String getConditionBeanTypeName();

    /**
     * Get the type-name of dao.
     * @return The type-name of dao. (Nullable: If the dao does not exist)
     */ 
    public String getDaoTypeName();

    /**
     * Get the type-name of behavior.
     * @return The type-name of behavior. (Nullable: If the behavior does not exist)
     */ 
    public String getBehaviorTypeName();

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    /**
     * Get the type of entity.
     * @return The type of entity. (NotNull)
     */ 
    public Class<? extends Entity> getEntityType();

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    /**
     * New the instance of entity.
     * @return The instance of entity. (NotNull)
     */ 
    public Entity newEntity();

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    /**
     * @return The list of DB name of column. (NotNull and NotEmpty)
     */
    public List<ColumnInfo> getColumnInfoList();

    /**
     * Has column?
     * @param columnFlexibleName The flexible name of the column. (NotNull)
     * @return Determination.
     */
    public boolean hasColumn(String columnFlexibleName);

    /**
     * Find the information of the column by the flexible name of the column.
     * <pre>
     * If the table name is 'BOOK_ID', you can find the dbmeta by ...(as follows)
     *     'BOOK_ID', 'BOok_iD', 'book_id'
     *     , 'BookId', 'bookid', 'bOoKiD'
     * </pre>
     * @param columnFlexibleName The flexible name of the column. (NotNull)
     * @return The information of the column. (NotNull)
     */ 
    public ColumnInfo findColumnInfo(String columnFlexibleName);

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    /**
     * Get primary unique info.
     * 
     * @return Primary unique info. (NotNull)
     */
    public UniqueInfo getPrimaryUniqueInfo();

    /**
     * Has primary-key?
     * 
     * @return Determination.
     */
    public boolean hasPrimaryKey();

    /**
     * Has two or more primary-keys?
     * 
     * @return Determination.
     */
    public boolean hasTwoOrMorePrimaryKeys();

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // -----------------------------------------------------
    //                                      Relation Element
    //                                      ----------------
    /**
     * Find relation info.
     * @param relationPropertyName Relation property name. (Both OK - InitCap or not). (NotNull)
     * @return Relation info. (NotNull)
     */ 
    public RelationInfo findRelationInfo(String relationPropertyName);

    // -----------------------------------------------------
    //                                       Foreign Element
    //                                       ---------------
    /**
     * Has foreign?
     * @param foreignPropName Foreign property name. (Both OK - InitCap or not). (NotNull)
     * @return Determination. (NotNull)
     */ 
    public boolean hasForeign(String foreignPropName);

    /**
     * Find foreign dbmeta.
     * @param foreignPropName Foreign property name. (Both OK - InitCap or not). (NotNull)
     * @return Foreign DBMeta. (NotNull)
     */ 
    public DBMeta findForeignDBMeta(String foreignPropName);

    /**
     * Find foreign info.
     * @param foreignPropName Foreign property name. (Both OK - InitCap or not). (NotNull)
     * @return Foreign info. (NotNull)
     */ 
    public ForeignInfo findForeignInfo(String foreignPropName);

    // -----------------------------------------------------
    //                                      Referrer Element
    //                                      ----------------
    /**
     * Has referrer?
     * @param referrerPropertyName The property name of referrer. (Both OK - InitCap or not). (NotNull)
     * @return Determination. (NotNull)
     */ 
    public boolean hasReferrer(String referrerPropertyName);

    /**
     * Find referrer dbmeta.
     * @param referrerPropertyName The property name of referrer. (Both OK - InitCap or not). (NotNull)
     * @return Referrer DBMeta. (NotNull)
     */ 
    public DBMeta findReferrerDBMeta(String referrerPropertyName);

    /**
     * Find referrer information.
     * @param referrerPropertyName The property name of referrer. (Both OK - InitCap or not). (NotNull)
     * @return Referrer information. (NotNull)
     */ 
    public ReferrerInfo findReferrerInfo(String referrerPropertyName);

    // -----------------------------------------------------
    //                                        Relation Trace
    //                                        --------------
    /**
     * Relation trace.
     */
    public static interface RelationTrace {

        /**
         * Get the trace of relation.
         * @return The trace of relation as the list of relation info. (NotNull)
         */
        public List<RelationInfo> getTraceRelation();

        /**
         * Get the trace of column.
         * @return The trace of column as column info. (Nullable)
         */
        public ColumnInfo getTraceColumn();
    }

    public static interface RelationTraceFixHandler {
        public void handleFixedTrace(RelationTrace relationTrace);
    }


    // ===================================================================================
    //                                                                       Sequence Info
    //                                                                       =============
    /**
     * Has sequence?
     * @return Determination.
     */
    public boolean hasSequence();

    /**
     * Get the SQL string for getting next value of sequence.
     * @return The SQL string for getting next value of sequence. (Nullable: If it does not have sequence, returns null.)
     */
    public String getSequenceNextValSql();

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    /**
     * Has version no?
     * @return Determination.
     */
    public boolean hasVersionNo();

    /**
     * Get the column information of version no.
     * @return The column information of version no. (Nullable: If it doesn't have the column, return null.)
     */
    public ColumnInfo getVersionNoColumnInfo();

    /**
     * Has update date?
     * @return Determination.
     */
    public boolean hasUpdateDate();

    /**
     * Get the column information of update date.
     * @return The column information of update date. (Nullable: If it doesn't have the column, return null.)
     */
    public ColumnInfo getUpdateDateColumnInfo();

    // ===================================================================================
    //                                                                  Common Column Info
    //                                                                  ==================
    /**
     * Has common column?
     * @return Determination.
     */
    public boolean hasCommonColumn();

    // ===================================================================================
    //                                                                     Entity Handling
    //                                                                     ===============
    // -----------------------------------------------------
    //                                                Accept
    //                                                ------
    /**
     * Accept primary-key map.
     * The column that column-value map-string doesn't have the value of is reflected as null.
     * The column that column-value map-string doesn't have the key of is NOT updated nothing.
     * @param entity Target entity. (NotNull)
     * @param primaryKeyMap Primary-key map. (NotNull and NotEmpty)
     */
    public void acceptPrimaryKeyMap(Entity entity, Map<String, ? extends Object> primaryKeyMap);

    /**
     * Accept primary-key map-string.
     * The column that column-value map-string doesn't have the value of is reflected as null.
     * The column that column-value map-string doesn't have the key of is NOT updated nothing.
     * @param entity Target entity. (NotNull)
     * @param primaryKeyMapString Primary-key map-string. (NotNull)
     */
    public void acceptPrimaryKeyMapString(Entity entity, String primaryKeyMapString);

    /**
     * Accept column-value map.
     * The column that column-value map-string doesn't have the value of is reflected as null.
     * The column that column-value map-string doesn't have the key of is NOT updated nothing.
     * @param entity Target entity. (NotNull)
     * @param columnValueMap Column-value map. (NotNull and NotEmpty)
     */
    public void acceptColumnValueMap(Entity entity, Map<String, ? extends Object> columnValueMap);

    /**
     * Accept column-value map-string.
     * The column that column-value map-string doesn't have the value of is reflected as null.
     * The column that column-value map-string doesn't have the key of is NOT updated nothing.
     * @param entity Target entity. (NotNull)
     * @param columnValueMapString Column-value map-string. (NotNull)
     */
    public void acceptColumnValueMapString(Entity entity, String columnValueMapString);

    // -----------------------------------------------------
    //                                               Extract
    //                                               -------
    /**
     * Extract primary-key map-string. Delimiter is at-mark and semicolon.
     * <p>
     * <pre>
     * ex) Uses that this method have.
     *   final String primaryKeyMapString = LdBookDbm.extractPrimaryKeyMapString(entity);
     *   final LdBook entity = dao.selectEntity(new LdBookCB().acceptPrimaryKeyMapString(primaryKeyMapString));
     *   ... // as primary key for condition.
     * </pre>
     * 
     * @param entity Target entity. (NotNull)
     * @return Primary-key map-string. (NotNull)
     */
    public String extractPrimaryKeyMapString(Entity entity);

    /**
     * Extract primary-key map-string.
     * @param entity Target entity. (NotNull)
     * @param startBrace Start-brace. (NotNull)
     * @param endBrace End-brace. (NotNull)
     * @param delimiter Delimiter. (NotNull)
     * @param equal Equal. (NotNull)
     * @return Primary-key map-string. (NotNull)
     */
    public String extractPrimaryKeyMapString(Entity entity, String startBrace, String endBrace, String delimiter, String equal);

    /**
     * Extract column-value map-string. Delimiter is at-mark and semicolon.
     * @param entity Target entity. (NotNull)
     * @return Column-value map-string. (NotNull)
     */
    public String extractColumnValueMapString(Entity entity);

    /**
     * Extract column-value map-string.
     * @param entity Target entity. (NotNull)
     * @param startBrace Start-brace. (NotNull)
     * @param endBrace End-brace. (NotNull)
     * @param delimiter Delimiter. (NotNull)
     * @param equal Equal. (NotNull)
     * @return Column-value map-string. (NotNull)
     */
    public String extractColumnValueMapString(Entity entity, String startBrace, String endBrace, String delimiter, String equal);

    // -----------------------------------------------------
    //                                               Convert
    //                                               -------
    /**
     * Convert entity to column value as list.
     * @param entity Target entity. (NotNull)
     * @return The list of column value. (NotNull)
     */
    public List<Object> convertToColumnValueList(Entity entity);

    /**
     * Convert entity to column value as map.
     * @param entity Target entity. (NotNull)
     * @return The map of column value. (NotNull)
     */
    public Map<String, Object> convertToColumnValueMap(Entity entity);

    /**
     * Convert entity to column string-value as list.
     * @param entity Target entity. (NotNull)
     * @return The list of column string-value. (NotNull)
     */
    public List<String> convertToColumnStringValueList(Entity entity);

    /**
     * Convert entity to column string-value as map.
     * @param entity Target entity. (NotNull)
     * @return The map of column string-value. (NotNull)
     */
    public Map<String, String> convertToColumnStringValueMap(Entity entity);

    // ===================================================================================
    //                                                                          Map String
    //                                                                          ==========
    /**
     * Create map list string that is prepared. (for INTERNAL)
     * @return Map list string that is prepared. (NotNull)
     */
    public MapListString createMapListString();

    /**
     * Create map string builder that is prepared. (for INTERNAL)
     * @return Map string builder that is prepared. (NotNull)
     */
    public MapStringBuilder createMapStringBuilder();
	
	// ===================================================================================
    //                                                               Entity Property Setup
    //                                                               =====================
	// It's very INTERNAL!
	/**
	 * Has the setupper of entity property by the name of property? <br />
	 * Comparing is so flexible. {Ignore cases and underscore}
	 * @param propertyName The name of the property. (NotNull)
	 * @return Determination.
	 */
	 public boolean hasEntityPropertySetupper(String propertyName);
	 
    /**
     * Set up entity property. (for INTERNAL)
	 * @param propertyName The name of the property. (NotNull)
	 * @param entity The entity for the property. (NotNull)
	 * @param value The value of the property. (Nullable)
     */
	public void setupEntityProperty(String propertyName, Object entity, Object value);
	
    /**
     * The setupper of entity property. <br />
	 * This class is for Internal. Don't use this!
	 * @param <ENTITY_TYPE> The type of entity.
     */
    public interface Eps<ENTITY_TYPE extends Entity> {
		
		/**
		 * @param entity Entity. (NotNull)
		 * @param value Value. (Nullable)
		 */
        void setup(ENTITY_TYPE entity, Object value);
    }

	// ===================================================================================
    //                                                                Optimistic Lock Type
    //                                                                ====================
    public static enum OptimisticLockType {
        NONE, VERSION_NO, UPDATE_DATE
    }
}
