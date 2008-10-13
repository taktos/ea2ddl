package jp.sourceforge.ea2ddl.dao.allcommon.bhv;

import jp.sourceforge.ea2ddl.dao.allcommon.DaoWritable;
import jp.sourceforge.ea2ddl.dao.allcommon.Entity;

/**
 * The interface of behavior-writable.
 * 
 * @author DBFlute(AutoGenerator)
 */
public interface BehaviorWritable extends BehaviorReadable {

    /**
     * Get dao-writable.
     * @return Dao-writable. (NotNull)
     */
    public DaoWritable getDaoWritable();

    // =====================================================================================
    //                                                                   Basic Entity Update
    //                                                                   ===================
    /**
     * Create.
     * @param entity Entity. (NotNull)
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void create(jp.sourceforge.ea2ddl.dao.allcommon.Entity entity);

    /**
     * Modify.
     * @param entity Entity. (NotNull)
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void modify(jp.sourceforge.ea2ddl.dao.allcommon.Entity entity);

    /**
     * Modify non-strict.
     * @param entity Entity. (NotNull)
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void modifyNonstrict(Entity entity);

    /**
     * Create or modify. <br />
     * {modify: modified only} <br />
     * This method is faster than createOrModifyAfterSelect().
     * @param entity Entity. This must contain primary-key value at least(Except use identity). (NotNull)
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void createOrModify(jp.sourceforge.ea2ddl.dao.allcommon.Entity entity);

    /**
     * Create or modify non-strict. <br />
     * {modify: modified only} <br />
     * This method is faster than createOrModifyAfterSelect().
     * @param entity Entity. This must contain primary-key value at least(Except use identity). (NotNull)
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityDuplicatedException When the entity has been duplicated.
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyExistsException When the entity already exists. (Unique Constraint Violation)
     */
    public void createOrModifyNonstrict(jp.sourceforge.ea2ddl.dao.allcommon.Entity entity);

    /**
     * Remove.
     * @param entity Entity. (NotNull)
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyUpdatedException When the entity has already been updated.
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyDeletedException When the entity has already been deleted.
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public void remove(jp.sourceforge.ea2ddl.dao.allcommon.Entity entity);


    // =====================================================================================
    //                                                                    Basic Batch Update
    //                                                                    ==================
    /**
     * Lump create the list.
     * @param entityList Entity-list. (NotNull and NotEmpty)
     * @return The array of created count.
     */
    public int[] lumpCreate(java.util.List<Entity> entityList);

    /**
     * Lump Modify the list.
     * @param entityList Entity-list. (NotNull and NotEmpty)
     * @return Modified count.
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyUpdatedException When the entity has already been updated. And Only when s2dao's version is over 1.0.47 (contains 1.0.47).
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public int[] lumpModify(java.util.List<Entity> entityList);

    /**
     * Lump remove the list.
     * @param entityList Entity-list. (NotNull and NotEmpty)
     * @return Removed count.
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityAlreadyUpdatedException When the entity has already been updated. And Only when s2dao's version is over 1.0.47 (contains 1.0.47).
     * @exception jp.sourceforge.ea2ddl.dao.allcommon.exception.EntityDuplicatedException When the entity has been duplicated.
     */
    public int[] lumpRemove(java.util.List<Entity> entityList);
}
