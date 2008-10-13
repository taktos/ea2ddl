package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TProjectroles;
import jp.sourceforge.ea2ddl.dao.cbean.TProjectrolesCB;

/**
 * The DAO interface of t_projectroles.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTProjectrolesDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TProjectroles.class; // For S2Dao

    public int selectCount(TProjectrolesCB cb);
    public List<TProjectroles> selectList(TProjectrolesCB cb);

}
