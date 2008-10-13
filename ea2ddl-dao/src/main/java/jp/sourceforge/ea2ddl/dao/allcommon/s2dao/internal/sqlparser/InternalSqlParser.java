package jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.sqlparser;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

import org.seasar.dao.CommandContext;
import org.seasar.dao.Node;
import org.seasar.dao.node.AbstractNode;
import org.seasar.dao.node.BeginNode;
import org.seasar.dao.node.ContainerNode;
import org.seasar.dao.node.ElseNode;
import org.seasar.dao.node.PrefixSqlNode;
import org.seasar.dao.node.SqlNode;
import org.seasar.framework.beans.BeanDesc;
import org.seasar.framework.beans.PropertyDesc;
import org.seasar.framework.beans.factory.BeanDescFactory;
import org.seasar.framework.util.OgnlUtil;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.MapParameterBean;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption;
import jp.sourceforge.ea2ddl.dao.allcommon.exception.BindVariableCommentNotFoundPropertyException;
import jp.sourceforge.ea2ddl.dao.allcommon.exception.BindVariableParameterNullValueException;
import jp.sourceforge.ea2ddl.dao.allcommon.exception.EmbeddedValueCommentNotFoundPropertyException;
import jp.sourceforge.ea2ddl.dao.allcommon.exception.EmbeddedValueParameterNullValueException;
import jp.sourceforge.ea2ddl.dao.allcommon.exception.EndCommentNotFoundException;
import jp.sourceforge.ea2ddl.dao.allcommon.exception.IfCommentConditionNotFoundException;
import jp.sourceforge.ea2ddl.dao.allcommon.exception.IfCommentNotBooleanResultException;
import jp.sourceforge.ea2ddl.dao.allcommon.exception.IfCommentWrongExpressionException;
import jp.sourceforge.ea2ddl.dao.allcommon.exception.RequiredOptionNotFoundException;
import jp.sourceforge.ea2ddl.dao.allcommon.s2dao.internal.util.InternalBindVariableUtil;
import jp.sourceforge.ea2ddl.dao.allcommon.util.SimpleStringUtil;
import jp.sourceforge.ea2ddl.dao.allcommon.util.SimpleSystemUtil;

/**
 * @author DBFlute(AutoGenerator)
 */
public class InternalSqlParser {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected InternalSqlTokenizer tokenizer;
    protected Stack<Node> nodeStack = new Stack<Node>();
    protected String specifiedSql;// Extension!

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public InternalSqlParser(String sql) {
        sql = sql.trim();
        if (sql.endsWith(";")) {
            sql = sql.substring(0, sql.length() - 1);
        }
        specifiedSql = sql;// Extension!
        tokenizer = new InternalSqlTokenizer(sql);
    }

    // ===================================================================================
    //                                                                               Parse
    //                                                                               =====
    public Node parse() {
        push(new ContainerNode());
        while (InternalSqlTokenizer.EOF != tokenizer.next()) {
            parseToken();
        }
        return pop();
    }

    protected void parseToken() {
        switch (tokenizer.getTokenType()) {
        case InternalSqlTokenizer.SQL:
            parseSql();
            break;
        case InternalSqlTokenizer.COMMENT:
            parseComment();
            break;
        case InternalSqlTokenizer.ELSE:
            parseElse();
            break;
        case InternalSqlTokenizer.BIND_VARIABLE:
            parseBindVariable();
            break;
        }
    }

    protected void parseSql() {
        String sql = tokenizer.getToken();
        if (isElseMode()) {
            sql = InternalStringUtil.replace(sql, "--", "");
        }
        Node node = peek();
        if ((node instanceof InternalIfNode || node instanceof ElseNode) && node.getChildSize() == 0) {

            InternalSqlTokenizer st = new InternalSqlTokenizer(sql);
            st.skipWhitespace();
            String token = st.skipToken();
            st.skipWhitespace();
            if (sql.startsWith(",")) {
                if (sql.startsWith(", ")) {
                    node.addChild(new PrefixSqlNode(", ", sql.substring(2)));
                } else {
                    node.addChild(new PrefixSqlNode(",", sql.substring(1)));
                }
            } else if ("AND".equalsIgnoreCase(token) || "OR".equalsIgnoreCase(token)) {
                node.addChild(new PrefixSqlNode(st.getBefore(), st.getAfter()));
            } else {
                node.addChild(new SqlNode(sql));
            }
        } else {
            node.addChild(new SqlNode(sql));
        }
    }

    protected void parseComment() {
        final String comment = tokenizer.getToken();
        if (isTargetComment(comment)) {
            if (isIfComment(comment)) {
                parseIf();
            } else if (isBeginComment(comment)) {
                parseBegin();
            } else if (isEndComment(comment)) {
                return;
            } else {
                parseCommentBindVariable();
            }
        } else if (comment != null && 0 < comment.length()) {
			// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
	        // [UnderReview]: Should I resolve bind character on scope comment(normal comment)?
		    // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
            String before = tokenizer.getBefore();
            peek().addChild(new SqlNode(before.substring(before.lastIndexOf("/*"))));
        }
    }

    protected void parseIf() {
        final String condition = tokenizer.getToken().substring(2).trim();
        if (InternalStringUtil.isEmpty(condition)) {
            throwIfCommentConditionNotFoundException();
        }
        final ContainerNode ifNode = createIfNode(condition);
        peek().addChild(ifNode);
        push(ifNode);
        parseEnd();
    }
	
    protected void throwIfCommentConditionNotFoundException() {
        String msg = "Look! Read the message below." + getLineSeparator();
        msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
        msg = msg + "The condition of IF comment was Not Found!" + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Advice]" + getLineSeparator();
        msg = msg + "Please confirm the IF comment expression." + getLineSeparator();
        msg = msg + "It may exist the IF comment that DOESN'T have a condition." + getLineSeparator();
        msg = msg + "  For example:" + getLineSeparator();
        msg = msg + "    before (x) -- /*IF*/XXX_ID = /*pmb.xxxId*/3/*END*/" + getLineSeparator();
        msg = msg + "    after  (o) -- /*IF pmb.xxxId != null*/XXX_ID = /*pmb.xxxId*/3/*END*/" + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[IF Comment Expression]" + getLineSeparator() + tokenizer.getToken() + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Specified SQL]" + getLineSeparator() + specifiedSql + getLineSeparator();
        msg = msg + "* * * * * * * * * */";
        throw new IfCommentConditionNotFoundException(msg);
    }

    protected void parseBegin() {
        BeginNode beginNode = new BeginNode();
        peek().addChild(beginNode);
        push(beginNode);
        parseEnd();
    }

    protected void parseEnd() {
        while (InternalSqlTokenizer.EOF != tokenizer.next()) {
            if (tokenizer.getTokenType() == InternalSqlTokenizer.COMMENT && isEndComment(tokenizer.getToken())) {
                pop();
                return;
            }
            parseToken();
        }
        throwEndCommentNotFoundException();
    }

    protected void throwEndCommentNotFoundException() {
        String msg = "Look! Read the message below." + getLineSeparator();
        msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
        msg = msg + "The end comment was Not Found!" + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Advice]" + getLineSeparator();
        msg = msg + "Please confirm the parameter comment logic." + getLineSeparator();
        msg = msg + "It may exist the parameter comment that DOESN'T have an end comment." + getLineSeparator();
        msg = msg + "  For example:" + getLineSeparator();
        msg = msg + "    before (x) -- /*IF pmb.xxxId != null*/XXX_ID = /*pmb.xxxId*/3" + getLineSeparator();
        msg = msg + "    after  (o) -- /*IF pmb.xxxId != null*/XXX_ID = /*pmb.xxxId*/3/*END*/" + getLineSeparator();
        msg = msg + getLineSeparator();
        msg = msg + "[Specified SQL]" + getLineSeparator() + specifiedSql + getLineSeparator();
        msg = msg + "* * * * * * * * * */";
        throw new EndCommentNotFoundException(msg);
    }
	
    protected void parseElse() {
        final Node parent = peek();
        if (!(parent instanceof InternalIfNode)) {
            return;
        }
        final InternalIfNode ifNode = (InternalIfNode) pop();
        final InternalElseNode elseNode = new InternalElseNode();
        ifNode.setElseNode(elseNode);
        push(elseNode);
        tokenizer.skipWhitespace();
    }

    protected void parseCommentBindVariable() {
        final String expr = tokenizer.getToken();
        final String s = tokenizer.skipToken();
        if (expr.startsWith("$")) {
            peek().addChild(createEmbeddedValueNode(expr.substring(1), s));// Extension!
        } else {
            peek().addChild(createBindVariableNode(expr, s));// Extension!
        }
    }

    protected void parseBindVariable() {
        final String expr = tokenizer.getToken();
        peek().addChild(createBindVariableNode(expr, null));// Extension!
    }

    protected Node pop() {
        return (Node) nodeStack.pop();
    }

    protected Node peek() {
        return (Node) nodeStack.peek();
    }

    protected void push(Node node) {
        nodeStack.push(node);
    }

    protected boolean isElseMode() {
        for (int i = 0; i < nodeStack.size(); ++i) {
            if (nodeStack.get(i) instanceof InternalElseNode) {
                return true;
            }
        }
        return false;
    }

    private static boolean isTargetComment(String comment) {
        return comment != null && comment.length() > 0 && Character.isJavaIdentifierStart(comment.charAt(0));
    }

    private static boolean isIfComment(String comment) {
        return comment.startsWith("IF");
    }

    private static boolean isBeginComment(String content) {
        return content != null && "BEGIN".equals(content);
    }

    private static boolean isEndComment(String content) {
        return content != null && "END".equals(content);
    }

    protected AbstractNode createBindVariableNode(String expr, String testValue) {// Extension!
        return new InternalBindVariableNode(expr, testValue, specifiedSql);
    }

    protected AbstractNode createEmbeddedValueNode(String expr, String testValue) {// Extension!
        return new InternalEmbeddedValueNode(expr, testValue, specifiedSql);
    }

    protected ContainerNode createIfNode(String expr) {// Extension!
        return new InternalIfNode(expr, specifiedSql);
    }

    // ===================================================================================
    //                                                                      General Helper
    //                                                                      ==============
    protected String getLineSeparator() {
        return SimpleSystemUtil.getLineSeparator();
    }
	
    protected final String replaceString(String text, String fromText, String toText) {
	    return SimpleStringUtil.replace(text, fromText, toText);
    }
	
    // ===================================================================================
    //                                                                           Extension
    //                                                                           =========
    // -----------------------------------------------------
    //                                      BindVariableNode
    //                                      ----------------
    protected static class InternalBindVariableNode extends AbstractNode {
        protected String _expression;
        protected String _testValue;
        protected String[] _names;
        protected String _specifiedSql;

        public InternalBindVariableNode(String expression, String testValue, String specifiedSql) {
            this._expression = expression;
			this._testValue = testValue;
            this._names = InternalStringUtil.split(expression, ".");
            this._specifiedSql = specifiedSql;
        }

        public void accept(CommandContext ctx) {
            final Object value = ctx.getArg(_names[0]);
            final Class<?> clazz = ctx.getArgType(_names[0]);
            final InternalValueAndType valueAndType = new InternalValueAndType();
            valueAndType.setTargetValue(value);
            valueAndType.setTargetType(clazz);
            setupValueAndType(valueAndType);
			
			if (valueAndType.getTargetValue() == null) {
			    throwBindOrEmbeddedParameterNullValueException(valueAndType);
			}
			if (!isInScope()) {
			    // Main Root
			    ctx.addSql("?", valueAndType.getTargetValue(), valueAndType.getTargetType());
			} else {
			    if (List.class.isAssignableFrom(valueAndType.getTargetType())) {
				    bindArray(ctx, ((List<?>)valueAndType.getTargetValue()).toArray());
				} else if (valueAndType.getTargetType().isArray()) {
				    bindArray(ctx, valueAndType.getTargetValue());
				} else {
				    ctx.addSql("?", valueAndType.getTargetValue(), valueAndType.getTargetType());
				}
			}
            if (valueAndType.isValidRearOption()) {
                ctx.addSql(valueAndType.buildRearOptionOnSql());
            }
        }

        protected void setupValueAndType(InternalValueAndType valueAndType) {
            final InternalValueAndTypeSetuper valueAndTypeSetuper = new InternalValueAndTypeSetuper(_expression, _names, _specifiedSql, true);
            valueAndTypeSetuper.setupValueAndType(valueAndType);
        }
		
		protected void throwBindOrEmbeddedParameterNullValueException(InternalValueAndType valueAndType) {
		    ParameterCommentExceptionProvider.throwBindOrEmbeddedParameterNullValueException(_expression, valueAndType.getTargetType(), _specifiedSql, true);
		}
		
		protected boolean isInScope() {
		    return _testValue != null && _testValue.startsWith("(") && _testValue.endsWith(")");
		}
		
        protected void bindArray(CommandContext ctx, Object array) {
            if (array == null) {
                return;
            }
            final int length = Array.getLength(array);
            if (length == 0) {
			    throwBindOrEmbeddedParameterEmptyListException();
            }
            Class<?> clazz = null;
            for (int i = 0; i < length; ++i) {
                final Object currentElement = Array.get(array, i);
                if (currentElement != null) {
                    clazz = currentElement.getClass();
					break;
                }
            }
			if (clazz == null) {
			    throwBindOrEmbeddedParameterNullOnlyListException();
			}
			boolean existsValidElements = false;
            ctx.addSql("(");
            for (int i = 0; i < length; ++i) {
				final Object currentElement = Array.get(array, i);
				if (currentElement != null) {
				    if (!existsValidElements) {
                        ctx.addSql("?", currentElement, clazz);
				        existsValidElements = true;
					} else {
                        ctx.addSql(", ?", currentElement, clazz);
					}
				}
            }
            ctx.addSql(")");
        }

		protected void throwBindOrEmbeddedParameterEmptyListException() {
		    ParameterCommentExceptionProvider.throwBindOrEmbeddedParameterEmptyListException(_expression, _specifiedSql, false);
		}
		
		protected void throwBindOrEmbeddedParameterNullOnlyListException() {
		    ParameterCommentExceptionProvider.throwBindOrEmbeddedParameterNullOnlyListException(_expression, _specifiedSql, true);
		}
    }

    // -----------------------------------------------------
    //                                     EmbeddedValueNode
    //                                     -----------------
    protected static class InternalEmbeddedValueNode extends AbstractNode {
        protected String _expression;
        protected String _testValue;
        protected String[] _names;
        protected String _specifiedSql;

        public InternalEmbeddedValueNode(String expression, String testValue, String specifiedSql) {
            this._expression = expression;
			this._testValue = testValue;
            this._names = InternalStringUtil.split(expression, ".");
            this._specifiedSql = specifiedSql;
        }

        public void accept(CommandContext ctx) {
            final Object value = ctx.getArg(_names[0]);
            final Class<?> clazz = ctx.getArgType(_names[0]);
            final InternalValueAndType valueAndType = new InternalValueAndType();
            valueAndType.setTargetValue(value);
            valueAndType.setTargetType(clazz);
            setupValueAndType(valueAndType);
			
			if (valueAndType.getTargetValue() == null) {
			    throwBindOrEmbeddedParameterNullValueException(valueAndType);
			}
			if (!isInScope()) {
			    // Main Root
		        // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
	            // [UnderReview]: Should I make an original exception instead of this exception?
		        // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
                if (valueAndType.getTargetValue() != null && valueAndType.getTargetValue().toString().indexOf("?") > -1) {
                    throw new org.seasar.framework.exception.SRuntimeException("EDAO0023");
                }
                ctx.addSql(valueAndType.getTargetValue().toString());
			} else {
			    if (List.class.isAssignableFrom(valueAndType.getTargetType())) {
                    embedArray(ctx, ((List<?>)valueAndType.getTargetValue()).toArray());
				} else if (valueAndType.getTargetType().isArray()) {
                    embedArray(ctx, valueAndType.getTargetValue());
				} else {
    		        // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    	            // [UnderReview]: Should I make an original exception instead of this exception?
    		        // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
                    if (valueAndType.getTargetValue() != null && valueAndType.getTargetValue().toString().indexOf("?") > -1) {
                        throw new org.seasar.framework.exception.SRuntimeException("EDAO0023");
                    }
                    ctx.addSql(valueAndType.getTargetValue().toString());
				}
			}
            if (valueAndType.isValidRearOption()) {
                ctx.addSql(valueAndType.buildRearOptionOnSql());
            }
        }

        protected void setupValueAndType(InternalValueAndType valueAndType) {
            final InternalValueAndTypeSetuper valueAndTypeSetuper = new InternalValueAndTypeSetuper(_expression, _names, _specifiedSql, false);
            valueAndTypeSetuper.setupValueAndType(valueAndType);
        }
		
		protected void throwBindOrEmbeddedParameterNullValueException(InternalValueAndType valueAndType) {
		    ParameterCommentExceptionProvider.throwBindOrEmbeddedParameterNullValueException(_expression, valueAndType.getTargetType(), _specifiedSql, false);
		}
		
		protected boolean isInScope() {
		    return _testValue != null && _testValue.startsWith("(") && _testValue.endsWith(")");
		}
		
        protected void embedArray(CommandContext ctx, Object array) {
            if (array == null) {
                return;
            }
            final int length = Array.getLength(array);
            if (length == 0) {
			    throwBindOrEmbeddedParameterEmptyListException();
            }
            String quote = null;
            for (int i = 0; i < length; ++i) {
                final Object currentElement = Array.get(array, i);
                if (currentElement != null) {
                    quote = !(currentElement instanceof Number) ? "'" : "";
					break;
                }
            }
			if (quote == null) {
			    throwBindOrEmbeddedParameterNullOnlyListException();
			}
			boolean existsValidElements = false;
            ctx.addSql("(");
            for (int i = 0; i < length; ++i) {
				final Object currentElement = Array.get(array, i);
				if (currentElement != null) {
				    if (!existsValidElements) {
                        ctx.addSql(quote + currentElement + quote);
				        existsValidElements = true;
					} else {
                        ctx.addSql(", " + quote + currentElement + quote);
					}
				}
            }
            ctx.addSql(")");
        }
		
		protected void throwBindOrEmbeddedParameterEmptyListException() {
		    ParameterCommentExceptionProvider.throwBindOrEmbeddedParameterEmptyListException(_expression, _specifiedSql, false);
		}
		
		protected void throwBindOrEmbeddedParameterNullOnlyListException() {
		    ParameterCommentExceptionProvider.throwBindOrEmbeddedParameterNullOnlyListException(_expression, _specifiedSql, false);
		}
    }

    // -----------------------------------------------------
    //                                        Value and Type
    //                                        --------------
    protected static class InternalValueAndType {
        public Object _targetValue;
        public Class<?> _targetType;
        protected String _rearOption;

        public boolean isValidRearOption() {
            return _targetValue != null && _rearOption != null && _rearOption.trim().length() > 0;
        }

        public String buildRearOptionOnSql() {
            return " " + _rearOption.trim() + " ";
        }

        public Object getTargetValue() {
            return _targetValue;
        }
        public void setTargetValue(Object targetValue) {
            this._targetValue = targetValue;
        }
        public Class<?> getTargetType() {
            return _targetType;
        }
        public void setTargetType(Class<?> targetType) {
            this._targetType = targetType;
        }
        public String getRearOption() {
            return _rearOption;
        }
        public void setRearOption(String rearOption) {
            this._rearOption = rearOption;
        }
    }

    protected static class InternalValueAndTypeSetuper {
        protected String _expression;
        protected String[] _names;
        protected String _specifiedSql;
        protected boolean _bind;

        public InternalValueAndTypeSetuper(String expression, String[] names, String specifiedSql, boolean bind) {
            this._expression = expression;
            this._names = names;
            this._specifiedSql = specifiedSql;
            this._bind = bind;
        }

        protected void setupValueAndType(InternalValueAndType valueAndType) {
            Object value = valueAndType.getTargetValue();
            Class<?> clazz = valueAndType.getTargetType();

            // LikeSearchOption handling here is for OutsideSql.
            LikeSearchOption likeSearchOption = null;
            String rearOption = null;

            for (int pos = 1; pos < _names.length; ++pos) {
                if (value == null) {
                    break;
                }
                final String currentName = _names[pos];
                if (pos == 1) {// at the First Loop
                    final BeanDesc beanDesc = BeanDescFactory.getBeanDesc(clazz);
                    if (hasLikeSearchOption(beanDesc, currentName)) {
                        likeSearchOption = getLikeSearchOption(beanDesc, currentName, value);
                    }
                }
                if (Map.class.isInstance(value)) {
                    final Map<?, ?> map = (Map<?, ?>) value;
                    value = map.get(_names[pos]);
                    if (isLastLoop4LikeSearch(pos, likeSearchOption) && isValidStringValue(value)) {// at the Last Loop
                        value = likeSearchOption.generateRealValue((String) value);
                        rearOption = likeSearchOption.getRearOption();
                    }
                    clazz = (value != null ? value.getClass() : clazz);
                    continue;
                }
                final BeanDesc beanDesc = BeanDescFactory.getBeanDesc(clazz);
                if (beanDesc.hasPropertyDesc(currentName)) {
                    final PropertyDesc pd = beanDesc.getPropertyDesc(currentName);
                    value = getPropertyValue(clazz, value, currentName, pd);
                    if (isLastLoop4LikeSearch(pos, likeSearchOption) && isValidStringValue(value)) {// at the Last Loop
                        value = likeSearchOption.generateRealValue((String) value);
                        rearOption = likeSearchOption.getRearOption();
                    }
                    clazz = (value != null ? value.getClass() : pd.getPropertyType());
                    continue;
                }
                final String methodName = "get" + initCap(currentName);
                if (beanDesc.hasMethod(methodName)) {// Is this unused???
                    final Method method = beanDesc.getMethod(methodName);
                    value = invokeGetter(method, value);
                    clazz = method.getReturnType();
                    continue;
                }
                if (pos == 1 && MapParameterBean.class.isAssignableFrom(clazz)) {
                    final MapParameterBean pmb = (MapParameterBean)value;
                    final Map<String, Object> map = pmb.getParameterMap();
                    final Object elementValue = (map != null ? map.get(_names[pos]) : null);
                    if (elementValue != null) {
                        value = elementValue;
                        clazz = value.getClass();
                        continue;
                    }
                }
                throwBindOrEmbeddedCommentNotFoundPropertyException(_expression, clazz, currentName, _specifiedSql, _bind);
            }
            valueAndType.setTargetValue(value);
            valueAndType.setTargetType(clazz);
            valueAndType.setRearOption(rearOption);
        }

        // for OutsideSql
        protected boolean isLastLoop4LikeSearch(int pos, LikeSearchOption likeSearchOption) {
            return _names.length == (pos + 1) && likeSearchOption != null;
        }

        protected boolean isValidStringValue(Object value) {
            return value != null && value instanceof String && ((String) value).length() > 0;
        }

        // for OutsideSql
        protected boolean hasLikeSearchOption(BeanDesc beanDesc, String currentName) {
            return beanDesc.hasPropertyDesc(currentName + "InternalLikeSearchOption");
        }

        // for OutsideSql
        protected LikeSearchOption getLikeSearchOption(BeanDesc beanDesc, String currentName, Object resourceBean) {
            final PropertyDesc pb = beanDesc.getPropertyDesc(currentName + "InternalLikeSearchOption");
			final LikeSearchOption option = (LikeSearchOption) pb.getValue(resourceBean);
			if (option == null) {
			    throwLikeSearchOptionNotFoundException(resourceBean, currentName);
			}
			if (option.isSplit()) {
			    throwOutsideSqlLikeSearchOptionSplitUnsupportedException(option, resourceBean, currentName);
			}
            return option;
        }

        // for OutsideSql
        protected void throwLikeSearchOptionNotFoundException(Object resourceBean, String currentName) {
            String msg = "Look! Read the message below." + getLineSeparator();
            msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
            msg = msg + "The likeSearchOption was Not Found! (Should not be null!)" + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Advice]" + getLineSeparator();
            msg = msg + "Please confirm your method call:"  + getLineSeparator();
			final String beanName = resourceBean.getClass().getSimpleName();
			final String methodName = "set" + initCap(currentName) + "_LikeSearch(value, likeSearchOption);";
            msg = msg + "    " + beanName + "." + methodName + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Target ParameterBean]" + getLineSeparator() + resourceBean + getLineSeparator();
            msg = msg + "* * * * * * * * * */";
            throw new RequiredOptionNotFoundException(msg);
        }
		
        // for OutsideSql
        protected void throwOutsideSqlLikeSearchOptionSplitUnsupportedException(LikeSearchOption option, Object resourceBean, String currentName) {
            String msg = "Look! Read the message below." + getLineSeparator();
            msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
            msg = msg + "The splitByXxx() of LikeSearchOption is unsupported at OutsideSql!" + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Advice]" + getLineSeparator();
            msg = msg + "Please confirm your method call:"  + getLineSeparator();
            msg = msg + "  For example:"  + getLineSeparator();
            msg = msg + "    before (x):" + getLineSeparator();
            final String beanName = resourceBean.getClass().getSimpleName();
            final String methodName = "set" + initCap(currentName) + "_LikeSearch(value, likeSearchOption);";
            msg = msg + "      " + beanName + " pmb = new " + beanName + "();"  + getLineSeparator();
            msg = msg + "      LikeSearchOption likeSearchOption = new LikeSearchOption().likeContain();"  + getLineSeparator();
            msg = msg + "      likeSearchOption.splitBySpace(); // *No! Don't invoke this!"  + getLineSeparator();
            msg = msg + "      pmb." + methodName + getLineSeparator();
            msg = msg + "    after  (o):" + getLineSeparator();
            msg = msg + "      " + beanName + " pmb = new " + beanName + "();"  + getLineSeparator();
            msg = msg + "      LikeSearchOption likeSearchOption = new LikeSearchOption().likeContain();"  + getLineSeparator();
            msg = msg + "      pmb." + methodName + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Target LikeSearchOption]" + getLineSeparator() + option + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Target ParameterBean]" + getLineSeparator() + resourceBean + getLineSeparator();
            msg = msg + "* * * * * * * * * */";
            throw new UnsupportedOperationException(msg);
        }

		protected Object getPropertyValue(Class<?> beanType, Object beanValue, String currentName, PropertyDesc pd) {
            try {
                return pd.getValue(beanValue);
            } catch (RuntimeException e) {
                throwPropertyHandlingFailureException(beanType, beanValue, currentName, _expression, _specifiedSql, _bind, e);
				return null;// Unreachable!
            }
		}
		
        protected void throwPropertyHandlingFailureException(Class<?> beanType, Object beanValue, String currentName,
                String expression, String specifiedSql, boolean bind, Exception e) {
            String msg = "Look! Read the message below." + getLineSeparator();
            msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
            msg = msg + "The handlig of the property was failed!" + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Advice]" + getLineSeparator();
            msg = msg + "This is the Framework Exception!" + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[" + (bind ? "Bind Variable" : "Embedded Value") + " Comment Expression]" + getLineSeparator()
                    + expression + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Bean Type]" + getLineSeparator() + beanType + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Bean Value]" + getLineSeparator() + beanValue + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Property Name]" + getLineSeparator() + currentName + getLineSeparator();
            msg = msg + getLineSeparator();
			msg = msg + "[Specified SQL]" + getLineSeparator() + specifiedSql + getLineSeparator();
            msg = msg + "* * * * * * * * * */";
            throw new IllegalStateException(msg, e);
        }

        protected String initCap(String name) {
		    return SimpleStringUtil.initCap(name);
        }

        protected Object invokeGetter(Method method, Object target) {
            try {
                return method.invoke(target, (Object[]) null);
            } catch (IllegalArgumentException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (java.lang.reflect.InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }

        protected void throwBindOrEmbeddedCommentNotFoundPropertyException(String expression, Class<?> targetType, String notFoundProperty, String specifiedSql, boolean bind) {
            String msg = "Look! Read the message below." + getLineSeparator();
            msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
            msg = msg + "The property on the " + (bind ? "bind variable" : "embedded value") + " comment was Not Found!" + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Advice]" + getLineSeparator();
            msg = msg + "Please confirm the existence of your property on your arguments." + getLineSeparator();
            msg = msg + "Abd has the property had misspelling?" + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[" + (bind ? "Bind Variable" : "Embedded Value") + " Comment Expression]" + getLineSeparator() + expression + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[NotFound Property]" + getLineSeparator() + (targetType != null ? targetType.getName() + "#" : "") + notFoundProperty + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Specified SQL]" + getLineSeparator() + specifiedSql + getLineSeparator();
            msg = msg + "* * * * * * * * * */";
            if (bind) {
                throw new BindVariableCommentNotFoundPropertyException(msg);
            } else {
                throw new EmbeddedValueCommentNotFoundPropertyException(msg);
            }
        }

        protected String getLineSeparator() {
            return SimpleSystemUtil.getLineSeparator();
        }
    }
	
    // -----------------------------------------------------
    //                                    Exception Provider
    //                                    ------------------
	protected static class ParameterCommentExceptionProvider {
        public static void throwBindOrEmbeddedParameterNullValueException(String expression, Class<?> targetType, String specifiedSql, boolean bind) {
            String msg = "Look! Read the message below." + getLineSeparator();
            msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
            msg = msg + "The value of " + (bind ? "bind variable" : "embedded value") + " was Null!" + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Advice]" + getLineSeparator();
            msg = msg + "Is it within the scope of your assumption?" + getLineSeparator();
            msg = msg + "If the answer is YES, please confirm your application logic about the parameter." + getLineSeparator();
            msg = msg + "If the answer is NO, please confirm the logic of parameter comment(especially IF comment)." + getLineSeparator();
            msg = msg + "  --> For example:" + getLineSeparator();
            msg = msg + "        before (x) -- XXX_ID = /*pmb.xxxId*/3" + getLineSeparator();
            msg = msg + "        after  (o) -- /*IF pmb.xxxId != null*/XXX_ID = /*pmb.xxxId*/3/*END*/" + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[" + (bind ? "Bind Variable" : "Embedded Value") + " Comment Expression]" + getLineSeparator() + expression + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Parameter Property Type]" + getLineSeparator() + targetType + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Specified SQL]" + getLineSeparator() + specifiedSql + getLineSeparator();
            msg = msg + "* * * * * * * * * */";
            if (bind) {
                throw new BindVariableParameterNullValueException(msg);
            } else {
                throw new EmbeddedValueParameterNullValueException(msg);
            }
        }
		
        public static void throwBindOrEmbeddedParameterEmptyListException(String expression, String specifiedSql, boolean bind) {
            String msg = "Look! Read the message below." + getLineSeparator();
            msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
            msg = msg + "The list of " + (bind ? "bind variable" : "embedded value") + " was empty!" + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Advice]" + getLineSeparator();
            msg = msg + "Please confirm your application logic." + getLineSeparator();
            msg = msg + "  For example:" + getLineSeparator();
            msg = msg + "    before (x):" + getLineSeparator();
            msg = msg + "      List<Integer> xxxIdList = new ArrayList<Integer>();" + getLineSeparator();
            msg = msg + "      cb.query().setXxxId_InScope(xxxIdList);// Or pmb.setXxxIdList(xxxIdList);" + getLineSeparator();
            msg = msg + "    after  (o):" + getLineSeparator();
            msg = msg + "      List<Integer> xxxIdList = new ArrayList<Integer>();" + getLineSeparator();
            msg = msg + "      xxxIdList.add(3);" + getLineSeparator();
            msg = msg + "      xxxIdList.add(7);" + getLineSeparator();
            msg = msg + "      cb.query().setXxxId_InScope(xxxIdList);// Or pmb.setXxxIdList(xxxIdList);" + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[" + (bind ? "Bind Variable" : "Embedded Value") + " Comment Expression]" + getLineSeparator() + expression + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Specified SQL]" + getLineSeparator() + specifiedSql + getLineSeparator();
            msg = msg + "* * * * * * * * * */";
            throw new IllegalArgumentException(msg);
        }
		
        public static void throwBindOrEmbeddedParameterNullOnlyListException(String expression, String specifiedSql, boolean bind) {
            String msg = "Look! Read the message below." + getLineSeparator();
            msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
            msg = msg + "The list of " + (bind ? "bind variable" : "embedded value") + " was 'Null Only List'!" + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Advice]" + getLineSeparator();
            msg = msg + "Please confirm your application logic." + getLineSeparator();
            msg = msg + "  For example:" + getLineSeparator();
            msg = msg + "    before (x):" + getLineSeparator();
            msg = msg + "      List<Integer> xxxIdList = new ArrayList<Integer>();" + getLineSeparator();
            msg = msg + "      xxxIdList.add(null);" + getLineSeparator();
            msg = msg + "      xxxIdList.add(null);" + getLineSeparator();
            msg = msg + "      cb.query().setXxxId_InScope(xxxIdList);// Or pmb.setXxxIdList(xxxIdList);" + getLineSeparator();
            msg = msg + "    after  (o):" + getLineSeparator();
            msg = msg + "      List<Integer> xxxIdList = new ArrayList<Integer>();" + getLineSeparator();
            msg = msg + "      xxxIdList.add(3);" + getLineSeparator();
            msg = msg + "      xxxIdList.add(7);" + getLineSeparator();
            msg = msg + "      cb.query().setXxxId_InScope(xxxIdList);// Or pmb.setXxxIdList(xxxIdList);" + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[" + (bind ? "Bind Variable" : "Embedded Value") + " Comment Expression]" + getLineSeparator() + expression + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Specified SQL]" + getLineSeparator() + specifiedSql + getLineSeparator();
            msg = msg + "* * * * * * * * * */";
            throw new IllegalArgumentException(msg);
        }
		
        protected static String getLineSeparator() {
            return SimpleSystemUtil.getLineSeparator();
        }
	}
	
    // -----------------------------------------------------
    //                                                IfNode
    //                                                ------
    protected static class InternalIfNode extends ContainerNode {
        private String _expression;
        private Object _parsedExpression;
        private InternalElseNode _elseNode;
        private String _specifiedSql;

        public InternalIfNode(String expression, String specifiedSql) {
            this._expression = expression;
            this._parsedExpression = OgnlUtil.parseExpression(expression);
            this._specifiedSql = specifiedSql;
        }

        public String getExpression() {
            return _expression;
        }

        public InternalElseNode getElseNode() {
            return _elseNode;
        }

        public void setElseNode(InternalElseNode elseNode) {
            this._elseNode = elseNode;
        }

        public void accept(CommandContext ctx) {
            Object result = null;
            try {
                result = OgnlUtil.getValue(_parsedExpression, ctx);
            } catch (RuntimeException e) {
                if (!_expression.contains("pmb.")) {
                    throwIfCommentWrongExpressionException(_expression, e, _specifiedSql);
                }
                final String replaced = InternalStringUtil.replace(_expression, "pmb.", "pmb.parameterMap.");
                final Object secondParsedExpression = OgnlUtil.parseExpression(replaced);
                try {
                    result = OgnlUtil.getValue(secondParsedExpression, ctx);
                } catch (RuntimeException ignored) {
                    throwIfCommentWrongExpressionException(_expression, e, _specifiedSql);
                }
                if (result == null) {
                    throwIfCommentWrongExpressionException(_expression, e, _specifiedSql);
                }
                _parsedExpression = secondParsedExpression;
            }
            if (result != null && result instanceof Boolean) {
                if (((Boolean) result).booleanValue()) {
                    super.accept(ctx);
                    ctx.setEnabled(true);
                } else if (_elseNode != null) {
                    _elseNode.accept(ctx);
                    ctx.setEnabled(true);
                }
            } else {
                throwIfCommentNotBooleanResultException(_expression, result, _specifiedSql);
            }
        }

        protected void throwIfCommentWrongExpressionException(String expression, RuntimeException cause, String specifiedSql) {
            String msg = "Look! Read the message below." + getLineSeparator();
            msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
            msg = msg + "The IF comment of your specified SQL was Wrong!" + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Advice]" + getLineSeparator();
            msg = msg + "Please confirm the existence of your property on your arguments." + getLineSeparator();
            msg = msg + "And confirm the IF comment of your specified SQL." + getLineSeparator();
            msg = msg + "  For example, correct IF comment is as below:" + getLineSeparator();
            msg = msg + "    /*IF pmb.xxxId != null*/XXX_ID = .../*END*/" + getLineSeparator();
            msg = msg + "    /*IF pmb.isPaging()*/.../*END*/" + getLineSeparator();
            msg = msg + "    /*IF pmb.xxxId == null && pmb.xxxName != null*/.../*END*/" + getLineSeparator();
            msg = msg + "    /*IF pmb.xxxId == null || pmb.xxxName != null*/.../*END*/" + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[IF Comment Expression]" + getLineSeparator() + expression + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Cause Message]" + getLineSeparator();
            msg = msg + cause.getClass() + ":" + getLineSeparator();
            msg = msg + "  --> " + cause.getMessage() + getLineSeparator();
            final Throwable nestedCause = cause.getCause();
            if (nestedCause != null) {
                msg = msg + nestedCause.getClass() + ":" + getLineSeparator();
                msg = msg + "  --> " + nestedCause.getMessage() + getLineSeparator();
            }
            msg = msg + getLineSeparator();
            msg = msg + "[Specified SQL]" + getLineSeparator() + specifiedSql + getLineSeparator();
            msg = msg + "* * * * * * * * * */";
            throw new IfCommentWrongExpressionException(msg, cause);
        }

        protected void throwIfCommentNotBooleanResultException(String expression, Object result, String specifiedSql) {
            String msg = "Look! Read the message below." + getLineSeparator();
            msg = msg + "/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *" + getLineSeparator();
            msg = msg + "The boolean expression on IF comment of your specified SQL was Wrong!" + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Advice]" + getLineSeparator();
            msg = msg + "Please confirm the grammar of your IF comment. Does it really express boolean?" + getLineSeparator();
            msg = msg + "And confirm the existence of your property on your arguments if you use parameterMap." + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[IF Comment Expression]" + getLineSeparator() + expression + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[IF Comment Result Value]" + getLineSeparator() + result + getLineSeparator();
            msg = msg + getLineSeparator();
            msg = msg + "[Specified SQL]" + getLineSeparator() + specifiedSql + getLineSeparator();
            msg = msg + "* * * * * * * * * */";
            throw new IfCommentNotBooleanResultException(msg);
        }

        protected String getLineSeparator() {
            return SimpleSystemUtil.getLineSeparator();
        }
    }

    // -----------------------------------------------------
    //                                              ElseNode
    //                                              --------
    protected static class InternalElseNode extends ContainerNode {
        public void accept(CommandContext ctx) {
            super.accept(ctx);
            ctx.setEnabled(true);
        }
    }

    // -----------------------------------------------------
    //                                            StringUtil
    //                                            ----------
    protected static class InternalStringUtil {

        public static final String[] EMPTY_STRINGS = new String[0];
        private InternalStringUtil() {
        }

        public static final boolean isEmpty(String text) {
            return text == null || text.length() == 0;
        }

        public static final String replace(String text, String fromText,  String toText) {
		    return SimpleStringUtil.replace(text, fromText, toText);
        }

        public static String[] split(String str, String delim) {
            if (str == null) {
                return EMPTY_STRINGS;
            }
            List<String> list = new ArrayList<String>();
            StringTokenizer st = new StringTokenizer(str, delim);
            while (st.hasMoreElements()) {
                list.add(st.nextToken());
            }
            return (String[]) list.toArray(new String[list.size()]);
        }
    }
	
	// ===================================================================================
    //                                                                             Convert
    //                                                                             =======
	public static String convertTwoWaySql2DisplaySql(String twoWaySql, Object arg) {
	    final String[] argNames = new String[]{"dto"};
	    final Class<?>[] argTypes = new Class<?>[]{arg.getClass()};
	    final Object[] args = new Object[]{arg};
		return convertTwoWaySql2DisplaySql(twoWaySql, argNames, argTypes, args);
	}
	
	public static String convertTwoWaySql2DisplaySql(String twoWaySql, String[] argNames, Class<?>[] argTypes, Object[] args) {
        final CommandContext context;
		{
            final InternalSqlParser parser = new InternalSqlParser(twoWaySql);
            final Node node = parser.parse();
            final InternalCommandContextCreator creator = new InternalCommandContextCreator(argNames, argTypes);
            context = creator.createCommandContext(args);
            node.accept(context);
		}
        final String preparedSql = context.getSql();
		return InternalBindVariableUtil.getCompleteSql(preparedSql, context.getBindVariables());
	}
}
