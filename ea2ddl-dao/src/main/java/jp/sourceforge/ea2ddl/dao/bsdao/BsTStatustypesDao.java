package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TStatustypes;
import jp.sourceforge.ea2ddl.dao.cbean.TStatustypesCB;

/**
 * The DAO interface of t_statustypes.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTStatustypesDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TStatustypes.class; // For S2Dao

    public int selectCount(TStatustypesCB cb);
    public List<TStatustypes> selectList(TStatustypesCB cb);

}
