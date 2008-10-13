package jp.sourceforge.ea2ddl.dao.allcommon.s2dao;

import java.util.Arrays;
import java.util.List;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import org.aopalliance.intercept.MethodInvocation;
import org.seasar.framework.beans.MethodNotFoundRuntimeException;
import org.seasar.dao.DaoMetaData;
import org.seasar.dao.DaoMetaDataFactory;
import org.seasar.dao.SqlCommand;
import org.seasar.dao.NotSingleRowUpdatedRuntimeException;

import jp.sourceforge.ea2ddl.dao.allcommon.XLog;
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.InternalMapContext;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ConditionBean;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ConditionBeanContext;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.FetchNarrowingBeanContext;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.FetchNarrowingBean;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.outsidesql.OutsideSqlContext;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.outsidesql.OutsideSqlDao;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.outsidesql.OutsideSqlOption;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;
import jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyUpdatedException;
import jp.sourceforge.ea2ddl.dao.allcommon.helper.stacktrace.InvokeNameExtractingResource;
import jp.sourceforge.ea2ddl.dao.allcommon.helper.stacktrace.InvokeNameResult;
import jp.sourceforge.ea2ddl.dao.allcommon.helper.stacktrace.impl.InvokeNameExtractorImpl;
import jp.sourceforge.ea2ddl.dao.allcommon.util.TraceViewUtil;

/**
 * The interceptor of S2Dao for DBFlute.
 * @author DBFlute(AutoGenerator)
 */
public class S2DaoInterceptor extends org.seasar.framework.aop.interceptors.AbstractInterceptor {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** Log instance. */
    private static final org.apache.commons.logging.Log _log = org.apache.commons.logging.LogFactory.getLog(S2DaoInterceptor.class);

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The factory of DAO meta data. */
    protected DaoMetaDataFactory _daoMetaDataFactory;
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor.
     * @param daoMetaDataFactory The factory of DAO meta data. (NotNull)
     */
    public S2DaoInterceptor(DaoMetaDataFactory daoMetaDataFactory) {
        _daoMetaDataFactory = daoMetaDataFactory;
    }

    // ===================================================================================
    //                                                                  Execute Status Log
    //                                                                  ==================
    protected void log(String msg) {
        XLog.log(msg);
    }
    
    protected boolean isLogEnabled() {
        return XLog.isLogEnabled();
    }
    
    // ===================================================================================
    //                                                                              Invoke
    //                                                                              ======
    /**
     * Invoke the method.
     * @param invocation The method invocation. (NotNull)
     * @return The result of the method. (Nullable)
     * @throws Throwable
     */
    public Object invoke(MethodInvocation invocation) throws Throwable {
        clearThreadLocal();
        try {
            return dispatchInvoking(invocation);
        } finally {
            clearThreadLocal();
        }
    }

    /**
     * Dispatch invoking the method.
     * @param invocation The method invocation. (NotNull)
     * @return The result of the method. (Nullable)
     * @throws Throwable
     */
    protected Object dispatchInvoking(MethodInvocation invocation) throws Throwable {
        final Method method = invocation.getMethod();
        if (!isAbstract(method)) {
            return invocation.proceed();
        }

        // - - - - - - - - - - - - -
        // Initialize DAO meta data
        // - - - - - - - - - - - - -
        if (method.getName().equals("initializeDaoMetaData")) {
            initializeSqlCommand(invocation);
            return null;// The end! (Initilization Only)
        }

        // - - - - - - - - - - - -
        // Preprocess outside-SQL
        // - - - - - - - - - - - -
        preprocessOutsideSql(invocation);

        // - - - - - - - - - - - - -
        // Preprocess condition-bean
        // - - - - - - - - - - - - -
        final ConditionBean cb = preprocessConditionBean(invocation);

        // - - - - - - - - - -
        // Set up SQL-command
        // - - - - - - - - - -
        final SqlCommand cmd;
        try {
            long beforeCmd = 0;
            if (isLogEnabled()) {
                beforeCmd = System.currentTimeMillis();
            }
            cmd = findSqlCommand(invocation);
            if (isLogEnabled()) {
                final long afterCmd = System.currentTimeMillis();
                if (beforeCmd != afterCmd) {
                    logSqlCommand(invocation, cmd, beforeCmd, afterCmd);
                }
            }
        } finally {
            if (isLogEnabled()) {
                logInvocation(invocation);
            }
        }

        long before = 0;
        if (isLogEnabled()) {
            before = System.currentTimeMillis();
        }

        // - - - - - - - - - -
        // Execute SQL-command
        // - - - - - - - - - -
        Object ret = null;
        try {
            ret = cmd.execute(invocation.getArguments());
        } catch (Exception e) {
            if (e.getClass().equals(NotSingleRowUpdatedRuntimeException.class)) {
                throw new EntityAlreadyUpdatedException((NotSingleRowUpdatedRuntimeException)e);
            }
            throw e;
        } finally {
            postprocessConditionBean(invocation, cb);
        }
        final Class<?> retType = method.getReturnType();
        assertRetType(retType, ret);

        if (isLogEnabled()) {
            final long after = System.currentTimeMillis();
            logReturn(invocation, retType, ret, before, after);
        }

        // - - - - - - - - - -
        // Convert and Return!
        // - - - - - - - - - -
        if (retType.isPrimitive()) {
            return org.seasar.framework.util.NumberConversionUtil.convertPrimitiveWrapper(retType, ret);
        } else if (Number.class.isAssignableFrom(retType)) {
            return org.seasar.framework.util.NumberConversionUtil.convertNumber(retType, ret);
        } else {
            return ret;
        }
    }

    // ===================================================================================
    //                                                                          SqlCommand
    //                                                                          ==========
    protected void initializeSqlCommand(MethodInvocation invocation) {
        final Class<?> targetType = getTargetClass(invocation);
        final DaoMetaData dmd = _daoMetaDataFactory.getDaoMetaData(targetType);
        if (OutsideSqlDao.class.isAssignableFrom(targetType)) {
            return;// Do nothing!
        } else {
            final Object[] arguments = invocation.getArguments();
            if (arguments != null && arguments.length > 0 && arguments[0] instanceof String) {
                final String methodName = (String)arguments[0];
                try {
                    dmd.getSqlCommand(methodName);
                } catch (MethodNotFoundRuntimeException ignored) {
                    // Do nothing!
                    if (isLogEnabled()) {
                        log("Not Found the method: " + methodName + " msg=" + ignored.getMessage());
                    }
                }
                return;
            } else {
                String msg = "The method should have one string argument as method name: " + invocation;
                throw new IllegalStateException(msg);
            }
        }
    }
    
    protected SqlCommand findSqlCommand(MethodInvocation invocation) {
        final SqlCommand cmd;
        final Class<?> targetType = getTargetClass(invocation);
        final DaoMetaData dmd = _daoMetaDataFactory.getDaoMetaData(targetType);
        if (OutsideSqlDao.class.isAssignableFrom(targetType)) {
            cmd = dmd.getSqlCommand(generateSpecifiedOutsideSqlUniqueKey(invocation));
        } else {
            cmd = dmd.getSqlCommand(invocation.getMethod().getName());
        }
        return cmd;
    }

    protected String generateSpecifiedOutsideSqlUniqueKey(MethodInvocation invocation) {
        final Object[] args = invocation.getArguments();
        final String path = (String)args[0];
        final Object pmb = args[1];
        final OutsideSqlOption option = (OutsideSqlOption)args[2];
        Object resultTypeSpecification = null;
        if (args.length > 3) {
            resultTypeSpecification = args[3];
        }
        return OutsideSqlContext.generateSpecifiedOutsideSqlUniqueKey(invocation.getMethod().getName(), path, pmb, option, resultTypeSpecification);
    }

    // ===================================================================================
    //                                                                      Log Invocation
    //                                                                      ==============
    protected void logInvocation(MethodInvocation invocation) {
        final StackTraceElement[] stackTrace = new Exception().getStackTrace();
        final InvokeNameResult behaviorResult = extractBehaviorInvokeName(stackTrace);

        final String invokeClassName;
        final String invokeMethodName;
        if (!behaviorResult.isEmptyResult()) {
            invokeClassName = behaviorResult.getSimpleClassName();
            invokeMethodName = behaviorResult.getMethodName();
        } else {
            final Method method = invocation.getMethod();
            invokeClassName = extractInvocationExpression(method);
            invokeMethodName = method.getName();
        }
        final String expWithoutKakko = buildInvocationExpressionWithoutKakko(invocation, invokeClassName, invokeMethodName);

        // Save behavior invoke name for error message.
        putObjectToMapContext("df:BehaviorInvokeName", expWithoutKakko + "()");

        final String equalBorder = buildFitBorder("", "=", expWithoutKakko, false);
        final String invocationExpression = expWithoutKakko + "()";

        log("/=====================================================" + equalBorder + "==");
        log("                                                      " + invocationExpression);
        log("                                                      " + equalBorder + "=/");

        logPath(invocation, stackTrace, behaviorResult);

        // Specified OutsideSql
        if (isSpecifiedOutsideSql(invocation)) {
		    final OutsideSqlContext outsideSqlContext = getOutsideSqlContext();
            if (!outsideSqlContext.isProcedure()) {// [DBFlute-0.7.5]
                Object[] args = invocation.getArguments();
                if (outsideSqlContext != null) {
				    log("path: " + outsideSqlContext.getOutsideSqlPath());
                } else {
                    log("path: " + getOutsideSqlPath(args));
			    }
                log("option: " + getOutsideSqlOption(args));
            }
        }
    }

    protected String buildInvocationExpressionWithoutKakko(MethodInvocation invocation, String invokeClassName, String invokeMethodName) {
        if (invokeClassName.contains("OutsideSql") && invokeClassName.endsWith("Executor")) { // OutsideSql Executor Handling
            try {
                final String originalName = invokeClassName;
                if (isSpecifiedOutsideSql()) {
                    final OutsideSqlContext outsideSqlContext = getOutsideSqlContext();
                    final String tableDbName = outsideSqlContext.getTableDbName();
                    final DBMeta dbmeta = DBMetaInstanceHandler.findDBMeta(tableDbName);
                    final String behaviorTypeName = dbmeta.getBehaviorTypeName();
                    final String behaviorClassName = behaviorTypeName.substring(behaviorTypeName.lastIndexOf(".") + ".".length());
                    invokeClassName = behaviorClassName + ".outsideSql()";
                    if (originalName.endsWith("OutsideSqlEntityExecutor")) {
                        invokeClassName = invokeClassName + ".entityHandling()";
                    } else if (originalName.endsWith("OutsideSqlPagingExecutor")) {
                        if (outsideSqlContext.isOffsetByCursorForcedly() || outsideSqlContext.isLimitByCursorForcedly()) {
                            invokeClassName = invokeClassName + ".autoPaging()";
                        } else {
                            invokeClassName = invokeClassName + ".manualPaging()";
                        }
                    } else if (originalName.endsWith("OutsideSqlCursorExecutor")) {
                        invokeClassName = invokeClassName + ".cursorHandling()";
                    }
                } else {
                    invokeClassName = "OutsideSql";
                }
            } catch (RuntimeException ignored) {
                log("Ignored exception occurred: msg=" + ignored.getMessage());
            }
        }
        String invocationExpressionWithoutKakko = invokeClassName  + "." + invokeMethodName;
        if ("selectPage".equals(invokeMethodName)) { // Special Handling!
            boolean resultTypeInteger = false;
            if (isSpecifiedOutsideSql()) {
                final OutsideSqlContext outsideSqlContext = getOutsideSqlContext();
                final Object resultTypeSpecification = outsideSqlContext.getResultTypeSpecification();
                if (resultTypeSpecification != null && resultTypeSpecification instanceof Class<?>) {
                    final Class<?> resultType = (Class<?>)resultTypeSpecification;
                    if (Integer.class.isAssignableFrom(resultType)) {
                        resultTypeInteger = true;
                    }
                }
            }
            if (resultTypeInteger || "selectCount".equals(invocation.getMethod().getName())) {
                invocationExpressionWithoutKakko = invocationExpressionWithoutKakko + "():count";
            } else {
                invocationExpressionWithoutKakko = invocationExpressionWithoutKakko + "():paging";
            }
        }
        return invocationExpressionWithoutKakko;
    }

    protected void logPath(MethodInvocation invocation, StackTraceElement[] stackTrace, InvokeNameResult behaviorResult) {
        final int bhvNextIndex = behaviorResult.getNextStartIndex();
        final InvokeNameResult clientResult = extractClientInvokeName(stackTrace, bhvNextIndex);
        final int clientFirstIndex = clientResult.getFoundFirstIndex();
        final InvokeNameResult byPassResult = extractByPassInvokeName(stackTrace, bhvNextIndex, clientFirstIndex - bhvNextIndex);

        final String clientInvokeName = clientResult.getInvokeName();
        final String byPassInvokeName = byPassResult.getInvokeName();
        final String behaviorInvokeName = behaviorResult.getInvokeName();
        if (clientInvokeName.trim().length() == 0 && byPassInvokeName.trim().length() == 0) {
            return;
        }
        
        // Save client invoke name for error message.
        if (!clientResult.isEmptyResult()) {
            putObjectToMapContext("df:ClientInvokeName", clientInvokeName);
        }
        // Save by-pass invoke name for error message.
        if (!byPassResult.isEmptyResult()) {
            putObjectToMapContext("df:ByPassInvokeName", byPassInvokeName);
        }
        
        log(clientInvokeName + byPassInvokeName + behaviorInvokeName + "...");
    }

    protected String buildFitBorder(String prefix, String element, String lengthTargetString, boolean space) {
        final int length = space ? lengthTargetString.length() / 2 : lengthTargetString.length();
        final StringBuffer sb = new StringBuffer();
        sb.append(prefix);
        for (int i = 0; i < length; i++) {
            sb.append(element);
            if (space) {
                sb.append(" ");
            }
        }
        if (space) {
            sb.append(element);
        }
        return sb.toString();
    }

    protected InvokeNameResult extractClientInvokeName(StackTraceElement[] stackTrace, final int startIndex) {
        final List<String> suffixList = Arrays.asList(new String[]{"Page", "Action"});
        final InvokeNameExtractingResource resource = new InvokeNameExtractingResource() {
            public boolean isTargetElement(String className, String methodName) {
                return isClassNameEndsWith(className, suffixList);
            }
            public String filterSimpleClassName(String simpleClassName) {
                return simpleClassName;
            }
            public boolean isUseAdditionalInfo() {
                return true;
            }
            public int getStartIndex() {
                return startIndex;
            }
            public int getLoopSize() {
                return 25;
            }
        };
        return extractInvokeName(resource, stackTrace);
    }

    protected InvokeNameResult extractByPassInvokeName(StackTraceElement[] stackTrace, final int startIndex, final int loopSize) {
        final List<String> suffixList = Arrays.asList(new String[]{"Service", "ServiceImpl", "Facade", "FacadeImpl"});
        final InvokeNameExtractingResource resource = new InvokeNameExtractingResource() {
            public boolean isTargetElement(String className, String methodName) {
                return isClassNameEndsWith(className, suffixList);
            }
            public String filterSimpleClassName(String simpleClassName) {
                return simpleClassName;
            }
            public boolean isUseAdditionalInfo() {
                return true;
            }
            public int getStartIndex() {
                return startIndex;
            }
            public int getLoopSize() {
                return loopSize >= 0 ? loopSize : 25;
            }
        };
        return extractInvokeName(resource, stackTrace);
    }

    protected InvokeNameResult extractBehaviorInvokeName(StackTraceElement[] stackTrace) {
        final List<String> suffixList = Arrays.asList(new String[]{"Bhv", "BehaviorReadable", "BehaviorWritable" , "PagingInvoker"});
        final List<String> keywordList = Arrays.asList(new String[]{"Bhv$", "BehaviorReadable$", "BehaviorWritable$"});
        final List<String> ousideSql1List = Arrays.asList(new String[]{"OutsideSql"});
        final List<String> ousideSql2List = Arrays.asList(new String[]{"Executor"});
        final List<String> ousideSql3List = Arrays.asList(new String[]{"Executor$"});
        final InvokeNameExtractingResource resource = new InvokeNameExtractingResource() {
            public boolean isTargetElement(String className, String methodName) {
                if (isClassNameEndsWith(className, suffixList)) {
                    return true;
                }
                if (isClassNameContains(className, keywordList)) {
                    return true;
                }
                if (isClassNameContains(className, ousideSql1List)
                        && (isClassNameEndsWith(className, ousideSql2List) || isClassNameContains(className, ousideSql3List))) {
                    return true;
                }
                return false;
            }
            public String filterSimpleClassName(String simpleClassName) {
                return removeBasePrefixFromSimpleClassName(simpleClassName);
            }
            public boolean isUseAdditionalInfo() {
                return false;
            }
            public int getStartIndex() {
                return 0;
            }
            public int getLoopSize() {
                return 25;
            }
        };
        return extractInvokeName(resource, stackTrace);
    }

    protected boolean isClassNameEndsWith(String className, List<String> suffixList) {
        for (String suffix : suffixList) {
            if (className.endsWith(suffix)) {
                return true;
            }
        }
        return false;
    }
    
    
    protected boolean isClassNameContains(String className, List<String> keywordList) {
        for (String keyword : keywordList) {
            if (className.contains(keyword)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param resource the call-back resource for invoke-name-extracting. (NotNull)
     * @param stackTrace Stack log. (NotNull)
     * @return The result of invoke name. (NotNull: If not found, returns empty string.)
     */
    protected InvokeNameResult extractInvokeName(InvokeNameExtractingResource resource, StackTraceElement[] stackTrace) {
        final InvokeNameExtractorImpl extractor = new InvokeNameExtractorImpl();
        extractor.setStackTrace(stackTrace);
        return extractor.extractInvokeName(resource);
    }

    /**
     * @param method The invoked method. (NotNull)
     * @return The expression of invocation. (NotNull)
     */
    protected String extractInvocationExpression(Method method) {
        final Class<?> declaringClass = method.getDeclaringClass();
        return removeBasePrefixFromSimpleClassName(declaringClass.getSimpleName());
    }
    
    /**
     * @param simpleClassName The simple class name. (NotNull)
     * @return The simple class name removed the base prefix. (NotNull)
     */
    protected String removeBasePrefixFromSimpleClassName(String simpleClassName) {
        if (!simpleClassName.startsWith("Bs")) {
            return simpleClassName;
        }
        final int prefixLength = "Bs".length();
        if (!Character.isUpperCase(simpleClassName.substring(prefixLength).charAt(0))) {
            return simpleClassName;
        }
        if (simpleClassName.length() <= prefixLength) {
            return simpleClassName;
        }
        return "" + simpleClassName.substring(prefixLength);
    }

    // ===================================================================================
    //                                                                      Log SqlCommand
    //                                                                      ==============
    protected void logSqlCommand(MethodInvocation invocation, SqlCommand cmd, long beforeCmd, long afterCmd) {
        log("SqlCommand Initialization Cost: [" + TraceViewUtil.convertToPerformanceView(afterCmd - beforeCmd) + "]");
    }

    protected void assertRetType(Class<?> retType, Object ret) {
        if (java.util.List.class.isAssignableFrom(retType)) {
            if (ret != null && !(ret instanceof java.util.List)) {
                String msg = "The retType is difference from actual return: ";
                msg = msg + "retType=" + retType + " ret.getClass()=" + ret.getClass() + " ref=" + ret;
                throw new IllegalStateException(msg);
            }
        } else if (Entity.class.isAssignableFrom(retType)) {
            if (ret != null && !(ret instanceof Entity)) {
                String msg = "The retType is difference from actual return: ";
                msg = msg + "retType=" + retType + " ret.getClass()=" + ret.getClass() + " ref=" + ret;
                throw new IllegalStateException(msg);
            }
        }
    }

    // ===================================================================================
    //                                                                          Log Return
    //                                                                          ==========
    protected void logReturn(org.aopalliance.intercept.MethodInvocation invocation, Class<?> retType, Object ret, long before, long after) throws Throwable {
        try {
            final String daoResultPrefix = "===========/ [" + TraceViewUtil.convertToPerformanceView(after - before) + " - ";
            if (java.util.List.class.isAssignableFrom(retType)) {
                if (ret == null) {
                    log(daoResultPrefix + "Selected list: null]");
                } else {
                    final java.util.List<?> ls = (java.util.List<?>) ret;
                    if (ls.isEmpty()) {
                        log(daoResultPrefix + "Selected list: 0]");
                    } else if (ls.size() == 1 && ls.get(0) instanceof Number) {
                        log(daoResultPrefix + "Selected count: " + ls.get(0) + "]");
                    } else {
                        log(daoResultPrefix + "Selected list: " + ls.size() + " first=" + ls.get(0) + "]");
                    }
                }
            } else if (Entity.class.isAssignableFrom(retType)) {
                if (ret == null) {
                    log(daoResultPrefix + "Selected entity: null" + "]");
                } else {
                    final Entity entity = (Entity) ret;
                    log(daoResultPrefix + "Selected entity: " + entity + "]");
                }
            } else if (Entity.class.isAssignableFrom(retType)) {
                if (ret == null) {
                    log(daoResultPrefix + "Selected entity: null" + "]");
                } else {
                    final Entity entity = (Entity) ret;
                    log(daoResultPrefix + "Selected entity: " + entity + "]");
                }
            } else if (int[].class.isAssignableFrom(retType)) {
                if (ret == null) {
                    log(daoResultPrefix + "Selected entity: null" + "]");
                } else {
                    final int[] resultArray = (int[]) ret;
                    if (resultArray.length == 0) {
                        log(daoResultPrefix + "All updated count: 0]");
                    } else {
                        final StringBuilder sb = new StringBuilder();
                        boolean resultExpressionScope = true;
                        int resultCount = 0;
                        int loopCount = 0;
                        for (int element : resultArray) {
                            resultCount = resultCount + element;
                            if (resultExpressionScope) {
                                if (loopCount <= 10) {
                                    if (sb.length() == 0) {
                                        sb.append(element);
                                    } else {
                                        sb.append(",").append(element);
                                    }
                                } else {
                                    sb.append(",").append("...");
                                    resultExpressionScope = false;
                                }
                            }
                            ++loopCount;
                        }
                        sb.insert(0, "{").append("}");
                        log(daoResultPrefix + "All updated count: " + resultCount + " result=" + sb + "]");
                    }
                }
            } else {
                if (isSelectCountIgnoreFetchScopeMethod(invocation)) {
                    log(daoResultPrefix + "Selected count: " + ret + "]");
                } else {
                    log(daoResultPrefix + "Result: " + ret + "]");
                }
            }
            log(" ");
        } catch (Exception e) {
            String msg = "Result object debug threw the exception: methodName=";
            msg = msg + invocation.getMethod().getName() + " retType=" + retType;
            msg = msg + " ret=" + ret;
            _log.warn(msg, e);
            throw e;
        }
    }

    // ===================================================================================
    //                                                                    Pre Post Process
    //                                                                    ================
    // -----------------------------------------------------
    //                                            OutsideSql
    //                                            ----------
    protected void preprocessOutsideSql(MethodInvocation invocation) {
        final Class<jp.sourceforge.ea2ddl.dao.allcommon.annotation.OutsideSql> outsideSqlType = jp.sourceforge.ea2ddl.dao.allcommon.annotation.OutsideSql.class;
        final jp.sourceforge.ea2ddl.dao.allcommon.annotation.OutsideSql outsideSql = invocation.getMethod().getAnnotation(outsideSqlType);

        // Traditional OutsideSql
        if (outsideSql != null && (outsideSql.dynamicBinding() || outsideSql.offsetByCursor() || outsideSql.offsetByCursor() || outsideSql.limitByCursor())) {
            final OutsideSqlContext outsideSqlContext = new OutsideSqlContext();
            outsideSqlContext.setDynamicBinding(outsideSql.dynamicBinding());
            outsideSqlContext.setOffsetByCursorForcedly(outsideSql.offsetByCursor());
            outsideSqlContext.setLimitByCursorForcedly(outsideSql.limitByCursor());
            OutsideSqlContext.setOutsideSqlContextOnThread(outsideSqlContext);

            // Set up fetchNarrowingBean.
            final Object[] args = invocation.getArguments();
            if (args == null || args.length == 0) {
                return;
            }
            if (FetchNarrowingBeanContext.isTheTypeFetchNarrowingBean(args[0].getClass())) {
                FetchNarrowingBeanContext.setFetchNarrowingBeanOnThread((FetchNarrowingBean)args[0]);
            }
            return;
        }

        // Specified OutsideSql
        if (isSpecifiedOutsideSql(invocation)) {
            if (isOutsideSqlDaoMethodSelect(invocation)) {
                setupOutsideSqlContextSelect(invocation);
            } else {
                setupOutsideSqlContextExecute(invocation);
            }
            return;
        }
    }
    
    protected boolean isSpecifiedOutsideSql(MethodInvocation invocation) {
        return OutsideSqlDao.class.isAssignableFrom(getTargetClass(invocation));
    }

    // - - - - - - - - - - - -
    //                  Select
    //                   - - -
    protected boolean isOutsideSqlDaoMethodSelect(MethodInvocation invocation) {
        return invocation.getMethod().getName().startsWith("select");
    }

    protected void setupOutsideSqlContextSelect(MethodInvocation invocation) {
        final Object[] args = invocation.getArguments();
        if (args.length != 4) {
            String msg = "Internal Error! OutsideSqlDao.selectXxx() should have 4 arguements: args.length=" + args.length;
            throw new IllegalStateException(msg);
        }
        final String path = getOutsideSqlPath(args);
        final Object pmb = getOutsideSqlParameterBean(args);
        final OutsideSqlOption option = getOutsideSqlOption(args);
        final Object resultTypeSpecification = args[3];
        final OutsideSqlContext outsideSqlContext = new OutsideSqlContext();
        outsideSqlContext.setDynamicBinding(option.isDynamicBinding());
        outsideSqlContext.setOffsetByCursorForcedly(option.isAutoPaging());
        outsideSqlContext.setLimitByCursorForcedly(option.isAutoPaging());
        outsideSqlContext.setOutsideSqlPath(path);
        outsideSqlContext.setParameterBean(pmb);
        outsideSqlContext.setResultTypeSpecification(resultTypeSpecification);
        outsideSqlContext.setMethodName(invocation.getMethod().getName());
        outsideSqlContext.setStatementConfig(option.getStatementConfig());
        outsideSqlContext.setTableDbName(option.getTableDbName());
		outsideSqlContext.setupBehaviorQueryPathIfNeeds();
        OutsideSqlContext.setOutsideSqlContextOnThread(outsideSqlContext);

        // Set up fetchNarrowingBean.
        setupOutsideSqlFetchNarrowingBean(pmb, option);
    }

    // - - - - - - - - - - - -
    //                 Execute
    //                 - - - -
    protected void setupOutsideSqlContextExecute(MethodInvocation invocation) {
        final Object[] args = invocation.getArguments();
        if (args.length != 3) {
            String msg = "Internal Error! OutsideSqlDao.execute() should have 3 arguements: args.length=" + args.length;
            throw new IllegalStateException(msg);
        }
        final String path = getOutsideSqlPath(args);
        final Object pmb = getOutsideSqlParameterBean(args);
        final OutsideSqlOption option = getOutsideSqlOption(args);
        final OutsideSqlContext outsideSqlContext = new OutsideSqlContext();
        outsideSqlContext.setDynamicBinding(option.isDynamicBinding());
        outsideSqlContext.setOffsetByCursorForcedly(option.isAutoPaging());
        outsideSqlContext.setLimitByCursorForcedly(option.isAutoPaging());
        outsideSqlContext.setOutsideSqlPath(path);
        outsideSqlContext.setParameterBean(pmb);
        outsideSqlContext.setMethodName(invocation.getMethod().getName());
        outsideSqlContext.setStatementConfig(option.getStatementConfig());
        outsideSqlContext.setTableDbName(option.getTableDbName());
		outsideSqlContext.setupBehaviorQueryPathIfNeeds();
        OutsideSqlContext.setOutsideSqlContextOnThread(outsideSqlContext);

        // Set up fetchNarrowingBean.
        setupOutsideSqlFetchNarrowingBean(pmb, option);
    }

    // - - - - - - - - - - - -
    //                  Common
    //                   - - -
    protected String getOutsideSqlPath(Object[] args) {
        return (String)args[0];
    }
    protected Object getOutsideSqlParameterBean(Object[] args) {
        return args[1];
    }
    protected OutsideSqlOption getOutsideSqlOption(Object[] args) {
        return (OutsideSqlOption)args[2];
    }

    protected void setupOutsideSqlFetchNarrowingBean(Object pmb, OutsideSqlOption option) {
        if (pmb == null || !FetchNarrowingBeanContext.isTheTypeFetchNarrowingBean(pmb.getClass())) {
            return;
        }
        final FetchNarrowingBean fetchNarrowingBean = (FetchNarrowingBean)pmb;
        if (option.isManualPaging()) {
            fetchNarrowingBean.ignoreFetchNarrowing();
        }
        FetchNarrowingBeanContext.setFetchNarrowingBeanOnThread(fetchNarrowingBean);
    }

    // -----------------------------------------------------
    //                                         ConditionBean
    //                                         -------------
    /**
     * Pre-process conditionBean.
     * <p>
     * If this method is condition bean select target, make dynamic SQL.
     * Else nothing.
     * @param invocation Method invocation. (NotNull)
     * @return ConditionBean. (Nullable)
     */
    protected ConditionBean preprocessConditionBean(MethodInvocation invocation) {
        final OutsideSqlContext outsideSqlContext = getOutsideSqlContext();
        if (outsideSqlContext != null) {
            return null; // Because it has already finished setting up fetchNarrowingBean for outsideSql here.
        }
        
        final ConditionBean cb;
        {
            final Object[] args = invocation.getArguments();
            if (args == null || args.length == 0) {
                return null;
            }
            final Object arg0 = args[0];
            if (arg0 == null) {
                return null;
            }
            if (!ConditionBeanContext.isTheTypeConditionBean(arg0.getClass())) {// The argument is not condition-bean...
                if (FetchNarrowingBeanContext.isTheTypeFetchNarrowingBean(arg0.getClass()) && !isSelectCountIgnoreFetchScopeMethod(invocation)) {
                    // Fetch-narrowing-bean and Not select count!
                    FetchNarrowingBeanContext.setFetchNarrowingBeanOnThread((FetchNarrowingBean)arg0);
                }
                return null;
            }
            cb = (ConditionBean)arg0;
        }

        if (isSelectCountIgnoreFetchScopeMethod(invocation)) {
            cb.xsetupSelectCountIgnoreFetchScope();
        } else {
            FetchNarrowingBeanContext.setFetchNarrowingBeanOnThread(cb);
        }

        ConditionBeanContext.setConditionBeanOnThread(cb);
        return cb;
    }

    /**
     * Post-process condition-bean.
     * @param invocation Method invocation. (NotNull)
     * @param cb Condition-bean. (Nullable)
     */
    protected void postprocessConditionBean(MethodInvocation invocation, ConditionBean cb) {
        if (cb == null) {
            return;
        }
        if (isSelectCountIgnoreFetchScopeMethod(invocation)) {
            cb.xafterCareSelectCountIgnoreFetchScope();
        }
    }

    // -----------------------------------------------------
    //                                    Clear Thread Local
    //                                    ------------------
    protected void clearThreadLocal() {
        if (OutsideSqlContext.isExistOutsideSqlContextOnThread()) {
            OutsideSqlContext.clearOutsideSqlContextOnThread();
        }
        if (FetchNarrowingBeanContext.isExistFetchNarrowingBeanOnThread()) {
            // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
            // Because there is possible that fetch narrowing has been ignored for manualPaging of outsideSql.
            // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
            FetchNarrowingBeanContext.getFetchNarrowingBeanOnThread().restoreIgnoredFetchNarrowing();

            FetchNarrowingBeanContext.clearFetchNarrowingBeanOnThread();
        }
        if (ConditionBeanContext.isExistConditionBeanOnThread()) {
            ConditionBeanContext.clearConditionBeanOnThread();
        }
        if (InternalMapContext.isExistInternalMapContextOnThread()) {
            InternalMapContext.clearInternalMapContextOnThread();
        }
    }

    // ===================================================================================
    //                                                                      Context Helper
    //                                                                      ==============
    protected OutsideSqlContext getOutsideSqlContext() {
        if (!OutsideSqlContext.isExistOutsideSqlContextOnThread()) {
            return null;
        }
        return OutsideSqlContext.getOutsideSqlContextOnThread();
    }
    
    protected boolean isSpecifiedOutsideSql() {
        final OutsideSqlContext outsideSqlContext = getOutsideSqlContext();
        return outsideSqlContext != null && outsideSqlContext.isSpecifiedOutsideSql();
    }

    protected void putObjectToMapContext(String key, Object value) {
        InternalMapContext.setObject(key, value);
    }

    // ===================================================================================
    //                                                                       Determination
    //                                                                       =============
    /**
     * Is select count ignore-fetch-scope method?
     * @param invocation Method invocation. (NotNull)
     * @return Determination.
     */
    protected boolean isSelectCountIgnoreFetchScopeMethod(MethodInvocation invocation) {
        final String name = invocation.getMethod().getName();
        return name.startsWith("readCount") || name.startsWith("selectCount");
    }

    // ===================================================================================
    //                                                                      General Helper
    //                                                                      ==============
    /**
     * Is the method abstract?
     * @param method Method. (NotNull)
     * @return Determination. (NotNull)
     */
    public boolean isAbstract(Method method) {
        final int mod = method.getModifiers();
        return Modifier.isAbstract(mod);
    }

    /**
     * Get the value of line separator.
     * @return The value of line separator. (NotNull)
     */
    protected String getLineSeparator() {
        return System.getProperty("line.separator");
    }
}