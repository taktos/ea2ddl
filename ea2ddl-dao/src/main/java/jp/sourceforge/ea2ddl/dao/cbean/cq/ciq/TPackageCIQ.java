package jp.sourceforge.ea2ddl.dao.cbean.cq.ciq;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.ConditionOption;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.bs.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The condition-inline-query of t_package.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class TPackageCIQ extends AbstractBsTPackageCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTPackageCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TPackageCIQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel, BsTPackageCQ myCQ) {
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
    protected ConditionValue getCValuePackageId() {
        return _myCQ.getPackageId();
    }
    protected ConditionValue getCValueName() {
        return _myCQ.getName();
    }
    protected ConditionValue getCValueParentId() {
        return _myCQ.getParentId();
    }
    protected ConditionValue getCValueCreateddate() {
        return _myCQ.getCreateddate();
    }
    protected ConditionValue getCValueModifieddate() {
        return _myCQ.getModifieddate();
    }
    protected ConditionValue getCValueNotes() {
        return _myCQ.getNotes();
    }
    protected ConditionValue getCValueEaGuid() {
        return _myCQ.getEaGuid();
    }
    protected ConditionValue getCValueXmlpath() {
        return _myCQ.getXmlpath();
    }
    protected ConditionValue getCValueIscontrolled() {
        return _myCQ.getIscontrolled();
    }
    protected ConditionValue getCValueLastloaddate() {
        return _myCQ.getLastloaddate();
    }
    protected ConditionValue getCValueLastsavedate() {
        return _myCQ.getLastsavedate();
    }
    protected ConditionValue getCValueVersion() {
        return _myCQ.getVersion();
    }
    protected ConditionValue getCValuePkgowner() {
        return _myCQ.getPkgowner();
    }
    protected ConditionValue getCValueUmlversion() {
        return _myCQ.getUmlversion();
    }
    protected ConditionValue getCValueUsedtd() {
        return _myCQ.getUsedtd();
    }
    protected ConditionValue getCValueLogxml() {
        return _myCQ.getLogxml();
    }
    protected ConditionValue getCValueCodepath() {
        return _myCQ.getCodepath();
    }
    protected ConditionValue getCValueNamespace() {
        return _myCQ.getNamespace();
    }
    protected ConditionValue getCValueTpos() {
        return _myCQ.getTpos();
    }
    protected ConditionValue getCValuePackageflags() {
        return _myCQ.getPackageflags();
    }
    protected ConditionValue getCValueBatchsave() {
        return _myCQ.getBatchsave();
    }
    protected ConditionValue getCValueBatchload() {
        return _myCQ.getBatchload();
    }

    protected String getConditionQueryClassNameInternally() { return TPackageCQ.class.getName(); }
}
