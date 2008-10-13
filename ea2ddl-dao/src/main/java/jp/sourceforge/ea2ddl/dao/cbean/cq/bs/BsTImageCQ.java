package jp.sourceforge.ea2ddl.dao.cbean.cq.bs;

import java.util.Map;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.*;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.cvalue.ConditionValue;
import jp.sourceforge.ea2ddl.dao.allcommon.cbean.sqlclause.SqlClause;
import jp.sourceforge.ea2ddl.dao.cbean.cq.ciq.*;
import jp.sourceforge.ea2ddl.dao.cbean.cq.*;

/**
 * The base condition-query of t_image.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BsTImageCQ extends AbstractBsTImageCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TImageCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTImageCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                              Inline
    //                                                                              ======
    /**
     * Prepare inline query. <br />
     * {select ... from ... left outer join (select * from t_image) where abc = [abc] ...}
     * @return Inline query. (NotNull)
     */
    public TImageCIQ inline() {
        if (_inlineQuery == null) {
            _inlineQuery = new TImageCIQ(getChildQuery(), getSqlClause(), getAliasName(), getNestLevel(), this);
        }
        _inlineQuery.xsetOnClauseInline(false); return _inlineQuery;
    }
    
    /**
     * Prepare on-clause query. <br />
     * {select ... from ... left outer join t_image on ... and abc = [abc] ...}
     * @return On-clause query. (NotNull)
     */
    public TImageCIQ on() {
        if (isBaseQuery(this)) { throw new UnsupportedOperationException("Unsupported onClause of Base Table!"); }
        TImageCIQ inlineQuery = inline(); inlineQuery.xsetOnClauseInline(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====

    protected ConditionValue _imageid;
    public ConditionValue getImageid() {
        if (_imageid == null) { _imageid = new ConditionValue(); }
        return _imageid;
    }
    protected ConditionValue getCValueImageid() { return getImageid(); }
          
    public BsTImageCQ addOrderBy_Imageid_Asc() { regOBA("ImageID"); return this; }
    public BsTImageCQ addOrderBy_Imageid_Desc() { regOBD("ImageID"); return this; }

    protected ConditionValue _name;
    public ConditionValue getName() {
        if (_name == null) { _name = new ConditionValue(); }
        return _name;
    }
    protected ConditionValue getCValueName() { return getName(); }
    
    public BsTImageCQ addOrderBy_Name_Asc() { regOBA("Name"); return this; }
    public BsTImageCQ addOrderBy_Name_Desc() { regOBD("Name"); return this; }

    protected ConditionValue _type;
    public ConditionValue getType() {
        if (_type == null) { _type = new ConditionValue(); }
        return _type;
    }
    protected ConditionValue getCValueType() { return getType(); }
    
    public BsTImageCQ addOrderBy_Type_Asc() { regOBA("Type"); return this; }
    public BsTImageCQ addOrderBy_Type_Desc() { regOBD("Type"); return this; }

    protected ConditionValue _image;
    public ConditionValue getImage() {
        if (_image == null) { _image = new ConditionValue(); }
        return _image;
    }
    protected ConditionValue getCValueImage() { return getImage(); }
    
    public BsTImageCQ addOrderBy_Image_Asc() { regOBA("Image"); return this; }
    public BsTImageCQ addOrderBy_Image_Desc() { regOBD("Image"); return this; }

    // ===================================================================================
    //                                                           Specified Derived OrderBy
    //                                                           =========================
    public BsTImageCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }
    public BsTImageCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    protected void reflectRelationOnUnionQuery(ConditionQuery baseQueryAsSuper, ConditionQuery unionQueryAsSuper) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============


    protected String getConditionQueryClassNameInternally() { return TImageCQ.class.getName(); }
    protected String getMapClassNameInternally() { return Map.class.getName(); }
}
