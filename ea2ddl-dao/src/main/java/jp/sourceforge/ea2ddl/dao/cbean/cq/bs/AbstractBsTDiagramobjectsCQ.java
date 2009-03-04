package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.ckey.*;
import org.seasar.dbflute.cbean.coption.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import org.seasar.dbflute.dbmeta.DBMetaProvider;
import jp.sourceforge.ea2ddl.dao.allcommon.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_diagramobjects.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTDiagramobjectsCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTDiagramobjectsCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                     DBMeta Provider
    //                                                                     ===============
    @Override
    protected DBMetaProvider getDBMetaProvider() {
        return _dbmetaProvider;
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_diagramobjects";
    }
    
    public String getTableSqlName() {
        return "t_diagramobjects";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param diagramId The value of diagramId as equal.
     */
    public void setDiagramId_Equal(java.lang.Integer diagramId) {
        regDiagramId(CK_EQ, diagramId);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param diagramId The value of diagramId as notEqual.
     */
    public void setDiagramId_NotEqual(java.lang.Integer diagramId) {
        regDiagramId(CK_NE, diagramId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param diagramId The value of diagramId as greaterThan.
     */
    public void setDiagramId_GreaterThan(java.lang.Integer diagramId) {
        regDiagramId(CK_GT, diagramId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param diagramId The value of diagramId as lessThan.
     */
    public void setDiagramId_LessThan(java.lang.Integer diagramId) {
        regDiagramId(CK_LT, diagramId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param diagramId The value of diagramId as greaterEqual.
     */
    public void setDiagramId_GreaterEqual(java.lang.Integer diagramId) {
        regDiagramId(CK_GE, diagramId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param diagramId The value of diagramId as lessEqual.
     */
    public void setDiagramId_LessEqual(java.lang.Integer diagramId) {
        regDiagramId(CK_LE, diagramId);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param diagramIdList The collection of diagramId as inScope.
     */
    public void setDiagramId_InScope(Collection<java.lang.Integer> diagramIdList) {
        regDiagramId(CK_INS, cTL(diagramIdList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setDiagramId_IsNull() { regDiagramId(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setDiagramId_IsNotNull() { regDiagramId(CK_ISNN, DOBJ); }

    protected void regDiagramId(ConditionKey k, Object v) { regQ(k, v, getCValueDiagramId(), "Diagram_ID"); }
    abstract protected ConditionValue getCValueDiagramId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param objectId The value of objectId as equal.
     */
    public void setObjectId_Equal(java.lang.Integer objectId) {
        regObjectId(CK_EQ, objectId);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param objectId The value of objectId as notEqual.
     */
    public void setObjectId_NotEqual(java.lang.Integer objectId) {
        regObjectId(CK_NE, objectId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param objectId The value of objectId as greaterThan.
     */
    public void setObjectId_GreaterThan(java.lang.Integer objectId) {
        regObjectId(CK_GT, objectId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param objectId The value of objectId as lessThan.
     */
    public void setObjectId_LessThan(java.lang.Integer objectId) {
        regObjectId(CK_LT, objectId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param objectId The value of objectId as greaterEqual.
     */
    public void setObjectId_GreaterEqual(java.lang.Integer objectId) {
        regObjectId(CK_GE, objectId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param objectId The value of objectId as lessEqual.
     */
    public void setObjectId_LessEqual(java.lang.Integer objectId) {
        regObjectId(CK_LE, objectId);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param objectIdList The collection of objectId as inScope.
     */
    public void setObjectId_InScope(Collection<java.lang.Integer> objectIdList) {
        regObjectId(CK_INS, cTL(objectIdList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setObjectId_IsNull() { regObjectId(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setObjectId_IsNotNull() { regObjectId(CK_ISNN, DOBJ); }

    protected void regObjectId(ConditionKey k, Object v) { regQ(k, v, getCValueObjectId(), "Object_ID"); }
    abstract protected ConditionValue getCValueObjectId();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param recttop The value of recttop as equal.
     */
    public void setRecttop_Equal(java.lang.Integer recttop) {
        regRecttop(CK_EQ, recttop);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param recttop The value of recttop as notEqual.
     */
    public void setRecttop_NotEqual(java.lang.Integer recttop) {
        regRecttop(CK_NE, recttop);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param recttop The value of recttop as greaterThan.
     */
    public void setRecttop_GreaterThan(java.lang.Integer recttop) {
        regRecttop(CK_GT, recttop);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param recttop The value of recttop as lessThan.
     */
    public void setRecttop_LessThan(java.lang.Integer recttop) {
        regRecttop(CK_LT, recttop);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param recttop The value of recttop as greaterEqual.
     */
    public void setRecttop_GreaterEqual(java.lang.Integer recttop) {
        regRecttop(CK_GE, recttop);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param recttop The value of recttop as lessEqual.
     */
    public void setRecttop_LessEqual(java.lang.Integer recttop) {
        regRecttop(CK_LE, recttop);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param recttopList The collection of recttop as inScope.
     */
    public void setRecttop_InScope(Collection<java.lang.Integer> recttopList) {
        regRecttop(CK_INS, cTL(recttopList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setRecttop_IsNull() { regRecttop(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setRecttop_IsNotNull() { regRecttop(CK_ISNN, DOBJ); }

    protected void regRecttop(ConditionKey k, Object v) { regQ(k, v, getCValueRecttop(), "RectTop"); }
    abstract protected ConditionValue getCValueRecttop();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param rectleft The value of rectleft as equal.
     */
    public void setRectleft_Equal(java.lang.Integer rectleft) {
        regRectleft(CK_EQ, rectleft);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param rectleft The value of rectleft as notEqual.
     */
    public void setRectleft_NotEqual(java.lang.Integer rectleft) {
        regRectleft(CK_NE, rectleft);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param rectleft The value of rectleft as greaterThan.
     */
    public void setRectleft_GreaterThan(java.lang.Integer rectleft) {
        regRectleft(CK_GT, rectleft);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param rectleft The value of rectleft as lessThan.
     */
    public void setRectleft_LessThan(java.lang.Integer rectleft) {
        regRectleft(CK_LT, rectleft);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param rectleft The value of rectleft as greaterEqual.
     */
    public void setRectleft_GreaterEqual(java.lang.Integer rectleft) {
        regRectleft(CK_GE, rectleft);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param rectleft The value of rectleft as lessEqual.
     */
    public void setRectleft_LessEqual(java.lang.Integer rectleft) {
        regRectleft(CK_LE, rectleft);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param rectleftList The collection of rectleft as inScope.
     */
    public void setRectleft_InScope(Collection<java.lang.Integer> rectleftList) {
        regRectleft(CK_INS, cTL(rectleftList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setRectleft_IsNull() { regRectleft(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setRectleft_IsNotNull() { regRectleft(CK_ISNN, DOBJ); }

    protected void regRectleft(ConditionKey k, Object v) { regQ(k, v, getCValueRectleft(), "RectLeft"); }
    abstract protected ConditionValue getCValueRectleft();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param rectright The value of rectright as equal.
     */
    public void setRectright_Equal(java.lang.Integer rectright) {
        regRectright(CK_EQ, rectright);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param rectright The value of rectright as notEqual.
     */
    public void setRectright_NotEqual(java.lang.Integer rectright) {
        regRectright(CK_NE, rectright);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param rectright The value of rectright as greaterThan.
     */
    public void setRectright_GreaterThan(java.lang.Integer rectright) {
        regRectright(CK_GT, rectright);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param rectright The value of rectright as lessThan.
     */
    public void setRectright_LessThan(java.lang.Integer rectright) {
        regRectright(CK_LT, rectright);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param rectright The value of rectright as greaterEqual.
     */
    public void setRectright_GreaterEqual(java.lang.Integer rectright) {
        regRectright(CK_GE, rectright);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param rectright The value of rectright as lessEqual.
     */
    public void setRectright_LessEqual(java.lang.Integer rectright) {
        regRectright(CK_LE, rectright);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param rectrightList The collection of rectright as inScope.
     */
    public void setRectright_InScope(Collection<java.lang.Integer> rectrightList) {
        regRectright(CK_INS, cTL(rectrightList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setRectright_IsNull() { regRectright(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setRectright_IsNotNull() { regRectright(CK_ISNN, DOBJ); }

    protected void regRectright(ConditionKey k, Object v) { regQ(k, v, getCValueRectright(), "RectRight"); }
    abstract protected ConditionValue getCValueRectright();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param rectbottom The value of rectbottom as equal.
     */
    public void setRectbottom_Equal(java.lang.Integer rectbottom) {
        regRectbottom(CK_EQ, rectbottom);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param rectbottom The value of rectbottom as notEqual.
     */
    public void setRectbottom_NotEqual(java.lang.Integer rectbottom) {
        regRectbottom(CK_NE, rectbottom);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param rectbottom The value of rectbottom as greaterThan.
     */
    public void setRectbottom_GreaterThan(java.lang.Integer rectbottom) {
        regRectbottom(CK_GT, rectbottom);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param rectbottom The value of rectbottom as lessThan.
     */
    public void setRectbottom_LessThan(java.lang.Integer rectbottom) {
        regRectbottom(CK_LT, rectbottom);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param rectbottom The value of rectbottom as greaterEqual.
     */
    public void setRectbottom_GreaterEqual(java.lang.Integer rectbottom) {
        regRectbottom(CK_GE, rectbottom);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param rectbottom The value of rectbottom as lessEqual.
     */
    public void setRectbottom_LessEqual(java.lang.Integer rectbottom) {
        regRectbottom(CK_LE, rectbottom);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param rectbottomList The collection of rectbottom as inScope.
     */
    public void setRectbottom_InScope(Collection<java.lang.Integer> rectbottomList) {
        regRectbottom(CK_INS, cTL(rectbottomList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setRectbottom_IsNull() { regRectbottom(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setRectbottom_IsNotNull() { regRectbottom(CK_ISNN, DOBJ); }

    protected void regRectbottom(ConditionKey k, Object v) { regQ(k, v, getCValueRectbottom(), "RectBottom"); }
    abstract protected ConditionValue getCValueRectbottom();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param sequence The value of sequence as equal.
     */
    public void setSequence_Equal(java.lang.Integer sequence) {
        regSequence(CK_EQ, sequence);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param sequence The value of sequence as notEqual.
     */
    public void setSequence_NotEqual(java.lang.Integer sequence) {
        regSequence(CK_NE, sequence);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param sequence The value of sequence as greaterThan.
     */
    public void setSequence_GreaterThan(java.lang.Integer sequence) {
        regSequence(CK_GT, sequence);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param sequence The value of sequence as lessThan.
     */
    public void setSequence_LessThan(java.lang.Integer sequence) {
        regSequence(CK_LT, sequence);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param sequence The value of sequence as greaterEqual.
     */
    public void setSequence_GreaterEqual(java.lang.Integer sequence) {
        regSequence(CK_GE, sequence);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param sequence The value of sequence as lessEqual.
     */
    public void setSequence_LessEqual(java.lang.Integer sequence) {
        regSequence(CK_LE, sequence);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param sequenceList The collection of sequence as inScope.
     */
    public void setSequence_InScope(Collection<java.lang.Integer> sequenceList) {
        regSequence(CK_INS, cTL(sequenceList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setSequence_IsNull() { regSequence(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setSequence_IsNotNull() { regSequence(CK_ISNN, DOBJ); }

    protected void regSequence(ConditionKey k, Object v) { regQ(k, v, getCValueSequence(), "Sequence"); }
    abstract protected ConditionValue getCValueSequence();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(255)}
     * @param objectstyle The value of objectstyle as equal.
     */
    public void setObjectstyle_Equal(String objectstyle) {
        regObjectstyle(CK_EQ, fRES(objectstyle));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param objectstyle The value of objectstyle as notEqual.
     */
    public void setObjectstyle_NotEqual(String objectstyle) {
        regObjectstyle(CK_NE, fRES(objectstyle));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param objectstyle The value of objectstyle as greaterThan.
     */
    public void setObjectstyle_GreaterThan(String objectstyle) {
        regObjectstyle(CK_GT, fRES(objectstyle));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param objectstyle The value of objectstyle as lessThan.
     */
    public void setObjectstyle_LessThan(String objectstyle) {
        regObjectstyle(CK_LT, fRES(objectstyle));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param objectstyle The value of objectstyle as greaterEqual.
     */
    public void setObjectstyle_GreaterEqual(String objectstyle) {
        regObjectstyle(CK_GE, fRES(objectstyle));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param objectstyle The value of objectstyle as lessEqual.
     */
    public void setObjectstyle_LessEqual(String objectstyle) {
        regObjectstyle(CK_LE, fRES(objectstyle));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param objectstyle The value of objectstyle as prefixSearch.
     */
    public void setObjectstyle_PrefixSearch(String objectstyle) {
        regObjectstyle(CK_PS, fRES(objectstyle));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param objectstyleList The collection of objectstyle as inScope.
     */
    public void setObjectstyle_InScope(Collection<String> objectstyleList) {
        regObjectstyle(CK_INS, cTL(objectstyleList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param objectstyle The value of objectstyle as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setObjectstyle_LikeSearch(String objectstyle, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(objectstyle), getCValueObjectstyle(), "ObjectStyle", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param objectstyle The value of objectstyle as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setObjectstyle_NotLikeSearch(String objectstyle, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(objectstyle), getCValueObjectstyle(), "ObjectStyle", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setObjectstyle_IsNull() { regObjectstyle(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setObjectstyle_IsNotNull() { regObjectstyle(CK_ISNN, DOBJ); }

    protected void regObjectstyle(ConditionKey k, Object v) { regQ(k, v, getCValueObjectstyle(), "ObjectStyle"); }
    abstract protected ConditionValue getCValueObjectstyle();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {UQ : NotNull : COUNTER}
     * @param instanceId The value of instanceId as equal.
     */
    public void setInstanceId_Equal(java.lang.Integer instanceId) {
        regInstanceId(CK_EQ, instanceId);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param instanceId The value of instanceId as notEqual.
     */
    public void setInstanceId_NotEqual(java.lang.Integer instanceId) {
        regInstanceId(CK_NE, instanceId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param instanceId The value of instanceId as greaterThan.
     */
    public void setInstanceId_GreaterThan(java.lang.Integer instanceId) {
        regInstanceId(CK_GT, instanceId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param instanceId The value of instanceId as lessThan.
     */
    public void setInstanceId_LessThan(java.lang.Integer instanceId) {
        regInstanceId(CK_LT, instanceId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param instanceId The value of instanceId as greaterEqual.
     */
    public void setInstanceId_GreaterEqual(java.lang.Integer instanceId) {
        regInstanceId(CK_GE, instanceId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param instanceId The value of instanceId as lessEqual.
     */
    public void setInstanceId_LessEqual(java.lang.Integer instanceId) {
        regInstanceId(CK_LE, instanceId);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param instanceIdList The collection of instanceId as inScope.
     */
    public void setInstanceId_InScope(Collection<java.lang.Integer> instanceIdList) {
        regInstanceId(CK_INS, cTL(instanceIdList));
    }

    protected void regInstanceId(ConditionKey k, Object v) { regQ(k, v, getCValueInstanceId(), "Instance_ID"); }
    abstract protected ConditionValue getCValueInstanceId();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TDiagramobjectsCB.class.getName(); }
    String xCQ() { return TDiagramobjectsCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
