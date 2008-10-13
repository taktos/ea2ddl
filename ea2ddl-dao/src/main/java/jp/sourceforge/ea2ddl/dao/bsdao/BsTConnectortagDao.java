package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TConnectortag;
import jp.sourceforge.ea2ddl.dao.cbean.TConnectortagCB;

/**
 * The DAO interface of t_connectortag.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTConnectortagDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TConnectortag.class; // For S2Dao

    public int selectCount(TConnectortagCB cb);
    public List<TConnectortag> selectList(TConnectortagCB cb);

}
