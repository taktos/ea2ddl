package jp.sourceforge.ea2ddl.dao.allcommon.bhv.setup;

import jp.sourceforge.ea2ddl.dao.allcommon.cbean.ConditionBean;

/**
 * The interface of condition-bean setupper.
 * @param <CONDITION_BEAN> The type of condition-bean.
 * @author DBFlute(AutoGenerator)
 */
public interface ConditionBeanSetupper<CONDITION_BEAN extends ConditionBean> {

    /**
     * Set up condition.
     * @param cb Condition-bean. (NotNull)
     */
    public void setup(CONDITION_BEAN cb);
}
