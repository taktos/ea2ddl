package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TSecgroup;
import jp.sourceforge.ea2ddl.dao.cbean.TSecgroupCB;

/**
 * The DAO interface of t_secgroup.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTSecgroupDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TSecgroup.class; // For S2Dao

    public int selectCount(TSecgroupCB cb);
    public List<TSecgroup> selectList(TSecgroupCB cb);

}
