package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TSecuserpermission;
import jp.sourceforge.ea2ddl.dao.cbean.TSecuserpermissionCB;

/**
 * The DAO interface of t_secuserpermission.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTSecuserpermissionDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TSecuserpermission.class; // For S2Dao

    public int selectCount(TSecuserpermissionCB cb);
    public List<TSecuserpermission> selectList(TSecuserpermissionCB cb);

}
