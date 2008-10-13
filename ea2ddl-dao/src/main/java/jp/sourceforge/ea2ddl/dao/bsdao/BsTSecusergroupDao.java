package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TSecusergroup;
import jp.sourceforge.ea2ddl.dao.cbean.TSecusergroupCB;

/**
 * The DAO interface of t_secusergroup.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTSecusergroupDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TSecusergroup.class; // For S2Dao

    public int selectCount(TSecusergroupCB cb);
    public List<TSecusergroup> selectList(TSecusergroupCB cb);

}
