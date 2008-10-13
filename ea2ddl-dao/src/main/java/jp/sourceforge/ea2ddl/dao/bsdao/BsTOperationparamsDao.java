package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TOperationparams;
import jp.sourceforge.ea2ddl.dao.cbean.TOperationparamsCB;

/**
 * The DAO interface of t_operationparams.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTOperationparamsDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TOperationparams.class; // For S2Dao

    public int selectCount(TOperationparamsCB cb);
    public List<TOperationparams> selectList(TOperationparamsCB cb);

}
