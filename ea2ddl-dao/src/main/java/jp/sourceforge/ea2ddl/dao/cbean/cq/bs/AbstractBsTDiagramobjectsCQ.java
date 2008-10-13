package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Collection;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ckey.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The abstract condition-query of t_diagramobjects.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public abstract class AbstractBsTDiagramobjectsCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTDiagramobjectsCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
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
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param diagramId The value of diagramId as equal.
     */
    public void setDiagramId_Equal(java.lang.Integer diagramId) {
        regDiagramId(CK_EQ, diagramId);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param diagramId The value of diagramId as notEqual.
     */
    public void setDiagramId_NotEqual(java.lang.Integer diagramId) {
        regDiagramId(CK_NE, diagramId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param diagramId The value of diagramId as greaterThan.
     */
    public void setDiagramId_GreaterThan(java.lang.Integer diagramId) {
        regDiagramId(CK_GT, diagramId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param diagramId The value of diagramId as lessThan.
     */
    public void setDiagramId_LessThan(java.lang.Integer diagramId) {
        regDiagramId(CK_LT, diagramId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param diagramId The value of diagramId as greaterEqual.
     */
    public void setDiagramId_GreaterEqual(java.lang.Integer diagramId) {
        regDiagramId(CK_GE, diagramId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
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
     * IsNull(is null). And OnceRegistered.
     */
    public void setDiagramId_IsNull() { regDiagramId(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setDiagramId_IsNotNull() { regDiagramId(CK_ISNN, DUMMY_OBJECT); }

    protected void regDiagramId(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueDiagramId(), "Diagram_ID", "DiagramId", "diagramId");
    }
    protected void registerInlineDiagramId(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueDiagramId(), "Diagram_ID", "DiagramId", "diagramId");
    }
    abstract protected ConditionValue getCValueDiagramId();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param objectId The value of objectId as equal.
     */
    public void setObjectId_Equal(java.lang.Integer objectId) {
        regObjectId(CK_EQ, objectId);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param objectId The value of objectId as notEqual.
     */
    public void setObjectId_NotEqual(java.lang.Integer objectId) {
        regObjectId(CK_NE, objectId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param objectId The value of objectId as greaterThan.
     */
    public void setObjectId_GreaterThan(java.lang.Integer objectId) {
        regObjectId(CK_GT, objectId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param objectId The value of objectId as lessThan.
     */
    public void setObjectId_LessThan(java.lang.Integer objectId) {
        regObjectId(CK_LT, objectId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param objectId The value of objectId as greaterEqual.
     */
    public void setObjectId_GreaterEqual(java.lang.Integer objectId) {
        regObjectId(CK_GE, objectId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
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
     * IsNull(is null). And OnceRegistered.
     */
    public void setObjectId_IsNull() { regObjectId(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setObjectId_IsNotNull() { regObjectId(CK_ISNN, DUMMY_OBJECT); }

    protected void regObjectId(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueObjectId(), "Object_ID", "ObjectId", "objectId");
    }
    protected void registerInlineObjectId(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueObjectId(), "Object_ID", "ObjectId", "objectId");
    }
    abstract protected ConditionValue getCValueObjectId();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param recttop The value of recttop as equal.
     */
    public void setRecttop_Equal(java.lang.Integer recttop) {
        regRecttop(CK_EQ, recttop);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param recttop The value of recttop as notEqual.
     */
    public void setRecttop_NotEqual(java.lang.Integer recttop) {
        regRecttop(CK_NE, recttop);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param recttop The value of recttop as greaterThan.
     */
    public void setRecttop_GreaterThan(java.lang.Integer recttop) {
        regRecttop(CK_GT, recttop);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param recttop The value of recttop as lessThan.
     */
    public void setRecttop_LessThan(java.lang.Integer recttop) {
        regRecttop(CK_LT, recttop);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param recttop The value of recttop as greaterEqual.
     */
    public void setRecttop_GreaterEqual(java.lang.Integer recttop) {
        regRecttop(CK_GE, recttop);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
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
     * IsNull(is null). And OnceRegistered.
     */
    public void setRecttop_IsNull() { regRecttop(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setRecttop_IsNotNull() { regRecttop(CK_ISNN, DUMMY_OBJECT); }

    protected void regRecttop(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueRecttop(), "RectTop", "Recttop", "recttop");
    }
    protected void registerInlineRecttop(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueRecttop(), "RectTop", "Recttop", "recttop");
    }
    abstract protected ConditionValue getCValueRecttop();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param rectleft The value of rectleft as equal.
     */
    public void setRectleft_Equal(java.lang.Integer rectleft) {
        regRectleft(CK_EQ, rectleft);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param rectleft The value of rectleft as notEqual.
     */
    public void setRectleft_NotEqual(java.lang.Integer rectleft) {
        regRectleft(CK_NE, rectleft);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param rectleft The value of rectleft as greaterThan.
     */
    public void setRectleft_GreaterThan(java.lang.Integer rectleft) {
        regRectleft(CK_GT, rectleft);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param rectleft The value of rectleft as lessThan.
     */
    public void setRectleft_LessThan(java.lang.Integer rectleft) {
        regRectleft(CK_LT, rectleft);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param rectleft The value of rectleft as greaterEqual.
     */
    public void setRectleft_GreaterEqual(java.lang.Integer rectleft) {
        regRectleft(CK_GE, rectleft);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
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
     * IsNull(is null). And OnceRegistered.
     */
    public void setRectleft_IsNull() { regRectleft(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setRectleft_IsNotNull() { regRectleft(CK_ISNN, DUMMY_OBJECT); }

    protected void regRectleft(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueRectleft(), "RectLeft", "Rectleft", "rectleft");
    }
    protected void registerInlineRectleft(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueRectleft(), "RectLeft", "Rectleft", "rectleft");
    }
    abstract protected ConditionValue getCValueRectleft();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param rectright The value of rectright as equal.
     */
    public void setRectright_Equal(java.lang.Integer rectright) {
        regRectright(CK_EQ, rectright);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param rectright The value of rectright as notEqual.
     */
    public void setRectright_NotEqual(java.lang.Integer rectright) {
        regRectright(CK_NE, rectright);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param rectright The value of rectright as greaterThan.
     */
    public void setRectright_GreaterThan(java.lang.Integer rectright) {
        regRectright(CK_GT, rectright);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param rectright The value of rectright as lessThan.
     */
    public void setRectright_LessThan(java.lang.Integer rectright) {
        regRectright(CK_LT, rectright);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param rectright The value of rectright as greaterEqual.
     */
    public void setRectright_GreaterEqual(java.lang.Integer rectright) {
        regRectright(CK_GE, rectright);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
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
     * IsNull(is null). And OnceRegistered.
     */
    public void setRectright_IsNull() { regRectright(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setRectright_IsNotNull() { regRectright(CK_ISNN, DUMMY_OBJECT); }

    protected void regRectright(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueRectright(), "RectRight", "Rectright", "rectright");
    }
    protected void registerInlineRectright(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueRectright(), "RectRight", "Rectright", "rectright");
    }
    abstract protected ConditionValue getCValueRectright();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param rectbottom The value of rectbottom as equal.
     */
    public void setRectbottom_Equal(java.lang.Integer rectbottom) {
        regRectbottom(CK_EQ, rectbottom);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param rectbottom The value of rectbottom as notEqual.
     */
    public void setRectbottom_NotEqual(java.lang.Integer rectbottom) {
        regRectbottom(CK_NE, rectbottom);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param rectbottom The value of rectbottom as greaterThan.
     */
    public void setRectbottom_GreaterThan(java.lang.Integer rectbottom) {
        regRectbottom(CK_GT, rectbottom);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param rectbottom The value of rectbottom as lessThan.
     */
    public void setRectbottom_LessThan(java.lang.Integer rectbottom) {
        regRectbottom(CK_LT, rectbottom);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param rectbottom The value of rectbottom as greaterEqual.
     */
    public void setRectbottom_GreaterEqual(java.lang.Integer rectbottom) {
        regRectbottom(CK_GE, rectbottom);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
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
     * IsNull(is null). And OnceRegistered.
     */
    public void setRectbottom_IsNull() { regRectbottom(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setRectbottom_IsNotNull() { regRectbottom(CK_ISNN, DUMMY_OBJECT); }

    protected void regRectbottom(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueRectbottom(), "RectBottom", "Rectbottom", "rectbottom");
    }
    protected void registerInlineRectbottom(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueRectbottom(), "RectBottom", "Rectbottom", "rectbottom");
    }
    abstract protected ConditionValue getCValueRectbottom();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {INTEGER}
     * @param sequence The value of sequence as equal.
     */
    public void setSequence_Equal(java.lang.Integer sequence) {
        regSequence(CK_EQ, sequence);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param sequence The value of sequence as notEqual.
     */
    public void setSequence_NotEqual(java.lang.Integer sequence) {
        regSequence(CK_NE, sequence);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param sequence The value of sequence as greaterThan.
     */
    public void setSequence_GreaterThan(java.lang.Integer sequence) {
        regSequence(CK_GT, sequence);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param sequence The value of sequence as lessThan.
     */
    public void setSequence_LessThan(java.lang.Integer sequence) {
        regSequence(CK_LT, sequence);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param sequence The value of sequence as greaterEqual.
     */
    public void setSequence_GreaterEqual(java.lang.Integer sequence) {
        regSequence(CK_GE, sequence);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
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
     * IsNull(is null). And OnceRegistered.
     */
    public void setSequence_IsNull() { regSequence(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setSequence_IsNotNull() { regSequence(CK_ISNN, DUMMY_OBJECT); }

    protected void regSequence(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueSequence(), "Sequence", "Sequence", "sequence");
    }
    protected void registerInlineSequence(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueSequence(), "Sequence", "Sequence", "sequence");
    }
    abstract protected ConditionValue getCValueSequence();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnceRegistered. {VARCHAR(255)}
     * @param objectstyle The value of objectstyle as equal.
     */
    public void setObjectstyle_Equal(String objectstyle) {
        regObjectstyle(CK_EQ, fRES(objectstyle));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnceRegistered.
     * @param objectstyle The value of objectstyle as notEqual.
     */
    public void setObjectstyle_NotEqual(String objectstyle) {
        regObjectstyle(CK_NE, fRES(objectstyle));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param objectstyle The value of objectstyle as greaterThan.
     */
    public void setObjectstyle_GreaterThan(String objectstyle) {
        regObjectstyle(CK_GT, fRES(objectstyle));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnceRegistered.
     * @param objectstyle The value of objectstyle as lessThan.
     */
    public void setObjectstyle_LessThan(String objectstyle) {
        regObjectstyle(CK_LT, fRES(objectstyle));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param objectstyle The value of objectstyle as greaterEqual.
     */
    public void setObjectstyle_GreaterEqual(String objectstyle) {
        regObjectstyle(CK_GE, fRES(objectstyle));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnceRegistered.
     * @param objectstyle The value of objectstyle as lessEqual.
     */
    public void setObjectstyle_LessEqual(String objectstyle) {
        regObjectstyle(CK_LE, fRES(objectstyle));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnceRegistered.
     * @param objectstyle The value of objectstyle as prefixSearch.
     */
    public void setObjectstyle_PrefixSearch(String objectstyle) {
        regObjectstyle(CK_PS, fRES(objectstyle));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param objectstyle The value of objectstyle as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setObjectstyle_LikeSearch(String objectstyle, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.LikeSearchOption likeSearchOption) {
        registerLikeSearchQuery(CK_LS, fRES(objectstyle), getCValueObjectstyle(), "ObjectStyle", "Objectstyle", "objectstyle", likeSearchOption);
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param objectstyleList The collection of objectstyle as inScope.
     */
    public void setObjectstyle_InScope(Collection<String> objectstyleList) {
        regObjectstyle(CK_INS, cTL(objectstyleList));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param objectstyle The collection of objectstyle as inScope.
     * @param inScopeOption The option of in-scope. (NotNull)
     */
    public void setObjectstyle_InScope(String objectstyle, jp.sourceforge.ea2ddl.dao.allcommon.cbean.coption.InScopeOption inScopeOption) {
        registerInScopeQuery(CK_INS, fRES(objectstyle), getCValueObjectstyle(), "ObjectStyle", "Objectstyle", "objectstyle", inScopeOption);
    }

    /**
     * IsNull(is null). And OnceRegistered.
     */
    public void setObjectstyle_IsNull() { regObjectstyle(CK_ISN, DUMMY_OBJECT); }

    /**
     * IsNotNull(is not null). And OnceRegistered.
     */
    public void setObjectstyle_IsNotNull() { regObjectstyle(CK_ISNN, DUMMY_OBJECT); }

    protected void regObjectstyle(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueObjectstyle(), "ObjectStyle", "Objectstyle", "objectstyle");
    }
    protected void registerInlineObjectstyle(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueObjectstyle(), "ObjectStyle", "Objectstyle", "objectstyle");
    }
    abstract protected ConditionValue getCValueObjectstyle();
    
    /**
     * Equal(=). And NullIgnored, OnceRegistered. {UQ : COUNTER : NotNull}
     * @param instanceId The value of instanceId as equal.
     */
    public void setInstanceId_Equal(java.lang.Integer instanceId) {
        regInstanceId(CK_EQ, instanceId);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnceRegistered.
     * @param instanceId The value of instanceId as notEqual.
     */
    public void setInstanceId_NotEqual(java.lang.Integer instanceId) {
        regInstanceId(CK_NE, instanceId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnceRegistered.
     * @param instanceId The value of instanceId as greaterThan.
     */
    public void setInstanceId_GreaterThan(java.lang.Integer instanceId) {
        regInstanceId(CK_GT, instanceId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnceRegistered.
     * @param instanceId The value of instanceId as lessThan.
     */
    public void setInstanceId_LessThan(java.lang.Integer instanceId) {
        regInstanceId(CK_LT, instanceId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnceRegistered.
     * @param instanceId The value of instanceId as greaterEqual.
     */
    public void setInstanceId_GreaterEqual(java.lang.Integer instanceId) {
        regInstanceId(CK_GE, instanceId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnceRegistered.
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

    protected void regInstanceId(ConditionKey key, Object value) {
        registerQuery(key, value, getCValueInstanceId(), "Instance_ID", "InstanceId", "instanceId");
    }
    protected void registerInlineInstanceId(ConditionKey key, Object value) {
        registerInlineQuery(key, value, getCValueInstanceId(), "Instance_ID", "InstanceId", "instanceId");
    }
    abstract protected ConditionValue getCValueInstanceId();

    // Very Internal (for Suppressing Warn about 'Not Use Import')
    protected String getConditionBeanClassNameInternally() { return TDiagramobjectsCB.class.getName(); }
    protected String getConditionQueryClassNameInternally() { return TDiagramobjectsCQ.class.getName(); }
}
