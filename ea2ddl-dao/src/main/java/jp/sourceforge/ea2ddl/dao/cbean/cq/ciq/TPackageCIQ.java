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
 * The condition-inline-query of t_package.
 * @author DBFlute(AutoGenerator)
 */
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

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xiCB() { return TPackageCB.class.getName(); }
    String xiCQ() { return TPackageCQ.class.getName(); }
}
