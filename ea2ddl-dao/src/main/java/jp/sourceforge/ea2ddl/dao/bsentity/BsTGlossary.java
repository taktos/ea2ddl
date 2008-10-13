package jp.sourceforge.ea2ddl.dao.bsentity;

import java.util.*;
    
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;

/**
 * The entity of t_glossary(TABLE).
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     Term, Type, Meaning, GlossaryID
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
public abstract class BsTGlossary implements Entity, java.io.Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    /** TABLE-Annotation for S2Dao. The value is t_glossary. */
    public static final String TABLE = "t_glossary";


    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** The attribute of the column 'Term'. {UQ : VARCHAR(255)} */
    protected String _term;

    /** The attribute of the column 'Type'. {VARCHAR(255)} */
    protected String _type;

    /** The attribute of the column 'Meaning'. {LONGCHAR(2147483647)} */
    protected String _meaning;

    /** The attribute of the column 'GlossaryID'. {COUNTER : NotNull} */
    protected java.lang.Integer _glossaryid;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The attribute of entity modified properties. (for S2Dao) */
    protected EntityModifiedProperties _modifiedProperties = newEntityModifiedProperties();
    
    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTGlossary() {
    }

    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    public String getTableDbName() {
        return "t_glossary";
    }

    public String getTablePropertyName() {// as JavaBeansRule
        return "TGlossary";
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
        if (other == null || !(other instanceof BsTGlossary)) { return false; }
        final BsTGlossary otherEntity = (BsTGlossary)other;
        if (!helpComparingValue(getTerm(), otherEntity.getTerm())) { return false; }
        if (!helpComparingValue(getType(), otherEntity.getType())) { return false; }
        if (!helpComparingValue(getMeaning(), otherEntity.getMeaning())) { return false; }
        if (!helpComparingValue(getGlossaryid(), otherEntity.getGlossaryid())) { return false; }
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
        if (this.getTerm() != null) { result = result + this.getTerm().hashCode(); }
        if (this.getType() != null) { result = result + this.getType().hashCode(); }
        if (this.getMeaning() != null) { result = result + this.getMeaning().hashCode(); }
        if (this.getGlossaryid() != null) { result = result + this.getGlossaryid().hashCode(); }
        return result;
    }

    /**
     * @return The view string of columns. (NotNull)
     */
    public String toString() {
        String delimiter = ",";
        StringBuilder sb = new StringBuilder();
        sb.append(delimiter).append(getTerm());
        sb.append(delimiter).append(getType());
        sb.append(delimiter).append(getMeaning());
        sb.append(delimiter).append(getGlossaryid());
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========

    /** The column annotation for S2Dao. {UQ : VARCHAR(255)} */
    public static final String term_COLUMN = "Term";

    /**
     * Get the value of the column 'Term'. <br />
     * {UQ : VARCHAR(255)}
     * @return The value of the column 'Term'. (Nullable)
     */
    public String getTerm() {
        return _term;
    }

    /**
     * Set the value of the column 'Term'. <br />
     * {UQ : VARCHAR(255)}
     * @param term The value of the column 'Term'. (Nullable)
     */
    public void setTerm(String term) {
        _modifiedProperties.addPropertyName("term");
        this._term = term;
    }

    /** The column annotation for S2Dao. {VARCHAR(255)} */
    public static final String type_COLUMN = "Type";

    /**
     * Get the value of the column 'Type'. <br />
     * {VARCHAR(255)}
     * @return The value of the column 'Type'. (Nullable)
     */
    public String getType() {
        return _type;
    }

    /**
     * Set the value of the column 'Type'. <br />
     * {VARCHAR(255)}
     * @param type The value of the column 'Type'. (Nullable)
     */
    public void setType(String type) {
        _modifiedProperties.addPropertyName("type");
        this._type = type;
    }

    /** The column annotation for S2Dao. {LONGCHAR(2147483647)} */
    public static final String meaning_COLUMN = "Meaning";

    /**
     * Get the value of the column 'Meaning'. <br />
     * {LONGCHAR(2147483647)}
     * @return The value of the column 'Meaning'. (Nullable)
     */
    public String getMeaning() {
        return _meaning;
    }

    /**
     * Set the value of the column 'Meaning'. <br />
     * {LONGCHAR(2147483647)}
     * @param meaning The value of the column 'Meaning'. (Nullable)
     */
    public void setMeaning(String meaning) {
        _modifiedProperties.addPropertyName("meaning");
        this._meaning = meaning;
    }

    /** The column annotation for S2Dao. {COUNTER : NotNull} */
    public static final String glossaryid_COLUMN = "GlossaryID";

    /**
     * Get the value of the column 'GlossaryID'. <br />
     * {COUNTER : NotNull}
     * @return The value of the column 'GlossaryID'. (Nullable)
     */
    public java.lang.Integer getGlossaryid() {
        return _glossaryid;
    }

    /**
     * Set the value of the column 'GlossaryID'. <br />
     * {COUNTER : NotNull}
     * @param glossaryid The value of the column 'GlossaryID'. (Nullable)
     */
    public void setGlossaryid(java.lang.Integer glossaryid) {
        _modifiedProperties.addPropertyName("glossaryid");
        this._glossaryid = glossaryid;
    }

}
