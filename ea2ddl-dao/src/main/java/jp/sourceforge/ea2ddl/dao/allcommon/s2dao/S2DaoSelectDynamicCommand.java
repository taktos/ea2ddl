package jp.sourceforge.ea2ddl.dao.allcommon.s2dao;

import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

import org.seasar.dao.CommandContext;
import org.seasar.extension.jdbc.ResultSetHandler;
import org.seasar.extension.jdbc.StatementFactory;
import org.seasar.extension.jdbc.ValueType;
import org.seasar.extension.jdbc.types.ValueTypes;
import org.seasar.framework.beans.BeanDesc;
import org.seasar.framework.beans.PropertyDesc;
import org.seasar.framework.beans.factory.BeanDescFactory;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ConditionBean;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ConditionBeanContext;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.outsidesql.OutsideSqlContext;
import jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.sqlcommand.InternalAbstractDynamicCommand;
import jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.sqlhandler.InternalBasicSelectHandler;
import jp.sourceforge.ea2ddl.dao.allcommon.util.SimpleStringUtil;
import jp.sourceforge.ea2ddl.dao.allcommon.util.SimpleSystemUtil;

/**
 * SelectDynamicCommand for DBFlute.
 * 
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class S2DaoSelectDynamicCommand extends InternalAbstractDynamicCommand {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The handler of resultSet. */
    protected ResultSetHandler resultSetHandler;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor.
     * @param dataSource Data source.
     * @param statementFactory The factory of statement.
     * @param resultSetHandler The handler of resultSet.
     */
    public S2DaoSelectDynamicCommand(DataSource dataSource,
            StatementFactory statementFactory,
            ResultSetHandler resultSetHandler) {
        super(dataSource, statementFactory);
        this.resultSetHandler = resultSetHandler;
    }

    // ===================================================================================
    //                                                            Very Important Extension
    //                                                            ========================
    // -----------------------------------------------------
    //                         SelectDynamicCommand Creation
    //                         -----------------------------
    protected S2DaoSelectDynamicCommand createMySelectDynamicCommand() {
        return new S2DaoSelectDynamicCommand(getDataSource(), getStatementFactory(), resultSetHandler);
    }

    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    // -----------------------------------------------------
    //                                           Top Execute
    //                                           -----------
    /**
     * @param args The array of argument. (Nullable)
     * @return The object of execution result. (Nullable)
     */
    public Object execute(Object[] args) {
        // - - - - - - - - - - - -
        // This is top execution.
        // - - - - - - - - - - - -

        if (!ConditionBeanContext.isExistConditionBeanOnThread()) {
            // - - - - - - - - - -
            // Execute outsideSql.
            // - - - - - - - - - -
            if (OutsideSqlContext.isExistOutsideSqlContextOnThread()) {
                final OutsideSqlContext outsideSqlContext = OutsideSqlContext.getOutsideSqlContextOnThread();
                if (outsideSqlContext.isDynamicBinding()) {
                    return executeOutsideSqlAsDynamic(args, outsideSqlContext);
                } else {
                    return executeOutsideSqlAsStatic(args, outsideSqlContext);
                }
            }

            // - - - - - - - - -
            // Execute default.
            // - - - - - - - - -
            return executeDefault(args);
        }

        // - - - - - - - - - - - -
        // Execute conditionBean.
        // - - - - - - - - - - - -
        final List<Object> bindVariableList = new ArrayList<Object>(4);
        final List<Class> bindVariableTypeList = new ArrayList<Class>(4);

        final ConditionBean cb = ConditionBeanContext.getConditionBeanOnThread();
        final String finalClause;
        if (cb.hasUnionQueryOrUnionAllQuery()) {
            final String realClause = setupRealClause(args, bindVariableList, bindVariableTypeList);
            if (cb.isSelectCountIgnoreFetchScope()) {
                // If the query uses union and it selects count, the way of select-count is as follows.
                finalClause = "select count(*) from (" + realClause + ") dfmain";
            } else {
                finalClause = realClause;
            }
        } else {
            if (cb.isSelectCountIgnoreFetchScope()) {
                finalClause = setupRealSelectCountClause(args, bindVariableList, bindVariableTypeList);
            } else {
                finalClause = setupRealClause(args, bindVariableList, bindVariableTypeList);
            }
        }

        final InternalBasicSelectHandler selectHandler = createBasicSelectHandler(finalClause, this.resultSetHandler);
        final Object[] bindVariableArray = bindVariableList.toArray();
        selectHandler.setLoggingMessageSqlArgs(bindVariableArray);
        return selectHandler.execute(bindVariableArray, toClassArray(bindVariableTypeList));
    }

    // -----------------------------------------------------
    //                                       Default Execute
    //                                       ---------------
    /**
     * Execute default.
     * @param args The array of argument. (Nullable)
     * @return Result. (Nullable)
     */
    protected Object executeDefault(Object args[]) {
        // - - - - - - - - - - - - - - - - -
        // Find specified resultSetHandler.
        // - - - - - - - - - - - - - - - - -
        final ResultSetHandler specifiedResultSetHandler = findSpecifiedResultSetHandler(args);

        // - - - - - - - - -
        // Filter arguments.
        // - - - - - - - - -
        final Object[] filteredArgs = filterArgumentsForResultSetHandler(args);

        final org.seasar.dao.CommandContext ctx = apply(filteredArgs);
        final InternalBasicSelectHandler selectHandler = createBasicSelectHandler(ctx.getSql(), specifiedResultSetHandler);
        final Object[] bindVariableArray = ctx.getBindVariables();
        selectHandler.setLoggingMessageSqlArgs(bindVariableArray);
        return selectHandler.execute(bindVariableArray, ctx.getBindVariableTypes());
    }

    // -----------------------------------------------------
    //                                    OutsideSql Execute
    //                                    ------------------
    /**
     * Execute outsideSql as static.
     * 
     * @param args The array of argument. (Nullable)
     * @param outsideSqlContext The context of outsideSql. (NotNull)
     * @return Result. (Nullable)
     */
    protected Object executeOutsideSqlAsStatic(Object[] args, OutsideSqlContext outsideSqlContext) {
        // - - - - - - - - - - - - - - - - -
        // Find specified resultSetHandler.
        // - - - - - - - - - - - - - - - - -
        final ResultSetHandler specifiedResultSetHandler = findSpecifiedResultSetHandler(args);

        // - - - - - - - - -
        // Filter arguments.
        // - - - - - - - - -
        final Object[] filteredArgs;
        if (outsideSqlContext.isSpecifiedOutsideSql()) {
            final Object parameterBean = outsideSqlContext.getParameterBean();
            filteredArgs = new Object[] {parameterBean};
        } else {
            filteredArgs = filterArgumentsForResultSetHandler(args);
        }

        final org.seasar.dao.CommandContext ctx = apply(filteredArgs);
        final InternalBasicSelectHandler selectHandler = createBasicSelectHandler(ctx.getSql(), specifiedResultSetHandler);
        final Object[] bindVariableArray = ctx.getBindVariables();
        selectHandler.setLoggingMessageSqlArgs(bindVariableArray);
        return selectHandler.execute(bindVariableArray, ctx.getBindVariableTypes());
    }

    /**
     * Execute outsideSql as Dynamic.
     * 
     * @param args The array of argument. (Nullable)
     * @param outsideSqlContext The context of outsideSql. (NotNull)
     * @return Result. (Nullable)
     */
    protected Object executeOutsideSqlAsDynamic(Object[] args, OutsideSqlContext outsideSqlContext) {
        final Object firstArg;
        if (outsideSqlContext.isSpecifiedOutsideSql()) {
            final Object parameterBean = outsideSqlContext.getParameterBean();
            firstArg = parameterBean;
        } else {
            firstArg = args[0];
        }
        String filteredSql = getSql();
        if (firstArg != null) {
            final BeanDesc beanDesc = BeanDescFactory.getBeanDesc(firstArg.getClass());

            // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
            // Resolve embedded comment for parsing bind variable comment in embedded comment.
            // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
            for (int i = 0; i < beanDesc.getPropertyDescSize(); i++) {
                final PropertyDesc propertyDesc = beanDesc.getPropertyDesc(i);
                final Class propertyType = propertyDesc.getPropertyType();
                if (!propertyType.equals(String.class)) {
                    continue;
                }
                final String outsideSqlPiece = (String) propertyDesc.getValue(firstArg);
                if (outsideSqlPiece == null) {
                    continue;
                }
                final String embeddedComment = "/*$pmb." + propertyDesc.getPropertyName() + "*/";
                filteredSql = replaceString(filteredSql, embeddedComment, outsideSqlPiece);
            }
        }
        final S2DaoSelectDynamicCommand outsideSqlCommand = createMySelectDynamicCommand();
        if (outsideSqlContext.isSpecifiedOutsideSql()) {
            outsideSqlCommand.setArgNames(new String[]{"pmb"});
            outsideSqlCommand.setArgTypes(new Class<?>[]{firstArg != null ? firstArg.getClass() : Object.class});
        } else {
            outsideSqlCommand.setArgNames(getArgNames());
            outsideSqlCommand.setArgTypes(getArgTypes());
        }
        outsideSqlCommand.setSql(filteredSql);

        // - - - - - - - - - - - - - - - - -
        // Find specified resultSetHandler.
        // - - - - - - - - - - - - - - - - -
        final ResultSetHandler specifiedResultSetHandler = findSpecifiedResultSetHandler(args);

        // - - - - - - - - -
        // Filter arguments.
        // - - - - - - - - -
        final Object[] filteredArgs;
        if (outsideSqlContext.isSpecifiedOutsideSql()) {
            final Object parameterBean = outsideSqlContext.getParameterBean();
            filteredArgs = new Object[] {parameterBean};
        } else {
            filteredArgs = filterArgumentsForResultSetHandler(args);
        }

        final org.seasar.dao.CommandContext ctx = outsideSqlCommand.apply(filteredArgs);
        final java.util.List<Object> bindVariableList = new java.util.ArrayList<Object>();
        final java.util.List<Class> bindVariableTypeList = new java.util.ArrayList<Class>();
        addBindVariableInfo(ctx, bindVariableList, bindVariableTypeList);
        final InternalBasicSelectHandler selectHandler = createBasicSelectHandler(ctx.getSql(), specifiedResultSetHandler);
        final Object[] bindVariableArray = bindVariableList.toArray();
        selectHandler.setLoggingMessageSqlArgs(bindVariableArray);
        return selectHandler.execute(bindVariableArray, toClassArray(bindVariableTypeList));
    }

    protected Object[] filterArgumentsForResultSetHandler(Object[] args) {
        if (args == null || args.length == 0) {
            return args;
        }
        final Object[] filteredArgs;
        if (args[args.length - 1] instanceof jp.sourceforge.ea2ddl.dao.allcommon.jdbc.CursorHandler) {
            filteredArgs = new Object[args.length - 1];
            for (int i=0; i < args.length - 1; i++) {
                filteredArgs[i] = args[i];
            }
        } else {
            filteredArgs = args;
        }
        return filteredArgs;
    }

    protected ResultSetHandler findSpecifiedResultSetHandler(Object[] args) {
        if (args == null || args.length == 0) {
            return this.resultSetHandler;
        }
        if (args[args.length-1] instanceof jp.sourceforge.ea2ddl.dao.allcommon.jdbc.CursorHandler) {
            final jp.sourceforge.ea2ddl.dao.allcommon.jdbc.CursorHandler cursorHandler = (jp.sourceforge.ea2ddl.dao.allcommon.jdbc.CursorHandler)args[args.length-1];
            return new ResultSetHandler() { public Object handle(java.sql.ResultSet rs) throws java.sql.SQLException { return cursorHandler.handle(rs); } };
        }
        if (getArgTypes().length+1 == args.length && args[args.length-1] == null) {
            String msg = "System Level Exception!" + getLineSeparator();
            msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
            msg = msg + "The size of arg types have not been same as the size of arg objects:";
            msg = msg + " argTypes=" + getArgTypes().length + " args=" + args.length + getLineSeparator();
            msg = msg + "If the arguments contain ResultSetHandler, the argument value should not be null!" + getLineSeparator();
            for (int i=0; i < args.length - 1; i++) {
                msg = msg + "  args[" + i + "] -- " + args[i] + getLineSeparator();
            }
            msg = msg + "* * * * * * * * * */" + getLineSeparator();
            throw new IllegalStateException(msg);
        }
        return this.resultSetHandler;
    }

    // -----------------------------------------------------
    //                                          Setup Clause
    //                                          ------------
    protected String setupRealClause(Object[] args, List<Object> bindVariableList, List<Class> bindVariableTypeList) {
        final ConditionBean cb = ConditionBeanContext.getConditionBeanOnThread();
        final String realClause;
        {
            final S2DaoSelectDynamicCommand dynamicCommand = createMySelectDynamicCommand();
            dynamicCommand.setArgNames(getArgNames());
            dynamicCommand.setArgTypes(getArgTypes());
            if (cb.isLimitSelect_PKOnly()) {
                dynamicCommand.setSql(cb.getSqlClause().getClausePKOnly());
            } else {
                dynamicCommand.setSql(cb.getSqlClause().getClause());
            }
            final CommandContext ctx = dynamicCommand.apply(args);
            realClause = ctx.getSql();
            addBindVariableInfo(ctx, bindVariableList, bindVariableTypeList);
        }
        return realClause;
    }
    
    protected String setupRealSelectCountClause(Object[] args, List<Object> bindVariableList, List<Class> bindVariableTypeList) {
        final ConditionBean cb = ConditionBeanContext.getConditionBeanOnThread();
        final String realSelectCountClause;
        {
            final S2DaoSelectDynamicCommand selectCountCommand = createMySelectDynamicCommand();
            selectCountCommand.setArgNames(getArgNames());
            selectCountCommand.setArgTypes(getArgTypes());
            final String selectClause = "select count(*)";
            String fromWhereClause = cb.getSqlClause().getClauseFromWhereWithUnionTemplate();
            
            // Replace template marks. These are very important!
            fromWhereClause = replaceString(fromWhereClause, cb.getSqlClause().getUnionSelectClauseMark(), selectClause);
            fromWhereClause = replaceString(fromWhereClause, cb.getSqlClause().getUnionWhereClauseMark(), "");
            fromWhereClause = replaceString(fromWhereClause, cb.getSqlClause().getUnionWhereFirstConditionMark(), "");

            final String sql = cb.getSqlClause().filterSubQueryIndent(selectClause + " " + fromWhereClause);
            selectCountCommand.setSql(sql);

            final CommandContext ctx = selectCountCommand.apply(args);
            realSelectCountClause = ctx.getSql();
            addBindVariableInfo(ctx, bindVariableList, bindVariableTypeList);
        }
        return realSelectCountClause;
    }

    protected InternalBasicSelectHandler createBasicSelectHandler(String realSql, ResultSetHandler specifiedResultSetHandler) {
        return newBasicSelectHandler(realSql, specifiedResultSetHandler, getStatementFactory());
    }

    protected InternalBasicSelectHandler newBasicSelectHandler(String sql, ResultSetHandler resultSetHandler, StatementFactory statementFactory) {
        return new InternalBasicSelectHandler(getDataSource(), sql, resultSetHandler, statementFactory) {
            @Override
            protected void bindArgs(java.sql.PreparedStatement ps, Object[] args, Class[] argTypes) {
                if (args == null) {
                    return;
                }
                for (int i = 0; i < args.length; ++i) {
                    final ValueType valueType = findValueType(argTypes[i], args[i]);
                    try {
                        valueType.bindValue(ps, i + 1, args[i]);
                    } catch (java.sql.SQLException e) {
                        handleSQLException(e, ps);
                    }
                }
            }
            protected ValueType findValueType(Class argType, Object arg) {
                ValueType valueType = ValueTypes.getValueType(arg);
                if (valueType != null) {
                    return valueType;
                }
                valueType = ValueTypes.getValueType(argType);
                if (valueType != null) {
                    return valueType;
                }
                String msg = "Unknown type：argType=" + argType + " args=" + arg;
                throw new IllegalStateException(msg);
            }
        };
    }

    // -----------------------------------------------------
    //                                          Setup Helper
    //                                          ------------
    protected Class[] toClassArray(List<Class> bindVariableTypeList) {
        final Class[] bindVariableTypesArray = new Class[bindVariableTypeList.size()];
        for (int i = 0; i < bindVariableTypeList.size(); i++) {
            final Class bindVariableType = (Class) bindVariableTypeList.get(i);
            bindVariableTypesArray[i] = bindVariableType;
        }
        return bindVariableTypesArray;
    }

    protected void addBindVariableInfo(CommandContext ctx, List<Object> bindVariableList, List<Class> bindVariableTypeList) {
        final Object[] bindVariables = ctx.getBindVariables();
        addBindVariableList(bindVariableList, bindVariables);
        final Class[] bindVariableTypes = ctx.getBindVariableTypes();
        addBindVariableTypeList(bindVariableTypeList, bindVariableTypes);
    }

    protected void addBindVariableList(List<Object> bindVariableList, Object[] bindVariables) {
        for (int i=0; i < bindVariables.length; i++) {
            bindVariableList.add(bindVariables[i]);
        }
    }

    protected void addBindVariableTypeList(List<Class> bindVariableTypeList, Class[] bindVariableTypes) {
        for (int i=0; i < bindVariableTypes.length; i++) {
            bindVariableTypeList.add(bindVariableTypes[i]);
        }
    }

    // ===================================================================================
    //                                                                      General Helper
    //                                                                      ==============
    protected final String replaceString(String text, String fromText, String toText) {
        return SimpleStringUtil.replace(text, fromText, toText);
    }

    protected String getLineSeparator() {
        return SimpleSystemUtil.getLineSeparator();
    }
}