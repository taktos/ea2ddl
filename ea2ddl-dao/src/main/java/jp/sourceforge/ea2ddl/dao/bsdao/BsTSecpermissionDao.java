package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TSecpermission;
import jp.sourceforge.ea2ddl.dao.cbean.TSecpermissionCB;

/**
 * The DAO interface of t_secpermission.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTSecpermissionDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TSecpermission.class; // For S2Dao

    public int selectCount(TSecpermissionCB cb);
    public List<TSecpermission> selectList(TSecpermissionCB cb);

}
