package jp.sourceforge.ea2ddl.dao.allcommon;

import jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable;
import jp.sourceforge.ea2ddl.dao.allcommon.DaoSelector;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMeta;
import jp.sourceforge.ea2ddl.dao.allcommon.dbmeta.DBMetaInstanceHandler;

/**
 * The implementation of DAO-selector.
 * <pre>
 * Long long ago this object have cache of DAO and behavior.
 * But the cache cause wrong performance when this is initialized.
 * So now this object don't have cache.
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@SuppressWarnings("unchecked")
public class CacheDaoSelector extends CacheAbstractSelector implements DaoSelector {

    // ===================================================================================
    //                                                                            Selector
    //                                                                            ========
    /**
     * Select DAO.
     * @param <DAO> The type of DAO.
     * @param daoType DAO type. (NotNull)
     * @return DAO. (NotNull)
     */
    public <DAO extends DaoReadable> DAO select(Class<DAO> daoType) {
        return (DAO)getComponent(daoType);
    }

    /**
     * Select DAO-readable by name.
     * @param tableFlexibleName Table flexible name. (NotNull)
     * @return DAO-readable. (NotNull)
     */
    public DaoReadable byName(String tableFlexibleName) {
        assertStringNotNullAndNotTrimmedEmpty("tableFlexibleName", tableFlexibleName);
        final DBMeta dbmeta = DBMetaInstanceHandler.findDBMeta(tableFlexibleName);
        return select(getDaoType(dbmeta));
    }

    protected Class<DaoReadable> getDaoType(DBMeta dbmeta) {
        final String daoTypeName = dbmeta.getDaoTypeName();
        if (daoTypeName == null) {
            String msg = "The dbmeta.getDaoTypeName() should not return null: dbmeta=" + dbmeta;
            throw new IllegalStateException(msg);
        }
        final Class<DaoReadable> daoType;
        try {
            daoType = (Class<DaoReadable>)Class.forName(daoTypeName);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("The class does not exist: " + daoTypeName, e);
        }
        return daoType;
    }
}
