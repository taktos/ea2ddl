package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TOperationpres;
import jp.sourceforge.ea2ddl.dao.cbean.TOperationpresCB;

/**
 * The DAO interface of t_operationpres.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTOperationpresDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TOperationpres.class; // For S2Dao

    public int selectCount(TOperationpresCB cb);
    public List<TOperationpres> selectList(TOperationpresCB cb);

}
