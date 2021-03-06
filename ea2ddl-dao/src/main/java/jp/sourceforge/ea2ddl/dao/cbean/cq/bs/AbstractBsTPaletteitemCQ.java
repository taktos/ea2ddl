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
 * The abstract condition-query of t_paletteitem.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTPaletteitemCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final DBMetaProvider _dbmetaProvider = new DBMetaInstanceHandler();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTPaletteitemCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_paletteitem";
    }
    
    public String getTableSqlName() {
        return "t_paletteitem";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param paletteid The value of paletteid as equal.
     */
    public void setPaletteid_Equal(java.lang.Integer paletteid) {
        regPaletteid(CK_EQ, paletteid);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param paletteid The value of paletteid as notEqual.
     */
    public void setPaletteid_NotEqual(java.lang.Integer paletteid) {
        regPaletteid(CK_NE, paletteid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param paletteid The value of paletteid as greaterThan.
     */
    public void setPaletteid_GreaterThan(java.lang.Integer paletteid) {
        regPaletteid(CK_GT, paletteid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param paletteid The value of paletteid as lessThan.
     */
    public void setPaletteid_LessThan(java.lang.Integer paletteid) {
        regPaletteid(CK_LT, paletteid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param paletteid The value of paletteid as greaterEqual.
     */
    public void setPaletteid_GreaterEqual(java.lang.Integer paletteid) {
        regPaletteid(CK_GE, paletteid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param paletteid The value of paletteid as lessEqual.
     */
    public void setPaletteid_LessEqual(java.lang.Integer paletteid) {
        regPaletteid(CK_LE, paletteid);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param paletteidList The collection of paletteid as inScope.
     */
    public void setPaletteid_InScope(Collection<java.lang.Integer> paletteidList) {
        regPaletteid(CK_INS, cTL(paletteidList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setPaletteid_IsNull() { regPaletteid(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setPaletteid_IsNotNull() { regPaletteid(CK_ISNN, DOBJ); }

    protected void regPaletteid(ConditionKey k, Object v) { regQ(k, v, getCValuePaletteid(), "PaletteID"); }
    abstract protected ConditionValue getCValuePaletteid();
    
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. {INTEGER}
     * @param itemid The value of itemid as equal.
     */
    public void setItemid_Equal(java.lang.Integer itemid) {
        regItemid(CK_EQ, itemid);
    }

    /**
     * NotEqual(!=). And NullIgnored, OnlyOnceRegistered.
     * @param itemid The value of itemid as notEqual.
     */
    public void setItemid_NotEqual(java.lang.Integer itemid) {
        regItemid(CK_NE, itemid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered.
     * @param itemid The value of itemid as greaterThan.
     */
    public void setItemid_GreaterThan(java.lang.Integer itemid) {
        regItemid(CK_GT, itemid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered.
     * @param itemid The value of itemid as lessThan.
     */
    public void setItemid_LessThan(java.lang.Integer itemid) {
        regItemid(CK_LT, itemid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered.
     * @param itemid The value of itemid as greaterEqual.
     */
    public void setItemid_GreaterEqual(java.lang.Integer itemid) {
        regItemid(CK_GE, itemid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered.
     * @param itemid The value of itemid as lessEqual.
     */
    public void setItemid_LessEqual(java.lang.Integer itemid) {
        regItemid(CK_LE, itemid);
    }

    /**
     * InScope(in (1, 2)). And NullIgnored, NullElementIgnored, SeveralRegistered.
     * @param itemidList The collection of itemid as inScope.
     */
    public void setItemid_InScope(Collection<java.lang.Integer> itemidList) {
        regItemid(CK_INS, cTL(itemidList));
    }

    /**
     * IsNull(is null). And OnlyOnceRegistered.
     */
    public void setItemid_IsNull() { regItemid(CK_ISN, DOBJ); }

    /**
     * IsNotNull(is not null). And OnlyOnceRegistered.
     */
    public void setItemid_IsNotNull() { regItemid(CK_ISNN, DOBJ); }

    protected void regItemid(ConditionKey k, Object v) { regQ(k, v, getCValueItemid(), "ItemID"); }
    abstract protected ConditionValue getCValueItemid();

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TPaletteitemCB.class.getName(); }
    String xCQ() { return TPaletteitemCQ.class.getName(); }
    String xLSO() { return LikeSearchOption.class.getName(); }
}
