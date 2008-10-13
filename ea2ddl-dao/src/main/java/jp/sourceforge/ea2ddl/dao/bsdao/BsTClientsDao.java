package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TClients;
import jp.sourceforge.ea2ddl.dao.cbean.TClientsCB;

/**
 * The DAO interface of t_clients.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTClientsDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TClients.class; // For S2Dao

    public int selectCount(TClientsCB cb);
    public List<TClients> selectList(TClientsCB cb);

}
