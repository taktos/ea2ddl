package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TVersion;
import jp.sourceforge.ea2ddl.dao.cbean.TVersionCB;

/**
 * The DAO interface of t_version.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTVersionDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TVersion.class; // For S2Dao

    public int selectCount(TVersionCB cb);
    public List<TVersion> selectList(TVersionCB cb);

}
