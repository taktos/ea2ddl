package jp.sourceforge.ea2ddl.dao.bsdao;

import java.util.List;

import jp.sourceforge.ea2ddl.dao.exentity.TConstrainttypes;
import jp.sourceforge.ea2ddl.dao.cbean.TConstrainttypesCB;

/**
 * The DAO interface of t_constrainttypes.
 * @author DBFlute(AutoGenerator)
 */
public interface BsTConstrainttypesDao extends jp.sourceforge.ea2ddl.dao.allcommon.DaoReadable {

    public Class<?> BEAN = TConstrainttypes.class; // For S2Dao

    public int selectCount(TConstrainttypesCB cb);
    public List<TConstrainttypes> selectList(TConstrainttypesCB cb);

}
