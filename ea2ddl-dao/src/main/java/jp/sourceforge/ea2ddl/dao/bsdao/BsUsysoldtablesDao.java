package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.Usysoldtables;
import jp.sourceforge.ea2ddl.dao.cbean.UsysoldtablesCB;

/**
 * The DAO interface of usysOldTables.
 * @author DBFlute(AutoGenerator)
 */
public interface BsUsysoldtablesDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = Usysoldtables.class; // For S2Dao

    public int selectCount(UsysoldtablesCB cb);
    public List<Usysoldtables> selectList(UsysoldtablesCB cb);

}
