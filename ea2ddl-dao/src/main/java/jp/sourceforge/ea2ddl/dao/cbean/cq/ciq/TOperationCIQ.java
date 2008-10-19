package jp.sourceforge.ea2ddl.dao.cbean.cq.ciq;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.ConditionOption;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.bs.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The condition-inline-query of t_operation.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class TOperationCIQ extends AbstractBsTOperationCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTOperationCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TOperationCIQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel, BsTOperationCQ myCQ) {
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
    protected ConditionValue getCValueOperationid() {
        return _myCQ.getOperationid();
    }
    public String keepOperationid_InScopeSubQuery_TOperationparamsList(TOperationparamsCQ subQuery) {
        return _myCQ.keepOperationid_InScopeSubQuery_TOperationparamsList(subQuery);
    }
    public String keepOperationid_NotInScopeSubQuery_TOperationparamsList(TOperationparamsCQ subQuery) {
        return _myCQ.keepOperationid_NotInScopeSubQuery_TOperationparamsList(subQuery);
    }
    public String keepOperationid_ExistsSubQuery_TOperationparamsList(TOperationparamsCQ subQuery) {
        throw new UnsupportedOperationException("ExistsSubQuery at inline() is unsupported! Sorry!");
    }
    public String keepOperationid_NotExistsSubQuery_TOperationparamsList(TOperationparamsCQ subQuery) {
        throw new UnsupportedOperationException("NotExistsSubQuery at inline() is unsupported! Sorry!");
    }
    public String keepOperationid_DeriveSubQuery_TOperationparamsList(TOperationparamsCQ subQuery) {
        throw new UnsupportedOperationException("DeriveSubQuery at inline() is unsupported! Sorry!");
    }
    protected ConditionValue getCValueObjectId() {
        return _myCQ.getObjectId();
    }
    protected ConditionValue getCValueName() {
        return _myCQ.getName();
    }
    public String keepName_InScopeSubQuery_TConnectorBySourceroleList(TConnectorCQ subQuery) {
        return _myCQ.keepName_InScopeSubQuery_TConnectorBySourceroleList(subQuery);
    }
    public String keepName_InScopeSubQuery_TConnectorByDestroleList(TConnectorCQ subQuery) {
        return _myCQ.keepName_InScopeSubQuery_TConnectorByDestroleList(subQuery);
    }
    public String keepName_NotInScopeSubQuery_TConnectorBySourceroleList(TConnectorCQ subQuery) {
        return _myCQ.keepName_NotInScopeSubQuery_TConnectorBySourceroleList(subQuery);
    }
    public String keepName_NotInScopeSubQuery_TConnectorByDestroleList(TConnectorCQ subQuery) {
        return _myCQ.keepName_NotInScopeSubQuery_TConnectorByDestroleList(subQuery);
    }
    public String keepName_ExistsSubQuery_TConnectorBySourceroleList(TConnectorCQ subQuery) {
        throw new UnsupportedOperationException("ExistsSubQuery at inline() is unsupported! Sorry!");
    }
    public String keepName_ExistsSubQuery_TConnectorByDestroleList(TConnectorCQ subQuery) {
        throw new UnsupportedOperationException("ExistsSubQuery at inline() is unsupported! Sorry!");
    }
    public String keepName_NotExistsSubQuery_TConnectorBySourceroleList(TConnectorCQ subQuery) {
        throw new UnsupportedOperationException("NotExistsSubQuery at inline() is unsupported! Sorry!");
    }
    public String keepName_NotExistsSubQuery_TConnectorByDestroleList(TConnectorCQ subQuery) {
        throw new UnsupportedOperationException("NotExistsSubQuery at inline() is unsupported! Sorry!");
    }
    public String keepName_DeriveSubQuery_TConnectorBySourceroleList(TConnectorCQ subQuery) {
        throw new UnsupportedOperationException("DeriveSubQuery at inline() is unsupported! Sorry!");
    }
    public String keepName_DeriveSubQuery_TConnectorByDestroleList(TConnectorCQ subQuery) {
        throw new UnsupportedOperationException("DeriveSubQuery at inline() is unsupported! Sorry!");
    }
    protected ConditionValue getCValueScope() {
        return _myCQ.getScope();
    }
    protected ConditionValue getCValueType() {
        return _myCQ.getType();
    }
    protected ConditionValue getCValueReturnarray() {
        return _myCQ.getReturnarray();
    }
    protected ConditionValue getCValueStereotype() {
        return _myCQ.getStereotype();
    }
    protected ConditionValue getCValueIsstatic() {
        return _myCQ.getIsstatic();
    }
    protected ConditionValue getCValueConcurrency() {
        return _myCQ.getConcurrency();
    }
    protected ConditionValue getCValueNotes() {
        return _myCQ.getNotes();
    }
    protected ConditionValue getCValueBehaviour() {
        return _myCQ.getBehaviour();
    }
    protected ConditionValue getCValueGenoption() {
        return _myCQ.getGenoption();
    }
    protected ConditionValue getCValuePos() {
        return _myCQ.getPos();
    }
    protected ConditionValue getCValueStyle() {
        return _myCQ.getStyle();
    }
    protected ConditionValue getCValuePure() {
        return _myCQ.getPure();
    }
    protected ConditionValue getCValueClassifier() {
        return _myCQ.getClassifier();
    }
    protected ConditionValue getCValueCode() {
        return _myCQ.getCode();
    }
    protected ConditionValue getCValueIsroot() {
        return _myCQ.getIsroot();
    }
    protected ConditionValue getCValueIsleaf() {
        return _myCQ.getIsleaf();
    }
    protected ConditionValue getCValueIsquery() {
        return _myCQ.getIsquery();
    }
    protected ConditionValue getCValueStateflags() {
        return _myCQ.getStateflags();
    }
    protected ConditionValue getCValueEaGuid() {
        return _myCQ.getEaGuid();
    }
    protected ConditionValue getCValueStyleex() {
        return _myCQ.getStyleex();
    }

    protected String getConditionQueryClassNameInternally() { return TOperationCQ.class.getName(); }
}
