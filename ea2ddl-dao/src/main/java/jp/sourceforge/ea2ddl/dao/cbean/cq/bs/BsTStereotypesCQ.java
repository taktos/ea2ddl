package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_stereotypes.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTStereotypesCQ extends AbstractBsTStereotypesCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TStereotypesCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTStereotypesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_stereotypes) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TStereotypesCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TStereotypesCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_stereotypes on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TStereotypesCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported onClause of Base Table!"); }
        TStereotypesCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _stereotype;
    public ConditionValue getStereotype() {
        if (_stereotype == null) { _stereotype = new ConditionValue(); }
        return _stereotype;
    }
    protected ConditionValue getCValueStereotype() { return getStereotype(); }
    
    public BsTStereotypesCQ addOrderBy_Stereotype_Asc() { regOBA("Stereotype"); return this; }
    public BsTStereotypesCQ addOrderBy_Stereotype_Desc() { regOBD("Stereotype"); return this; }

    protected ConditionValue _appliesto;
    public ConditionValue getAppliesto() {
        if (_appliesto == null) { _appliesto = new ConditionValue(); }
        return _appliesto;
    }
    protected ConditionValue getCValueAppliesto() { return getAppliesto(); }
    
    public BsTStereotypesCQ addOrderBy_Appliesto_Asc() { regOBA("AppliesTo"); return this; }
    public BsTStereotypesCQ addOrderBy_Appliesto_Desc() { regOBD("AppliesTo"); return this; }

    protected ConditionValue _description;
    public ConditionValue getDescription() {
        if (_description == null) { _description = new ConditionValue(); }
        return _description;
    }
    protected ConditionValue getCValueDescription() { return getDescription(); }
    
    public BsTStereotypesCQ addOrderBy_Description_Asc() { regOBA("Description"); return this; }
    public BsTStereotypesCQ addOrderBy_Description_Desc() { regOBD("Description"); return this; }

    protected ConditionValue _mfenabled;
    public ConditionValue getMfenabled() {
        if (_mfenabled == null) { _mfenabled = new ConditionValue(); }
        return _mfenabled;
    }
    protected ConditionValue getCValueMfenabled() { return getMfenabled(); }
    
    public BsTStereotypesCQ addOrderBy_Mfenabled_Asc() { regOBA("MFEnabled"); return this; }
    public BsTStereotypesCQ addOrderBy_Mfenabled_Desc() { regOBD("MFEnabled"); return this; }

    protected ConditionValue _mfpath;
    public ConditionValue getMfpath() {
        if (_mfpath == null) { _mfpath = new ConditionValue(); }
        return _mfpath;
    }
    protected ConditionValue getCValueMfpath() { return getMfpath(); }
    
    public BsTStereotypesCQ addOrderBy_Mfpath_Asc() { regOBA("MFPath"); return this; }
    public BsTStereotypesCQ addOrderBy_Mfpath_Desc() { regOBD("MFPath"); return this; }

    protected ConditionValue _metafile;
    public ConditionValue getMetafile() {
        if (_metafile == null) { _metafile = new ConditionValue(); }
        return _metafile;
    }
    protected ConditionValue getCValueMetafile() { return getMetafile(); }
    
    public BsTStereotypesCQ addOrderBy_Metafile_Asc() { regOBA("Metafile"); return this; }
    public BsTStereotypesCQ addOrderBy_Metafile_Desc() { regOBD("Metafile"); return this; }

    protected ConditionValue _style;
    public ConditionValue getStyle() {
        if (_style == null) { _style = new ConditionValue(); }
        return _style;
    }
    protected ConditionValue getCValueStyle() { return getStyle(); }
    
    public BsTStereotypesCQ addOrderBy_Style_Asc() { regOBA("Style"); return this; }
    public BsTStereotypesCQ addOrderBy_Style_Desc() { regOBD("Style"); return this; }

    protected ConditionValue _eaGuid;
    public ConditionValue getEaGuid() {
        if (_eaGuid == null) { _eaGuid = new ConditionValue(); }
        return _eaGuid;
    }
    protected ConditionValue getCValueEaGuid() { return getEaGuid(); }
    
    public BsTStereotypesCQ addOrderBy_EaGuid_Asc() { regOBA("ea_guid"); return this; }
    public BsTStereotypesCQ addOrderBy_EaGuid_Desc() { regOBD("ea_guid"); return this; }

    protected ConditionValue _visualtype;
    public ConditionValue getVisualtype() {
        if (_visualtype == null) { _visualtype = new ConditionValue(); }
        return _visualtype;
    }
    protected ConditionValue getCValueVisualtype() { return getVisualtype(); }
    
    public BsTStereotypesCQ addOrderBy_Visualtype_Asc() { regOBA("VisualType"); return this; }
    public BsTStereotypesCQ addOrderBy_Visualtype_Desc() { regOBD("VisualType"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTStereotypesCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTStereotypesCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============


    protected String getConditionQueryClassNameInternally() { return TStereotypesCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}
