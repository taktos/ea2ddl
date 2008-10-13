package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TSecgrouppermission;
import jp.sourceforge.ea2ddl.dao.cbean.TSecgrouppermissionCB;

/**
 * The DAO interface of t_secgrouppermission.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTSecgrouppermissionDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TSecgrouppermission.class; // For S2Dao

    public int selectCount(TSecgrouppermissionCB cb);
    public List<TSecgrouppermission> selectList(TSecgrouppermissionCB cb);

}
