package jp.sourceforge.ea2ddl.dao.cbean.cq.ciq;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.ConditionOption;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.bs.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The condition-inline-query of t_objectproperties.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class TObjectpropertiesCIQ extends AbstractBsTObjectpropertiesCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTObjectpropertiesCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TObjectpropertiesCIQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel, BsTObjectpropertiesCQ myCQ) {
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
    protected ConditionValue getCValuePropertyid() {
        return _myCQ.getPropertyid();
    }
    protected ConditionValue getCValueObjectId() {
        return _myCQ.getObjectId();
    }
    public String keepObjectId_InScopeSubQuery_TObject(TObjectCQ subQuery) {
        return _myCQ.keepObjectId_InScopeSubQuery_TObject(subQuery);
    }
    protected ConditionValue getCValueProperty() {
        return _myCQ.getProperty();
    }
    protected ConditionValue getCValueValue() {
        return _myCQ.getValue();
    }
    protected ConditionValue getCValueNotes() {
        return _myCQ.getNotes();
    }
    protected ConditionValue getCValueEaGuid() {
        return _myCQ.getEaGuid();
    }

    protected String getConditionQueryClassNameInternally() { return TObjectpropertiesCQ.class.getName(); }
}
