package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_version.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTVersionCQ extends AbstractBsTVersionCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TVersionCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTVersionCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_version) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TVersionCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TVersionCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_version on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TVersionCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported onClause of Base Table!"); }
        TVersionCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _elementid;
    public ConditionValue getElementid() {
        if (_elementid == null) { _elementid = new ConditionValue(); }
        return _elementid;
    }
    protected ConditionValue getCValueElementid() { return getElementid(); }
    
    public BsTVersionCQ addOrderBy_Elementid_Asc() { regOBA("ElementID"); return this; }
    public BsTVersionCQ addOrderBy_Elementid_Desc() { regOBD("ElementID"); return this; }

    protected ConditionValue _versionid;
    public ConditionValue getVersionid() {
        if (_versionid == null) { _versionid = new ConditionValue(); }
        return _versionid;
    }
    protected ConditionValue getCValueVersionid() { return getVersionid(); }
    
    public BsTVersionCQ addOrderBy_Versionid_Asc() { regOBA("VersionID"); return this; }
    public BsTVersionCQ addOrderBy_Versionid_Desc() { regOBD("VersionID"); return this; }

    protected ConditionValue _elementtype;
    public ConditionValue getElementtype() {
        if (_elementtype == null) { _elementtype = new ConditionValue(); }
        return _elementtype;
    }
    protected ConditionValue getCValueElementtype() { return getElementtype(); }
    
    public BsTVersionCQ addOrderBy_Elementtype_Asc() { regOBA("ElementType"); return this; }
    public BsTVersionCQ addOrderBy_Elementtype_Desc() { regOBD("ElementType"); return this; }

    protected ConditionValue _flags;
    public ConditionValue getFlags() {
        if (_flags == null) { _flags = new ConditionValue(); }
        return _flags;
    }
    protected ConditionValue getCValueFlags() { return getFlags(); }
    
    public BsTVersionCQ addOrderBy_Flags_Asc() { regOBA("Flags"); return this; }
    public BsTVersionCQ addOrderBy_Flags_Desc() { regOBD("Flags"); return this; }

    protected ConditionValue _externalfile;
    public ConditionValue getExternalfile() {
        if (_externalfile == null) { _externalfile = new ConditionValue(); }
        return _externalfile;
    }
    protected ConditionValue getCValueExternalfile() { return getExternalfile(); }
    
    public BsTVersionCQ addOrderBy_Externalfile_Asc() { regOBA("ExternalFile"); return this; }
    public BsTVersionCQ addOrderBy_Externalfile_Desc() { regOBD("ExternalFile"); return this; }

    protected ConditionValue _notes;
    public ConditionValue getNotes() {
        if (_notes == null) { _notes = new ConditionValue(); }
        return _notes;
    }
    protected ConditionValue getCValueNotes() { return getNotes(); }
    
    public BsTVersionCQ addOrderBy_Notes_Asc() { regOBA("Notes"); return this; }
    public BsTVersionCQ addOrderBy_Notes_Desc() { regOBD("Notes"); return this; }

    protected ConditionValue _owner;
    public ConditionValue getOwner() {
        if (_owner == null) { _owner = new ConditionValue(); }
        return _owner;
    }
    protected ConditionValue getCValueOwner() { return getOwner(); }
    
    public BsTVersionCQ addOrderBy_Owner_Asc() { regOBA("Owner"); return this; }
    public BsTVersionCQ addOrderBy_Owner_Desc() { regOBD("Owner"); return this; }

    protected ConditionValue _versiondate;
    public ConditionValue getVersiondate() {
        if (_versiondate == null) { _versiondate = new ConditionValue(); }
        return _versiondate;
    }
    protected ConditionValue getCValueVersiondate() { return getVersiondate(); }
    
    public BsTVersionCQ addOrderBy_Versiondate_Asc() { regOBA("VersionDate"); return this; }
    public BsTVersionCQ addOrderBy_Versiondate_Desc() { regOBD("VersionDate"); return this; }

    protected ConditionValue _branch;
    public ConditionValue getBranch() {
        if (_branch == null) { _branch = new ConditionValue(); }
        return _branch;
    }
    protected ConditionValue getCValueBranch() { return getBranch(); }
    
    public BsTVersionCQ addOrderBy_Branch_Asc() { regOBA("Branch"); return this; }
    public BsTVersionCQ addOrderBy_Branch_Desc() { regOBD("Branch"); return this; }

    protected ConditionValue _elementxml;
    public ConditionValue getElementxml() {
        if (_elementxml == null) { _elementxml = new ConditionValue(); }
        return _elementxml;
    }
    protected ConditionValue getCValueElementxml() { return getElementxml(); }
    
    public BsTVersionCQ addOrderBy_Elementxml_Asc() { regOBA("ElementXML"); return this; }
    public BsTVersionCQ addOrderBy_Elementxml_Desc() { regOBD("ElementXML"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTVersionCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTVersionCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============


    protected String getConditionQueryClassNameInternally() { return TVersionCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}
