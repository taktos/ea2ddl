package jp.sourceforge.ea2ddl.dao.allcommon;

/**
 * The interface of DAO-selector.
 * @author DBFlute(AutoGenerator)
 */
public interface DaoSelector {

    /**
     * Select DAO.
     * @param <DAO> The type of DAO.
     * @param daoType DAO type. (NotNull)
     * @return Dao. (NotNull)
     */
    public <DAO extends DaoReadable> DAO select(Class<DAO> daoType);

    /**
     * Select DAO-readable by name.
     * @param tableFlexibleName Table flexible name. (NotNull)
     * @return DAO-readable. (NotNull)
     */
    public DaoReadable byName(String tableFlexibleName);
}
