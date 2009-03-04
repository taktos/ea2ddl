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
 * The condition-inline-query of t_objectproblems.
 * @author DBFlute(AutoGenerator)
 */
public class TObjectproblemsCIQ extends AbstractBsTObjectproblemsCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTObjectproblemsCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TObjectproblemsCIQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel, BsTObjectproblemsCQ myCQ) {
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
    protected ConditionValue getCValueProblem() {
        return _myCQ.getProblem();
    }
    protected ConditionValue getCValueProblemtype() {
        return _myCQ.getProblemtype();
    }
    protected ConditionValue getCValueDatereported() {
        return _myCQ.getDatereported();
    }
    protected ConditionValue getCValueStatus() {
        return _myCQ.getStatus();
    }
    protected ConditionValue getCValueProblemnotes() {
        return _myCQ.getProblemnotes();
    }
    protected ConditionValue getCValueReportedby() {
        return _myCQ.getReportedby();
    }
    protected ConditionValue getCValueResolvedby() {
        return _myCQ.getResolvedby();
    }
    protected ConditionValue getCValueDateresolved() {
        return _myCQ.getDateresolved();
    }
    protected ConditionValue getCValueVersion() {
        return _myCQ.getVersion();
    }
    protected ConditionValue getCValueResolvernotes() {
        return _myCQ.getResolvernotes();
    }
    protected ConditionValue getCValuePriority() {
        return _myCQ.getPriority();
    }
    protected ConditionValue getCValueSeverity() {
        return _myCQ.getSeverity();
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xiCB() { return TObjectproblemsCB.class.getName(); }
    String xiCQ() { return TObjectproblemsCQ.class.getName(); }
}
