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
 * The condition-inline-query of t_object.
 * @author DBFlute(AutoGenerator)
 */
public class TObjectCIQ extends AbstractBsTObjectCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTObjectCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TObjectCIQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel, BsTObjectCQ myCQ) {
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
    public String keepObjectId_InScopeSubQuery_TObjectpropertiesList(TObjectpropertiesCQ subQuery) {
        return _myCQ.keepObjectId_InScopeSubQuery_TObjectpropertiesList(subQuery);
    }
    public String keepObjectId_InScopeSubQuery_TAttributeList(TAttributeCQ subQuery) {
        return _myCQ.keepObjectId_InScopeSubQuery_TAttributeList(subQuery);
    }
    public String keepObjectId_InScopeSubQuery_TOperationList(TOperationCQ subQuery) {
        return _myCQ.keepObjectId_InScopeSubQuery_TOperationList(subQuery);
    }
    public String keepObjectId_InScopeSubQuery_TConnectorByStartObjectIdList(TConnectorCQ subQuery) {
        return _myCQ.keepObjectId_InScopeSubQuery_TConnectorByStartObjectIdList(subQuery);
    }
    public String keepObjectId_InScopeSubQuery_TConnectorByEndObjectIdList(TConnectorCQ subQuery) {
        return _myCQ.keepObjectId_InScopeSubQuery_TConnectorByEndObjectIdList(subQuery);
    }
    public String keepObjectId_NotInScopeSubQuery_TObjectpropertiesList(TObjectpropertiesCQ subQuery) {
        return _myCQ.keepObjectId_NotInScopeSubQuery_TObjectpropertiesList(subQuery);
    }
    public String keepObjectId_NotInScopeSubQuery_TAttributeList(TAttributeCQ subQuery) {
        return _myCQ.keepObjectId_NotInScopeSubQuery_TAttributeList(subQuery);
    }
    public String keepObjectId_NotInScopeSubQuery_TOperationList(TOperationCQ subQuery) {
        return _myCQ.keepObjectId_NotInScopeSubQuery_TOperationList(subQuery);
    }
    public String keepObjectId_NotInScopeSubQuery_TConnectorByStartObjectIdList(TConnectorCQ subQuery) {
        return _myCQ.keepObjectId_NotInScopeSubQuery_TConnectorByStartObjectIdList(subQuery);
    }
    public String keepObjectId_NotInScopeSubQuery_TConnectorByEndObjectIdList(TConnectorCQ subQuery) {
        return _myCQ.keepObjectId_NotInScopeSubQuery_TConnectorByEndObjectIdList(subQuery);
    }
    public String keepObjectId_ExistsSubQuery_TObjectpropertiesList(TObjectpropertiesCQ subQuery) {
        throw new UnsupportedOperationException("ExistsSubQuery at inline() is unsupported! Sorry!");
    }
    public String keepObjectId_ExistsSubQuery_TAttributeList(TAttributeCQ subQuery) {
        throw new UnsupportedOperationException("ExistsSubQuery at inline() is unsupported! Sorry!");
    }
    public String keepObjectId_ExistsSubQuery_TOperationList(TOperationCQ subQuery) {
        throw new UnsupportedOperationException("ExistsSubQuery at inline() is unsupported! Sorry!");
    }
    public String keepObjectId_ExistsSubQuery_TConnectorByStartObjectIdList(TConnectorCQ subQuery) {
        throw new UnsupportedOperationException("ExistsSubQuery at inline() is unsupported! Sorry!");
    }
    public String keepObjectId_ExistsSubQuery_TConnectorByEndObjectIdList(TConnectorCQ subQuery) {
        throw new UnsupportedOperationException("ExistsSubQuery at inline() is unsupported! Sorry!");
    }
    public String keepObjectId_NotExistsSubQuery_TObjectpropertiesList(TObjectpropertiesCQ subQuery) {
        throw new UnsupportedOperationException("NotExistsSubQuery at inline() is unsupported! Sorry!");
    }
    public String keepObjectId_NotExistsSubQuery_TAttributeList(TAttributeCQ subQuery) {
        throw new UnsupportedOperationException("NotExistsSubQuery at inline() is unsupported! Sorry!");
    }
    public String keepObjectId_NotExistsSubQuery_TOperationList(TOperationCQ subQuery) {
        throw new UnsupportedOperationException("NotExistsSubQuery at inline() is unsupported! Sorry!");
    }
    public String keepObjectId_NotExistsSubQuery_TConnectorByStartObjectIdList(TConnectorCQ subQuery) {
        throw new UnsupportedOperationException("NotExistsSubQuery at inline() is unsupported! Sorry!");
    }
    public String keepObjectId_NotExistsSubQuery_TConnectorByEndObjectIdList(TConnectorCQ subQuery) {
        throw new UnsupportedOperationException("NotExistsSubQuery at inline() is unsupported! Sorry!");
    }
    public String keepObjectId_SpecifyDerivedReferrer_TObjectpropertiesList(TObjectpropertiesCQ subQuery) {
        throw new UnsupportedOperationException("(Specify)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    public String keepObjectId_SpecifyDerivedReferrer_TAttributeList(TAttributeCQ subQuery) {
        throw new UnsupportedOperationException("(Specify)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    public String keepObjectId_SpecifyDerivedReferrer_TOperationList(TOperationCQ subQuery) {
        throw new UnsupportedOperationException("(Specify)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    public String keepObjectId_SpecifyDerivedReferrer_TConnectorByStartObjectIdList(TConnectorCQ subQuery) {
        throw new UnsupportedOperationException("(Specify)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    public String keepObjectId_SpecifyDerivedReferrer_TConnectorByEndObjectIdList(TConnectorCQ subQuery) {
        throw new UnsupportedOperationException("(Specify)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    public String keepObjectId_QueryDerivedReferrer_TObjectpropertiesList(TObjectpropertiesCQ subQuery) {
        throw new UnsupportedOperationException("(Query)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    public String keepObjectId_QueryDerivedReferrer_TObjectpropertiesListParameter(Object parameterValue) {
        throw new UnsupportedOperationException("(Query)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    public String keepObjectId_QueryDerivedReferrer_TAttributeList(TAttributeCQ subQuery) {
        throw new UnsupportedOperationException("(Query)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    public String keepObjectId_QueryDerivedReferrer_TAttributeListParameter(Object parameterValue) {
        throw new UnsupportedOperationException("(Query)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    public String keepObjectId_QueryDerivedReferrer_TOperationList(TOperationCQ subQuery) {
        throw new UnsupportedOperationException("(Query)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    public String keepObjectId_QueryDerivedReferrer_TOperationListParameter(Object parameterValue) {
        throw new UnsupportedOperationException("(Query)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    public String keepObjectId_QueryDerivedReferrer_TConnectorByStartObjectIdList(TConnectorCQ subQuery) {
        throw new UnsupportedOperationException("(Query)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    public String keepObjectId_QueryDerivedReferrer_TConnectorByStartObjectIdListParameter(Object parameterValue) {
        throw new UnsupportedOperationException("(Query)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    public String keepObjectId_QueryDerivedReferrer_TConnectorByEndObjectIdList(TConnectorCQ subQuery) {
        throw new UnsupportedOperationException("(Query)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    public String keepObjectId_QueryDerivedReferrer_TConnectorByEndObjectIdListParameter(Object parameterValue) {
        throw new UnsupportedOperationException("(Query)DerivedReferrer at inline() is unsupported! Sorry!");
    }
    protected ConditionValue getCValueObjectType() {
        return _myCQ.getObjectType();
    }
    protected ConditionValue getCValueDiagramId() {
        return _myCQ.getDiagramId();
    }
    protected ConditionValue getCValueName() {
        return _myCQ.getName();
    }
    protected ConditionValue getCValueAlias() {
        return _myCQ.getAlias();
    }
    protected ConditionValue getCValueAuthor() {
        return _myCQ.getAuthor();
    }
    protected ConditionValue getCValueVersion() {
        return _myCQ.getVersion();
    }
    protected ConditionValue getCValueNote() {
        return _myCQ.getNote();
    }
    protected ConditionValue getCValuePackageId() {
        return _myCQ.getPackageId();
    }
    protected ConditionValue getCValueStereotype() {
        return _myCQ.getStereotype();
    }
    protected ConditionValue getCValueNtype() {
        return _myCQ.getNtype();
    }
    protected ConditionValue getCValueComplexity() {
        return _myCQ.getComplexity();
    }
    protected ConditionValue getCValueEffort() {
        return _myCQ.getEffort();
    }
    protected ConditionValue getCValueStyle() {
        return _myCQ.getStyle();
    }
    protected ConditionValue getCValueBackcolor() {
        return _myCQ.getBackcolor();
    }
    protected ConditionValue getCValueBorderstyle() {
        return _myCQ.getBorderstyle();
    }
    protected ConditionValue getCValueBorderwidth() {
        return _myCQ.getBorderwidth();
    }
    protected ConditionValue getCValueFontcolor() {
        return _myCQ.getFontcolor();
    }
    protected ConditionValue getCValueBordercolor() {
        return _myCQ.getBordercolor();
    }
    protected ConditionValue getCValueCreateddate() {
        return _myCQ.getCreateddate();
    }
    protected ConditionValue getCValueModifieddate() {
        return _myCQ.getModifieddate();
    }
    protected ConditionValue getCValueStatus() {
        return _myCQ.getStatus();
    }
    protected ConditionValue getCValueTagged() {
        return _myCQ.getTagged();
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
    protected ConditionValue getCValuePdata5() {
        return _myCQ.getPdata5();
    }
    protected ConditionValue getCValueConcurrency() {
        return _myCQ.getConcurrency();
    }
    protected ConditionValue getCValueVisibility() {
        return _myCQ.getVisibility();
    }
    protected ConditionValue getCValuePersistence() {
        return _myCQ.getPersistence();
    }
    protected ConditionValue getCValueCardinality() {
        return _myCQ.getCardinality();
    }
    protected ConditionValue getCValueGentype() {
        return _myCQ.getGentype();
    }
    protected ConditionValue getCValueGenfile() {
        return _myCQ.getGenfile();
    }
    protected ConditionValue getCValueHeader1() {
        return _myCQ.getHeader1();
    }
    protected ConditionValue getCValueHeader2() {
        return _myCQ.getHeader2();
    }
    protected ConditionValue getCValuePhase() {
        return _myCQ.getPhase();
    }
    protected ConditionValue getCValueScope() {
        return _myCQ.getScope();
    }
    protected ConditionValue getCValueGenoption() {
        return _myCQ.getGenoption();
    }
    protected ConditionValue getCValueGenlinks() {
        return _myCQ.getGenlinks();
    }
    protected ConditionValue getCValueClassifier() {
        return _myCQ.getClassifier();
    }
    protected ConditionValue getCValueEaGuid() {
        return _myCQ.getEaGuid();
    }
    protected ConditionValue getCValueParentid() {
        return _myCQ.getParentid();
    }
    protected ConditionValue getCValueRunstate() {
        return _myCQ.getRunstate();
    }
    protected ConditionValue getCValueClassifierGuid() {
        return _myCQ.getClassifierGuid();
    }
    protected ConditionValue getCValueTpos() {
        return _myCQ.getTpos();
    }
    protected ConditionValue getCValueIsroot() {
        return _myCQ.getIsroot();
    }
    protected ConditionValue getCValueIsleaf() {
        return _myCQ.getIsleaf();
    }
    protected ConditionValue getCValueIsspec() {
        return _myCQ.getIsspec();
    }
    protected ConditionValue getCValueIsactive() {
        return _myCQ.getIsactive();
    }
    protected ConditionValue getCValueStateflags() {
        return _myCQ.getStateflags();
    }
    protected ConditionValue getCValuePackageflags() {
        return _myCQ.getPackageflags();
    }
    protected ConditionValue getCValueMultiplicity() {
        return _myCQ.getMultiplicity();
    }
    protected ConditionValue getCValueStyleex() {
        return _myCQ.getStyleex();
    }
    protected ConditionValue getCValueActionflags() {
        return _myCQ.getActionflags();
    }
    protected ConditionValue getCValueEventflags() {
        return _myCQ.getEventflags();
    }

    // ===================================================================================
    //                                                                     Scalar SubQuery
    //                                                                     ===============
    public String keepScalarSubQuery(TObjectCQ subQuery) {
        throw new UnsupportedOperationException("ScalarSubQuery at inline() is unsupported! Sorry!");
    }

    // ===================================================================================
    //                                                             MySelf InScope SubQuery
    //                                                             =======================
    public String keepMyselfInScopeSubQuery(TObjectCQ subQuery) {
        throw new UnsupportedOperationException("MyselfInScopeSubQuery at inline() is unsupported! Sorry!");
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xiCB() { return TObjectCB.class.getName(); }
    String xiCQ() { return TObjectCQ.class.getName(); }
}
