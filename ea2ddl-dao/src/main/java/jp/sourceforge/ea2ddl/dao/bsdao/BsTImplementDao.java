package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TImplement;
import jp.sourceforge.ea2ddl.dao.cbean.TImplementCB;

/**
 * The DAO interface of t_implement.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTImplementDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TImplement.class; // For S2Dao

    public int selectCount(TImplementCB cb);
    public List<TImplement> selectList(TImplementCB cb);

}
