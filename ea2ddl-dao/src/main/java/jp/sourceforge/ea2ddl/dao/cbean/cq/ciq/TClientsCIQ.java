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
 * The condition-inline-query of t_clients.
 * @author DBFlute(AutoGenerator)
 */
public class TClientsCIQ extends AbstractBsTClientsCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTClientsCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TClientsCIQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel, BsTClientsCQ myCQ) {
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
    protected ConditionValue getCValueName() {
        return _myCQ.getName();
    }
    protected ConditionValue getCValueOrganisation() {
        return _myCQ.getOrganisation();
    }
    protected ConditionValue getCValuePhone1() {
        return _myCQ.getPhone1();
    }
    protected ConditionValue getCValuePhone2() {
        return _myCQ.getPhone2();
    }
    protected ConditionValue getCValueMobile() {
        return _myCQ.getMobile();
    }
    protected ConditionValue getCValueFax() {
        return _myCQ.getFax();
    }
    protected ConditionValue getCValueEmail() {
        return _myCQ.getEmail();
    }
    protected ConditionValue getCValueRoles() {
        return _myCQ.getRoles();
    }
    protected ConditionValue getCValueNotes() {
        return _myCQ.getNotes();
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xiCB() { return TClientsCB.class.getName(); }
    String xiCQ() { return TClientsCQ.class.getName(); }
}
