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
 * The condition-inline-query of t_attribute.
 * @author DBFlute(AutoGenerator)
 */
public class TAttributeCIQ extends AbstractBsTAttributeCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsTAttributeCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public TAttributeCIQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel, BsTAttributeCQ myCQ) {
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
    public String keepObjectId_InScopeSubQuery_TObject(TObjectCQ subQuery) {
        return _myCQ.keepObjectId_InScopeSubQuery_TObject(subQuery);
    }
    protected ConditionValue getCValueName() {
        return _myCQ.getName();
    }
    protected ConditionValue getCValueScope() {
        return _myCQ.getScope();
    }
    protected ConditionValue getCValueStereotype() {
        return _myCQ.getStereotype();
    }
    protected ConditionValue getCValueContainment() {
        return _myCQ.getContainment();
    }
    protected ConditionValue getCValueIsstatic() {
        return _myCQ.getIsstatic();
    }
    protected ConditionValue getCValueIscollection() {
        return _myCQ.getIscollection();
    }
    protected ConditionValue getCValueIsordered() {
        return _myCQ.getIsordered();
    }
    protected ConditionValue getCValueAllowduplicates() {
        return _myCQ.getAllowduplicates();
    }
    protected ConditionValue getCValueLowerbound() {
        return _myCQ.getLowerbound();
    }
    protected ConditionValue getCValueUpperbound() {
        return _myCQ.getUpperbound();
    }
    protected ConditionValue getCValueContainer() {
        return _myCQ.getContainer();
    }
    protected ConditionValue getCValueNotes() {
        return _myCQ.getNotes();
    }
    protected ConditionValue getCValueDerived() {
        return _myCQ.getDerived();
    }
    protected ConditionValue getCValueId() {
        return _myCQ.getId();
    }
    protected ConditionValue getCValuePos() {
        return _myCQ.getPos();
    }
    protected ConditionValue getCValueGenoption() {
        return _myCQ.getGenoption();
    }
    protected ConditionValue getCValueLength() {
        return _myCQ.getLength();
    }
    protected ConditionValue getCValuePrecision() {
        return _myCQ.getPrecision();
    }
    protected ConditionValue getCValueScale() {
        return _myCQ.getScale();
    }
    protected ConditionValue getCValueStyle() {
        return _myCQ.getStyle();
    }
    protected ConditionValue getCValueClassifier() {
        return _myCQ.getClassifier();
    }
    protected ConditionValue getCValueType() {
        return _myCQ.getType();
    }
    protected ConditionValue getCValueEaGuid() {
        return _myCQ.getEaGuid();
    }
    protected ConditionValue getCValueStyleex() {
        return _myCQ.getStyleex();
    }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xiCB() { return TAttributeCB.class.getName(); }
    String xiCQ() { return TAttributeCQ.class.getName(); }
}
