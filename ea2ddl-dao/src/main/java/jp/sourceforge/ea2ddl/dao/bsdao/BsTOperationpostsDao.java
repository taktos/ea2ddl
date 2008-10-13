package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TOperationposts;
import jp.sourceforge.ea2ddl.dao.cbean.TOperationpostsCB;

/**
 * The DAO interface of t_operationposts.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTOperationpostsDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TOperationposts.class; // For S2Dao

    public int selectCount(TOperationpostsCB cb);
    public List<TOperationposts> selectList(TOperationpostsCB cb);

}
