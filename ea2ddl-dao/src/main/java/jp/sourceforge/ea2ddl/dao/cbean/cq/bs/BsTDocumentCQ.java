package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import org.seasar.dbflute.cbean.*;
import org.seasar.dbflute.cbean.cvalue.ConditionValue;
import org.seasar.dbflute.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_document.
 * @author DBFlute(AutoGenerator)
 */
public class BsTDocumentCQ extends AbstractBsTDocumentCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TDocumentCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTDocumentCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_document) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TDocumentCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TDocumentCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_document on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TDocumentCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported on-clause for local table!"); }
        TDocumentCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _docid;
    public ConditionValue getDocid() {
        if (_docid == null) { _docid = new ConditionValue(); }
        return _docid;
    }
    protected ConditionValue getCValueDocid() { return getDocid(); }

    public BsTDocumentCQ addOrderBy_Docid_Asc() { regOBA("DocID"); return this; }
    public BsTDocumentCQ addOrderBy_Docid_Desc() { regOBD("DocID"); return this; }

    protected ConditionValue _docname;
    public ConditionValue getDocname() {
        if (_docname == null) { _docname = new ConditionValue(); }
        return _docname;
    }
    protected ConditionValue getCValueDocname() { return getDocname(); }

    public BsTDocumentCQ addOrderBy_Docname_Asc() { regOBA("DocName"); return this; }
    public BsTDocumentCQ addOrderBy_Docname_Desc() { regOBD("DocName"); return this; }

    protected ConditionValue _notes;
    public ConditionValue getNotes() {
        if (_notes == null) { _notes = new ConditionValue(); }
        return _notes;
    }
    protected ConditionValue getCValueNotes() { return getNotes(); }

    public BsTDocumentCQ addOrderBy_Notes_Asc() { regOBA("Notes"); return this; }
    public BsTDocumentCQ addOrderBy_Notes_Desc() { regOBD("Notes"); return this; }

    protected ConditionValue _style;
    public ConditionValue getStyle() {
        if (_style == null) { _style = new ConditionValue(); }
        return _style;
    }
    protected ConditionValue getCValueStyle() { return getStyle(); }

    public BsTDocumentCQ addOrderBy_Style_Asc() { regOBA("Style"); return this; }
    public BsTDocumentCQ addOrderBy_Style_Desc() { regOBD("Style"); return this; }

    protected ConditionValue _elementid;
    public ConditionValue getElementid() {
        if (_elementid == null) { _elementid = new ConditionValue(); }
        return _elementid;
    }
    protected ConditionValue getCValueElementid() { return getElementid(); }

    public BsTDocumentCQ addOrderBy_Elementid_Asc() { regOBA("ElementID"); return this; }
    public BsTDocumentCQ addOrderBy_Elementid_Desc() { regOBD("ElementID"); return this; }

    protected ConditionValue _elementtype;
    public ConditionValue getElementtype() {
        if (_elementtype == null) { _elementtype = new ConditionValue(); }
        return _elementtype;
    }
    protected ConditionValue getCValueElementtype() { return getElementtype(); }

    public BsTDocumentCQ addOrderBy_Elementtype_Asc() { regOBA("ElementType"); return this; }
    public BsTDocumentCQ addOrderBy_Elementtype_Desc() { regOBD("ElementType"); return this; }

    protected ConditionValue _strcontent;
    public ConditionValue getStrcontent() {
        if (_strcontent == null) { _strcontent = new ConditionValue(); }
        return _strcontent;
    }
    protected ConditionValue getCValueStrcontent() { return getStrcontent(); }

    public BsTDocumentCQ addOrderBy_Strcontent_Asc() { regOBA("StrContent"); return this; }
    public BsTDocumentCQ addOrderBy_Strcontent_Desc() { regOBD("StrContent"); return this; }

    protected ConditionValue _bincontent;
    public ConditionValue getBincontent() {
        if (_bincontent == null) { _bincontent = new ConditionValue(); }
        return _bincontent;
    }
    protected ConditionValue getCValueBincontent() { return getBincontent(); }

    public BsTDocumentCQ addOrderBy_Bincontent_Asc() { regOBA("BinContent"); return this; }
    public BsTDocumentCQ addOrderBy_Bincontent_Desc() { regOBD("BinContent"); return this; }

    protected ConditionValue _doctype;
    public ConditionValue getDoctype() {
        if (_doctype == null) { _doctype = new ConditionValue(); }
        return _doctype;
    }
    protected ConditionValue getCValueDoctype() { return getDoctype(); }

    public BsTDocumentCQ addOrderBy_Doctype_Asc() { regOBA("DocType"); return this; }
    public BsTDocumentCQ addOrderBy_Doctype_Desc() { regOBD("DocType"); return this; }

    protected ConditionValue _author;
    public ConditionValue getAuthor() {
        if (_author == null) { _author = new ConditionValue(); }
        return _author;
    }
    protected ConditionValue getCValueAuthor() { return getAuthor(); }

    public BsTDocumentCQ addOrderBy_Author_Asc() { regOBA("Author"); return this; }
    public BsTDocumentCQ addOrderBy_Author_Desc() { regOBD("Author"); return this; }

    protected ConditionValue _version;
    public ConditionValue getVersion() {
        if (_version == null) { _version = new ConditionValue(); }
        return _version;
    }
    protected ConditionValue getCValueVersion() { return getVersion(); }

    public BsTDocumentCQ addOrderBy_Version_Asc() { regOBA("Version"); return this; }
    public BsTDocumentCQ addOrderBy_Version_Desc() { regOBD("Version"); return this; }

    protected ConditionValue _isactive;
    public ConditionValue getIsactive() {
        if (_isactive == null) { _isactive = new ConditionValue(); }
        return _isactive;
    }
    protected ConditionValue getCValueIsactive() { return getIsactive(); }

    public BsTDocumentCQ addOrderBy_Isactive_Asc() { regOBA("IsActive"); return this; }
    public BsTDocumentCQ addOrderBy_Isactive_Desc() { regOBD("IsActive"); return this; }

    protected ConditionValue _sequence;
    public ConditionValue getSequence() {
        if (_sequence == null) { _sequence = new ConditionValue(); }
        return _sequence;
    }
    protected ConditionValue getCValueSequence() { return getSequence(); }

    public BsTDocumentCQ addOrderBy_Sequence_Asc() { regOBA("Sequence"); return this; }
    public BsTDocumentCQ addOrderBy_Sequence_Desc() { regOBD("Sequence"); return this; }

    protected ConditionValue _docdate;
    public ConditionValue getDocdate() {
        if (_docdate == null) { _docdate = new ConditionValue(); }
        return _docdate;
    }
    protected ConditionValue getCValueDocdate() { return getDocdate(); }

    public BsTDocumentCQ addOrderBy_Docdate_Asc() { regOBA("DocDate"); return this; }
    public BsTDocumentCQ addOrderBy_Docdate_Desc() { regOBD("DocDate"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTDocumentCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTDocumentCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // Very Internal (for Suppressing Warn about 'Not Use Import')
    String xCB() { return TDocumentCB.class.getName(); }
    String xCQ() { return TDocumentCQ.class.getName(); }
    String xMap() { return Map.class.getName(); }
}
