package jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.sqlhandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.sql.SQLException;
import javax.sql.DataSource;

import org.seasar.framework.util.CaseInsensitiveMap;
import org.seasar.extension.jdbc.PropertyType;
import org.seasar.extension.jdbc.ResultSetHandler;
import org.seasar.extension.jdbc.StatementFactory;
import org.seasar.extension.jdbc.ValueType;
import org.seasar.extension.jdbc.impl.PropertyTypeImpl;
import org.seasar.extension.jdbc.types.ValueTypes;

import jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.various.InternalProcedureMetaData;
import jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.various.InternalProcedureParameterType;

/**
 * @author DBFlute(AutoGenerator)
 */
public class InternalProcedureHandler extends InternalBasicSelectHandler {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private InternalProcedureMetaData procedureMetaData;
		
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public InternalProcedureHandler(final DataSource dataSource, final String sql,
            final ResultSetHandler resultSetHandler, final StatementFactory statementFactory,
            final InternalProcedureMetaData procedureMetaData) {
        super(dataSource, sql, resultSetHandler, statementFactory);
        this.procedureMetaData = procedureMetaData;
    }
	
    // ===================================================================================
    //                                                                             Execute
    //                                                                             =======
    @SuppressWarnings("unchecked")
    public Object execute(final Connection connection, final Object[] args, final Class[] argTypes) {
        final Object dto = getArgumentDto(args);
        logSql(args, argTypes);
        CallableStatement cs = null;
        try {
            cs = prepareCallableStatement(connection);
            bindArgs(cs, dto);
            Object returnValue = null; 
            if (cs.execute()) {
                final ResultSet resultSet = cs.getResultSet();
                if (resultSet != null) {
                    final ResultSetHandler handler = createReturnResultSetHandler(resultSet);
                    try {
                        returnValue = handler.handle(resultSet);
                    } finally {
                        if (resultSet != null) {
                            resultSet.close();
                        }
                    }
                }
            }
            return handleOutParameters(cs, dto, returnValue);
        } catch (SQLException e) {
            handleSQLException(e, cs);
            return null;// Unreachable!
        } finally {
            close(cs);
        }
    }

    protected ResultSetHandler createReturnResultSetHandler(ResultSet resultSet) {
        return new InternalMapListResultSetHandler();
    }

    @Override
    protected String getCompleteSql(final Object[] args) {// for Procedure Call
        String sql = getSql();
        Object dto = getArgumentDto(args);
        if (args == null || dto == null) {
            return sql;
        }
        StringBuilder sb = new StringBuilder(100);
        int pos = 0;
        int pos2 = 0;
        for (InternalProcedureParameterType ppt : procedureMetaData.parameterTypes()) {
            if ((pos2 = sql.indexOf('?', pos)) < 0) {
                break;
            }
            sb.append(sql.substring(pos, pos2));
            pos = pos2 + 1;
            if (ppt.isInType()) {
                sb.append(getBindVariableText(ppt.getValue(dto)));
            } else {
                sb.append(sql.substring(pos2, pos));
            }
        }
        sb.append(sql.substring(pos));
        return sb.toString();
    }

    protected CallableStatement prepareCallableStatement(final Connection connection) {
        if (getSql() == null) { throw new IllegalStateException("The SQL should not be null!"); }
        return getStatementFactory().createCallableStatement(connection, getSql());
    }

    protected void bindArgs(final CallableStatement cs, final Object dto) throws SQLException {
        if (dto == null) { return; }
        int i = 0;
        for (InternalProcedureParameterType ppt : procedureMetaData.parameterTypes()) {
            final ValueType valueType = ppt.getValueType();
            if (ppt.isOutType()) {
                valueType.registerOutParameter(cs, i + 1);
            }
            if (ppt.isInType()) {
                final Object value = ppt.getValue(dto);
                valueType.bindValue(cs, i + 1, value);
            }
            ++i;
        }
    }

    protected Object handleResultSet(final CallableStatement cs) throws SQLException {
        ResultSet rs = null;
        try {
            rs = getResultSet(cs);
            return getResultSetHandler().handle(rs);
        } finally {
            close(rs);
        }
    }

    protected ResultSet getResultSet(Statement statement)  {
        try {
            return statement.getResultSet();
        } catch (SQLException e) {
            handleSQLException(e, statement);
            return null;// Unreachable!
        }
    }

    protected Object handleOutParameters(final CallableStatement cs, final Object dto, Object returnValue) throws SQLException {
        if (dto == null) {
            return null;
        }
        int i = 0;
        for (InternalProcedureParameterType ppt : procedureMetaData.parameterTypes()) {
            final ValueType valueType = ppt.getValueType();
            if (ppt.isOutType()) {
                Object value = valueType.getValue(cs, i + 1);
                if (value instanceof ResultSet) {
                    final ResultSet resultSet = (ResultSet) value;
                    final ResultSetHandler handler = createOutParameterResultSetHandler(ppt, resultSet);
                    try {
                        value = handler.handle(resultSet);
                    } finally {
                        if (resultSet != null) {
                            resultSet.close();
                        }
                    }
                }
                ppt.setValue(dto, value);
            } else if (ppt.isReturnType()) {
                ppt.setValue(dto, returnValue);
            }
            ++i;
        }
        return dto;
    }

    protected Object getArgumentDto(Object[] args) {
        if (args.length == 0) {
            return null;
        }
        if (args.length == 1) {
            if (args[0] == null) {
                throw new IllegalArgumentException("args[0] should not be null!");
            }
            return args[0];
        }
        throw new IllegalArgumentException("args");
    }

    protected ResultSetHandler createOutParameterResultSetHandler(InternalProcedureParameterType ppt, ResultSet resultSet) {
        return new InternalMapListResultSetHandler();
    }

	// ===================================================================================
    //                                                              Map Result Set Handler
    //                                                              ======================
    protected static abstract class InternalAbstractMapResultSetHandler implements ResultSetHandler {

        @SuppressWarnings("unchecked")
        protected Map<String, Object> createRow(ResultSet rs, PropertyType[] propertyTypes) throws SQLException {
            Map<String, Object> row = new CaseInsensitiveMap();
            for (int i = 0; i < propertyTypes.length; ++i) {
                Object value = propertyTypes[i].getValueType().getValue(rs, i + 1);
                row.put(propertyTypes[i].getPropertyName(), value);
            }
            return row;
        }

        protected PropertyType[] createPropertyTypes(ResultSetMetaData rsmd) throws SQLException {
            int count = rsmd.getColumnCount();
            PropertyType[] propertyTypes = new PropertyType[count];
            for (int i = 0; i < count; ++i) {
                String propertyName = rsmd.getColumnLabel(i + 1);
                ValueType valueType = ValueTypes.getValueType(rsmd.getColumnType(i + 1));
                propertyTypes[i] = new PropertyTypeImpl(propertyName, valueType);
            }
            return propertyTypes;
        }
    }

    protected static class InternalMapListResultSetHandler extends InternalAbstractMapResultSetHandler {

        public Object handle(ResultSet resultSet) throws SQLException {
            PropertyType[] propertyTypes = createPropertyTypes(resultSet.getMetaData());
            List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
            while (resultSet.next()) {
                list.add(createRow(resultSet, propertyTypes));
            }
            return list;
        }
    }
}
