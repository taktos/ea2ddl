package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TOperationtag;
import jp.sourceforge.ea2ddl.dao.cbean.TOperationtagCB;

/**
 * The DAO interface of t_operationtag.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTOperationtagDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TOperationtag.class; // For S2Dao

    public int selectCount(TOperationtagCB cb);
    public List<TOperationtag> selectList(TOperationtagCB cb);

}
