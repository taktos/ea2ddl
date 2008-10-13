package jp.sourceforge.ea2ddl.dao.cbean.cq.ciq;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.ConditionOption;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.bs.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The condition-inline-query of t_xrefuser.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class TXrefuserCIQ extends AbstractBsTXrefuserCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTXrefuserCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TXrefuserCIQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel, BsTXrefuserCQ myCQ) {
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
    protected ConditionValue getCValueXrefid() {
        return _myCQ.getXrefid();
    }
    protected ConditionValue getCValueToolid() {
        return _myCQ.getToolid();
    }
    protected ConditionValue getCValueName() {
        return _myCQ.getName();
    }
    protected ConditionValue getCValueType() {
        return _myCQ.getType();
    }
    protected ConditionValue getCValueVisibility() {
        return _myCQ.getVisibility();
    }
    protected ConditionValue getCValueNamespace() {
        return _myCQ.getNamespace();
    }
    protected ConditionValue getCValueRequirement() {
        return _myCQ.getRequirement();
    }
    protected ConditionValue getCValueConstraint() {
        return _myCQ.getConstraint();
    }
    protected ConditionValue getCValueBehavior() {
        return _myCQ.getBehavior();
    }
    protected ConditionValue getCValuePartition() {
        return _myCQ.getPartition();
    }
    protected ConditionValue getCValueDescription() {
        return _myCQ.getDescription();
    }
    protected ConditionValue getCValueClient() {
        return _myCQ.getClient();
    }
    protected ConditionValue getCValueSupplier() {
        return _myCQ.getSupplier();
    }
    protected ConditionValue getCValueLink() {
        return _myCQ.getLink();
    }

    protected String getConditionQueryClassNameInternally() { return TXrefuserCQ.class.getName(); }
}
