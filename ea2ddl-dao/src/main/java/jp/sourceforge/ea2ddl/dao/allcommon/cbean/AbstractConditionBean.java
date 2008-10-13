package jp.sourceforge.ea2ddl.dao.allcommon.cbean;

import java.util.List;
import java.util.Map;
import java.lang.reflect.Method;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ConditionBeanContext;
import jp.sourceforge.ea2ddl.dao.allcommon.helper.MapListString;
import jp.sourceforge.ea2ddl.dao.allcommon.helper.MapListStringImpl;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.OrderByClause;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.WhereClauseSimpleFilter;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.info.ColumnInfo;
import jp.sourceforge.ea2ddl.dao.allcommon.jdbc.StatementConfig;
import jp.sourceforge.ea2ddl.dao.allcommon.util.SimpleStringUtil;
import jp.sourceforge.ea2ddl.dao.allcommon.util.SimpleSystemUtil;

/**
 * The condition-bean as abstract.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractConditionBean implements ConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SQL clause instance. */
    protected final SqlClause _sqlClause;
    {
        _sqlClause = ConditionBeanContext.createSqlClause(this);
    }

    /** Safety max result size. */
    protected int _safetyMaxResultSize;
    
    /** The config of statement. (Nullable) */
    protected StatementConfig _statementConfig;

    // [DBFlute-0.7.4] @jflute -- At the future, I'll implement some check logics by these purpose types.
    protected boolean _forDeriveReferrer;
    protected boolean _forUnion;
    protected boolean _forExistsSubQuery;
    protected boolean _forInScopeSubQuery;

    // ===================================================================================
    //                                                                           SqlClause
    //                                                                           =========
    /**
     * The implementation.
     * @return Sql clause. (NotNull)
     */
    public SqlClause getSqlClause() {
        return _sqlClause;
    }

    // ===================================================================================
    //                                                                 Where Clause Filter
    //                                                                 ===================
    public void addWhereClauseSimpleFilter(WhereClauseSimpleFilter whereClauseSimpleFilter) {
        this._sqlClause.addWhereClauseSimpleFilter(whereClauseSimpleFilter);
    }

    // ===================================================================================
    //                                                                      ConditionQuery
    //                                                                      ==============
    /**
     * Get condition query as interface. At the future, change public to protected.
     * @return Instance of query as interface. (NotNull)
     */
    abstract public ConditionQuery getConditionQueryAsInterface();

    /**
     * The implementation.
     * @return The conditionQuery of the local table as interface. (NotNull)
     */
    public ConditionQuery localCQ() {
        return getConditionQueryAsInterface();
    }

    // ===================================================================================
    //                                                                   Accept PrimaryKey
    //                                                                   =================
    /**
     * The implementation.
     * @param primaryKeyMapString Primary-key map. (NotNull and NotEmpty)
     */
    public void acceptPrimaryKeyMapString(String primaryKeyMapString) {
        if (primaryKeyMapString == null) {
            String msg = "The argument[primaryKeyMapString] must not be null.";
            throw new IllegalArgumentException(msg);
        }
        final String prefix = MAP_STRING_MAP_MARK + MAP_STRING_START_BRACE;
        final String suffix = MAP_STRING_END_BRACE;
        if (!primaryKeyMapString.trim().startsWith(prefix)) {
            primaryKeyMapString = prefix + primaryKeyMapString;
        }
        if (!primaryKeyMapString.trim().endsWith(suffix)) {
            primaryKeyMapString = primaryKeyMapString + suffix;
        }
        MapListString mapListString = new MapListStringImpl();
        mapListString.setMapMark(MAP_STRING_MAP_MARK);
        mapListString.setListMark(MAP_STRING_LIST_MARK);
        mapListString.setDelimiter(MAP_STRING_DELIMITER);
        mapListString.setStartBrace(MAP_STRING_START_BRACE);
        mapListString.setEndBrace(MAP_STRING_END_BRACE);
        mapListString.setEqual(MAP_STRING_EQUAL);
        acceptPrimaryKeyMap(mapListString.generateMap(primaryKeyMapString));
    }

    protected void checkTypeString(Object value, String propertyName, String typeName) {
        if (value == null) {
            throw new IllegalArgumentException("The value should not be null: " + propertyName);
        }
        if (!(value instanceof String)) {
            String msg = "The value of " + propertyName + " should be " + typeName + " or String: ";
            msg = msg + "valueType=" + value.getClass() + " value=" + value;
            throw new IllegalArgumentException(msg);
        }
    }

    protected long parseDateStringAsMillis(Object value, String propertyName, String typeName) {
        checkTypeString(value, propertyName, typeName);
        try {
            final String valueString = (String)value;
            if (valueString.indexOf("-") >= 0 && valueString.indexOf("-") != valueString.lastIndexOf("-")) {
                return java.sql.Timestamp.valueOf(valueString).getTime();
            } else {
                return getParseDateFormat().parse((String)value).getTime();
            }
        } catch (java.text.ParseException e) {
            String msg = "The value of " + propertyName + " should be " + typeName + ". but: " + value;
            throw new RuntimeException(msg + " threw the exception: value=[" + value + "]", e);
        } catch (RuntimeException e) {
            String msg = "The value of " + propertyName + " should be " + typeName + ". but: " + value;
            throw new RuntimeException(msg + " threw the exception: value=[" + value + "]", e);
        }
    }

    private java.text.DateFormat getParseDateFormat() {
        return java.text.DateFormat.getDateTimeInstance();
    }

    // ===================================================================================
    //                                                        Implementation of PagingBean
    //                                                        ============================
    // -----------------------------------------------------
    //                                  Paging Determination
    //                                  --------------------
    // * * * * * * * *
    // For SQL Comment
    // * * * * * * * *
    /**
     * The implementation.
     * @return Determination.
     */
    public boolean isPaging() {
        String msg = "This method is unsupported on ConditionBean!";
        throw new UnsupportedOperationException(msg);
    }

    // * * * * * * * *
    // For Framework
    // * * * * * * * *
    /**
     * The implementation.
     * @return Determination.
     */
    public boolean isCountLater() {
        String msg = "This method is unsupported on ConditionBean!";
        throw new UnsupportedOperationException(msg);
    }

    // -----------------------------------------------------
    //                                        Paging Setting
    //                                        --------------
    /**
     * The implementation.
     * @param pageSize The page size per one page. (NotMinus & NotZero)
     * @param pageNumber The number of page. It's ONE origin. (NotMinus & NotZero: If it's minus or zero, it treats as one.)
     */
    public void paging(int pageSize, int pageNumber) {
        fetchFirst(pageSize);
        fetchPage(pageNumber);
    }
    
    /**
     * The implementation.
     * @param paging Determination.
     */
    public void xsetPaging(boolean paging) {// Very Internal!
        String msg = "This method is unsupported on ConditionBean!";
        throw new UnsupportedOperationException(msg);
    }

    // -----------------------------------------------------
    //                                         Fetch Setting
    //                                         -------------
    /**
     * The implementation.
     * @param fetchSize Fetch-size. (NotMinus & NotZero)
     * @return this. (NotNUll)
     */
    public PagingBean fetchFirst(int fetchSize) {
        getSqlClause().fetchFirst(fetchSize);
        return this;
    }

    /**
     * The implementation.
     * @param fetchStartIndex Fetch-start-index. 0 origin. (NotMinus)
     * @param fetchSize Fetch-size. (NotMinus & NotZero)
     * @return this. (NotNUll)
     */
    public PagingBean fetchScope(int fetchStartIndex, int fetchSize) {
        getSqlClause().fetchScope(fetchStartIndex, fetchSize);
        return this;
    }

    /**
     * The implementation.
     * @param fetchPageNumber Fetch-page-number. 1 origin. (NotMinus & NotZero: If minus or zero, set one.)
     * @return this. (NotNull)
     */
    public PagingBean fetchPage(int fetchPageNumber) {
        getSqlClause().fetchPage(fetchPageNumber);
        return this;
    }

    // -----------------------------------------------------
    //                                        Fetch Property
    //                                        --------------
    /**
     * The implementation.
     * @return Fetch-start-index.
     */
    public int getFetchStartIndex() {
        return getSqlClause().getFetchStartIndex();
    }

    /**
     * The implementation.
     * @return Fetch-size.
     */
    public int getFetchSize() {
        return getSqlClause().getFetchSize();
    }

    /**
     * The implementation.
     * @return Fetch-page-number.
     */
    public int getFetchPageNumber() {
        return getSqlClause().getFetchPageNumber();
    }

    /**
     * The implementation.
     * @return Page start index. 0 origin. (NotMinus)
     */
    public int getPageStartIndex() {
        return getSqlClause().getPageStartIndex();
    }

    /**
     * The implementation.
     * @return Page end index. 0 origin. (NotMinus)
     */
    public int getPageEndIndex() {
        return getSqlClause().getPageEndIndex();
    }

    /**
     * Is fetch scope effective?
     * @return Determiantion.
     */
    public boolean isFetchScopeEffective() {
        return getSqlClause().isFetchScopeEffective();
    }

    // -----------------------------------------------------
    //                                         Hint Property
    //                                         -------------
    /**
     * Get select-hint. {select [select-hint] * from table...}
     * @return select-hint. (NotNull)
     */
    public String getSelectHint() {
        return getSqlClause().getSelectHint();
    }

    /**
     * Get from-base-table-hint. {select * from table [from-base-table-hint] where ...}
     * @return from-base-table-hint. (NotNull)
     */
    public String getFromBaseTableHint() {
        return getSqlClause().getFromBaseTableHint();
    }

    /**
     * Get from-hint. {select * from table left outer join ... on ... [from-hint] where ...}
     * @return from-hint. (NotNull)
     */
    public String getFromHint() {
        return getSqlClause().getFromHint();
    }

    /**
     * Get sql-suffix. {select * from table where ... order by ... [sql-suffix]}
     * @return Sql-suffix.  (NotNull)
     */
    public String getSqlSuffix() {
        return getSqlClause().getSqlSuffix();
    }

    // ===================================================================================
    //                                                Implementation of FetchNarrowingBean
    //                                                ====================================
    /**
     * The implementation.
     * @return Fetch start index.
     */
    public int getFetchNarrowingSkipStartIndex() {
        return getSqlClause().getFetchNarrowingSkipStartIndex();
    }

    /**
     * The implementation.
     * @return Fetch size.
     */
    public int getFetchNarrowingLoopCount() {
        return getSqlClause().getFetchNarrowingLoopCount();
    }

    /**
     * The implementation.
     * @return Determination.
     */
    public boolean isFetchNarrowingSkipStartIndexEffective() {
        return !getSqlClause().isFetchStartIndexSupported();
    }

    /**
     * The implementation.
     * @return Determination.
     */
    public boolean isFetchNarrowingLoopCountEffective() {
        return !getSqlClause().isFetchSizeSupported();
    }

    /**
     * The implementation.
     * @return Determiantion.
     */
    public boolean isFetchNarrowingEffective() {
        return getSqlClause().isFetchNarrowingEffective();
    }

    /**
     * Ignore fetch narrowing. Only checking safety result size is valid. {INTERNAL METHOD}
     */
    public void ignoreFetchNarrowing() {
        String msg = "This method is unsupported on ConditionBean!";
        throw new UnsupportedOperationException(msg);
    }

    /**
     * Restore ignored fetch narrowing. {INTERNAL METHOD}
     */
    public void restoreIgnoredFetchNarrowing() {
        // Do nothing!
    }

    /**
     * Get safety max result size.
     * @return Safety max result size.
     */
    public int getSafetyMaxResultSize() {
        return _safetyMaxResultSize;
    }

    /**
     * Check safety result.
     * @param safetyMaxResultSize Safety max result size. (If zero or minus, ignore checking)
     */
    public void checkSafetyResult(int safetyMaxResultSize) {
        this._safetyMaxResultSize = safetyMaxResultSize;
    }

    // ===================================================================================
    //                                                       Implementation of OrderByBean
    //                                                       =============================
    /**
     * The implementation.
     * @return Sql component of order-by clause. (NotNull)
     */
    public OrderByClause getSqlComponentOfOrderByClause() {
        return getSqlClause().getSqlComponentOfOrderByClause();
    }

    /**
     * The implementation.
     * @return Order-by clause. (NotNull)
     */
    public String getOrderByClause() {
        return _sqlClause.getOrderByClause();
    }

    /**
     * The implementation.
     * @return this. (NotNull)
     */
    public OrderByBean clearOrderBy() {
        getSqlClause().clearOrderBy();
        return this;
    }

    /**
     * The implementation.
     * @return this. (NotNull)
     */
    public OrderByBean ignoreOrderBy() {
        getSqlClause().ignoreOrderBy();
        return this;
    }

    /**
     * The implementation.
     * @return this. (NotNull)
     */
    public OrderByBean makeOrderByEffective() {
        getSqlClause().makeOrderByEffective();
        return this;
    }
	
    // ===================================================================================
    //                                                                        Limit Select
    //                                                                        ============
    /** Is limit-select PK only? */
    protected boolean _isLimitSelectPKOnly;

    /**
     * Is limit-select PK only?
     * @return Determination.
     */
    public boolean isLimitSelect_PKOnly() {
        return _isLimitSelectPKOnly;
    }

    /**
     * Limit select PK only.
     * @return this. (NotNull)
     */
    public ConditionBean limitSelect_PKOnly() {
        _isLimitSelectPKOnly = true;
        return this;
    }

    /**
     * Limit select off.
     * @return this. (NotNull)
     */
    public ConditionBean limitSelect_Off() {
        _isLimitSelectPKOnly = false;
        return this;
    }

    // ===================================================================================
    //                                                                        Lock Setting
    //                                                                        ============
    /**
     * The implementation.
     * @return this. (NotNull)
     */
    public ConditionBean lockForUpdate() {
        getSqlClause().lockForUpdate();
        return this;
    }
    
    // ===================================================================================
    //                                                                        Select Count
    //                                                                        ============
    /**
     * Set up various things for select-count-ignore-fetch-scope. {Internal}
     * This method is for INTERNAL. Don't invoke this!
     * @return this. (NotNull)
     */
    public ConditionBean xsetupSelectCountIgnoreFetchScope() {
        _isSelectCountIgnoreFetchScope = true;

        // If the query uses union query, it needs included-select-column.
        if (!hasUnionQueryOrUnionAllQuery()) {
            getSqlClause().ignoreIncludedSelectColumn();
        }

        getSqlClause().ignoreOrderBy();
        getSqlClause().ignoreFetchScope();
        return this;
    }

    /**
     * Do after-care for select-count-ignore-fetch-scope. {Internal}
     * This method is for INTERNAL. Don't invoke this!
     * @return this. (NotNull)
     */
    public ConditionBean xafterCareSelectCountIgnoreFetchScope() {
        _isSelectCountIgnoreFetchScope = false;

        // If the query uses union query, it needs included-select-column.
        if (!hasUnionQueryOrUnionAllQuery()) {
            getSqlClause().makeIncludedSelectColumnEffective();
        }

        getSqlClause().makeOrderByEffective();
        getSqlClause().makeFetchScopeEffective();
        return this;
    }

    /** Is set up various things for select-count-ignore-fetch-scope? */
    protected boolean _isSelectCountIgnoreFetchScope;

    /**
     * Is set up various things for select-count-ignore-fetch-scope?
     * This method is for INTERNAL. Don't invoke this!
     * @return Determination.
     */
    public boolean isSelectCountIgnoreFetchScope() {
        return _isSelectCountIgnoreFetchScope;
    }
    
    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected static abstract class AbstractSpecification<CQ extends ConditionQuery> {
        protected ConditionBean _baseCB;
        protected SpQyCall<CQ> _qyCall;
        protected CQ _query;
        protected boolean _forDeriveReferrer;
        protected boolean alreadySpecifyRequiredColumn;
        /**
         * @param baseCB The condition-bean of base level. (NotNull)
         * @param qyCall The callback for condition-query. (NotNull)
         * @param forDeriveReferrer Is this for derive referrer?
         */
        protected AbstractSpecification(ConditionBean baseCB, SpQyCall<CQ> qyCall, boolean forDeriveReferrer) {
            _baseCB = baseCB;
            _qyCall = qyCall;
            _forDeriveReferrer = forDeriveReferrer;
        }
        protected void doColumn(String columnName) {
            assertColumn(columnName);
            if (_query == null) { _query = _qyCall.qy(); }
            if (!_forDeriveReferrer && !alreadySpecifyRequiredColumn) {
                alreadySpecifyRequiredColumn = true;
                doSpecifyRequiredColumn();
            }
            String relationPath = _query.getRelationPath() != null ? _query.getRelationPath() : "";
            final String tableAliasName;
            if (_query.isBaseQuery(_query)) {
                tableAliasName = _baseCB.getSqlClause().getLocalTableAliasName();
            } else {
                tableAliasName = _baseCB.getSqlClause().resolveJoinAliasName(relationPath, _query.getNestLevel());
            }
            _baseCB.getSqlClause().specifySelectColumn(tableAliasName, columnName);
        }
        protected void assertColumn(String columnName) {
            if (_query == null && !_qyCall.has()) { throwSpecifyColumnNotSetupSelectColumnException(columnName); }
        }
        protected void assertForeign(String foreignPropertyName) {
            if (_forDeriveReferrer) { throwDeriveReferrerInvalidForeignSpecificationException(foreignPropertyName); }
        }
        protected abstract void doSpecifyRequiredColumn();
        protected abstract String getTableDbName();
        
        protected void throwSpecifyColumnNotSetupSelectColumnException(String columnName) {
            String msg = "Look! Read the message below." + getLineSeparator();
            msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
            msg = msg + "You specified the column that had Not been Set up!" + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Advice]" + getLineSeparator();
            msg = msg + "You should call setupSelect_[ForeignTable]() before calling specify[ForeignTable]().column[TargetColumn]()." + getLineSeparator();
            msg = msg + "  For example:" + getLineSeparator();
            msg = msg + "    " + getLineSeparator();
            msg = msg + "    [Wrong]" + getLineSeparator();
            msg = msg + "    /- - - - - - - - - - - - - - - - - - - - " + getLineSeparator();
            msg = msg + "    MemberCB cb = new MemberCB();" + getLineSeparator();
            msg = msg + "    cb.specify().specifyMemberStatus().columnMemberStatusName(); // *No!" + getLineSeparator();
            msg = msg + "    - - - - - - - - - -/" + getLineSeparator();
            msg = msg + "    " + getLineSeparator();
            msg = msg + "    [Good!]" + getLineSeparator();
            msg = msg + "    /- - - - - - - - - - - - - - - - - - - - " + getLineSeparator();
            msg = msg + "    MemberCB cb = new MemberCB();" + getLineSeparator();
            msg = msg + "    cb.setupSelect_MemberStatus(); // *Point!" + getLineSeparator();
            msg = msg + "    cb.specify().specifyMemberStatus().columnMemberStatusName();" + getLineSeparator();
            msg = msg + "    - - - - - - - - - -/" + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[ConditionBean]" + getLineSeparator() + _baseCB.getClass().getName() + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Specified Column]" + getLineSeparator() + getTableDbName() + "." + columnName + getLineSeparator();
            msg = msg + "* * * * * * * * * */";
            throw new SpecifyColumnNotSetupSelectColumnException(msg);
        }
        protected void throwDeriveReferrerInvalidForeignSpecificationException(String foreignPropertyName) {
            String msg = "Look! Read the message below." + getLineSeparator();
            msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
            msg = msg + "You specified a foreign table column in spite of derive-sub-query!" + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Advice]" + getLineSeparator();
            msg = msg + "You should specified a local table column at condition-bean for derive-sub-query." + getLineSeparator();
            msg = msg + "  For example:" + getLineSeparator();
            msg = msg + "    " + getLineSeparator();
            msg = msg + "    [Wrong]" + getLineSeparator();
            msg = msg + "    /- - - - - - - - - - - - - - - - - - - - " + getLineSeparator();
            msg = msg + "    MemberCB cb = new MemberCB();" + getLineSeparator();
            msg = msg + "    cb.specify().derivePurchaseList().max(new SubQuery<PurchaseCB>() {" + getLineSeparator();
            msg = msg + "        public void query(PurchaseCB subCB) {" + getLineSeparator();
            msg = msg + "            subCB.specify().specifyProduct().columnProductName(); // *No!" + getLineSeparator();
            msg = msg + "        }" + getLineSeparator();
            msg = msg + "    }, \"LATEST_PURCHASE_DATETIME\");" + getLineSeparator();
            msg = msg + "    - - - - - - - - - -/" + getLineSeparator();
            msg = msg + "    " + getLineSeparator();
            msg = msg + "    [Good!]" + getLineSeparator();
            msg = msg + "    /- - - - - - - - - - - - - - - - - - - - " + getLineSeparator();
            msg = msg + "    MemberCB cb = new MemberCB();" + getLineSeparator();
            msg = msg + "    cb.specify().derivePurchaseList().max(new SubQuery<PurchaseCB>() {" + getLineSeparator();
            msg = msg + "        public void query(PurchaseCB subCB) {" + getLineSeparator();
            msg = msg + "            subCB.specify().columnPurchaseDatetime();// *Point!" + getLineSeparator();
            msg = msg + "        }" + getLineSeparator();
            msg = msg + "    }, \"LATEST_PURCHASE_DATETIME\");" + getLineSeparator();
            msg = msg + "    - - - - - - - - - -/" + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Specified Foreign Property]" + getLineSeparator() + foreignPropertyName + getLineSeparator();
            msg = msg + "* * * * * * * * * */";
            throw new DeriveReferrerInvalidForeignSpecificationException(msg);
        }
        protected String getLineSeparator() {
            return SimpleSystemUtil.getLineSeparator();
        }
    }
    
    protected static interface SpQyCall<CQ extends ConditionQuery> {
        public boolean has(); 
        public CQ qy(); 
    }
    
    public static class SpecifyColumnNotSetupSelectColumnException extends RuntimeException {
        private static final long serialVersionUID = 1L;
        public SpecifyColumnNotSetupSelectColumnException(String msg) {
            super(msg);
        }
    }
    
    public static class DeriveReferrerInvalidForeignSpecificationException extends RuntimeException {
        private static final long serialVersionUID = 1L;
        public DeriveReferrerInvalidForeignSpecificationException(String msg) {
            super(msg);
        }
    }

    public static class RAFunction<REFERRER_CB extends ConditionBean, LOCAL_CQ extends ConditionQuery> {
        protected ConditionBean _baseCB;
        protected LOCAL_CQ _localCQ;
        protected RAQSetupper<REFERRER_CB, LOCAL_CQ> _querySetupper;
        public RAFunction(ConditionBean baseCB, LOCAL_CQ localCQ, RAQSetupper<REFERRER_CB, LOCAL_CQ> querySetupper) {
            _baseCB = baseCB;
            _localCQ = localCQ;
            _querySetupper = querySetupper;
        }
        public void max(SubQuery<REFERRER_CB> subQuery, String aliasName) {
            assertAliasName(aliasName);
            _querySetupper.setup("max", subQuery, _localCQ, aliasName.trim());
        }
        public void min(SubQuery<REFERRER_CB> subQuery, String aliasName) {
            assertAliasName(aliasName);
            _querySetupper.setup("min", subQuery, _localCQ, aliasName.trim());
        }
        public void sum(SubQuery<REFERRER_CB> subQuery, String aliasName) {
            assertAliasName(aliasName);
            _querySetupper.setup("sum", subQuery, _localCQ, aliasName.trim());
        }
        public void avg(SubQuery<REFERRER_CB> subQuery, String aliasName) {
            assertAliasName(aliasName);
            _querySetupper.setup("avg", subQuery, _localCQ, aliasName.trim());
        }
        public void count(SubQuery<REFERRER_CB> subQuery, String aliasName) {
            assertAliasName(aliasName);
            _querySetupper.setup("count", subQuery, _localCQ, aliasName.trim());
        }

        protected void assertAliasName(String aliasName) {
            if (aliasName == null || aliasName.trim().length() == 0) {
                throwDeriveReferrerInvalidAliasNameException();
            }
            DBMeta dbmeta = DBMetaInstanceHandler.findDBMeta(_baseCB.getTableDbName());
            Method[] methods = dbmeta.getEntityType().getMethods();
            String targetMethodName = "set" + replaceString(aliasName, "_", "").toLowerCase();
            boolean existsSetterMethod = false;
            for (Method method : methods) {
                if (!method.getName().startsWith("set")) {
                    continue;
                }
                if (targetMethodName.equals(method.getName().toLowerCase())) {
                    existsSetterMethod = true;
                    break;
                }
            }
            if (!existsSetterMethod) {
                throwDeriveReferrerEntityPropertyNotFoundException(aliasName, dbmeta.getEntityType());
            }
        }
        protected void throwDeriveReferrerInvalidAliasNameException() {
            String msg = "Look! Read the message below." + getLineSeparator();
            msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
            msg = msg + "The alias name for derive-referrer was Invalid!" + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Advice]" + getLineSeparator();
            msg = msg + "You should set valid alias name. {NotNull, NotEmpty}" + getLineSeparator();
            msg = msg + "  For example:" + getLineSeparator();
            msg = msg + "    " + getLineSeparator();
            msg = msg + "    [Wrong]" + getLineSeparator();
            msg = msg + "    /- - - - - - - - - - - - - - - - - - - - " + getLineSeparator();
            msg = msg + "    MemberCB cb = new MemberCB();" + getLineSeparator();
            msg = msg + "    cb.specify().derivePurchaseList().max(new SubQuery<PurchaseCB>() {" + getLineSeparator();
            msg = msg + "        public void query(PurchaseCB subCB) {" + getLineSeparator();
            msg = msg + "            subCB.specify().columnPurchaseDatetime();" + getLineSeparator();
            msg = msg + "        }" + getLineSeparator();
            msg = msg + "    }, null); // *No! {null, \"\", \"   \"} are NG!" + getLineSeparator();
            msg = msg + "    - - - - - - - - - -/" + getLineSeparator();
            msg = msg + "    " + getLineSeparator();
            msg = msg + "    [Good!]" + getLineSeparator();
            msg = msg + "    /- - - - - - - - - - - - - - - - - - - - " + getLineSeparator();
            msg = msg + "    MemberCB cb = new MemberCB();" + getLineSeparator();
            msg = msg + "    cb.specify().derivePurchaseList().max(new SubQuery<PurchaseCB>() {" + getLineSeparator();
            msg = msg + "        public void query(PurchaseCB subCB) {" + getLineSeparator();
            msg = msg + "            subCB.specify().columnPurchaseDatetime();" + getLineSeparator();
            msg = msg + "        }" + getLineSeparator();
            msg = msg + "    }, \"LATEST_PURCHASE_DATETIME\"); // *Point!" + getLineSeparator();
            msg = msg + "    - - - - - - - - - -/" + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Local Table]" + getLineSeparator() + _localCQ.getTableDbName() + getLineSeparator();
            msg = msg + "* * * * * * * * * */";
            throw new DeriveReferrerInvalidAliasNameException(msg);
        }
        protected void throwDeriveReferrerEntityPropertyNotFoundException(String aliasName, Class<?> entityType) {
            String msg = "Look! Read the message below." + getLineSeparator();
            msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
            msg = msg + "A property for derive-referrer was Not Found in the entity!" + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Advice]" + getLineSeparator();
            msg = msg + "You should implement a property(setter and getter) in the entity." + getLineSeparator();
            msg = msg + "Or you should confirm whether the alias name has typo or not." + getLineSeparator();
            msg = msg + "  For example:" + getLineSeparator();
            msg = msg + "    " + getLineSeparator();
            msg = msg + "    [ConditionBean Invoking]" + getLineSeparator();
            msg = msg + "    /- - - - - - - - - - - - - - - - - - - - " + getLineSeparator();
            msg = msg + "    MemberCB cb = new MemberCB();" + getLineSeparator();
            msg = msg + "    cb.specify().derivePurchaseList().max(new SubQuery<PurchaseCB>() {" + getLineSeparator();
            msg = msg + "        public void query(PurchaseCB subCB) {" + getLineSeparator();
            msg = msg + "            subCB.specify().columnPurchaseDatetime();" + getLineSeparator();
            msg = msg + "        }" + getLineSeparator();
            msg = msg + "    }, \"LATEST_PURCHASE_DATETIME\");" + getLineSeparator();
            msg = msg + "    - - - - - - - - - -/" + getLineSeparator();
            msg = msg + "    " + getLineSeparator();
            msg = msg + "    [Extended Entity]" + getLineSeparator();
            msg = msg + "    /- - - - - - - - - - - - - - - - - - - - " + getLineSeparator();
            msg = msg + "    // At the entity of Purchase..." + getLineSeparator();
            msg = msg + "    protected Date _latestPurchaseDatetime;" + getLineSeparator();
            msg = msg + "    public Date getLatestPurchaseDatetime() {" + getLineSeparator();
            msg = msg + "        return _latestPurchaseDatetime;" + getLineSeparator();
            msg = msg + "    }" + getLineSeparator();
            msg = msg + "    public void setLatestPurchaseDatetime(Date latestPurchaseDatetime) {" + getLineSeparator();
            msg = msg + "        _latestPurchaseDatetime = latestPurchaseDatetime;" + getLineSeparator();
            msg = msg + "    }" + getLineSeparator();
            msg = msg + "    - - - - - - - - - -/" + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Alias Name]" + getLineSeparator() + aliasName + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Target Entity]" + getLineSeparator() + entityType + getLineSeparator();
            msg = msg + "* * * * * * * * * */";
            throw new DeriveReferrerEntityPropertyNotFoundException(msg);
        }
        protected String replaceString(String text, String fromText, String toText) {
            return SimpleStringUtil.replace(text, fromText, toText);
        }
        protected String getLineSeparator() {
            return SimpleSystemUtil.getLineSeparator();
        }
    }

    public static interface RAQSetupper<REFERRER_CB extends ConditionBean, LOCAL_CQ extends ConditionQuery> {
        public void setup(String function, SubQuery<REFERRER_CB> subQuery, LOCAL_CQ cq, String aliasName);
    }
    
    public static class DeriveReferrerInvalidAliasNameException extends RuntimeException {
        private static final long serialVersionUID = 1L;
        public DeriveReferrerInvalidAliasNameException(String msg) {
            super(msg);
        }
    }
    
    public static class DeriveReferrerEntityPropertyNotFoundException extends RuntimeException {
        private static final long serialVersionUID = 1L;
        public DeriveReferrerEntityPropertyNotFoundException(String msg) {
            super(msg);
        }
    }

    // =====================================================================================
    //                                                                      Statement Config
    //                                                                      ================
    /**
     * @param statementConfig The config of statement. (Nullable)
     */
    public void configure(StatementConfig statementConfig) {
        _statementConfig = statementConfig;
    }
    
    /**
     * @return The config of statement. (Nullable)
     */
    public StatementConfig getStatementConfig() {
        return _statementConfig;
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected void doSetupSelect(SsCall callback) {
        String foreignPropertyName = callback.qf().getForeignPropertyName();
        assertSetupSelectBeforeUnion(foreignPropertyName);
        limitSelect_Off();
        String foreignTableAliasName = callback.qf().getRealAliasName();
        String localRelationPath = localCQ().getRelationPath();
        getSqlClause().registerSelectedSelectColumn(foreignTableAliasName, getTableDbName(), foreignPropertyName, localRelationPath);
        getSqlClause().registerSelectedForeignInfo(callback.qf().getRelationPath(), foreignPropertyName);
    }
    
    protected static interface SsCall {
        public ConditionQuery qf();
    }
    
    // ===================================================================================
    //                                                                       Assert Helper
    //                                                                       =============
    protected void assertPrimaryKeyMap(Map<String, ? extends Object> primaryKeyMap) {
        if (primaryKeyMap == null) {
            String msg = "The argument[primaryKeyMap] must not be null.";
            throw new IllegalArgumentException(msg);
        }
        if (primaryKeyMap.isEmpty()) {
            String msg = "The argument[primaryKeyMap] must not be empty.";
            throw new IllegalArgumentException(msg);
        }
        List<ColumnInfo> columnInfoList = DBMetaInstanceHandler.findDBMeta(getTableDbName()).getPrimaryUniqueInfo().getUniqueColumnList();
        for (ColumnInfo columnInfo : columnInfoList) {
            String columnDbName = columnInfo.getColumnDbName();
            if (!primaryKeyMap.containsKey(columnDbName)) {
                String msg = "The primaryKeyMap must have the value of " + columnDbName;
                throw new IllegalStateException(msg + ": primaryKeyMap --> " + primaryKeyMap);
            }
        }
    }

    protected void assertSetupSelectBeforeUnion(String foreignPropertyName) {
        if (hasUnionQueryOrUnionAllQuery()) {
            throwSetupSelectAfterUnionException(this.getClass().getSimpleName(), foreignPropertyName);
        }
    }
    
    protected void throwSetupSelectAfterUnionException(String className, String foreignPropertyName) {
        String methodName = "setupSelect_" + initCap(foreignPropertyName) + "()";
        String msg = "Look! Read the message below." + getLineSeparator();
        msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
        msg = msg + "You should NOT call " + methodName + " after calling union()!" + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Advice]" + getLineSeparator();
        msg = msg + methodName + " should be called before calling union()." + getLineSeparator();
        msg = msg + "  For example:" + getLineSeparator();
        msg = msg + "    /- - - - - - - - - - - - - - - - - - - - " + getLineSeparator();
        msg = msg + "    " + className + " cb = new " + className + "();" + getLineSeparator();
        msg = msg + "    cb." + methodName + "; // You shuold call here!" + getLineSeparator();
        msg = msg + "    cb.query().setXxx...;" + getLineSeparator();
        msg = msg + "    cb.union(new UnionQuery<" + className + ">() {" + getLineSeparator();
        msg = msg + "        public void query(" + className + " unionCB) {" + getLineSeparator();
        msg = msg + "            unionCB.query().setXxx...;" + getLineSeparator();
        msg = msg + "        }" + getLineSeparator();
        msg = msg + "    });" + getLineSeparator();
        msg = msg + "    // You should not call setupSelect after calling union()!" + getLineSeparator();
        msg = msg + "    // cb." + methodName + ";" + getLineSeparator();
        msg = msg + "    - - - - - - - - - -/" + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[SetupSelect Method]" + getLineSeparator() + methodName + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[ConditionBean SQL]" + getLineSeparator() + toDisplaySql() + getLineSeparator();
        msg = msg + "* * * * * * * * * */" + getLineSeparator();
        throw new IllegalStateException(msg);
    }
    
    // ===================================================================================
    //                                                                      General Helper
    //                                                                      ==============
    protected String initCap(String str) {
        return SimpleStringUtil.initCap(str);
    }
    
    protected String getLineSeparator() {
        return SimpleSystemUtil.getLineSeparator();
    }

    // ===================================================================================
    //                                                                         Display SQL
    //                                                                         ===========
    /**
     * Convert this conditionBean to SQL for display.
     * @return SQL for display. (NotNull and NotEmpty)
     */
    public String toDisplaySql() {
        return ConditionBeanContext.convertConditionBean2DisplaySql(this);
    }
    
    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                        Purpose Type
    //                                                                        ============
    public void xsetupForDeriveReferrer() {
        _forDeriveReferrer = true;
    }

    public void xsetupForUnion() {
        _forUnion = true;
    }

    public void xsetupForExistsSubQuery() {
        _forExistsSubQuery = true;
    }

    public void xsetupForInScopeSubQuery() {
        _forInScopeSubQuery = true;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * The override.
     * @return SQL for display. (NotNull)
     */
    public String toString() {
        try {
            return toDisplaySql();
        } catch (RuntimeException e) {
            return getSqlClause().getClause();
        }
    }
}
