package jp.sourceforge.ea2ddl.dao.cbean.cq.ciq;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.ConditionOption;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.bs.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The condition-inline-query of t_datatypes.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class TDatatypesCIQ extends AbstractBsTDatatypesCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTDatatypesCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TDatatypesCIQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel, BsTDatatypesCQ myCQ) {
        super(childQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.getForeignPropertyName();// Accept foreign property name.
        _relationPath = _myCQ.getRelationPath();// Accept relation path.
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    @Override
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
        throw new UnsupportedOperationException("InlineQuery must not need UNION method: " + baseQueryAsSuper + " : " + unionQueryAsSuper);
    }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey key, Object value, ConditionValue cvalue
                                                             , String colName, String capPropName, String uncapPropName) {
        registerInlineQuery(key, value, cvalue, colName, capPropName, uncapPropName);
    }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey key, Object value, ConditionValue cvalue
                                                             , String colName, String capPropName, String uncapPropName, ConditionOption option) {
        registerInlineQuery(key, value, cvalue, colName, capPropName, uncapPropName, option);
    }

    @Override
    protected void registerWhereClause(String whereClause) {
        registerInlineWhereClause(whereClause);
    }

    @Override
    protected String getInScopeSubQueryRealColumnName(String columnName) {
        if (_onClauseInline) {
            throw new UnsupportedOperationException("InScopeSubQuery of on-clause is unsupported");
        }
        return _onClauseInline ? getRealAliasName() + "." + columnName : columnName;
    }

    @Override
    protected void registerExistsSubQuery(ConditionQuery subQuery
                                 , String columnName, String relatedColumnName, String propertyName) {
        throw new UnsupportedOperationException("Sorry! ExistsSubQuery at inline view is unsupported. So please use InScopeSubQyery.");
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue getCValueType() {
        return _myCQ.getType();
    }
    protected ConditionValue getCValueProductname() {
        return _myCQ.getProductname();
    }
    protected ConditionValue getCValueDatatype() {
        return _myCQ.getDatatype();
    }
    protected ConditionValue getCValueSize() {
        return _myCQ.getSize();
    }
    protected ConditionValue getCValueMaxlen() {
        return _myCQ.getMaxlen();
    }
    protected ConditionValue getCValueMaxprec() {
        return _myCQ.getMaxprec();
    }
    protected ConditionValue getCValueMaxscale() {
        return _myCQ.getMaxscale();
    }
    protected ConditionValue getCValueDefaultlen() {
        return _myCQ.getDefaultlen();
    }
    protected ConditionValue getCValueDefaultprec() {
        return _myCQ.getDefaultprec();
    }
    protected ConditionValue getCValueDefaultscale() {
        return _myCQ.getDefaultscale();
    }
    protected ConditionValue getCValueUser() {
        return _myCQ.getUser();
    }
    protected ConditionValue getCValuePdata1() {
        return _myCQ.getPdata1();
    }
    protected ConditionValue getCValuePdata2() {
        return _myCQ.getPdata2();
    }
    protected ConditionValue getCValuePdata3() {
        return _myCQ.getPdata3();
    }
    protected ConditionValue getCValuePdata4() {
        return _myCQ.getPdata4();
    }
    protected ConditionValue getCValueHaslength() {
        return _myCQ.getHaslength();
    }
    protected ConditionValue getCValueGenerictype() {
        return _myCQ.getGenerictype();
    }
    protected ConditionValue getCValueDatatypeid() {
        return _myCQ.getDatatypeid();
    }

    protected String getConditionQueryClassNameInternally() { return TDatatypesCQ.class.getName(); }
}
