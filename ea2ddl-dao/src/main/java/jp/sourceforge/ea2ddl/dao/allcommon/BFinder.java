package jp.sourceforge.ea2ddl.dao.allcommon;

import jp.sourceforge.ea2ddl.dao.allcommon.bhv.BehaviorReadable;

/**
 * The entry of DBFlute.
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class BFinder {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    protected static String _dbfluteDiconName = "dbflute.dicon";

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    private BFinder() {
    }

    // ===================================================================================
    //                                                                              Finder
    //                                                                             ======
    public static <BEHAVIOR_TYPE extends BehaviorReadable> BEHAVIOR_TYPE find(Class<BEHAVIOR_TYPE> behaviorType) {
        assertObjectNotNull("behaviorType", behaviorType);
        if (!org.seasar.framework.container.factory.SingletonS2ContainerFactory.hasContainer()) {
            synchronized (BFinder.class) {
                if (!org.seasar.framework.container.factory.SingletonS2ContainerFactory.hasContainer()) {
                    final String configFile = _dbfluteDiconName;
                    if (org.seasar.framework.util.ResourceUtil.isExist(configFile)) {
                        org.seasar.framework.container.factory.SingletonS2ContainerFactory.setConfigPath(configFile);
                        org.seasar.framework.container.factory.SingletonS2ContainerFactory.init();
                    } else {
                        String msg = "S2Container is not initialized! Confirm your initializer and your dicon files.";
                        throw new IllegalStateException(msg);
                    }
                }
            }
        }
        final org.seasar.framework.container.S2Container container = org.seasar.framework.container.factory.SingletonS2ContainerFactory.getContainer();
        final BEHAVIOR_TYPE behavior = (BEHAVIOR_TYPE)container.getComponent(behaviorType);
        return behavior;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public static void setDBFluteDiconName(String dbfluteDiconName) {
        _dbfluteDiconName = dbfluteDiconName;
    }
	
    // ===================================================================================
    //                                                                      General Helper
    //                                                                      ==============
    /**
     * Assert that the object is not null.
     * @param variableName Variable name. (NotNull)
     * @param value Value. (NotNull)
     * @exception IllegalArgumentException
     */
    protected static void assertObjectNotNull(String variableName, Object value) {
        if (variableName == null) {
            String msg = "The value should not be null: variableName=" + variableName + " value=" + value;
            throw new IllegalArgumentException(msg);
        }
        if (value == null) {
            String msg = "The value should not be null: variableName=" + variableName;
            throw new IllegalArgumentException(msg);
        }
    }

    // ----------------------------------------------------------------
    //                                                    Assert String
    //                                                    -------------
    /**
     * Assert that the entity is not null and not trimmed empty.
     * @param variableName Variable name. (NotNull)
     * @param value Value. (NotNull)
     */
    protected void assertStringNotNullAndNotTrimmedEmpty(String variableName, String value) {
        assertObjectNotNull("variableName", variableName);
        assertObjectNotNull("value", value);
        if (value.trim().length() ==0) {
            String msg = "The value should not be empty: variableName=" + variableName + " value=" + value;
            throw new IllegalArgumentException(msg);
        }
    }
}
