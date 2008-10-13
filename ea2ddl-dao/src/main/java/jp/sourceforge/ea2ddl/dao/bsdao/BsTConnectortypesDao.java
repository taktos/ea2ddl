package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TConnectortypes;
import jp.sourceforge.ea2ddl.dao.cbean.TConnectortypesCB;

/**
 * The DAO interface of t_connectortypes.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTConnectortypesDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TConnectortypes.class; // For S2Dao

    public int selectCount(TConnectortypesCB cb);
    public List<TConnectortypes> selectList(TConnectortypesCB cb);

}
