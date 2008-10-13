package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_files.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTFilesCQ extends AbstractBsTFilesCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TFilesCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTFilesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_files) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TFilesCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TFilesCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_files on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TFilesCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported onClause of Base Table!"); }
        TFilesCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _fileid;
    public ConditionValue getFileid() {
        if (_fileid == null) { _fileid = new ConditionValue(); }
        return _fileid;
    }
    protected ConditionValue getCValueFileid() { return getFileid(); }
    
    public BsTFilesCQ addOrderBy_Fileid_Asc() { regOBA("FileID"); return this; }
    public BsTFilesCQ addOrderBy_Fileid_Desc() { regOBD("FileID"); return this; }

    protected ConditionValue _appliesto;
    public ConditionValue getAppliesto() {
        if (_appliesto == null) { _appliesto = new ConditionValue(); }
        return _appliesto;
    }
    protected ConditionValue getCValueAppliesto() { return getAppliesto(); }
    
    public BsTFilesCQ addOrderBy_Appliesto_Asc() { regOBA("AppliesTo"); return this; }
    public BsTFilesCQ addOrderBy_Appliesto_Desc() { regOBD("AppliesTo"); return this; }

    protected ConditionValue _category;
    public ConditionValue getCategory() {
        if (_category == null) { _category = new ConditionValue(); }
        return _category;
    }
    protected ConditionValue getCValueCategory() { return getCategory(); }
    
    public BsTFilesCQ addOrderBy_Category_Asc() { regOBA("Category"); return this; }
    public BsTFilesCQ addOrderBy_Category_Desc() { regOBD("Category"); return this; }

    protected ConditionValue _name;
    public ConditionValue getName() {
        if (_name == null) { _name = new ConditionValue(); }
        return _name;
    }
    protected ConditionValue getCValueName() { return getName(); }
    
    public BsTFilesCQ addOrderBy_Name_Asc() { regOBA("Name"); return this; }
    public BsTFilesCQ addOrderBy_Name_Desc() { regOBD("Name"); return this; }

    protected ConditionValue _file;
    public ConditionValue getFile() {
        if (_file == null) { _file = new ConditionValue(); }
        return _file;
    }
    protected ConditionValue getCValueFile() { return getFile(); }
    
    public BsTFilesCQ addOrderBy_File_Asc() { regOBA("File"); return this; }
    public BsTFilesCQ addOrderBy_File_Desc() { regOBD("File"); return this; }

    protected ConditionValue _notes;
    public ConditionValue getNotes() {
        if (_notes == null) { _notes = new ConditionValue(); }
        return _notes;
    }
    protected ConditionValue getCValueNotes() { return getNotes(); }
    
    public BsTFilesCQ addOrderBy_Notes_Asc() { regOBA("Notes"); return this; }
    public BsTFilesCQ addOrderBy_Notes_Desc() { regOBD("Notes"); return this; }

    protected ConditionValue _filedate;
    public ConditionValue getFiledate() {
        if (_filedate == null) { _filedate = new ConditionValue(); }
        return _filedate;
    }
    protected ConditionValue getCValueFiledate() { return getFiledate(); }
    
    public BsTFilesCQ addOrderBy_Filedate_Asc() { regOBA("FileDate"); return this; }
    public BsTFilesCQ addOrderBy_Filedate_Desc() { regOBD("FileDate"); return this; }

    protected ConditionValue _filesize;
    public ConditionValue getFilesize() {
        if (_filesize == null) { _filesize = new ConditionValue(); }
        return _filesize;
    }
    protected ConditionValue getCValueFilesize() { return getFilesize(); }
          
    public BsTFilesCQ addOrderBy_Filesize_Asc() { regOBA("FileSize"); return this; }
    public BsTFilesCQ addOrderBy_Filesize_Desc() { regOBD("FileSize"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTFilesCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTFilesCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============


    protected String getConditionQueryClassNameInternally() { return TFilesCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}
