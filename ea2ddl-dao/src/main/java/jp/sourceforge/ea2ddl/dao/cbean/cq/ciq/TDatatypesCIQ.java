package jp.sourceforge.ea2ddl.dao.cbean.cq.ciq;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.ConditionOption;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.bs.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The condition-inline-query of t_datatypes.
 * @author DBFlute(AutoGenerator)
 */
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
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col) {
        regIQ(k, v, cv, col);
    }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op) {
        regIQ(k, v, cv, col, op);
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

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xiCB() { return TDatatypesCB.class.getName(); }
    String xiCQ() { return TDatatypesCQ.class.getName(); }
}
