package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TSnapshot;
import jp.sourceforge.ea2ddl.dao.cbean.TSnapshotCB;

/**
 * The DAO interface of t_snapshot.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTSnapshotDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TSnapshot.class; // For S2Dao

    public int selectCount(TSnapshotCB cb);
    public List<TSnapshot> selectList(TSnapshotCB cb);

}
