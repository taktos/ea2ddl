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
 * The condition-inline-query of t_objectresource.
 * @author DBFlute(AutoGenerator)
 */
public class TObjectresourceCIQ extends AbstractBsTObjectresourceCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTObjectresourceCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TObjectresourceCIQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel, BsTObjectresourceCQ myCQ) {
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
    protected ConditionValue getCValueResource() {
        return _myCQ.getResource();
    }
    protected ConditionValue getCValueRole() {
        return _myCQ.getRole();
    }
    protected ConditionValue getCValueTime() {
        return _myCQ.getTime();
    }
    protected ConditionValue getCValueNotes() {
        return _myCQ.getNotes();
    }
    protected ConditionValue getCValuePercentcomplete() {
        return _myCQ.getPercentcomplete();
    }
    protected ConditionValue getCValueDatestart() {
        return _myCQ.getDatestart();
    }
    protected ConditionValue getCValueDateend() {
        return _myCQ.getDateend();
    }
    protected ConditionValue getCValueHistory() {
        return _myCQ.getHistory();
    }
    protected ConditionValue getCValueExpectedhours() {
        return _myCQ.getExpectedhours();
    }
    protected ConditionValue getCValueActualhours() {
        return _myCQ.getActualhours();
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xiCB() { return TObjectresourceCB.class.getName(); }
    String xiCQ() { return TObjectresourceCQ.class.getName(); }
}
