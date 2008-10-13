package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_package.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTPackageCQ extends AbstractBsTPackageCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TPackageCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTPackageCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_package) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TPackageCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TPackageCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_package on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TPackageCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported onClause of Base Table!"); }
        TPackageCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _packageId;
    public ConditionValue getPackageId() {
        if (_packageId == null) { _packageId = new ConditionValue(); }
        return _packageId;
    }
    protected ConditionValue getCValuePackageId() { return getPackageId(); }
          
    public BsTPackageCQ addOrderBy_PackageId_Asc() { regOBA("Package_ID"); return this; }
    public BsTPackageCQ addOrderBy_PackageId_Desc() { regOBD("Package_ID"); return this; }

    protected ConditionValue _name;
    public ConditionValue getName() {
        if (_name == null) { _name = new ConditionValue(); }
        return _name;
    }
    protected ConditionValue getCValueName() { return getName(); }
    
    public BsTPackageCQ addOrderBy_Name_Asc() { regOBA("Name"); return this; }
    public BsTPackageCQ addOrderBy_Name_Desc() { regOBD("Name"); return this; }

    protected ConditionValue _parentId;
    public ConditionValue getParentId() {
        if (_parentId == null) { _parentId = new ConditionValue(); }
        return _parentId;
    }
    protected ConditionValue getCValueParentId() { return getParentId(); }
          
    public BsTPackageCQ addOrderBy_ParentId_Asc() { regOBA("Parent_ID"); return this; }
    public BsTPackageCQ addOrderBy_ParentId_Desc() { regOBD("Parent_ID"); return this; }

    protected ConditionValue _createddate;
    public ConditionValue getCreateddate() {
        if (_createddate == null) { _createddate = new ConditionValue(); }
        return _createddate;
    }
    protected ConditionValue getCValueCreateddate() { return getCreateddate(); }
    
    public BsTPackageCQ addOrderBy_Createddate_Asc() { regOBA("CreatedDate"); return this; }
    public BsTPackageCQ addOrderBy_Createddate_Desc() { regOBD("CreatedDate"); return this; }

    protected ConditionValue _modifieddate;
    public ConditionValue getModifieddate() {
        if (_modifieddate == null) { _modifieddate = new ConditionValue(); }
        return _modifieddate;
    }
    protected ConditionValue getCValueModifieddate() { return getModifieddate(); }
    
    public BsTPackageCQ addOrderBy_Modifieddate_Asc() { regOBA("ModifiedDate"); return this; }
    public BsTPackageCQ addOrderBy_Modifieddate_Desc() { regOBD("ModifiedDate"); return this; }

    protected ConditionValue _notes;
    public ConditionValue getNotes() {
        if (_notes == null) { _notes = new ConditionValue(); }
        return _notes;
    }
    protected ConditionValue getCValueNotes() { return getNotes(); }
    
    public BsTPackageCQ addOrderBy_Notes_Asc() { regOBA("Notes"); return this; }
    public BsTPackageCQ addOrderBy_Notes_Desc() { regOBD("Notes"); return this; }

    protected ConditionValue _eaGuid;
    public ConditionValue getEaGuid() {
        if (_eaGuid == null) { _eaGuid = new ConditionValue(); }
        return _eaGuid;
    }
    protected ConditionValue getCValueEaGuid() { return getEaGuid(); }
    
    public BsTPackageCQ addOrderBy_EaGuid_Asc() { regOBA("ea_guid"); return this; }
    public BsTPackageCQ addOrderBy_EaGuid_Desc() { regOBD("ea_guid"); return this; }

    protected ConditionValue _xmlpath;
    public ConditionValue getXmlpath() {
        if (_xmlpath == null) { _xmlpath = new ConditionValue(); }
        return _xmlpath;
    }
    protected ConditionValue getCValueXmlpath() { return getXmlpath(); }
    
    public BsTPackageCQ addOrderBy_Xmlpath_Asc() { regOBA("XMLPath"); return this; }
    public BsTPackageCQ addOrderBy_Xmlpath_Desc() { regOBD("XMLPath"); return this; }

    protected ConditionValue _iscontrolled;
    public ConditionValue getIscontrolled() {
        if (_iscontrolled == null) { _iscontrolled = new ConditionValue(); }
        return _iscontrolled;
    }
    protected ConditionValue getCValueIscontrolled() { return getIscontrolled(); }
    
    public BsTPackageCQ addOrderBy_Iscontrolled_Asc() { regOBA("IsControlled"); return this; }
    public BsTPackageCQ addOrderBy_Iscontrolled_Desc() { regOBD("IsControlled"); return this; }

    protected ConditionValue _lastloaddate;
    public ConditionValue getLastloaddate() {
        if (_lastloaddate == null) { _lastloaddate = new ConditionValue(); }
        return _lastloaddate;
    }
    protected ConditionValue getCValueLastloaddate() { return getLastloaddate(); }
    
    public BsTPackageCQ addOrderBy_Lastloaddate_Asc() { regOBA("LastLoadDate"); return this; }
    public BsTPackageCQ addOrderBy_Lastloaddate_Desc() { regOBD("LastLoadDate"); return this; }

    protected ConditionValue _lastsavedate;
    public ConditionValue getLastsavedate() {
        if (_lastsavedate == null) { _lastsavedate = new ConditionValue(); }
        return _lastsavedate;
    }
    protected ConditionValue getCValueLastsavedate() { return getLastsavedate(); }
    
    public BsTPackageCQ addOrderBy_Lastsavedate_Asc() { regOBA("LastSaveDate"); return this; }
    public BsTPackageCQ addOrderBy_Lastsavedate_Desc() { regOBD("LastSaveDate"); return this; }

    protected ConditionValue _version;
    public ConditionValue getVersion() {
        if (_version == null) { _version = new ConditionValue(); }
        return _version;
    }
    protected ConditionValue getCValueVersion() { return getVersion(); }
    
    public BsTPackageCQ addOrderBy_Version_Asc() { regOBA("Version"); return this; }
    public BsTPackageCQ addOrderBy_Version_Desc() { regOBD("Version"); return this; }

    protected ConditionValue _pkgowner;
    public ConditionValue getPkgowner() {
        if (_pkgowner == null) { _pkgowner = new ConditionValue(); }
        return _pkgowner;
    }
    protected ConditionValue getCValuePkgowner() { return getPkgowner(); }
    
    public BsTPackageCQ addOrderBy_Pkgowner_Asc() { regOBA("PkgOwner"); return this; }
    public BsTPackageCQ addOrderBy_Pkgowner_Desc() { regOBD("PkgOwner"); return this; }

    protected ConditionValue _umlversion;
    public ConditionValue getUmlversion() {
        if (_umlversion == null) { _umlversion = new ConditionValue(); }
        return _umlversion;
    }
    protected ConditionValue getCValueUmlversion() { return getUmlversion(); }
    
    public BsTPackageCQ addOrderBy_Umlversion_Asc() { regOBA("UMLVersion"); return this; }
    public BsTPackageCQ addOrderBy_Umlversion_Desc() { regOBD("UMLVersion"); return this; }

    protected ConditionValue _usedtd;
    public ConditionValue getUsedtd() {
        if (_usedtd == null) { _usedtd = new ConditionValue(); }
        return _usedtd;
    }
    protected ConditionValue getCValueUsedtd() { return getUsedtd(); }
    
    public BsTPackageCQ addOrderBy_Usedtd_Asc() { regOBA("UseDTD"); return this; }
    public BsTPackageCQ addOrderBy_Usedtd_Desc() { regOBD("UseDTD"); return this; }

    protected ConditionValue _logxml;
    public ConditionValue getLogxml() {
        if (_logxml == null) { _logxml = new ConditionValue(); }
        return _logxml;
    }
    protected ConditionValue getCValueLogxml() { return getLogxml(); }
    
    public BsTPackageCQ addOrderBy_Logxml_Asc() { regOBA("LogXML"); return this; }
    public BsTPackageCQ addOrderBy_Logxml_Desc() { regOBD("LogXML"); return this; }

    protected ConditionValue _codepath;
    public ConditionValue getCodepath() {
        if (_codepath == null) { _codepath = new ConditionValue(); }
        return _codepath;
    }
    protected ConditionValue getCValueCodepath() { return getCodepath(); }
    
    public BsTPackageCQ addOrderBy_Codepath_Asc() { regOBA("CodePath"); return this; }
    public BsTPackageCQ addOrderBy_Codepath_Desc() { regOBD("CodePath"); return this; }

    protected ConditionValue _namespace;
    public ConditionValue getNamespace() {
        if (_namespace == null) { _namespace = new ConditionValue(); }
        return _namespace;
    }
    protected ConditionValue getCValueNamespace() { return getNamespace(); }
    
    public BsTPackageCQ addOrderBy_Namespace_Asc() { regOBA("Namespace"); return this; }
    public BsTPackageCQ addOrderBy_Namespace_Desc() { regOBD("Namespace"); return this; }

    protected ConditionValue _tpos;
    public ConditionValue getTpos() {
        if (_tpos == null) { _tpos = new ConditionValue(); }
        return _tpos;
    }
    protected ConditionValue getCValueTpos() { return getTpos(); }
          
    public BsTPackageCQ addOrderBy_Tpos_Asc() { regOBA("TPos"); return this; }
    public BsTPackageCQ addOrderBy_Tpos_Desc() { regOBD("TPos"); return this; }

    protected ConditionValue _packageflags;
    public ConditionValue getPackageflags() {
        if (_packageflags == null) { _packageflags = new ConditionValue(); }
        return _packageflags;
    }
    protected ConditionValue getCValuePackageflags() { return getPackageflags(); }
    
    public BsTPackageCQ addOrderBy_Packageflags_Asc() { regOBA("PackageFlags"); return this; }
    public BsTPackageCQ addOrderBy_Packageflags_Desc() { regOBD("PackageFlags"); return this; }

    protected ConditionValue _batchsave;
    public ConditionValue getBatchsave() {
        if (_batchsave == null) { _batchsave = new ConditionValue(); }
        return _batchsave;
    }
    protected ConditionValue getCValueBatchsave() { return getBatchsave(); }
          
    public BsTPackageCQ addOrderBy_Batchsave_Asc() { regOBA("BatchSave"); return this; }
    public BsTPackageCQ addOrderBy_Batchsave_Desc() { regOBD("BatchSave"); return this; }

    protected ConditionValue _batchload;
    public ConditionValue getBatchload() {
        if (_batchload == null) { _batchload = new ConditionValue(); }
        return _batchload;
    }
    protected ConditionValue getCValueBatchload() { return getBatchload(); }
          
    public BsTPackageCQ addOrderBy_Batchload_Asc() { regOBA("BatchLoad"); return this; }
    public BsTPackageCQ addOrderBy_Batchload_Desc() { regOBD("BatchLoad"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTPackageCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTPackageCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============


    protected String getConditionQueryClassNameInternally() { return TPackageCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}
