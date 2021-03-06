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
 * The condition-inline-query of t_issues.
 * @author DBFlute(AutoGenerator)
 */
public class TIssuesCIQ extends AbstractBsTIssuesCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTIssuesCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TIssuesCIQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel, BsTIssuesCQ myCQ) {
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
    protected ConditionValue getCValueIssue() {
        return _myCQ.getIssue();
    }
    protected ConditionValue getCValueIssuedate() {
        return _myCQ.getIssuedate();
    }
    protected ConditionValue getCValueOwner() {
        return _myCQ.getOwner();
    }
    protected ConditionValue getCValueStatus() {
        return _myCQ.getStatus();
    }
    protected ConditionValue getCValueNotes() {
        return _myCQ.getNotes();
    }
    protected ConditionValue getCValueResolver() {
        return _myCQ.getResolver();
    }
    protected ConditionValue getCValueDateresolved() {
        return _myCQ.getDateresolved();
    }
    protected ConditionValue getCValueResolution() {
        return _myCQ.getResolution();
    }
    protected ConditionValue getCValueIssueid() {
        return _myCQ.getIssueid();
    }
    protected ConditionValue getCValueCategory() {
        return _myCQ.getCategory();
    }
    protected ConditionValue getCValuePriority() {
        return _myCQ.getPriority();
    }
    protected ConditionValue getCValueSeverity() {
        return _myCQ.getSeverity();
    }
    protected ConditionValue getCValueIssuetype() {
        return _myCQ.getIssuetype();
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xiCB() { return TIssuesCB.class.getName(); }
    String xiCQ() { return TIssuesCQ.class.getName(); }
}
