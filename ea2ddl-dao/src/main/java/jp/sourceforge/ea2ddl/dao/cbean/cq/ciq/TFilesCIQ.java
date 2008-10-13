package jp.sourceforge.ea2ddl.dao.cbean.cq.ciq;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.ConditionOption;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.bs.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The condition-inline-query of t_files.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class TFilesCIQ extends AbstractBsTFilesCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTFilesCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TFilesCIQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel, BsTFilesCQ myCQ) {
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
    protected ConditionValue getCValueFileid() {
        return _myCQ.getFileid();
    }
    protected ConditionValue getCValueAppliesto() {
        return _myCQ.getAppliesto();
    }
    protected ConditionValue getCValueCategory() {
        return _myCQ.getCategory();
    }
    protected ConditionValue getCValueName() {
        return _myCQ.getName();
    }
    protected ConditionValue getCValueFile() {
        return _myCQ.getFile();
    }
    protected ConditionValue getCValueNotes() {
        return _myCQ.getNotes();
    }
    protected ConditionValue getCValueFiledate() {
        return _myCQ.getFiledate();
    }
    protected ConditionValue getCValueFilesize() {
        return _myCQ.getFilesize();
    }

    protected String getConditionQueryClassNameInternally() { return TFilesCQ.class.getName(); }
}
