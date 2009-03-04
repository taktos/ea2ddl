package jp.sourceforge.ea2ddl.dao.bsbhv.pmbean;


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

    /** The value of objectType. */
    protected java.lang.String _objectType;

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
     * {@inheritDoc}
     * @return The view of properties. (NotNull)
     */
    @Override
    public String toString() {
        final String delimiter = ",";
        final StringBuffer sb = new StringBuffer();
        sb.append(delimiter).append(_packageId);
        sb.append(delimiter).append(_stereotype);
        sb.append(delimiter).append(_objectType);
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

    /**
     * Get the value of objectType. (Converted empty to null)
     * @return The value of objectType. (Nullable & NotEmptyString: if the value is empty string, returns null)
     */
    public java.lang.String getObjectType() {
        return (java.lang.String)convertEmptyToNullIfString(_objectType);
    }

    /**
     * Set the value of objectType.
     * @param objectType The value of objectType. (Nullable)
     */
    public void setObjectType(java.lang.String objectType) {
        _objectType = objectType;
    }

}
