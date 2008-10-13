package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TMetrictypes;
import jp.sourceforge.ea2ddl.dao.cbean.TMetrictypesCB;

/**
 * The DAO interface of t_metrictypes.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTMetrictypesDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TMetrictypes.class; // For S2Dao

    public int selectCount(TMetrictypesCB cb);
    public List<TMetrictypes> selectList(TMetrictypesCB cb);

}
