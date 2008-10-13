package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TOperation;
import jp.sourceforge.ea2ddl.dao.cbean.TOperationCB;

/**
 * The DAO interface of t_operation.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTOperationDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TOperation.class; // For S2Dao

    public int selectCount(TOperationCB cb);
    public List<TOperation> selectList(TOperationCB cb);

}
