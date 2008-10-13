package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TRequiretypes;
import jp.sourceforge.ea2ddl.dao.cbean.TRequiretypesCB;

/**
 * The DAO interface of t_requiretypes.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTRequiretypesDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TRequiretypes.class; // For S2Dao

    public int selectCount(TRequiretypesCB cb);
    public List<TRequiretypes> selectList(TRequiretypesCB cb);

}
