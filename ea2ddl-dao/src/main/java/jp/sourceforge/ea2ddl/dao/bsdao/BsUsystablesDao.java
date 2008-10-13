package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.Usystables;
import jp.sourceforge.ea2ddl.dao.cbean.UsystablesCB;

/**
 * The DAO interface of usysTables.
 * @author DBFlute(AutoGenerator)
 */
public interface BsUsystablesDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = Usystables.class; // For S2Dao

    public int selectCount(UsystablesCB cb);
    public List<Usystables> selectList(UsystablesCB cb);

}
