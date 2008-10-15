package jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause;

import java.io.Serializable;
import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.util.SimpleSystemUtil;

/**
 * @author DBFlute(AutoGenerator)
 */
public class OrderByElement implements Serializable {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    /** The value of alias name. */
    protected String _aliasName;

    /** The value of column name. */
    protected String _columnName;

    /** The value of registered alias name. */
    protected String _registeredAliasName;

    /** The value of registered column name. */
    protected String _registeredColumnName;

    /** The value of ascDesc. */
    protected String _ascDesc = "asc";
	
	/** The setupper of order-by nulls. */
	protected OrderByClause.OrderByNullsSetupper _orderByNullsSetupper;
	
	/** Is nulls ordered first? */
	protected boolean _nullsFirst;

    // =====================================================================================
    //                                                                          Manipulation
    //                                                                          ============
    public void setupAsc() {
        _ascDesc = "asc";
    }

    public void setupDesc() {
        _ascDesc = "desc";
    }

    public void reverse() {
        if (_ascDesc == null) {
            String msg = "The attribute[ascDesc] should not be null.";
            throw new IllegalStateException(msg);
        }
        if (_ascDesc.equals("asc")) {
            _ascDesc = "desc";
        } else if (_ascDesc.equals("desc")) {
            _ascDesc = "asc";
        } else {
            String msg = "The attribute[ascDesc] should be asc or desc: but ascDesc=" + _ascDesc;
            throw new IllegalStateException(msg);
        }
    }

    // =====================================================================================
    //                                                                   Order-By Expression
    //                                                                   ===================
    public boolean isAsc() {
        if (_ascDesc == null) {
            String msg = "The attribute[ascDesc] should not be null.";
            throw new IllegalStateException(msg);
        }
        if (_ascDesc.equals("asc")) {
            return true;
        } else if (_ascDesc.equals("desc")) {
            return false;
        } else {
            String msg = "The attribute[ascDesc] should be asc or desc: but ascDesc=" + _ascDesc;
            throw new IllegalStateException(msg);
        }
    }

    public String getColumnFullName() {
        final StringBuilder sb = new StringBuilder();
        if (_aliasName != null) {
            sb.append(_aliasName).append(".");
        }
        if (_columnName == null) {
            String msg = "The attribute[columnName] should not be null.";
            throw new IllegalStateException(msg);
        }
        sb.append(_columnName);
        return sb.toString();
    }

    public String getElementClause() {
        if (_ascDesc == null) {
            String msg = "The attribute[ascDesc] should not be null.";
            throw new IllegalStateException(msg);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(getColumnFullName()).append(" ").append(_ascDesc);
		if (_orderByNullsSetupper != null) {
		    return _orderByNullsSetupper.setup(getColumnFullName(), sb.toString(), _nullsFirst);
		} else {
            return sb.toString();
		}
    }

    public String getElementClause(Map<String, String> selectClauseRealColumnAliasMap) {
        if (selectClauseRealColumnAliasMap == null) {
            String msg = "The argument[selectClauseRealColumnAliasMap] should not be null.";
            throw new IllegalArgumentException(msg);
        }
        if (_ascDesc == null) {
            String msg = "The attribute[ascDesc] should not be null.";
            throw new IllegalStateException(msg);
        }
        final StringBuilder sb = new StringBuilder();
        final String columnAlias = selectClauseRealColumnAliasMap.get(getColumnFullName());
        if (columnAlias == null || columnAlias.trim().length() == 0) {
		    throwOrderByColumnNotFoundException(getColumnFullName(), selectClauseRealColumnAliasMap);
        }
        sb.append(columnAlias).append(" ").append(_ascDesc);
		if (_orderByNullsSetupper != null) {
		    return _orderByNullsSetupper.setup(columnAlias, sb.toString(), _nullsFirst);
		} else {
            return sb.toString();
		}
    }

    protected void throwOrderByColumnNotFoundException(String columnName, Map<String, String> selectClauseRealColumnAliasMap) {
        String msg = "Look! Read the message below." + getLineSeparator();
        msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
        msg = msg + "The column for order-by was Not Found in select-clause!" + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Advice]" + getLineSeparator();
        msg = msg + "If you use 'union()' or 'unionAll()', Check your condition-bean!" + getLineSeparator();
        msg = msg + "Order-by for union can use only columns on select-clause." + getLineSeparator();
        msg = msg + "So the rule when using union is little difference from the one when NOT using." + getLineSeparator();
        msg = msg + "  For example:" + getLineSeparator();
        msg = msg + "    [before (x)]" + getLineSeparator();
        msg = msg + "    AaaCB cb = new AaaCB();" + getLineSeparator();
        msg = msg + "    cb.query().setXxx...();" + getLineSeparator();
        msg = msg + "    {" + getLineSeparator();
        msg = msg + "        AaaCB unionCB = new AaaCB();" + getLineSeparator();
        msg = msg + "        unionCB.query().setXxx...();" + getLineSeparator();
        msg = msg + "        cb.union(unionCB.query());" + getLineSeparator();
        msg = msg + "    }" + getLineSeparator();
        msg = msg + "    cb.query().queryBbb().addOrderBy_BbbName_Asc();// *NG!" + getLineSeparator();
        msg = msg + "    " + getLineSeparator();
        msg = msg + "    [after (o)]" + getLineSeparator();
        msg = msg + "    AaaCB cb = new AaaCB();" + getLineSeparator();
        msg = msg + "    cb.setupSelect_Bbb();// *Point!" + getLineSeparator();
        msg = msg + "    cb.query().setXxx...();" + getLineSeparator();
        msg = msg + "    {" + getLineSeparator();
        msg = msg + "        AaaCB unionCB = new AaaCB();" + getLineSeparator();
        msg = msg + "        unionCB.query().setXxx...();" + getLineSeparator();
        msg = msg + "        cb.union(unionCB.query());" + getLineSeparator();
        msg = msg + "    }" + getLineSeparator();
        msg = msg + "    cb.query().queryBbb().addOrderBy_BbbName_Asc();// *OK!" + getLineSeparator();
        msg = msg + "    " + getLineSeparator();
        msg = msg + "Or else if you DON'T use 'union()' or 'unionAll()', This is the Framework Exception!" + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Target Column]" + getLineSeparator();
		msg = msg + columnName + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Internal Object]" + getLineSeparator();
		msg = msg + "selectClauseRealColumnAliasMap=" + selectClauseRealColumnAliasMap + getLineSeparator();
        msg = msg + "* * * * * * * * * */" + getLineSeparator();
        throw new IllegalStateException(msg);
    }

    protected String getLineSeparator() {
        return SimpleSystemUtil.getLineSeparator();
    }

    // =====================================================================================
    //                                                                        Basic Override
    //                                                                        ==============
    /**
     * This method overrides the method that is declared at super.
     * @return The view-string of all-columns value. (NotNull)
     */
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("{aliasName=").append(_aliasName);
        sb.append(" columnName=").append(_columnName);
        sb.append(" registeredAliasName=").append(_registeredAliasName);
        sb.append(" registeredColumnName=").append(_registeredColumnName);
        sb.append(" ascDesc=").append(_ascDesc).append("}");
        return sb.toString();
    }

    // =====================================================================================
    //                                                                              Accessor
    //                                                                              ========
    public String getAliasName() {
        return _aliasName;
    }
    public String getColumnName() {
        return _columnName;
    }
    public String getRegisteredAliasName() {
        return _registeredAliasName;
    }
    public String getRegisteredColumnName() {
        return _registeredColumnName;
    }
    public String getAscDesc() {
        return _ascDesc;
    }
    public void setAliasName(String value) {
        _aliasName = value;
    }
    public void setColumnName(String value) {
        _columnName = value;
    }
    public void setRegisteredAliasName(String value) {
        _registeredAliasName = value;
    }
    public void setRegisteredColumnName(String value) {
        _registeredColumnName = value;
    }
    public void setAscDesc(String value) {
        _ascDesc = value;
    }
    public void setOrderByNullsSetupper(OrderByClause.OrderByNullsSetupper value, boolean nullsFirst) {
        _orderByNullsSetupper = value;
		_nullsFirst = nullsFirst;
    }
}
