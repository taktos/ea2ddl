package jp.sourceforge.ea2ddl.dao.allcommon.bhv.setup;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.allcommon.Entity;

/**
 * The interface of entity list setupper.
 * @param <ENTITY> The type of entity.
 * @author DBFlute(AutoGenerator)
 */
public interface EntityListSetupper<ENTITY extends Entity> {

    /**
     * Set up the list of entity.
     * @param entityList The list of entity. (NotNull)
     */
    public void setup(List<ENTITY> entityList);
}
