package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TTasks;
import jp.sourceforge.ea2ddl.dao.cbean.TTasksCB;

/**
 * The DAO interface of t_tasks.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTTasksDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TTasks.class; // For S2Dao

    public int selectCount(TTasksCB cb);
    public List<TTasks> selectList(TTasksCB cb);

}
