package jp.sourceforge.ea2ddl.dao.allcommon;

import jp.sourceforge.ea2ddl.dao.allcommon.bhv.BehaviorReadable;

/**
 * The interface of behavior-selector.
 * @author DBFlute(AutoGenerator)
 */
public interface BehaviorSelector {

    /**
     * Initialize condition-bean meta data. <br />
	 * If you call this, Hot Deploy of OutsideSql becomes Cool!
     */
    public void initializeConditionBeanMetaData();
	
    /**
     * Select behavior.
	 * @param <BEHAVIOR> The type of behavior.
     * @param behaviorType Behavior type. (NotNull)
     * @return Behavior. (NotNull)
     */
    public <BEHAVIOR extends BehaviorReadable> BEHAVIOR select(Class<BEHAVIOR> behaviorType);

    /**
     * Select behavior-readable.
     * @param tableFlexibleName Table flexible-name. (NotNull)
     * @return Behavior-readable. (NotNull)
     */
    public BehaviorReadable byName(String tableFlexibleName);
}
