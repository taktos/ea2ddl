package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TConnector;
import jp.sourceforge.ea2ddl.dao.cbean.TConnectorCB;

/**
 * The DAO interface of t_connector.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTConnectorDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoWritable {

    public Class<?> BEAN = TConnector.class; // For S2Dao

    public int selectCount(TConnectorCB cb);
    public List<TConnector> selectList(TConnectorCB cb);

    int insert(TConnector entity);
    int updateModifiedOnly(TConnector entity);
    int delete(TConnector entity);

    int[] insertList(List<TConnector> entityList);
    int[] updateList(List<TConnector> entityList);
    int updateByQuery(TConnectorCB cb, TConnector entity);
    int[] deleteList(List<TConnector> entityList);
    int deleteByQuery(TConnectorCB cb);
}
