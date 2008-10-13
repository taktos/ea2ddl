package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_objectfiles.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTObjectfilesCQ extends AbstractBsTObjectfilesCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TObjectfilesCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTObjectfilesCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_objectfiles) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TObjectfilesCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TObjectfilesCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_objectfiles on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TObjectfilesCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported onClause of Base Table!"); }
        TObjectfilesCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _objectId;
    public ConditionValue getObjectId() {
        if (_objectId == null) { _objectId = new ConditionValue(); }
        return _objectId;
    }
    protected ConditionValue getCValueObjectId() { return getObjectId(); }
          
    public BsTObjectfilesCQ addOrderBy_ObjectId_Asc() { regOBA("Object_ID"); return this; }
    public BsTObjectfilesCQ addOrderBy_ObjectId_Desc() { regOBD("Object_ID"); return this; }

    protected ConditionValue _filename;
    public ConditionValue getFilename() {
        if (_filename == null) { _filename = new ConditionValue(); }
        return _filename;
    }
    protected ConditionValue getCValueFilename() { return getFilename(); }
    
    public BsTObjectfilesCQ addOrderBy_Filename_Asc() { regOBA("FileName"); return this; }
    public BsTObjectfilesCQ addOrderBy_Filename_Desc() { regOBD("FileName"); return this; }

    protected ConditionValue _type;
    public ConditionValue getType() {
        if (_type == null) { _type = new ConditionValue(); }
        return _type;
    }
    protected ConditionValue getCValueType() { return getType(); }
    
    public BsTObjectfilesCQ addOrderBy_Type_Asc() { regOBA("Type"); return this; }
    public BsTObjectfilesCQ addOrderBy_Type_Desc() { regOBD("Type"); return this; }

    protected ConditionValue _note;
    public ConditionValue getNote() {
        if (_note == null) { _note = new ConditionValue(); }
        return _note;
    }
    protected ConditionValue getCValueNote() { return getNote(); }
    
    public BsTObjectfilesCQ addOrderBy_Note_Asc() { regOBA("Note"); return this; }
    public BsTObjectfilesCQ addOrderBy_Note_Desc() { regOBD("Note"); return this; }

    protected ConditionValue _filesize;
    public ConditionValue getFilesize() {
        if (_filesize == null) { _filesize = new ConditionValue(); }
        return _filesize;
    }
    protected ConditionValue getCValueFilesize() { return getFilesize(); }
    
    public BsTObjectfilesCQ addOrderBy_Filesize_Asc() { regOBA("FileSize"); return this; }
    public BsTObjectfilesCQ addOrderBy_Filesize_Desc() { regOBD("FileSize"); return this; }

    protected ConditionValue _filedate;
    public ConditionValue getFiledate() {
        if (_filedate == null) { _filedate = new ConditionValue(); }
        return _filedate;
    }
    protected ConditionValue getCValueFiledate() { return getFiledate(); }
    
    public BsTObjectfilesCQ addOrderBy_Filedate_Asc() { regOBA("FileDate"); return this; }
    public BsTObjectfilesCQ addOrderBy_Filedate_Desc() { regOBD("FileDate"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTObjectfilesCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTObjectfilesCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============


    protected String getConditionQueryClassNameInternally() { return TObjectfilesCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}
