package jp.sourceforge.ea2ddl.dao.bsdao.pmbean;


/**
 * The parameter-bean of SelectTablesInPackagePmb.
 * @author DBFlute(AutoGenerator)
 */
public class BsSelectTablesInPackagePmb  {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** The value of packageId. */
    protected java.lang.Integer _packageId;

    /** The value of stereotype. */
    protected java.lang.String _stereotype;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSelectTablesInPackagePmb() {
    }
    
    // ===================================================================================
    //                                                                              Helper
    //                                                                              ======
    /**
     * @param value Query value. (Nullable)
     * @return Converted value. (Nullable)
     */
    protected String convertEmptyToNullIfString(String value) {
        return filterRemoveEmptyString(value);
    }

    /**
     * @param value Query value string. (Nullable)
     * @return Removed-empty value. (Nullable)
     */
    protected String filterRemoveEmptyString(String value) {
        return ((value != null && !"".equals(value)) ? value : null);
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    /**
     * The override.
     * @return The view of properties. (NotNull)
     */
    @Override
    public String toString() {
        final String delimiter = ",";
        final StringBuffer sb = new StringBuffer();
        sb.append(delimiter).append(_packageId);
        sb.append(delimiter).append(_stereotype);
        if (sb.length() > 0) { sb.delete(0, delimiter.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * Get the value of packageId. (Converted empty to null)
     * @return The value of packageId. (Nullable & NotEmptyString: if the value is empty string, returns null)
     */
    public java.lang.Integer getPackageId() {
        return _packageId;
    }

    /**
     * Set the value of packageId.
     * @param packageId The value of packageId. (Nullable)
     */
    public void setPackageId(java.lang.Integer packageId) {
        _packageId = packageId;
    }

    /**
     * Get the value of stereotype. (Converted empty to null)
     * @return The value of stereotype. (Nullable & NotEmptyString: if the value is empty string, returns null)
     */
    public java.lang.String getStereotype() {
        return (java.lang.String)convertEmptyToNullIfString(_stereotype);
    }

    /**
     * Set the value of stereotype.
     * @param stereotype The value of stereotype. (Nullable)
     */
    public void setStereotype(java.lang.String stereotype) {
        _stereotype = stereotype;
    }

}
