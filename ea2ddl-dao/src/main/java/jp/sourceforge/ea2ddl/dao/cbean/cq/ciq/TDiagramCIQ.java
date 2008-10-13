package jp.sourceforge.ea2ddl.dao.cbean.cq.ciq;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.ConditionOption;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.bs.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The condition-inline-query of t_diagram.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class TDiagramCIQ extends AbstractBsTDiagramCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTDiagramCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TDiagramCIQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel, BsTDiagramCQ myCQ) {
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
    protected ConditionValue getCValueDiagramId() {
        return _myCQ.getDiagramId();
    }
    protected ConditionValue getCValuePackageId() {
        return _myCQ.getPackageId();
    }
    protected ConditionValue getCValueParentid() {
        return _myCQ.getParentid();
    }
    protected ConditionValue getCValueDiagramType() {
        return _myCQ.getDiagramType();
    }
    protected ConditionValue getCValueName() {
        return _myCQ.getName();
    }
    protected ConditionValue getCValueVersion() {
        return _myCQ.getVersion();
    }
    protected ConditionValue getCValueAuthor() {
        return _myCQ.getAuthor();
    }
    protected ConditionValue getCValueShowdetails() {
        return _myCQ.getShowdetails();
    }
    protected ConditionValue getCValueNotes() {
        return _myCQ.getNotes();
    }
    protected ConditionValue getCValueStereotype() {
        return _myCQ.getStereotype();
    }
    protected ConditionValue getCValueAttpub() {
        return _myCQ.getAttpub();
    }
    protected ConditionValue getCValueAttpri() {
        return _myCQ.getAttpri();
    }
    protected ConditionValue getCValueAttpro() {
        return _myCQ.getAttpro();
    }
    protected ConditionValue getCValueOrientation() {
        return _myCQ.getOrientation();
    }
    protected ConditionValue getCValueCx() {
        return _myCQ.getCx();
    }
    protected ConditionValue getCValueCy() {
        return _myCQ.getCy();
    }
    protected ConditionValue getCValueScale() {
        return _myCQ.getScale();
    }
    protected ConditionValue getCValueCreateddate() {
        return _myCQ.getCreateddate();
    }
    protected ConditionValue getCValueModifieddate() {
        return _myCQ.getModifieddate();
    }
    protected ConditionValue getCValueHtmlpath() {
        return _myCQ.getHtmlpath();
    }
    protected ConditionValue getCValueShowforeign() {
        return _myCQ.getShowforeign();
    }
    protected ConditionValue getCValueShowborder() {
        return _myCQ.getShowborder();
    }
    protected ConditionValue getCValueShowpackagecontents() {
        return _myCQ.getShowpackagecontents();
    }
    protected ConditionValue getCValuePdata() {
        return _myCQ.getPdata();
    }
    protected ConditionValue getCValueLocked() {
        return _myCQ.getLocked();
    }
    protected ConditionValue getCValueEaGuid() {
        return _myCQ.getEaGuid();
    }
    protected ConditionValue getCValueTpos() {
        return _myCQ.getTpos();
    }
    protected ConditionValue getCValueSwimlanes() {
        return _myCQ.getSwimlanes();
    }
    protected ConditionValue getCValueStyleex() {
        return _myCQ.getStyleex();
    }

    protected String getConditionQueryClassNameInternally() { return TDiagramCQ.class.getName(); }
}
