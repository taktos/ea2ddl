package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TConnector;
import jp.sourceforge.ea2ddl.dao.cbean.TConnectorCB;

/**
 * The DAO interface of t_connector.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTConnectorDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TConnector.class; // For S2Dao

    public int selectCount(TConnectorCB cb);
    public List<TConnector> selectList(TConnectorCB cb);

}
