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
 * The condition-inline-query of t_objecttests.
 * @author DBFlute(AutoGenerator)
 */
public class TObjecttestsCIQ extends AbstractBsTObjecttestsCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTObjecttestsCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TObjecttestsCIQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel, BsTObjecttestsCQ myCQ) {
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
    protected ConditionValue getCValueObjectId() {
        return _myCQ.getObjectId();
    }
    protected ConditionValue getCValueTest() {
        return _myCQ.getTest();
    }
    protected ConditionValue getCValueTestclass() {
        return _myCQ.getTestclass();
    }
    protected ConditionValue getCValueTesttype() {
        return _myCQ.getTesttype();
    }
    protected ConditionValue getCValueNotes() {
        return _myCQ.getNotes();
    }
    protected ConditionValue getCValueInputdata() {
        return _myCQ.getInputdata();
    }
    protected ConditionValue getCValueAcceptancecriteria() {
        return _myCQ.getAcceptancecriteria();
    }
    protected ConditionValue getCValueStatus() {
        return _myCQ.getStatus();
    }
    protected ConditionValue getCValueDaterun() {
        return _myCQ.getDaterun();
    }
    protected ConditionValue getCValueResults() {
        return _myCQ.getResults();
    }
    protected ConditionValue getCValueRunby() {
        return _myCQ.getRunby();
    }
    protected ConditionValue getCValueCheckby() {
        return _myCQ.getCheckby();
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xiCB() { return TObjecttestsCB.class.getName(); }
    String xiCQ() { return TObjecttestsCQ.class.getName(); }
}
