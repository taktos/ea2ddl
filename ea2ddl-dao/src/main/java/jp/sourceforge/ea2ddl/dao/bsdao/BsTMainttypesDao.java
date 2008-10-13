package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TMainttypes;
import jp.sourceforge.ea2ddl.dao.cbean.TMainttypesCB;

/**
 * The DAO interface of t_mainttypes.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTMainttypesDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TMainttypes.class; // For S2Dao

    public int selectCount(TMainttypesCB cb);
    public List<TMainttypes> selectList(TMainttypesCB cb);

}
