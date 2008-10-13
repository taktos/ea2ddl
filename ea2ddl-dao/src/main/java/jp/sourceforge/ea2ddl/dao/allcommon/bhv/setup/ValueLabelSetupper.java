package jp.sourceforge.ea2ddl.dao.allcommon.bhv.setup;

import jp.sourceforge.ea2ddl.dao.allcommon.Entity;

/**
 * The interface of Value-Label Setupper.
 * @param <ENTITY> The type of entity.
 * @author DBFlute(AutoGenerator)
 */
public interface ValueLabelSetupper<ENTITY extends Entity> {

    /**
     * Set up value-label.
     * @param box Value-label box. (NotNull)
     * @param entity Entity. (NotNull)
     */
    public void setup(ValueLabelBox box, ENTITY entity);
}
