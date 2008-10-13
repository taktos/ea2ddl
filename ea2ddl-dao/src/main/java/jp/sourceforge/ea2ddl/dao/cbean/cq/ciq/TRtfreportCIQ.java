package jp.sourceforge.ea2ddl.dao.cbean.cq.ciq;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.ConditionOption;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.bs.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The condition-inline-query of t_rtfreport.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class TRtfreportCIQ extends AbstractBsTRtfreportCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTRtfreportCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TRtfreportCIQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel, BsTRtfreportCQ myCQ) {
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
    protected ConditionValue getCValueTemplateid() {
        return _myCQ.getTemplateid();
    }
    protected ConditionValue getCValueRootpackage() {
        return _myCQ.getRootpackage();
    }
    protected ConditionValue getCValueFilename() {
        return _myCQ.getFilename();
    }
    protected ConditionValue getCValueDetails() {
        return _myCQ.getDetails();
    }
    protected ConditionValue getCValueProcesschildren() {
        return _myCQ.getProcesschildren();
    }
    protected ConditionValue getCValueShowdiagrams() {
        return _myCQ.getShowdiagrams();
    }
    protected ConditionValue getCValueHeading() {
        return _myCQ.getHeading();
    }
    protected ConditionValue getCValueRequirements() {
        return _myCQ.getRequirements();
    }
    protected ConditionValue getCValueAssociations() {
        return _myCQ.getAssociations();
    }
    protected ConditionValue getCValueScenarios() {
        return _myCQ.getScenarios();
    }
    protected ConditionValue getCValueChilddiagrams() {
        return _myCQ.getChilddiagrams();
    }
    protected ConditionValue getCValueAttributes() {
        return _myCQ.getAttributes();
    }
    protected ConditionValue getCValueMethods() {
        return _myCQ.getMethods();
    }
    protected ConditionValue getCValueImagetype() {
        return _myCQ.getImagetype();
    }
    protected ConditionValue getCValuePaging() {
        return _myCQ.getPaging();
    }
    protected ConditionValue getCValueIntro() {
        return _myCQ.getIntro();
    }
    protected ConditionValue getCValueResources() {
        return _myCQ.getResources();
    }
    protected ConditionValue getCValueConstraints() {
        return _myCQ.getConstraints();
    }
    protected ConditionValue getCValueTagged() {
        return _myCQ.getTagged();
    }
    protected ConditionValue getCValueShowtag() {
        return _myCQ.getShowtag();
    }
    protected ConditionValue getCValueShowalias() {
        return _myCQ.getShowalias();
    }
    protected ConditionValue getCValuePdata1() {
        return _myCQ.getPdata1();
    }
    protected ConditionValue getCValuePdata2() {
        return _myCQ.getPdata2();
    }
    protected ConditionValue getCValuePdata3() {
        return _myCQ.getPdata3();
    }
    protected ConditionValue getCValuePdata4() {
        return _myCQ.getPdata4();
    }

    protected String getConditionQueryClassNameInternally() { return TRtfreportCQ.class.getName(); }
}
