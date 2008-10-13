package jp.sourceforge.ea2ddl.dao.allcommon;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.allcommon.Entity;

/**
 * The interface of dao-writable.
 * @author DBFlute(AutoGenerator)
 */
public interface DaoWritable extends DaoReadable {

    /**
     * Insert one entity that the type is entity-interface.
     * @param entity Entity that the type is entity-interface. (NotNull)
     * @return Inserted count.
     */
    public int create(Entity entity);

    /**
     * Update one entity that the type is entity-interface.
     * @param entity Entity that the type is entity-interface. (NotNull)
     * @return Updated count.
     */
    public int modify(Entity entity);

    /**
     * Update one entity that the type is entity-interface. (modified only)
     * @param entity Entity that the type is entity-interface. (NotNull)
     * @return Updated count.
     */
    public int modifyModifiedOnly(Entity entity);

    /**
     * Delete one entity that the type is entity-interface.
     * @param entity Entity that the type is entity-interface. (NotNull)
     * @return Deleted count.
     */
    public int remove(Entity entity);


    /**
     * Insert several entities that the type is entity-interface.
     * @param entityList Entity-list that the type is entity-interface. (NotNull)
     * @return The array of inserted count.
     */
    public int[] createList(List<Entity> entityList);

    /**
     * Update several entities that the type is entity-interface.
     * @param entityList Entity-list that the type is entity-interface. (NotNull)
     * @return The array of updated count.
     */
    public int[] modifyList(List<Entity> entityList);

    /**
     * Delete several entities that the type is entity-interface.
     * @param entityList Entity-list that the type is entity-interface. (NotNull)
     * @return The array of deleted count.
     */
    public int[] removeList(List<Entity> entityList);
}
