package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.UsysSystem;
import jp.sourceforge.ea2ddl.dao.cbean.UsysSystemCB;

/**
 * The DAO interface of usys_system.
 * @author DBFlute(AutoGenerator)
 */
public interface BsUsysSystemDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = UsysSystem.class; // For S2Dao

    public int selectCount(UsysSystemCB cb);
    public List<UsysSystem> selectList(UsysSystemCB cb);

}
