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
 * The abstract condition-query of t_objectscenarios.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTObjectscenariosCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTObjectscenariosCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_objectscenarios";
    }
    
    public String getTableSqlName() {
        return "t_objectscenarios";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {UQ : INTEGER}
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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {UQ : VARCHAR(255)}
     * @param scenario The value of scenario as equal.
     */
    public void setScenario_Equal(String scenario) {
        regScenario(CK_EQ, fRES(scenario));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param scenario The value of scenario as notEqual.
     */
    public void setScenario_NotEqual(String scenario) {
        regScenario(CK_NE, fRES(scenario));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param scenario The value of scenario as greaterThan.
     */
    public void setScenario_GreaterThan(String scenario) {
        regScenario(CK_GT, fRES(scenario));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param scenario The value of scenario as lessThan.
     */
    public void setScenario_LessThan(String scenario) {
        regScenario(CK_LT, fRES(scenario));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param scenario The value of scenario as greaterEqual.
     */
    public void setScenario_GreaterEqual(String scenario) {
        regScenario(CK_GE, fRES(scenario));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param scenario The value of scenario as lessEqual.
     */
    public void setScenario_LessEqual(String scenario) {
        regScenario(CK_LE, fRES(scenario));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param scenario The value of scenario as prefixSearch.
     */
    public void setScenario_PrefixSearch(String scenario) {
        regScenario(CK_PS, fRES(scenario));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param scenarioList The collection of scenario as inScope.
     */
    public void setScenario_InScope(Collection<String> scenarioList) {
        regScenario(CK_INS, cTL(scenarioList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param scenario The value of scenario as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setScenario_LikeSearch(String scenario, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(scenario), getCValueScenario(), "Scenario", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param scenario The value of scenario as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setScenario_NotLikeSearch(String scenario, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(scenario), getCValueScenario(), "Scenario", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setScenario_IsNull() { regScenario(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setScenario_IsNotNull() { regScenario(CK_ISNN, DOBJ); }

    protected void regScenario(ConditionKey k, Object v) { regQ(k, v, getCValueScenario(), "Scenario"); }
    abstract protected ConditionValue getCValueScenario();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(12)}
     * @param scenariotype The value of scenariotype as equal.
     */
    public void setScenariotype_Equal(String scenariotype) {
        regScenariotype(CK_EQ, fRES(scenariotype));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param scenariotype The value of scenariotype as notEqual.
     */
    public void setScenariotype_NotEqual(String scenariotype) {
        regScenariotype(CK_NE, fRES(scenariotype));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param scenariotype The value of scenariotype as greaterThan.
     */
    public void setScenariotype_GreaterThan(String scenariotype) {
        regScenariotype(CK_GT, fRES(scenariotype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param scenariotype The value of scenariotype as lessThan.
     */
    public void setScenariotype_LessThan(String scenariotype) {
        regScenariotype(CK_LT, fRES(scenariotype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param scenariotype The value of scenariotype as greaterEqual.
     */
    public void setScenariotype_GreaterEqual(String scenariotype) {
        regScenariotype(CK_GE, fRES(scenariotype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param scenariotype The value of scenariotype as lessEqual.
     */
    public void setScenariotype_LessEqual(String scenariotype) {
        regScenariotype(CK_LE, fRES(scenariotype));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param scenariotype The value of scenariotype as prefixSearch.
     */
    public void setScenariotype_PrefixSearch(String scenariotype) {
        regScenariotype(CK_PS, fRES(scenariotype));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param scenariotypeList The collection of scenariotype as inScope.
     */
    public void setScenariotype_InScope(Collection<String> scenariotypeList) {
        regScenariotype(CK_INS, cTL(scenariotypeList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param scenariotype The value of scenariotype as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setScenariotype_LikeSearch(String scenariotype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(scenariotype), getCValueScenariotype(), "ScenarioType", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param scenariotype The value of scenariotype as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setScenariotype_NotLikeSearch(String scenariotype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(scenariotype), getCValueScenariotype(), "ScenarioType", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setScenariotype_IsNull() { regScenariotype(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setScenariotype_IsNotNull() { regScenariotype(CK_ISNN, DOBJ); }

    protected void regScenariotype(ConditionKey k, Object v) { regQ(k, v, getCValueScenariotype(), "ScenarioType"); }
    abstract protected ConditionValue getCValueScenariotype();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {DOUBLE}
     * @param evalue The value of evalue as equal.
     */
    public void setEvalue_Equal(java.math.BigDecimal evalue) {
        regEvalue(CK_EQ, evalue);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param evalue The value of evalue as notEqual.
     */
    public void setEvalue_NotEqual(java.math.BigDecimal evalue) {
        regEvalue(CK_NE, evalue);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param evalue The value of evalue as greaterThan.
     */
    public void setEvalue_GreaterThan(java.math.BigDecimal evalue) {
        regEvalue(CK_GT, evalue);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param evalue The value of evalue as lessThan.
     */
    public void setEvalue_LessThan(java.math.BigDecimal evalue) {
        regEvalue(CK_LT, evalue);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param evalue The value of evalue as greaterEqual.
     */
    public void setEvalue_GreaterEqual(java.math.BigDecimal evalue) {
        regEvalue(CK_GE, evalue);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param evalue The value of evalue as lessEqual.
     */
    public void setEvalue_LessEqual(java.math.BigDecimal evalue) {
        regEvalue(CK_LE, evalue);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param evalueList The collection of evalue as inScope.
     */
    public void setEvalue_InScope(Collection<java.math.BigDecimal> evalueList) {
        regEvalue(CK_INS, cTL(evalueList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setEvalue_IsNull() { regEvalue(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setEvalue_IsNotNull() { regEvalue(CK_ISNN, DOBJ); }

    protected void regEvalue(ConditionKey k, Object v) { regQ(k, v, getCValueEvalue(), "EValue"); }
    abstract protected ConditionValue getCValueEvalue();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {LONGCHAR(2147483647)}
     * @param notes The value of notes as equal.
     */
    public void setNotes_Equal(String notes) {
        regNotes(CK_EQ, fRES(notes));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param notes The value of notes as notEqual.
     */
    public void setNotes_NotEqual(String notes) {
        regNotes(CK_NE, fRES(notes));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param notes The value of notes as greaterThan.
     */
    public void setNotes_GreaterThan(String notes) {
        regNotes(CK_GT, fRES(notes));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param notes The value of notes as lessThan.
     */
    public void setNotes_LessThan(String notes) {
        regNotes(CK_LT, fRES(notes));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param notes The value of notes as greaterEqual.
     */
    public void setNotes_GreaterEqual(String notes) {
        regNotes(CK_GE, fRES(notes));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param notes The value of notes as lessEqual.
     */
    public void setNotes_LessEqual(String notes) {
        regNotes(CK_LE, fRES(notes));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param notes The value of notes as prefixSearch.
     */
    public void setNotes_PrefixSearch(String notes) {
        regNotes(CK_PS, fRES(notes));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param notesList The collection of notes as inScope.
     */
    public void setNotes_InScope(Collection<String> notesList) {
        regNotes(CK_INS, cTL(notesList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param notes The value of notes as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNotes_LikeSearch(String notes, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(notes), getCValueNotes(), "Notes", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param notes The value of notes as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNotes_NotLikeSearch(String notes, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(notes), getCValueNotes(), "Notes", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setNotes_IsNull() { regNotes(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setNotes_IsNotNull() { regNotes(CK_ISNN, DOBJ); }

    protected void regNotes(ConditionKey k, Object v) { regQ(k, v, getCValueNotes(), "Notes"); }
    abstract protected ConditionValue getCValueNotes();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {LONGCHAR(2147483647)}
     * @param xmlcontent The value of xmlcontent as equal.
     */
    public void setXmlcontent_Equal(String xmlcontent) {
        regXmlcontent(CK_EQ, fRES(xmlcontent));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param xmlcontent The value of xmlcontent as notEqual.
     */
    public void setXmlcontent_NotEqual(String xmlcontent) {
        regXmlcontent(CK_NE, fRES(xmlcontent));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param xmlcontent The value of xmlcontent as greaterThan.
     */
    public void setXmlcontent_GreaterThan(String xmlcontent) {
        regXmlcontent(CK_GT, fRES(xmlcontent));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param xmlcontent The value of xmlcontent as lessThan.
     */
    public void setXmlcontent_LessThan(String xmlcontent) {
        regXmlcontent(CK_LT, fRES(xmlcontent));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param xmlcontent The value of xmlcontent as greaterEqual.
     */
    public void setXmlcontent_GreaterEqual(String xmlcontent) {
        regXmlcontent(CK_GE, fRES(xmlcontent));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param xmlcontent The value of xmlcontent as lessEqual.
     */
    public void setXmlcontent_LessEqual(String xmlcontent) {
        regXmlcontent(CK_LE, fRES(xmlcontent));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param xmlcontent The value of xmlcontent as prefixSearch.
     */
    public void setXmlcontent_PrefixSearch(String xmlcontent) {
        regXmlcontent(CK_PS, fRES(xmlcontent));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param xmlcontentList The collection of xmlcontent as inScope.
     */
    public void setXmlcontent_InScope(Collection<String> xmlcontentList) {
        regXmlcontent(CK_INS, cTL(xmlcontentList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param xmlcontent The value of xmlcontent as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setXmlcontent_LikeSearch(String xmlcontent, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(xmlcontent), getCValueXmlcontent(), "XMLContent", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param xmlcontent The value of xmlcontent as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setXmlcontent_NotLikeSearch(String xmlcontent, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(xmlcontent), getCValueXmlcontent(), "XMLContent", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setXmlcontent_IsNull() { regXmlcontent(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setXmlcontent_IsNotNull() { regXmlcontent(CK_ISNN, DOBJ); }

    protected void regXmlcontent(ConditionKey k, Object v) { regQ(k, v, getCValueXmlcontent(), "XMLContent"); }
    abstract protected ConditionValue getCValueXmlcontent();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. {VARCHAR(40)}
     * @param eaGuid The value of eaGuid as equal.
     */
    public void setEaGuid_Equal(String eaGuid) {
        regEaGuid(CK_EQ, fRES(eaGuid));
    }

    /**
     * NotEqual(!=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param eaGuid The value of eaGuid as notEqual.
     */
    public void setEaGuid_NotEqual(String eaGuid) {
        regEaGuid(CK_NE, fRES(eaGuid));
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param eaGuid The value of eaGuid as greaterThan.
     */
    public void setEaGuid_GreaterThan(String eaGuid) {
        regEaGuid(CK_GT, fRES(eaGuid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param eaGuid The value of eaGuid as lessThan.
     */
    public void setEaGuid_LessThan(String eaGuid) {
        regEaGuid(CK_LT, fRES(eaGuid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param eaGuid The value of eaGuid as greaterEqual.
     */
    public void setEaGuid_GreaterEqual(String eaGuid) {
        regEaGuid(CK_GE, fRES(eaGuid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param eaGuid The value of eaGuid as lessEqual.
     */
    public void setEaGuid_LessEqual(String eaGuid) {
        regEaGuid(CK_LE, fRES(eaGuid));
    }

    /**
     * PrefixSearch(like 'xxx%'). And NullOrEmptyIgnored, OnlyOnceRegistered.
     * @param eaGuid The value of eaGuid as prefixSearch.
     */
    public void setEaGuid_PrefixSearch(String eaGuid) {
        regEaGuid(CK_PS, fRES(eaGuid));
    }

    /**
     * InScope(in ('a', 'b')). And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered.
     * @param eaGuidList The collection of eaGuid as inScope.
     */
    public void setEaGuid_InScope(Collection<String> eaGuidList) {
        regEaGuid(CK_INS, cTL(eaGuidList));
    }

    /**
     * LikeSearch(like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param eaGuid The value of eaGuid as likeSearch.
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEaGuid_LikeSearch(String eaGuid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(eaGuid), getCValueEaGuid(), "ea_guid", likeSearchOption);
    }

    /**
     * NotLikeSearch(not like 'xxx%' escape ...). And NullOrEmptyIgnored, SeveralRegistered.
     * @param eaGuid The value of eaGuid as notLikeSearch.
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEaGuid_NotLikeSearch(String eaGuid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(eaGuid), getCValueEaGuid(), "ea_guid", likeSearchOption);
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setEaGuid_IsNull() { regEaGuid(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setEaGuid_IsNotNull() { regEaGuid(CK_ISNN, DOBJ); }

    protected void regEaGuid(ConditionKey k, Object v) { regQ(k, v, getCValueEaGuid(), "ea_guid"); }
    abstract protected ConditionValue getCValueEaGuid();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TObjectscenariosCB.class.getName(); }
    String xCQ() { return TObjectscenariosCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
