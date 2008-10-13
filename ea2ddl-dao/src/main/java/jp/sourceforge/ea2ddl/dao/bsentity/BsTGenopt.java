package jp.sourceforge.ea2ddl.dao.bsentity;

import java.util.*;
    
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;

/**
 * The entity of t_genopt(TABLE).
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     AppliesTo, Option
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
@SuppressWarnings("unchecked")
public abstract class BsTGenopt implements Entity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is t_genopt. */
    public static final String TABLE = "t_genopt";


    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** The attribute of the column 'AppliesTo'. {VARCHAR(12)} */
    protected String _appliesto;

    /** The attribute of the column 'Option'. {LONGCHAR(2147483647)} */
    protected String _option;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTGenopt() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_genopt";
    }

    public String getTablePropertyName() {// as JavaBeansRule
        return "TGenopt";
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
        if (other == null || !(other instanceof BsTGenopt)) { return false; }
        final BsTGenopt otherEntity = (BsTGenopt)other;
        if (!helpComparingValue(getAppliesto(), otherEntity.getAppliesto())) { return false; }
        if (!helpComparingValue(getOption(), otherEntity.getOption())) { return false; }
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
        if (this.getAppliesto() != null) { result = result + this.getAppliesto().hashCode(); }
        if (this.getOption() != null) { result = result + this.getOption().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getAppliesto());
        sb.append(delimiter).append(getOption());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========

    /** The column annotation for S2Dao. {VARCHAR(12)} */
    public static final String appliesto_COLUMN = "AppliesTo";

    /**
     * Get the value of the column 'AppliesTo'. <br />
     * {VARCHAR(12)}
     * @return The value of the column 'AppliesTo'. (Nullable)
     */
    public String getAppliesto() {
        return _appliesto;
    }

    /**
     * Set the value of the column 'AppliesTo'. <br />
     * {VARCHAR(12)}
     * @param appliesto The value of the column 'AppliesTo'. (Nullable)
     */
    public void setAppliesto(String appliesto) {
        _modifiedProperties.addPropertyName("appliesto");
        this._appliesto = appliesto;
    }

    /** The column annotation for S2Dao. {LONGCHAR(2147483647)} */
    public static final String option_COLUMN = "Option";

    /**
     * Get the value of the column 'Option'. <br />
     * {LONGCHAR(2147483647)}
     * @return The value of the column 'Option'. (Nullable)
     */
    public String getOption() {
        return _option;
    }

    /**
     * Set the value of the column 'Option'. <br />
     * {LONGCHAR(2147483647)}
     * @param option The value of the column 'Option'. (Nullable)
     */
    public void setOption(String option) {
        _modifiedProperties.addPropertyName("option");
        this._option = option;
    }

}
