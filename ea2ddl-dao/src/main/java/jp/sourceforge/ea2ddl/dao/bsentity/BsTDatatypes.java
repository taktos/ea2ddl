package jp.sourceforge.ea2ddl.dao.bsentity;

import java.io.Serializable;
import java.util.*;

import org.seasar.dbflute.Entity;
import org.seasar.dbflute.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.DBMetaInstanceHandler;

/**
 * The entity of t_datatypes that the type is TABLE. <br />
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     Type, ProductName, DataType, Size, MaxLen, MaxPrec, MaxScale, DefaultLen, DefaultPrec, DefaultScale, User, PDATA1, PDATA2, PDATA3, PDATA4, HasLength, GenericType, DatatypeID
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
 * 
 * [version-no]
 *     
 * 
 * [foreign-table]
 *     
 * 
 * [referrer-table]
 *     
 * 
 * [foreign-property]
 *     
 * 
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTDatatypes implements Entity, Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** Type: {VARCHAR(50)} */
    protected String _type;

    /** ProductName: {VARCHAR(50)} */
    protected String _productname;

    /** DataType: {VARCHAR(50)} */
    protected String _datatype;

    /** Size: {INTEGER} */
    protected java.lang.Integer _size;

    /** MaxLen: {INTEGER} */
    protected java.lang.Integer _maxlen;

    /** MaxPrec: {INTEGER} */
    protected java.lang.Integer _maxprec;

    /** MaxScale: {INTEGER} */
    protected java.lang.Integer _maxscale;

    /** DefaultLen: {INTEGER} */
    protected java.lang.Integer _defaultlen;

    /** DefaultPrec: {INTEGER} */
    protected java.lang.Integer _defaultprec;

    /** DefaultScale: {INTEGER} */
    protected java.lang.Integer _defaultscale;

    /** User: {INTEGER} */
    protected java.lang.Integer _user;

    /** PDATA1: {VARCHAR(255)} */
    protected String _pdata1;

    /** PDATA2: {VARCHAR(255)} */
    protected String _pdata2;

    /** PDATA3: {VARCHAR(255)} */
    protected String _pdata3;

    /** PDATA4: {VARCHAR(255)} */
    protected String _pdata4;

    /** HasLength: {VARCHAR(50)} */
    protected String _haslength;

    /** GenericType: {VARCHAR(255)} */
    protected String _generictype;

    /** DatatypeID: {UQ : NotNull : COUNTER} */
    protected java.lang.Integer _datatypeid;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_datatypes";
    }

    public String getTablePropertyName() { // as JavaBeansRule
        return "TDatatypes";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    public DBMeta getDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(getTableDbName());
    }

    // ===================================================================================
    //                                                          Classification Classifying
    //                                                          ==========================
    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    // ===================================================================================
    //                                                                       Determination
    //                                                                       =============
    public boolean hasPrimaryKeyValue() {
        return false;
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    public Set<String> getModifiedPropertyNames() {
        return _modifiedProperties.getPropertyNames();
    }

    protected EntityModifiedProperties newEntityModifiedProperties() {
        return new EntityModifiedProperties();
    }

    public void clearModifiedPropertyNames() {
        _modifiedProperties.clear();
    }

    public boolean hasModification() {
        return !_modifiedProperties.isEmpty();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * If the all-column value of the other is same as this one, returns true.
     * @param other Other entity. (Nullable)
     * @return Comparing result. If other is null, returns false.
     */
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTDatatypes)) { return false; }
        final BsTDatatypes otherEntity = (BsTDatatypes)other;
        if (!helpComparingValue(getType(), otherEntity.getType())) { return false; }
        if (!helpComparingValue(getProductname(), otherEntity.getProductname())) { return false; }
        if (!helpComparingValue(getDatatype(), otherEntity.getDatatype())) { return false; }
        if (!helpComparingValue(getSize(), otherEntity.getSize())) { return false; }
        if (!helpComparingValue(getMaxlen(), otherEntity.getMaxlen())) { return false; }
        if (!helpComparingValue(getMaxprec(), otherEntity.getMaxprec())) { return false; }
        if (!helpComparingValue(getMaxscale(), otherEntity.getMaxscale())) { return false; }
        if (!helpComparingValue(getDefaultlen(), otherEntity.getDefaultlen())) { return false; }
        if (!helpComparingValue(getDefaultprec(), otherEntity.getDefaultprec())) { return false; }
        if (!helpComparingValue(getDefaultscale(), otherEntity.getDefaultscale())) { return false; }
        if (!helpComparingValue(getUser(), otherEntity.getUser())) { return false; }
        if (!helpComparingValue(getPdata1(), otherEntity.getPdata1())) { return false; }
        if (!helpComparingValue(getPdata2(), otherEntity.getPdata2())) { return false; }
        if (!helpComparingValue(getPdata3(), otherEntity.getPdata3())) { return false; }
        if (!helpComparingValue(getPdata4(), otherEntity.getPdata4())) { return false; }
        if (!helpComparingValue(getHaslength(), otherEntity.getHaslength())) { return false; }
        if (!helpComparingValue(getGenerictype(), otherEntity.getGenerictype())) { return false; }
        if (!helpComparingValue(getDatatypeid(), otherEntity.getDatatypeid())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    /**
     * Calculates hash-code from all columns.
     * @return Hash-code from all-columns.
     */
    public int hashCode() {
        int result = 17;
        if (this.getType() != null) { result = result + this.getType().hashCode(); }
        if (this.getProductname() != null) { result = result + this.getProductname().hashCode(); }
        if (this.getDatatype() != null) { result = result + this.getDatatype().hashCode(); }
        if (this.getSize() != null) { result = result + this.getSize().hashCode(); }
        if (this.getMaxlen() != null) { result = result + this.getMaxlen().hashCode(); }
        if (this.getMaxprec() != null) { result = result + this.getMaxprec().hashCode(); }
        if (this.getMaxscale() != null) { result = result + this.getMaxscale().hashCode(); }
        if (this.getDefaultlen() != null) { result = result + this.getDefaultlen().hashCode(); }
        if (this.getDefaultprec() != null) { result = result + this.getDefaultprec().hashCode(); }
        if (this.getDefaultscale() != null) { result = result + this.getDefaultscale().hashCode(); }
        if (this.getUser() != null) { result = result + this.getUser().hashCode(); }
        if (this.getPdata1() != null) { result = result + this.getPdata1().hashCode(); }
        if (this.getPdata2() != null) { result = result + this.getPdata2().hashCode(); }
        if (this.getPdata3() != null) { result = result + this.getPdata3().hashCode(); }
        if (this.getPdata4() != null) { result = result + this.getPdata4().hashCode(); }
        if (this.getHaslength() != null) { result = result + this.getHaslength().hashCode(); }
        if (this.getGenerictype() != null) { result = result + this.getGenerictype().hashCode(); }
        if (this.getDatatypeid() != null) { result = result + this.getDatatypeid().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getType());
        sb.append(delimiter).append(getProductname());
        sb.append(delimiter).append(getDatatype());
        sb.append(delimiter).append(getSize());
        sb.append(delimiter).append(getMaxlen());
        sb.append(delimiter).append(getMaxprec());
        sb.append(delimiter).append(getMaxscale());
        sb.append(delimiter).append(getDefaultlen());
        sb.append(delimiter).append(getDefaultprec());
        sb.append(delimiter).append(getDefaultscale());
        sb.append(delimiter).append(getUser());
        sb.append(delimiter).append(getPdata1());
        sb.append(delimiter).append(getPdata2());
        sb.append(delimiter).append(getPdata3());
        sb.append(delimiter).append(getPdata4());
        sb.append(delimiter).append(getHaslength());
        sb.append(delimiter).append(getGenerictype());
        sb.append(delimiter).append(getDatatypeid());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * Type: {VARCHAR(50)} <br />
     * @return The value of the column 'Type'. (Nullable)
     */
    public String getType() {
        return _type;
    }

    /**
     * Type: {VARCHAR(50)} <br />
     * @param type The value of the column 'Type'. (Nullable)
     */
    public void setType(String type) {
        _modifiedProperties.addPropertyName("type");
        this._type = type;
    }

    /**
     * ProductName: {VARCHAR(50)} <br />
     * @return The value of the column 'ProductName'. (Nullable)
     */
    public String getProductname() {
        return _productname;
    }

    /**
     * ProductName: {VARCHAR(50)} <br />
     * @param productname The value of the column 'ProductName'. (Nullable)
     */
    public void setProductname(String productname) {
        _modifiedProperties.addPropertyName("productname");
        this._productname = productname;
    }

    /**
     * DataType: {VARCHAR(50)} <br />
     * @return The value of the column 'DataType'. (Nullable)
     */
    public String getDatatype() {
        return _datatype;
    }

    /**
     * DataType: {VARCHAR(50)} <br />
     * @param datatype The value of the column 'DataType'. (Nullable)
     */
    public void setDatatype(String datatype) {
        _modifiedProperties.addPropertyName("datatype");
        this._datatype = datatype;
    }

    /**
     * Size: {INTEGER} <br />
     * @return The value of the column 'Size'. (Nullable)
     */
    public java.lang.Integer getSize() {
        return _size;
    }

    /**
     * Size: {INTEGER} <br />
     * @param size The value of the column 'Size'. (Nullable)
     */
    public void setSize(java.lang.Integer size) {
        _modifiedProperties.addPropertyName("size");
        this._size = size;
    }

    /**
     * MaxLen: {INTEGER} <br />
     * @return The value of the column 'MaxLen'. (Nullable)
     */
    public java.lang.Integer getMaxlen() {
        return _maxlen;
    }

    /**
     * MaxLen: {INTEGER} <br />
     * @param maxlen The value of the column 'MaxLen'. (Nullable)
     */
    public void setMaxlen(java.lang.Integer maxlen) {
        _modifiedProperties.addPropertyName("maxlen");
        this._maxlen = maxlen;
    }

    /**
     * MaxPrec: {INTEGER} <br />
     * @return The value of the column 'MaxPrec'. (Nullable)
     */
    public java.lang.Integer getMaxprec() {
        return _maxprec;
    }

    /**
     * MaxPrec: {INTEGER} <br />
     * @param maxprec The value of the column 'MaxPrec'. (Nullable)
     */
    public void setMaxprec(java.lang.Integer maxprec) {
        _modifiedProperties.addPropertyName("maxprec");
        this._maxprec = maxprec;
    }

    /**
     * MaxScale: {INTEGER} <br />
     * @return The value of the column 'MaxScale'. (Nullable)
     */
    public java.lang.Integer getMaxscale() {
        return _maxscale;
    }

    /**
     * MaxScale: {INTEGER} <br />
     * @param maxscale The value of the column 'MaxScale'. (Nullable)
     */
    public void setMaxscale(java.lang.Integer maxscale) {
        _modifiedProperties.addPropertyName("maxscale");
        this._maxscale = maxscale;
    }

    /**
     * DefaultLen: {INTEGER} <br />
     * @return The value of the column 'DefaultLen'. (Nullable)
     */
    public java.lang.Integer getDefaultlen() {
        return _defaultlen;
    }

    /**
     * DefaultLen: {INTEGER} <br />
     * @param defaultlen The value of the column 'DefaultLen'. (Nullable)
     */
    public void setDefaultlen(java.lang.Integer defaultlen) {
        _modifiedProperties.addPropertyName("defaultlen");
        this._defaultlen = defaultlen;
    }

    /**
     * DefaultPrec: {INTEGER} <br />
     * @return The value of the column 'DefaultPrec'. (Nullable)
     */
    public java.lang.Integer getDefaultprec() {
        return _defaultprec;
    }

    /**
     * DefaultPrec: {INTEGER} <br />
     * @param defaultprec The value of the column 'DefaultPrec'. (Nullable)
     */
    public void setDefaultprec(java.lang.Integer defaultprec) {
        _modifiedProperties.addPropertyName("defaultprec");
        this._defaultprec = defaultprec;
    }

    /**
     * DefaultScale: {INTEGER} <br />
     * @return The value of the column 'DefaultScale'. (Nullable)
     */
    public java.lang.Integer getDefaultscale() {
        return _defaultscale;
    }

    /**
     * DefaultScale: {INTEGER} <br />
     * @param defaultscale The value of the column 'DefaultScale'. (Nullable)
     */
    public void setDefaultscale(java.lang.Integer defaultscale) {
        _modifiedProperties.addPropertyName("defaultscale");
        this._defaultscale = defaultscale;
    }

    /**
     * User: {INTEGER} <br />
     * @return The value of the column 'User'. (Nullable)
     */
    public java.lang.Integer getUser() {
        return _user;
    }

    /**
     * User: {INTEGER} <br />
     * @param user The value of the column 'User'. (Nullable)
     */
    public void setUser(java.lang.Integer user) {
        _modifiedProperties.addPropertyName("user");
        this._user = user;
    }

    /**
     * PDATA1: {VARCHAR(255)} <br />
     * @return The value of the column 'PDATA1'. (Nullable)
     */
    public String getPdata1() {
        return _pdata1;
    }

    /**
     * PDATA1: {VARCHAR(255)} <br />
     * @param pdata1 The value of the column 'PDATA1'. (Nullable)
     */
    public void setPdata1(String pdata1) {
        _modifiedProperties.addPropertyName("pdata1");
        this._pdata1 = pdata1;
    }

    /**
     * PDATA2: {VARCHAR(255)} <br />
     * @return The value of the column 'PDATA2'. (Nullable)
     */
    public String getPdata2() {
        return _pdata2;
    }

    /**
     * PDATA2: {VARCHAR(255)} <br />
     * @param pdata2 The value of the column 'PDATA2'. (Nullable)
     */
    public void setPdata2(String pdata2) {
        _modifiedProperties.addPropertyName("pdata2");
        this._pdata2 = pdata2;
    }

    /**
     * PDATA3: {VARCHAR(255)} <br />
     * @return The value of the column 'PDATA3'. (Nullable)
     */
    public String getPdata3() {
        return _pdata3;
    }

    /**
     * PDATA3: {VARCHAR(255)} <br />
     * @param pdata3 The value of the column 'PDATA3'. (Nullable)
     */
    public void setPdata3(String pdata3) {
        _modifiedProperties.addPropertyName("pdata3");
        this._pdata3 = pdata3;
    }

    /**
     * PDATA4: {VARCHAR(255)} <br />
     * @return The value of the column 'PDATA4'. (Nullable)
     */
    public String getPdata4() {
        return _pdata4;
    }

    /**
     * PDATA4: {VARCHAR(255)} <br />
     * @param pdata4 The value of the column 'PDATA4'. (Nullable)
     */
    public void setPdata4(String pdata4) {
        _modifiedProperties.addPropertyName("pdata4");
        this._pdata4 = pdata4;
    }

    /**
     * HasLength: {VARCHAR(50)} <br />
     * @return The value of the column 'HasLength'. (Nullable)
     */
    public String getHaslength() {
        return _haslength;
    }

    /**
     * HasLength: {VARCHAR(50)} <br />
     * @param haslength The value of the column 'HasLength'. (Nullable)
     */
    public void setHaslength(String haslength) {
        _modifiedProperties.addPropertyName("haslength");
        this._haslength = haslength;
    }

    /**
     * GenericType: {VARCHAR(255)} <br />
     * @return The value of the column 'GenericType'. (Nullable)
     */
    public String getGenerictype() {
        return _generictype;
    }

    /**
     * GenericType: {VARCHAR(255)} <br />
     * @param generictype The value of the column 'GenericType'. (Nullable)
     */
    public void setGenerictype(String generictype) {
        _modifiedProperties.addPropertyName("generictype");
        this._generictype = generictype;
    }

    /**
     * DatatypeID: {UQ : NotNull : COUNTER} <br />
     * @return The value of the column 'DatatypeID'. (Nullable)
     */
    public java.lang.Integer getDatatypeid() {
        return _datatypeid;
    }

    /**
     * DatatypeID: {UQ : NotNull : COUNTER} <br />
     * @param datatypeid The value of the column 'DatatypeID'. (Nullable)
     */
    public void setDatatypeid(java.lang.Integer datatypeid) {
        _modifiedProperties.addPropertyName("datatypeid");
        this._datatypeid = datatypeid;
    }
}
