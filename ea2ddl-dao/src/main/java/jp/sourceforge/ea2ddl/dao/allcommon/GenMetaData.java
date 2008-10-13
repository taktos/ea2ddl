package jp.sourceforge.ea2ddl.dao.allcommon;


/**
 * The sigleton class that has generate-meta-data(GenMetaData).
 * 
 * @author DBFlute(AutoGenerator)
 */
public class GenMetaData {

    /** Singleton instance. */
    private static final GenMetaData _instance = new GenMetaData();

    /**
     * Constructor.
     */
    private GenMetaData() {
    }

    /**
     * Get instance.
     *
     * @return Singleton instance.
     */
    public static GenMetaData getInstance() {
        return _instance;
    }

    // ===================================================================================
    //                                                                               Basic
    //                                                                               =====
    /**
     * Get the property-value of targetLanguage.
     *
     * @return The property-value.
     */
    public String getTargetLanguage() {
        return "java";
    }

    /**
     * Get the property-value of templateFileExtension.
     *
     * @return The property-value.
     */
    public String getTemplateFileExtension() {
        return "vm";
    }

    /**
     * Get the property-value of classFileExtension.
     *
     * @return The property-value.
     */
    public String getClassFileExtension() {
        return "java";
    }

    /**
     * Get the property-value of templateFileEncoding.
     *
     * @return The property-value.
     */
    public String getTemplateEncoding() {
        return "UTF-8";
    }

    /**
     * Get the property-value of classAuthor.
     *
     * @return The property-value.
     */
    public String getClassAuthor() {
        return "DBFlute(AutoGenerator)";
    }

    // ===================================================================================
    //                                                                              Naming
    //                                                                              ======
    /**
     * Is java name of table same as db name? Answer is false!
     *
     * @return The property-value.
     */
    public boolean isJavaNameOfTableSameAsDbName() {
        return false;
    }

    /**
     * Is java name of column same as db name? Answer is false!
     *
     * @return The property-value.
     */
    public boolean isJavaNameOfColumnSameAsDbName() {
        return false;
    }

    // ===================================================================================
    //                                                                              Prefix
    //                                                                              ======
    /**
     * Get the property-value of projectPrefix.
     *
     * @return The property-value.
     */
    public String getProjectPrefix() {
        return "";
    }

    /**
     * Get the property-value of basePrefix.
     *
     * @return The property-value.
     */
    public String getBasePrefix() {
        return "Bs";
    }

    // ===================================================================================
    //                                                                             Package
    //                                                                             =======
    /**
     * Get the property-value of baseCommonPackage.
     *
     * @return The property-value.
     */
    public String getBaseCommonPackage() {
        return "jp.sourceforge.ea2ddl.dao.allcommon";
    }

    /**
     * Get the property-value of baseBehaviorPackage.
     *
     * @return The property-value.
     */
    public String getBaseBehaviorPackage() {
        return "jp.sourceforge.ea2ddl.dao.bsbhv";
    }

    /**
     * Get the property-value of baseDaoPackage.
     *
     * @return The property-value.
     */
    public String getBaseDaoPackage() {
        return "jp.sourceforge.ea2ddl.dao.bsdao";
    }

    /**
     * Get the property-value of baseEntityPackage.
     *
     * @return The property-value.
     */
    public String getBaseEntityPackage() {
        return "jp.sourceforge.ea2ddl.dao.bsentity";
    }

    /**
     * Get the property-value of conditionBeanPackage.
     *
     * @return The property-value.
     */
    public String getConditionBeanPackage() {
        return "jp.sourceforge.ea2ddl.dao.cbean";
    }

    /**
     * Get the property-value of extendedDaoPackage.
     *
     * @return The property-value.
     */
    public String getExtendedDaoPackage() {
        return "jp.sourceforge.ea2ddl.dao.exdao";
    }

    /**
     * Get the property-value of extendedBehaviorPackage.
     *
     * @return The property-value.
     */
    public String getExtendedBehaviorPackage() {
        return "jp.sourceforge.ea2ddl.dao.exbhv";
    }

    /**
     * Get the property-value of extendedEntityPackage.
     *
     * @return The property-value.
     */
    public String getExtendedEntityPackage() {
        return "jp.sourceforge.ea2ddl.dao.exentity";
    }

    // ===================================================================================
    //                                                                     Optimistic Lock
    //                                                                     ===============
    /**
     * Get the property-value of updateDateFieldName.
     *
     * @return The property-value.
     */
    public String getUpdateDateFieldName() {
        return "";
    }

    /**
     * Get the property-value of versionNoFieldName.
     *
     * @return The property-value.
     */
    public String getVersionNoFieldName() {
        return "";
    }

    // ===================================================================================
    //                                                                             Extract
    //                                                                             =======
    /**
     * Get the value of 'extractAcceptStartBrace'.
     *
     * @return The property-value. (NotNull)
     */
    public String getExtractAcceptStartBrace() {
        return "@{";
    }

    /**
     * Get the value of 'extractAcceptEndBrace'.
     *
     * @return The property-value. (NotNull)
     */
    public String getExtractAcceptEndBrace() {
        return "@}";
    }

    /**
     * Get the value of 'extractAcceptDelimiter'.
     *
     * @return The property-value. (NotNull)
     */
    public String getExtractAcceptDelimiter() {
        return "@;";
    }

    /**
     * Get the value of 'extractAcceptEqual'.
     *
     * @return The property-value. (NotNull)
     */
    public String getExtractAcceptEqual() {
        return "@=";
    }
}
