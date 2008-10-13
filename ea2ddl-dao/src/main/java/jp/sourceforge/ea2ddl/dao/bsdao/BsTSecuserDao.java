package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TSecuser;
import jp.sourceforge.ea2ddl.dao.cbean.TSecuserCB;

/**
 * The DAO interface of t_secuser.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTSecuserDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TSecuser.class; // For S2Dao

    public int selectCount(TSecuserCB cb);
    public List<TSecuser> selectList(TSecuserCB cb);

}
