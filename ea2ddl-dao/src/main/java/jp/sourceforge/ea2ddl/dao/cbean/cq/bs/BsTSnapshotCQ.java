package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_snapshot.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTSnapshotCQ extends AbstractBsTSnapshotCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TSnapshotCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTSnapshotCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_snapshot) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TSnapshotCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TSnapshotCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_snapshot on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TSnapshotCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported onClause of Base Table!"); }
        TSnapshotCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _snapshotid;
    public ConditionValue getSnapshotid() {
        if (_snapshotid == null) { _snapshotid = new ConditionValue(); }
        return _snapshotid;
    }
    protected ConditionValue getCValueSnapshotid() { return getSnapshotid(); }
    
    public BsTSnapshotCQ addOrderBy_Snapshotid_Asc() { regOBA("SnapshotID"); return this; }
    public BsTSnapshotCQ addOrderBy_Snapshotid_Desc() { regOBD("SnapshotID"); return this; }

    protected ConditionValue _seriesid;
    public ConditionValue getSeriesid() {
        if (_seriesid == null) { _seriesid = new ConditionValue(); }
        return _seriesid;
    }
    protected ConditionValue getCValueSeriesid() { return getSeriesid(); }
    
    public BsTSnapshotCQ addOrderBy_Seriesid_Asc() { regOBA("SeriesID"); return this; }
    public BsTSnapshotCQ addOrderBy_Seriesid_Desc() { regOBD("SeriesID"); return this; }

    protected ConditionValue _position;
    public ConditionValue getPosition() {
        if (_position == null) { _position = new ConditionValue(); }
        return _position;
    }
    protected ConditionValue getCValuePosition() { return getPosition(); }
          
    public BsTSnapshotCQ addOrderBy_Position_Asc() { regOBA("Position"); return this; }
    public BsTSnapshotCQ addOrderBy_Position_Desc() { regOBD("Position"); return this; }

    protected ConditionValue _snapshotname;
    public ConditionValue getSnapshotname() {
        if (_snapshotname == null) { _snapshotname = new ConditionValue(); }
        return _snapshotname;
    }
    protected ConditionValue getCValueSnapshotname() { return getSnapshotname(); }
    
    public BsTSnapshotCQ addOrderBy_Snapshotname_Asc() { regOBA("SnapshotName"); return this; }
    public BsTSnapshotCQ addOrderBy_Snapshotname_Desc() { regOBD("SnapshotName"); return this; }

    protected ConditionValue _notes;
    public ConditionValue getNotes() {
        if (_notes == null) { _notes = new ConditionValue(); }
        return _notes;
    }
    protected ConditionValue getCValueNotes() { return getNotes(); }
    
    public BsTSnapshotCQ addOrderBy_Notes_Asc() { regOBA("Notes"); return this; }
    public BsTSnapshotCQ addOrderBy_Notes_Desc() { regOBD("Notes"); return this; }

    protected ConditionValue _style;
    public ConditionValue getStyle() {
        if (_style == null) { _style = new ConditionValue(); }
        return _style;
    }
    protected ConditionValue getCValueStyle() { return getStyle(); }
    
    public BsTSnapshotCQ addOrderBy_Style_Asc() { regOBA("Style"); return this; }
    public BsTSnapshotCQ addOrderBy_Style_Desc() { regOBD("Style"); return this; }

    protected ConditionValue _elementid;
    public ConditionValue getElementid() {
        if (_elementid == null) { _elementid = new ConditionValue(); }
        return _elementid;
    }
    protected ConditionValue getCValueElementid() { return getElementid(); }
    
    public BsTSnapshotCQ addOrderBy_Elementid_Asc() { regOBA("ElementID"); return this; }
    public BsTSnapshotCQ addOrderBy_Elementid_Desc() { regOBD("ElementID"); return this; }

    protected ConditionValue _elementtype;
    public ConditionValue getElementtype() {
        if (_elementtype == null) { _elementtype = new ConditionValue(); }
        return _elementtype;
    }
    protected ConditionValue getCValueElementtype() { return getElementtype(); }
    
    public BsTSnapshotCQ addOrderBy_Elementtype_Asc() { regOBA("ElementType"); return this; }
    public BsTSnapshotCQ addOrderBy_Elementtype_Desc() { regOBD("ElementType"); return this; }

    protected ConditionValue _strcontent;
    public ConditionValue getStrcontent() {
        if (_strcontent == null) { _strcontent = new ConditionValue(); }
        return _strcontent;
    }
    protected ConditionValue getCValueStrcontent() { return getStrcontent(); }
    
    public BsTSnapshotCQ addOrderBy_Strcontent_Asc() { regOBA("StrContent"); return this; }
    public BsTSnapshotCQ addOrderBy_Strcontent_Desc() { regOBD("StrContent"); return this; }

    protected ConditionValue _bincontent1;
    public ConditionValue getBincontent1() {
        if (_bincontent1 == null) { _bincontent1 = new ConditionValue(); }
        return _bincontent1;
    }
    protected ConditionValue getCValueBincontent1() { return getBincontent1(); }
    
    public BsTSnapshotCQ addOrderBy_Bincontent1_Asc() { regOBA("BinContent1"); return this; }
    public BsTSnapshotCQ addOrderBy_Bincontent1_Desc() { regOBD("BinContent1"); return this; }

    protected ConditionValue _bincontent2;
    public ConditionValue getBincontent2() {
        if (_bincontent2 == null) { _bincontent2 = new ConditionValue(); }
        return _bincontent2;
    }
    protected ConditionValue getCValueBincontent2() { return getBincontent2(); }
    
    public BsTSnapshotCQ addOrderBy_Bincontent2_Asc() { regOBA("BinContent2"); return this; }
    public BsTSnapshotCQ addOrderBy_Bincontent2_Desc() { regOBD("BinContent2"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTSnapshotCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTSnapshotCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============


    protected String getConditionQueryClassNameInternally() { return TSnapshotCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}
